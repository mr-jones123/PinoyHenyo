public class Members {
    private static final String[][] _mems = {
            { "Aaron Philip G. Paz", "QA Tester" },
            { "Alpha Romer Coma", "Programmer" },
            { "Carlo Dela Cruz", "Documentation Specialist" },
            { "Exequiel Enriquez", "Project Manager" },
            { "Xynil Lacap", "Systems Analyst"}
    };
    
    public void printMembers() {
        for (String[] member : _mems) {
            System.out.println(member[0] + " - " + member[1]);
        }
    }
}
