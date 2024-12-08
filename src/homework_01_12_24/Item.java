package homework_01_12_24;

public class Item {
    private int id;
    private String name;
    private double price;
    private String gift;

    public Item(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.gift = null; // Initially no gift
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void addGift(String gift) {
        this.gift = gift;
    }

    public String getGift() {
        return gift;
    }

    public void removeGift() {
        this.gift = null;
    }

    public void print() {
        System.out.println("Item{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", gift=" + (gift != null ? gift : "No Gift") +
                '}');
    }
}
