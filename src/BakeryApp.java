import java.util.*;

public class BakeryApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] allergens = {"peanut", "tree nut", "dairy", "gluten", "soy", "egg"};
        Bakery store = new Bakery("JK Bakery");
        BakedGood carrotCake = new BakedGood("carrot cake", 25, "March 9 2020", allergens[1], 5);
        BakedGood cookie = new BakedGood("peanut butter cookie", 5, "5/21/2020", allergens[0],20);
        BakedGood bananaBread = new BakedGood("banana bread", 15, "5/15/2020", allergens[1], 4);
        BakedGood fruitTart = new BakedGood("fresh fruit tart", 23, "5/10/2020", allergens[2], 3);
            fruitTart.addDietRestriction(allergens[5]);
        BakedGood branMuffin = new BakedGood("bran muffin", 3.5, "5/8/2020", allergens[1], 13);
        BakedGood savoryRoll = new BakedGood("savory roll", 3.5, "5/8/2020", allergens[5], 10);
        //BakedGood raisinBread = new BakedGood("raisin bread", 8, "5/12/2020", allergens[])
        store.add(carrotCake);
        store.add(cookie);
        store.add(bananaBread);
        store.add(fruitTart);
        store.add(branMuffin);
        store.add(savoryRoll);
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
        System.out.println("Welcome to " + store.getName() + ". To see a list of everything we have, please type \"all\". What are you allergic to?");
        String response = input.nextLine();
        String filterResult = store.filterResults(response);
        System.out.println(filterResult);

    }
}
