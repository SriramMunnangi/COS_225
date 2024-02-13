public class Tree {
    private int idNumber;
    private int age;
    private String speciesName;
    
    public Tree(int idNumber, int age, String speciesName) {
        this.idNumber = idNumber;
        this.age = age;
        this.speciesName = speciesName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public int getAge() {
        return age;
    }

    public String getSpeciesName() {
        return speciesName;
    }
}

