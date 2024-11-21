package homework_20_11_24;

public class Main {
    public static void main(String[] args) {
        ITWorker[] workers = {new ProjectManager("Arthur", "Minasyan"),
                new FEDeveloper("Ashot", "Grigoryan", new String[]{"javascript"}, new String[]{"WebStorm"}),
                new TestAutomationEngineer("Aram", "Aramyan", new String[]{"java", "Python"}, new String[]{"IntellijIdea", "PyCharm"}),
                new ProjectManager("Hayk", "Yeritsyan")};
        for (ITWorker worker : workers) {
            worker.doesWork();
        }

        System.out.println("-------------------------------------------------------");

        Developer[] developers = {new FEDeveloper("Ashot", "Grigoryan", new String[]{"javascript"}, new String[]{"WebStorm"}),
                new TestAutomationEngineer("Aram", "Aramyan", new String[]{"java", "Python"}, new String[]{"IntellijIdea", "PyCharm"}),
                new FullStackDeveloper("Karen", "Sahakyan", new String[]{"java", "Python", "Typescript"}, new String[]{"IntellijIdea", "PyCharm"})};

        for (Developer developer : developers) {
            System.out.println(developer.doHealthCheck());
        }

    }
}
