import java.util.ArrayList;

public class Grove {
    private ArrayList<Tree> trees;
    private String groveName;

    public Grove(String groveName) {
        this.groveName = groveName;
        this.trees = new ArrayList<>(12); // initialize with size 12
    }

    public int plantTree(Tree tree) {
        if (trees.size() < 12) {
            trees.add(tree);
            return trees.size() - 1; // index where the tree is planted
        } else {
            return -1; // no spots available
        }
    }

    public Tree removeTree(int index) {
        if (index >= 0 && index < trees.size()) {
            return trees.remove(index);
        } else {
            return null; // index out of bounds
        }
    }

    public ArrayList<Tree> getTrees() {
        return trees;
    }

    public String getGroveName() {
        return groveName;
    }
}
