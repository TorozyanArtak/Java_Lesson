package homework_27_10_24;

public class DemoCall {
    public static void main(String[] args) {
        DummyAppPro dummyAppPro = new DummyAppPro(true, "test", "asd", "sdsdsd");
        dummyAppPro.acceptCall();
        dummyAppPro.dropCall(20);
        dummyAppPro = null;

        DummyAppProMax dummyAppProMax = new DummyAppProMax(false, "Hasmik", "Zaven", "Karen", "Harut");
        dummyAppProMax.switchScreenShare();
        dummyAppProMax.dropCall(0);
        dummyAppProMax = null;

        DummyCall dummyCall = new DummyCall("Artur", "Anna");
        dummyCall.acceptCall();
        dummyCall.dropCall(60);
        System.out.println("Last call duration " + dummyCall.getDuration());
        dummyCall = null;

    }

}
