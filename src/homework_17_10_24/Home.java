package homework_17_10_24;

public class Home {
    private double areaBedroom;
    private double areaLivingRoom;
    private double areaKitchen;
    private double areaCorridor;
    private double areaBathroom;

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
}
