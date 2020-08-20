import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GroceryList {

    public static void main(String[] args) {
        HashMap<String, HashMap<String, Integer>> groceryList = new HashMap<>();
        HashMap<String, Integer> items = new HashMap<>();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to create a grocery list? y/n: ");
        String userInput = scanner.nextLine();

        boolean userAgrees = true;

        do {
            if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
                System.out.println("Given an ordered list of grocery categories to choose from, select the category using numbers: ");
                System.out.println("1) Meat\n2) Bread\n3) Drinks\n4) Vegetables");
                userInput = scanner.nextLine();
                int userCategory = Integer.parseInt(userInput);

                if (userCategory == 1) {
                    System.out.println("Enter the name of the item: ");
                    userInput = scanner.nextLine();
                    String userItem = userInput;
                    System.out.println("Quantity of this item?");
                    int userItems = scanner.nextInt();
                    items.put(userItem, userItems);
                    groceryList.put("meat", items);
                } else if (userCategory == 2) {
                    System.out.println("Enter the name of the item: ");
                    userInput = scanner.nextLine();
                    String userItem = userInput;
                    System.out.println("Quantity of this item?");
                    int userItems = scanner.nextInt();
                    items.put(userItem, userItems);
                    groceryList.put("bread", items);
                } else if (userCategory == 3) {
                    System.out.println("Enter the name of the item: ");
                    userInput = scanner.nextLine();
                    String userItem = userInput;
                    System.out.println("Quantity of this item?");
                    int userItems = scanner.nextInt();
                    items.put(userItem, userItems);
                    groceryList.put("drinks", items);
                } else if (userCategory == 4) {
                    System.out.println("Enter the name of the item: ");
                    userInput = scanner.nextLine();
                    String userItem = userInput;
                    System.out.println("Quantity of this item?");
                    int userItems = scanner.nextInt();
                    items.put(userItem, userItems);
                    groceryList.put("vegetables", items);
                }

                System.out.println("Would you like to finalize the list or add more items?\n1: finalize\n2: add more items");
                int userInputs = scanner.nextInt();

                if (userInputs == 1) {
                    userAgrees = false;
                } else if (userInputs == 2) {
                    continue;
                } else {
                    System.out.println("Would you like to finalize the list or add more items?\n1) finalize\n2: add more items");
                    userInputs = scanner.nextInt();
                }
            }

        } while (userAgrees);

        for (Map.Entry<String, HashMap<String, Integer>> entry : groceryList.entrySet()) {
            for (Map.Entry<String, Integer> entry2 : items.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry2.getKey() + ", " + entry2.getValue());
            }
        }

    }

}
