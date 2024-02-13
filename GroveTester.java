public class GroveTester {
    public static void main(String[] args) {
        Grove grove1 = new Grove("Grove 1");
        System.out.println(0);

        // Instantiate seven Tree objects of species Spruce and age 37, and add them to Grove One
        for (int i = 0; i < 7; i++) {
            Tree spruceTree = new Tree(i, 37, "Spruce");
            grove1.plantTree(spruceTree);
        }
        System.out.println(grove1.getTrees().size());

        // Remove the Trees from Grove One at index 3 and 5.
        grove1.removeTree(3);
        grove1.removeTree(5);
        System.out.println(grove1.getTrees().size());

        // Instantiate one Tree object of species Maple and age 13, and add it to Grove One
        Tree mapleTree = new Tree(0, 13, "Maple");
        grove1.plantTree(mapleTree);
        System.out.println(grove1.getTrees().size());
    }
}
