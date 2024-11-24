package homework_20_11_24;

public class Main {
    public static void main(String[] args) {
        ITWorker[] workers = {new ProjectManager("Arthur", "Minasyan"),
                new FEDeveloper("Ashot", "Grigoryan"),
                new TestAutomationEngineer("Aram", "Aramyan"),
                new ProjectManager("Hayk", "Yeritsyan")};
        for (ITWorker worker : workers) {
            worker.doesWork();
        }

        System.out.println("-------------------------------------------------------");

        Developer[] developers = {new FEDeveloper("Ashot", "Grigoryan"),
                new TestAutomationEngineer("Aram", "Aramyan"),
                new FullStackDeveloper("Karen", "Sahakyan")};

        for (Developer developer : developers) {
            System.out.println(developer.doHealthCheck());
        }

    }
}
