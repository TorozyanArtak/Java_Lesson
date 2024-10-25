package homework_24_10_24;

public class TestComputer {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        computer1.printDetails();
        System.out.println("---------------");
        Computer computer2 = new Computer();
        computer2.printDetails();
        System.out.println("---------------");
        Computer computer3 = new Computer(64,512);
        computer3.printDetails();
        System.out.println("---------------");
        Computer computer4 = Computer.generateMegaComputer(256,4*1024);
        computer4.printDetails();
    }
}
