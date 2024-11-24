package homework_27_10_24;

public class DummyAppProMax extends DummyAppPro {

    private boolean screenShare = false;

    public DummyAppProMax(boolean camera, String... members) {
        super(camera, members);
    }

    public void switchScreenShare() {
        if (screenShare) {
            screenShare = false;
            System.out.println("Turning off screen share");
        } else {
            screenShare = true;
            System.out.println("Turning on screen share");
        }
    }

}
