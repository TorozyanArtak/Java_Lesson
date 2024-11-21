package homework_20_11_24;

public class ProjectManager extends ITWorker {
    public ProjectManager(String name, String lastname) {
        super(name, lastname, "Manage", "Take responsibility", "Time tracking");
    }

    @Override
    public void doesWork() {
        System.out.print("the Project manager does the following: ");
        for (String skill : skills) {
            System.out.print(" " + skill+ " ");
        }
        System.out.println();
    }
}
