package homework_20_10_24;

public class SmartLight {
    private boolean isOn;
    private int brightness;
    private String color;

    public SmartLight(boolean isOn, int brightness, String color) {
        setOn(isOn);
        setBrightness(brightness);
        setColor(color);
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        if (brightness < 0 || brightness > 100) {
            System.out.println("Brightness can not be less than 0 or bigger than 100");
            System.exit(2);
        }
        this.brightness = brightness;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void toggle() {
        isOn = !isOn;
        System.out.println(isOn ? "Light is on" : "Light is off");
    }
}
