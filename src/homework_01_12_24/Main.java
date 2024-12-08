package homework_01_12_24;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        Item laptop = new Item(1, " Lenovo Laptop", 400000);
        laptop.addGift("Smartphone worth 100.000 AMD");
        basket.addItem(laptop);

        Item tv = new Item(2, "Sony TV", 300000);
        tv.addGift("Hairdryer worth 30000");
        basket.addItem(tv);

        Item tv2 = new Item(3, "Samsung TV", 200000);
        basket.addItem(tv2);

        basket.print();//զամբյուղի պարունակությունը նախքան գնելը

        try {
            basket.checkout(100000);
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        basket.print();//զամբյուղի պարունակությունը գնելուց հետո
    }
}
