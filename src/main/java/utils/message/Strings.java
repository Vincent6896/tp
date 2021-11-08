package utils.message;

/**
 * String constants used in the program.
 */
public class Strings {

    private Strings() {
        // Disallow instantiation
    }

    // Application name and version
    public static final String APP_NAME_LONG = "A text-based code game for children ages 6 and up(Code Hunt)";
    public static final String APP_NAME_SHORT = "Code Hunt";
    public static final String APP_VERSION = "1.0";

    // Prompt
    public static final String MAIN_MENU = " [MAIN MENU]";
    public static final String GAME_MENU = " [GAME MENU]";
    public static final String CARD_MENU = " [CARD MENU]";
    public static final String MAIN_PROMPT = String.format("%s > ", APP_NAME_SHORT + MAIN_MENU);
    public static final String GAME_PROMPT = String.format("%s > ", APP_NAME_SHORT + GAME_MENU);
    public static final String CARD_PROMPT = String.format("%s > ", APP_NAME_SHORT + CARD_MENU);
    public static final String HELP_MESSAGE = "Type \"help\" to see a list of available commands.";
    public static final String SUBCOMMAND_HELP_MESSAGE = "Please provide a subcommand.";

    // Main menu messages
    private static final String LOGO = "  ____          _        _   _             _\n"
            + " / ___|___   __| | ___  | | | |_   _ _ __ | |_\n"
            + "| |   / _ \\ / _` |/ _ \\ | |_| | | | | '_ \\| __|\n"
            + "| |__| (_) | (_| |  __/ |  _  | |_| | | | | |_\n"
            + " \\____\\___/ \\__,_|\\___| |_| |_|\\__,_|_| |_|\\__|\n";
    public static final String MAIN_WELCOME_MESSAGE = LOGO
            + String.format("Welcome to %s.Are you ready to play?\n "
            + "Remember, you can't play the next game until you pass through the processing one. "
            + "Good luck, young knight! ", APP_NAME_LONG) + HELP_MESSAGE;
    public static final String MAIN_ABOUT_MESSAGE = String.format("%s (Version %s)\n", APP_NAME_LONG, APP_VERSION)
            + "Developed by Wang Chuhan, Jiang Yuxin, Xue Yushan, Wang Ruisi, Peng Wenxuan";
    public static final String MAIN_EXIT_MESSAGE =
            String.format("Thank you playing %s ! Have a nice day~~", APP_NAME_SHORT);
    public static final String MAIN_PLAYER_ID_ENTER_PROMPT = "Enter your player ID: ";
    public static final String NO_GAME_RECORD_MESSAGE = "Aiyah! There isn't any game record yet.";
    public static final String SHOW_EASY_PROGRESS = "Here is your game record of easy level:";
    public static final String SHOW_DIFFICULT_PROGRESS = "Here is your game record of difficult level:";

    // Game menu messages
    public static final String GAME_WELCOME_MESSAGE = LOGO
            + "There you go!\n" + HELP_MESSAGE;
    public static final String CHOOSE_LEVEL_MESSAGE = "Please choose your game mode: \n"
            + "(1) Easy Mode | (2) Difficult Mode.\n";
    public static final String GAME_RECORD = "   ____      _      __  __  U _____ u       ____    "
            + "U _____ u   ____   U  ___ u   ____     ____    \n"
            + "U /\"___|uU  /\"\\  uU|' \\/ '|u\\| ___\"|/    "
            + "U |  _\"\\ u \\| ___\"|/U /\"___|   \\/\"_ \\/U |  _\"\\ u |  _\"\\   \n"
            + "\\| |  _ / \\/ _ \\/ \\| |\\/| |/ |  _|\"       "
            + "\\| |_) |/  |  _|\"  \\| | u     | | | | \\| |_) |//| | | |  \n"
            + " | |_| |  / ___ \\  | |  | |  | |___        "
            + "|  _ <    | |___   | |/__.-,_| |_| |  |  _ <  U| |_| |\\ \n"
            + "  \\____| /_/   \\_\\ |_|  |_|  |_____|       "
            + "|_| \\_\\   |_____|   \\____|\\_)-\\___/   |_| \\_\\  |____/ u \n"
            + "  _)(|_   \\\\    >><<,-,,-.   <<   >>       "
            + "//   \\\\_  <<   >>  _// \\\\      \\\\     //   \\\\_  |||_    \n"
            + " (__)__) (__)  (__)(./  \\.) (__) (__)     "
            + "(__)  (__)(__) (__)(__)(__)    (__)   (__)  (__)(__)_)   \n";
    public static final String GAME_RECORD_MESSAGE = GAME_RECORD + "Here is you game history!";

    // Easy game messages
    public static final String DIVIDER = "=========================================================";
    public static final String _GAME_WELCOME_MESSAGE = DIVIDER + "\nHello! Brave cool kids!\n"
        + "We are the Avengers. To protect the world from devastation, we need your help!\n"
        + "We need to get as many cards ad possible for the last Infinity Gem.\n"
        + "Win following games and collect the cards.\n"
        + "Good luck!\n"
        + "We will be waiting for you and the cards!\n" + DIVIDER;
    public static final String EASY_LOGO = "            _.------.                        .----.__\n"
            + "           /         \\_.       ._           /---.__  \\\n"
            + "          |  O    O   |\\\\___  //|          /       `\\ |\n"
            + "          |  .vvvvv.  | )   `(/ |         | o     o  \\|\n"
            + "          /  |     |  |/      \\ |  /|   ./| .vvvvv.  |\\\n"
            + "         /   `^^^^^'  / _   _  `|_ ||  / /| |     |  | \\\n"
            + "       ./  /|         | O)  O   ) \\|| //' | `^vvvv'  |/\\\\\n"
            + "      /   / |         \\        /  | | ~   \\          |  \\\\\n"
            + "      \\  /  |        / \\ Y   /'   | \\     |          |   ~\n"
            + "       `'   |  _     |  `._/' |   |  \\     7        /\n"
            + "         _.-'-' `-'-'|  |`-._/   /    \\ _ /    .    |\n"
            + "    __.-'            \\  \\   .   / \\_.  \\ -|_/\\/ `--.|_\n"
            + " --'                  \\  \\ |   /    |  |              `-\n"
            + "                       \\uU \\UU/     |  /   :F_P:\n";
    public static final String HANG_MAN_START = "\n******************** Level 1: Hang Man ********************\n";
    public static final String QUIZ_START = "\n******************** Level 2: How Code Works ********************\n";
    public static final String GUESS_NUM_START = "\n******************** Level 3: Guess Number ********************\n";
    public static final String TREASURE_HUNT_START = "\n******************** "
            + "Level 4: Treasure Hunt ********************\n";
    public static final String FINISH_EASY_MODE = "Congratulation! You have finished all the tasks of Easy Mode!!";
    public static final String GAME_END_SIGN_WIN = " Game won. Well Done!. Enter your choice: \n"
            + "(1) continue | (2) again | (3) exit\n";
    public static final String GAME_END_SIGN = " Game ended. Enter your choice: \n"
            + "(1) continue | (2) again | (3) exit\n";
    public static final String GAME_END_SIGN_LOSS = " Game failed. Enter your choice: \n"
            + "(1) again | (3) exit\n";
    public static final String NO_CARD_MESSAGE = "Sorry! Since you didn't win the game, No CARDS!";

    // Card menu messages
    private static final String PACKAGE = "\n"
        + "      ___           ___           ___          _____    \n"
        + "     /  /\\         /  /\\         /  /\\        /  /::\\   \n"
        + "    /  /:/        /  /::\\       /  /::\\      /  /:/\\:\\  \n"
        + "   /  /:/        /  /:/\\:\\     /  /:/\\:\\    /  /:/  \\:\\ \n"
        + "  /  /:/  ___   /  /:/~/::\\   /  /:/~/:/   /__/:/ \\__\\:|\n"
        + " /__/:/  /  /\\ /__/:/ /:/\\:\\ /__/:/ /:/___ \\  \\:\\ /  /:/\n"
        + " \\  \\:\\ /  /:/ \\  \\:\\/:/__\\/ \\  \\:\\/:::::/  \\  \\:\\  /:/ \n"
        + "  \\  \\:\\  /:/   \\  \\::/       \\  \\::/~~~~    \\  \\:\\/:/  \n"
        + "   \\  \\:\\/:/     \\  \\:\\        \\  \\:\\         \\  \\::/   \n"
        + "    \\  \\::/       \\  \\:\\        \\  \\:\\         \\__\\/    \n"
        + "     \\__\\/         \\__\\/         \\__\\/                  \n";

    public static final String CARD_WELCOME_MESSAGE = PACKAGE
        + "Here is your package of cards!\n" + HELP_MESSAGE;
    public static final String LIST_CARD_MESSAGE = "Here is all of your cards!";
    public static final String CARD_DIVIDER_MESSAGE = "\n♠♡♢♣♤♥♦♧♠♡♢♣♤♥♦♧♠♡♢♣♤♥♦♧♠♡♢♣♤♥♦♧♠♡♢♣♤♥♦♧♠♡♢♣♤♥♦♧\n";
    public static final String ASK_CARD_INDEX = "Enter the ID of card (-1 to exit): ";

    // Difficult game messages
    public static final String DIFFICULT_LOGO = "                     ==\\\\\n"
            + "                     || \\\\\n"
            + "                  ________\\\n"
            + "                 |________|\\\n"
            + "                 | .\\  /. | \\\n"
            + "                {|   ^^   |}\n"
            + "                  \\ /||\\ /\n"
            + "                   \\|__|/\n"
            + "              =____||  ||____=\n"
            + "     \\\\/\\    /                \\    /\\//\n"
            + "    \\\\/  \\  /           .      \\  /  \\//\n"
            + "     /    \\/                    \\/    \\\n"
            + "      \\            .                 /\n"
            + "       \\                            /\n"
            + "        \\_                        _/\n";

    public static final String FINISH_DIFFICULT_MODE = "Congratulation! "
            + "You have finished all the tasks of Difficult Mode!!";

    // Error messages
    public static final String ERR_PLAYER_FILE_NOTFOUND_MESSAGE =
        " not found or does not exists. Default settings will be loaded.";
    public static final String ERR_PLAYER_FILE_CORRUPTED_MESSAGE =
        "Data file %s is corrupted. Default settings will be loaded instead.";
    public static final String ERR_UNKNOWN_COMMAND = "Unknown command.\n" + HELP_MESSAGE;
    public static final String ERR_UNEXPECTED_INPUT = "Unexpected input.\n" + HELP_MESSAGE;
    public static final String ERR_EMPTY_STRING = "Please provide an input.";
    public static final String ERR_UNKNOWN_INPUT = "Please enter one of the options provided.";
    public static final String ERR_INPUT_MISMATCH_INT_EXPECTED = "Please enter an integer.";
    public static final String ERR_INPUT_MISMATCH_DOUBLE_EXPECTED = "Please enter a number.";
    public static final String ERR_BOOLEAN_INPUT = "Please enter \"y\" for yes, \"n\" for no.";
    public static final String ERR_DATE_INPUT = "Please enter a valid date.";
    public static final String ERR_TIME_INPUT = "Please enter a valid time.";
    public static final String ERR_INVALID_NUMBER = "Please enter a number from either 1 or 2.";
    public static final String ERR_PLAY_INVALID_NUMBER = "Please enter a number from either 1, 2 or 3.";
    public static final String ERR_INVALID_CARD_ID = "OOPS! It seems that you input an invalid card id, "
            + "Please try again!";

    //Player messages
    public static final String PLAYER_NAME_ENTER_PROMPT = "Enter your player name: ";
    public static final String PLAYER_ID_PROMPT = "Remember your ID to continue your game next time: %s\n";
    public static final String GAME_RECORD_LOADING = "Game Loading ...\n0 ███████████████████] 100%";
}
