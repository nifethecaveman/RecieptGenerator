import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<List<String>> items = new ArrayList<>();
        int cost = 0, i;

//        for (i=0;i == m;) {
        int v, c;
        while (true) {

            List<String> eachItem = new ArrayList<>();

            System.out.println("What would you like to buy");
            String shop = input.nextLine().toLowerCase();
            eachItem.add(shop);

            System.out.println("How many " + shop + " are you buying?");
            String quantity = input.nextLine().toLowerCase();
            eachItem.add(quantity);

            System.out.println("Enter unit price of " + shop);
            String price = input.nextLine().toLowerCase();
            eachItem.add(price);
            v = Integer.parseInt(price);
            c = Integer.parseInt(quantity);
            cost += v * c;

            items.add(eachItem);


            System.out.println("Do you want to add another item?");
            String loop = input.nextLine().toLowerCase();
            if (loop.equals("no"))
                break;
        }

        System.out.println("--------RECEIPT----------");
        System.out.println("ITEM         QUANTITY      UNIT PRICE      TOTAL PRICE");
        for (i = 0; i < items.size(); i ++) {
            v = Integer.parseInt(items.get(i).get(1));
            c = Integer.parseInt(items.get(i).get(2));
            System.out.println(items.get(i).get(0) + "            " + items.get(i).get(1) + "             " + items.get(i).get(2) + "                 " + (c*v));
        }
        System.out.println("Your total cost = #"+cost);
    }
}
/*
            if (shop.equals("apple")) {
                items.add("apple");
                System.out.println("Apples cost 5 naira, Confirm Purchase?(Yes/No)");
                String apple = input.nextLine().toLowerCase();
                if (apple.equals("yes")) {
                    cost += 5;
                    System.out.println("ADDED TO CART");
                } else System.out.println("Cancelling Purchase...");
            }
            if (shop.equals("orange")) {
                System.out.println("Oranges cost 3 naira, Confirm Purchase?(Yes/No)");
                String orange = input.nextLine().toLowerCase();
                if (orange.equals("yes")) {
                    cost += 3;
                    System.out.println("ADDED TO CART");
                } else System.out.println("Cancelling Purchase...");
            }
            if (shop.equals("tomato")) {
                System.out.println("Tomatoes cost 11 naira, Confirm Purchase?(Yes/No)");
                String tomato = input.nextLine().toLowerCase();
                if (tomato.equals("yes")) {
                    cost += 11;
                    System.out.println("ADDED TO CART");
                } else System.out.println("Cancelling Purchase...");
            }
            if (shop.equals("pineapple")) {
                System.out.println("Pineapples cost 13 naira, Confirm Purchase?(Yes/No)");
                String tomato = input.nextLine().toLowerCase();
                if (tomato.equals("yes")) {
                    cost += 11;
                    System.out.println("ADDED TO CART");
                } else System.out.println("Cancelling Purchase...");
            }
            System.out.println("Would you like to buy anything else(Yes/No)");
            String loop = input.nextLine().toLowerCase();
            if (loop.equals("no"))
            break;
        }
        System.out.println("Your total cost is" + cost);
    }
}
*/