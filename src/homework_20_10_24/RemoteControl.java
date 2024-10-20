package homework_20_10_24;

public class RemoteControl {
    public void resetLight(SmartLight smartLight) {
        smartLight.setOn(false);
        smartLight.setBrightness(50);
        smartLight.setColor("white");
    }
    //
    public SmartLight getLightStatus(SmartLight smartLight) {
        return smartLight;
    }
    public void changeBrightness(SmartLight smartLight, int newBrightness) {
        smartLight.setBrightness(newBrightness);
    }

    public void pressBottom(SmartLight smartLight) {
        smartLight.toggle();
    }

    public void printStatus(SmartLight smartLight) {
        System.out.println("Light is on - " + smartLight.isOn());
        System.out.println("Brightness is " + smartLight.getBrightness());
        System.out.println("Light color is " + smartLight.getColor());
    }
}

