package homework_20_11_24;

import java.util.Random;

public class FullStackDeveloper extends FEDeveloper {

    public FullStackDeveloper(String name, String lastname) {
        super(name, lastname);
    }

    @Override
    public String[] getSkills() {
        return new String[] {"javascript", "ReactJS", "Java"};
    }

    @Override
    public void doesWork() {
        System.out.println("Full stack developer implements web sites and backend sites");

    }

    @Override
    public boolean doHealthCheck() {
        Random randomStatus = new Random();
        boolean feHealthCheck = super.doHealthCheck();
        System.out.println( feHealthCheck? "Frontend is ready":"Frontend is not ready");
        System.out.println("Calling to API https/ararat.am/be/healthCheck ");
        boolean beHealthCheck = randomStatus.nextBoolean();
        System.out.println( beHealthCheck? "Backend is ready":"Backend is not ready");
        return feHealthCheck && beHealthCheck;
    }
}