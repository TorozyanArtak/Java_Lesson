package homework_20_11_24;

public class ProjectManager extends ITWorker {
    public ProjectManager(String name, String lastname) {
        super(name, lastname);
    }

    @Override
    public String[] getSkills() {
        return new String[] {"Manage", "Take responsibility", "Time tracking"};
    }

    @Override
    public void doesWork() {
        System.out.println("The Project manager defines project scope and objectives.");
    }
}
