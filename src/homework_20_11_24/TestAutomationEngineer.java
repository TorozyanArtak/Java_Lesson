package homework_20_11_24;

public class TestAutomationEngineer extends Developer{

    public TestAutomationEngineer(String name, String lastname, String[]skills,String[]ide) {
        super(name, lastname, skills, ide);
    }

    @Override
    public void doesWork() {
        System.out.println("Test Automation Engineer automates test cases");
    }

    @Override
    public boolean doHealthCheck() {
        if(randomStatus.nextBoolean()) {
            System.out.print("Test case is ready " );
            return true;
        }
        else {
            System.out.println("Test case isn't ready" );
            return false;
        }
    }
}