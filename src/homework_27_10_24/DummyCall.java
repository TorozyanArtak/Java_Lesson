package homework_27_10_24;


public class DummyCall {

    protected String[] members;

    public static int duration;

    public DummyCall(String... members) {
        if (members.length != 2) {
            System.out.println("Call should be between 2 persons");
            System.exit(1);
        }
        this.members = members;
        duration = 0;
    }

    public DummyCall() {
    }

    public void acceptCall() {
        System.out.println("Call accepted.");
    }

    public void dropCall(int d) {
        System.out.println("Call finished.");
        duration = d;
    }

    public int getDuration() {
        return duration;
    }
}


