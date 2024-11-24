package homework_20_11_24;

public abstract class ITWorker {
    protected String name;
    protected String lastname;

    public ITWorker(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;

    }

    public abstract String[] getSkills() ;

    public abstract void doesWork();
}
