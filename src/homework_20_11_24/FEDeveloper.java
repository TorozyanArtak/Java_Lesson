package homework_20_11_24;

public class FEDeveloper extends Developer{

    public FEDeveloper(String name, String lastname, String[] skills, String[] ide) {
        super(name, lastname, skills, ide);
    }
    public String[] getSkills() {
        return new String[]{"jhjhj","jkjkjk"};
    }
    @Override
    public void doesWork() {
        System.out.println("FE developer implements web sites");
    }
    @Override
    public boolean doHealthCheck() {
        System.out.print("Calling to API https/ararat.am/fe/healthCheck ");
        return randomStatus.nextBoolean();
    }
}
