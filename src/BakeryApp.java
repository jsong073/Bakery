import java.util.*;

public class BakeryApp {
    public static void main(String[] args) {
        BakedGood example = new BakedGood();
        BakedGood example2 = new BakedGood("cake", 25, "March 9 2020", 5);
        BakedGood cookie = new BakedGood("cookie", 5, "5/21/2020", 20);
        System.out.println(example2.getName());
        System.out.println(example2.getPrice());
        String information = example2.toString();
        System.out.println(information);
        System.out.println();
        cookie.addDietRestriction("peanuts");
        System.out.println(cookie.toString());
    }
}
