package homework_27_10_24;

public class DummyAppPro extends DummyCall {

    protected boolean camera;

    DummyAppPro(boolean camera, String... members) {
        super();
        if (members.length > 10) {
            System.out.println("Call should be maximum between 10 persons");
            System.exit(1);
        }
        this.camera = camera;
    }

    public void switchCamera() {
        camera = !camera;
    }
}

