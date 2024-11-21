package homework_20_11_24;

public class FullStackDeveloper extends FEDeveloper {

    public FullStackDeveloper(String name, String lastname, String[] skills, String[] ide) {
        super(name, lastname, skills, ide);
    }

    @Override
    public void doesWork() {
        System.out.println("Full stack developer implements web sites and backend sites");

    }

    @Override
    public boolean doHealthCheck() {
        boolean feHealthCheck = super.doHealthCheck();
        System.out.print("& Calling to API https/ararat.am/be/healthCheck ");
        return feHealthCheck && randomStatus.nextBoolean();
    }
}