import java.util.ArrayList;

public class Bakery {
    private ArrayList<BakedGood> inventory;
    private String name;

    //Constructors
    public Bakery () {
        inventory = new ArrayList<>();
        name = "";
    }

    public Bakery (ArrayList<BakedGood> inventory, String name) {
        this.inventory = inventory;
        this.name = name;
    }

    public Bakery(String name) {
        this.name = name;
        inventory = new ArrayList<>();
    }


    //Getters and Setters
    public ArrayList<BakedGood> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<BakedGood> inventory) {
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Methods
    @Override
    public String toString() {
        String output = name + " \n";
        for (int i = 0; i < inventory.size(); i++) {
            output += "Item " + (i + 1) + ": \n";
            output += inventory.get(i).toString() + "\n\n";
        }
        output += "------------------ \n";
        return output;
    }

    public void add(BakedGood item) {
        this.inventory.add(item);
    }

    public String filterResults(String allergen) {
        String output = "";
        if (allergen.equalsIgnoreCase("all")) {
            output += this.toString();
        } else {
            output += "Here are our baked goods that don't contain any " + allergen + ": \n";
            for (int i = 0; i < inventory.size(); i++) {
                if (inventory.get(i).getDietRestriction().contains(allergen) == true) {
                    continue;
                } else {
                    output += "Item " + (i + 1) + ": \n";
                    output += inventory.get(i).toString() + "\n\n";
                }
            }

        }
        return output;
    }
}
