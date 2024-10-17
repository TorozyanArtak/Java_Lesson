package homework_17_10_24;

public class Home {
    public double areaBedroom;
    public double areaLivingRoom;
    public double areaKitchen;
    public double areaCorridor;
    public double areaBathroom;

    public Home(double areaBedroom, double areaLivingRoom, double areaKitchen, double areaCorridor, double areaBathroom) {
        this.areaBedroom = setArea(areaBedroom);
        this.areaLivingRoom = setArea(areaLivingRoom);
        this.areaKitchen = setArea(areaKitchen);
        this.areaCorridor = setArea(areaCorridor);
        this.areaBathroom = setArea(areaBathroom);
    }

    public Home(double areaBedroom, double areaLivingRoom, double areaKitchen, double areaCorridor) {
        this(areaBedroom, areaLivingRoom, areaKitchen, areaCorridor, 5.2);
    }

    public double setArea(double size) {
        if (size <= 0) {
            System.out.println("Room area can not be 0 or less");
            System.exit(2);
        }
        return size;
    }

    public void printAreas() {
        System.out.println("Bedroom size is " + areaBedroom);
        System.out.println("Living room size is " + areaLivingRoom);
        System.out.println("Kitchen size is " + areaKitchen);
        System.out.println("Corridor size is " + areaCorridor);
        System.out.println("Bathroom size is " + areaBathroom);

    }

    public static void main(String[] args) {
        Home myHome1 = new Home(5.0, 24.0, 12.0, 8.0, 6.2);
        myHome1.printAreas();
        Home myHome2 = new Home(0, 28.0, 14.5, 7.4);
        myHome2.printAreas();
    }
}
