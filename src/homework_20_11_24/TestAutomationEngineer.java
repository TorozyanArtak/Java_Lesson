package homework_20_11_24;

import java.util.Random;

public class TestAutomationEngineer extends Developer{

    public TestAutomationEngineer(String name, String lastname) {
        super(name, lastname);
    }

    @Override
    public String[] getSkills() {
        return new String[]{"java"};
    }

    @Override
    public void doesWork() {
        System.out.println("Test Automation Engineer automates test cases");
    }

    @Override
    public boolean doHealthCheck() {
        Random randomStatus = new Random();
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