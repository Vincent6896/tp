package ui.game;

import data.Player;
import storage.Storage;
import ui.Menu;
import ui.card.CardCommandType;
import ui.card.CardMenu;
import ui.main.GameMainCommandType;
import ui.main.GameMainMenu;
import utils.Errors;
import utils.IO;
import utils.StringParser;
import utils.message.Strings;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * The game menu after start the CodeHunt game.
 */
public class GameMenu extends Menu {
    /**
     * The {@code Scanner} for the menu to consume input.
     */
    private final Scanner in;

    /**
     * The parser with the rest of the command to be consumed by the menu.
     */
    private final StringParser parser;

    /**
     * Creates a new instance of the game menu.
     */
    public GameMenu(Scanner in, StringParser parser) {
        this.in = in;
        this.parser = parser;
    }

    /**
     * Displays the welcome message.
     */
    private void welcome() {
        System.out.println(Strings.GAME_WELCOME_MESSAGE);
        System.out.println();
    }

    /**
     * Displays the prompt of the menu.
     */
    private void prompt() {
        System.out.print(Strings.GAME_PROMPT);
        System.out.flush();
    }

    /**
     * Displays the game history of this player.
     */
    private void showRecord() {
        System.out.println(Strings.GAME_RECORD_MESSAGE);
        System.out.println(Strings.DIVIDER);
        Player.showEasyGameRecord();
        System.out.println(Strings.DIVIDER);
        Player.showDifficultGameRecord();
        System.out.println(Strings.DIVIDER);
    }

    /**
     * Displays available commands and their corresponding details.
     */
    private void help() {
        for (GameCommandType commandType : GameCommandType.values()) {
            System.out.printf("%-12s%s\n", commandType.getCommand(), commandType.getInfo());
        }
        System.out.println();
    }

    /**
     * The handler for command "exit". Does all necessary cleanups before the exit.
     * Note that the exit does not happen here. It is done by the {@code return}
     * statement under the {@link #enter()} method.
     *
     * @param promptToSave whether to prompt to save the current state or not
     */
    public void exit(boolean promptToSave) {
        Storage.savePlayer();
        System.out.println(Strings.MAIN_EXIT_MESSAGE);
        System.out.println();
    }

    @Override
    public void enter() {
        welcome();
        help();
        try {
            while (true) {
                prompt();
                String command = in.nextLine();
                StringParser parser = new StringParser(command);
                GameCommandType commandType = GameCommandType.getCommandType(parser.nextToken());
                if (commandType == null) {
                    Errors.print(parser.getString(), Strings.ERR_UNKNOWN_COMMAND);
                    continue;
                }
                if (parser.hasMoreTokens()) {
                    Errors.print(parser.getRemaining(), Strings.ERR_UNEXPECTED_INPUT);
                    continue;
                }
                switch (commandType) {
                case START: {
                    int selection = IO.readInt(in, Strings.CHOOSE_LEVEL_MESSAGE);

                    if (selection == 1) {
                        EasyMenu easyMenu = new EasyMenu(in, parser);
                        easyMenu.enter();
                        help();
                    } else if (selection == 2) {
                        DifficultMenu easyMenu = new DifficultMenu(in, parser);
                        easyMenu.enter();
                        help();
                    } else {
                        Errors.print(Integer.toString(selection), Strings.ERR_INVALID_NUMBER);
                    }

                    Storage.savePlayer();
                    break;
                }
                case CHECK: {
                    showRecord();
                    break;
                }
                case CARD: {
                    CardMenu cardMenu = new CardMenu(in, parser);
                    cardMenu.enter();
                    help();
                    break;
                }
                case HELP: {
                    help();
                    break;
                }
                case BACK: {
                    return;
                }
                default: {
                    break;
                }
                }
            }
        } catch (NoSuchElementException e) {
            exit(false);
        }
    }
}
