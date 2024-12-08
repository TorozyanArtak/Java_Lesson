package homework_01_12_24;

import java.util.Scanner;

public class Basket {
    private Item[] items;
    private int itemCount;

    public Basket() {
        this.items = new Item[10];
        this.itemCount = 0;
    }

    public void addItem(Item item) {
        if (itemCount < items.length) {
            items[itemCount++] = item;
        } else {
            System.out.println("Basket is full! Cannot add more items.");
        }
    }

    public void checkout(double cardBalance) {
        int giftCount = getItemsCount();

        if (giftCount > 2) {
            throw new RuntimeException("There are more than one gift.");
        }
        if (giftCount == 2) {
            System.out.println("You can only select one gift. Please remove an item gift:");
            for (int i = 0; i < itemCount; i++) {
                if (items[i].getGift() != null) {
                    items[i].print();
                }
            }
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input the ID of the item which gift you would like to remove: ");
            int id = scanner.nextInt();
            for (int i = 0; i < itemCount; i++) {
                if (items[i].getId() == id && items[i].getGift() != null) {
                    items[i].removeGift();
                    giftCount--;
                    break;
                }
            }
        }
        if (giftCount > 1) {
            throw new RuntimeException("There are more than one gift.");
        }
        double totalCost = 0;
        for (int i = 0; i < itemCount; i++) {
            totalCost += items[i].getPrice();
        }
        if (cardBalance < totalCost) {
            throw new RuntimeException("Card balance isn't enough to checkout");
        }
        System.out.println("Checkout successful. Total cost: " + totalCost);

        this.items = new Item[items.length];
        this.itemCount = 0;
    }

    private int getItemsCount() {
        int giftCount = 0;
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getGift() != null) {
                giftCount++;
            }
        }
        return giftCount;
    }

    public void print() {
        System.out.println("basket[");
        for (int i = 0; i < itemCount; i++) {
            items[i].print();
        }
        System.out.println("]");
    }
}
