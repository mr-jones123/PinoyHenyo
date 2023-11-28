public class Auxillary {
    private static final String[][] _mems = {
            { "Aaron Philip G. Paz", "QA Tester" },
            { "Alpha Romer Coma", "Programmer" },
            { "Carlo Dela Cruz", "Documentation Specialist" },
            { "Exequiel Enriquez", "Project Manager" },
            { "Xynil Lacap", "Systems Analyst" }
    };

    private void printMembers() {
        for (String[] member : _mems) {
            System.out.println(member[0] + " - " + member[1]);
        }
    }

    String introAscii = " _______   __                                      __    __          \n" +
            "|       \\ |  \\                                    |  \\  |  \\         \n" +
            "| $$$$$$$\\ \\$$ _______    ______   __    __       | $$  | $$  ______   _______   __    __   ______  \n" +
            "| $$__/ $$|  \\|       \\  /      \\ |  \\  |  \\      | $$__| $$ /      \\ |       \\ |  \\  |  \\ /      \\ \n"
            +
            "| $$    $$| $$| $$$$$$$\\|  $$$$$$\\| $$  | $$      | $$    $$|  $$$$$$\\| $$$$$$$\\| $$  | $$|  $$$$$$\\\n"
            +
            "| $$$$$$$ | $$| $$  | $$| $$  | $$| $$  | $$      | $$$$$$$$| $$    $$| $$  | $$| $$  | $$| $$  | $$\n" +
            "| $$      | $$| $$  | $$| $$__/ $$| $$__/ $$      | $$  | $$| $$$$$$$$| $$  | $$| $$__/ $$| $$__/ $$\n" +
            "| $$      | $$| $$  | $$ \\$$    $$ \\$$    $$      | $$  | $$ \\$$     \\| $$  | $$ \\$$    $$ \\$$    $$\n"
            +
            " \\$$       \\$$ \\$$   \\$$  \\$$$$$$  _\\$$$$$$$       \\$$   \\$$  \\$$$$$$$ \\$$   \\$$ _\\$$$$$$$  \\$$$$$$ \n"
            +
            "                                  |  \\__| $$                                    |  \\__| $$          \n" +
            "                                   \\$$    $$                                     \\$$    $$          \n" +
            "                                    \\$$$$$$                                       \\$$$$$$           ";

    public void printIntro() {
        System.out.println(introAscii);
        System.out.println("Welcome to Pinoy Henyo!");
        System.out.println("-----------------------");
    }

    String outroAscii = " /$$$$$$$$ /$$                           /$$             /$$     /$$                  /$$\n" +
            "|__  $$__/| $$                          | $$            |  $$   /$$/                 | $$\n" +
            "   | $$   | $$$$$$$   /$$$$$$  /$$$$$$$ | $$   /$$       \\  $$ /$$//$$$$$$  /$$   /$$| $$\n" +
            "   | $$   | $$__  $$ |____  $$| $$__  $$| $$  /$$/        \\  $$$$//$$__  $$| $$  | $$| $$\n" +
            "   | $$   | $$  \\ $$  /$$$$$$$| $$  \\ $$| $$$$$$/          \\  $$/| $$  \\ $$| $$  | $$|__/\n" +
            "   | $$   | $$  | $$ /$$__  $$| $$  | $$| $$_  $$           | $$ | $$  | $$| $$  | $$    \n" +
            "   | $$   | $$  | $$|  $$$$$$$| $$  | $$| $$ \\  $$          | $$ |  $$$$$$/|  $$$$$$/ /$$\n" +
            "   |__/   |__/  |__/ \\_______/|__/  |__/|__/  \\__/          |__/  \\______/  \\______/ |__/\n" +
            "                                                                                         \n" +
            "                                                                                         \n" +
            "                                                                                         ";

    public void printOutro() {
        System.out.println(outroAscii);
        System.out.println("-----------------------");
        System.out.println("Thank you for playing Pinoy Henyo!");
        System.out.println("Here are the members of the group:");
        printMembers();
    }
}
