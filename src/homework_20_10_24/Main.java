package homework_20_10_24;

public class Main {
    public static void main(String[] args) {
        SmartLight smartLight1 = new SmartLight(false, 88, "yellow");
        SmartLight smartLight2 = new SmartLight(true, 98, "green");
        RemoteControl remote = new RemoteControl();
        remote.changeBrightness(smartLight1, 78);
        remote.pressPowerButton(smartLight1);
        remote.printStatus(smartLight1);
        System.out.println("-------------------");
        remote.changeBrightness(smartLight2, 44);
        remote.pressPowerButton(smartLight2);
        remote.printStatus(smartLight2);
        System.out.println("-------------------");
        remote.resetLight(smartLight1);
        remote.printStatus(smartLight1);
        System.out.println("-------------------");
        remote.resetLight(smartLight2);
        remote.printStatus(smartLight2);

    }

}
