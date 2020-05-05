import java.util.*;

public class BakeryApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] allergens = {"peanut", "tree nut", "dairy", "gluten", "soy", "egg"};
        Bakery store = new Bakery("JK Bakery");
        BakedGood carrotCake = new BakedGood("carrot cake", 25, "March 9 2020", allergens[1], 5);
        BakedGood peanutCookie = new BakedGood("peanut butter cookie", 5, "5/21/2020", allergens[0],20);
        BakedGood bananaBread = new BakedGood("banana bread", 15, "5/15/2020", allergens[1], 4);
        BakedGood fruitTart = new BakedGood("fresh fruit tart", 23, "5/10/2020", allergens[2], 3);
            fruitTart.addDietRestriction(allergens[5]);
        BakedGood branMuffin = new BakedGood("bran muffin", 3.5, "5/8/2020", allergens[1], 13);
        BakedGood savoryRoll = new BakedGood("savory roll", 3.5, "5/8/2020", allergens[5], 10);
        BakedGood raisinBread = new BakedGood("raisin bread", 8, "5/12/2020", allergens[3], 6);
        BakedGood cheesePastry = new BakedGood("cheese pastry", 4, "5/10/2020", allergens[2], 8);
            cheesePastry.addDietRestriction(allergens[5]);
        BakedGood cinnamonBun = new BakedGood("cinnamon bun", 3.5, "5/15/2020", allergens[3], 5);
        BakedGood frostedCookie = new BakedGood("frosted cookie", 2, "5/16/2020", allergens[1], 12);
            frostedCookie.addDietRestriction(allergens[0]);
        BakedGood applePie = new BakedGood("apple pie", 12, "5/12/2020", allergens[4], 4);
            applePie.addDietRestriction(allergens[5]);
        BakedGood calzone = new BakedGood("calzone", 2.5, "5/10/2020", allergens[4], 8);
        BakedGood chocolateChipMuffin = new BakedGood("chocolate chip muffin", 2.5, "5/10/2020",
                allergens[2], 6);
        BakedGood breadRoll = new BakedGood("bread roll", 6, "5/12/2020", allergens[3], 6);
        BakedGood riceCake = new BakedGood("rice cake", 1.5, "5/15/2020", allergens[4], 8);
        store.add(carrotCake);
        store.add(peanutCookie);
        store.add(bananaBread);
        store.add(fruitTart);
        store.add(branMuffin);
        store.add(savoryRoll);
        store.add(raisinBread);
        store.add(cheesePastry);
        store.add(cinnamonBun);
        store.add(frostedCookie);
        store.add(applePie);
        store.add(calzone);
        store.add(chocolateChipMuffin);
        store.add(breadRoll);
        store.add(riceCake);

        /*
        System.out.println(carrotCake.getName());
        System.out.println(carrotCake.getPrice());
        String information = cake.toString();
        System.out.println(information);
        System.out.println();
        cookie.addDietRestriction("peanuts");
        System.out.println(cookie.toString());
         */
        //String test = bakery.toString();
        //System.out.println(test);
        //System.out.println(store.toString());
        System.out.println("Welcome to " + store.getName() + ". To see a list of everything we have, please type " +
                "\"all\". What are you allergic to?");
        System.out.println(Arrays.toString(allergens));
        String response = input.nextLine();
        String filterResult = store.filterResults(response);
        System.out.println(filterResult);

    }
}
