package homework_20_11_24;

public class ITWorker {
    protected String name;
    protected String lastname;
    protected String[] skills;

    public ITWorker(String name, String lastname, String... skills) {
        this.name = name;
        this.lastname = lastname;
        this.skills = skills;
    }

    public String[] getSkills() {
        return skills;
    }

    public abstract void doesWork();
}
