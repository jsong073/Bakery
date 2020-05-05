Bakery assignment on Canvas  
Jaeha Song  
Kal Ab

1. Using two classes, Bakery and BakedGood, simulates a bakery with various allergen-free products
2. BakedGood contains the following instance variables:
- String name
- double price
- String expirationDate
- ArrayList(String) dietRestriction
- int quantity
3. BakedGood also contains two methods, toString and addDietRestriction:
- toString prints out all the information about the current BakedGood
- addDietRestriction uses the ArrayList's add method to add a String to the dietRestriction
4. Bakery contains the following instance variables:
- ArrayList(BakedGood) inventory
- String name
5. Bakery contains the following methods
- toString prints out the name of the bakery and its entire inventory
- add takes a BakedGood parameter and adds it to the BakedGood ArrayList inventory
- filterResults takes a String parameter and goes through each BakedGood in the inventory and looks at its dietRestriction. If the parameter equals the dietRestriction of that BakedGood, it skips it. Otherwise, it prints out that BakedGood using the BakedGood's toString method. If the parameter equals "all", it prints out every BakedGood in the inventory variable
6. Inside the main method, 15 BakedGood objects were instantiated and added to the Bakery object. The main method then asks the user for their allergy using the Scanner class, and then prints out all the BakedGoods that do not have that allergen, using the filterResults method in Bakery.
