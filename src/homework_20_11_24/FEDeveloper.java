package homework_20_11_24;

import java.util.Random;

public class FEDeveloper extends Developer{

    public FEDeveloper(String name, String lastname) {
        super(name, lastname);
    }

    @Override
    public String[] getSkills() {
        return new String[] {"javascript", "ReactJS"};
    }

    @Override
    public void doesWork() {
        System.out.println("FE developer implements web sites");
    }

    @Override
    public boolean doHealthCheck() {
        Random randomStatus = new Random();
        System.out.println("Calling to API https/ararat.am/fe/healthCheck ");
        return randomStatus.nextBoolean();
    }

}
