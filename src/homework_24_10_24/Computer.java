package homework_24_10_24;

public class Computer {
    private int id;
    private int ram;
    private int memory;
    private static int nextId = 1;
    private static final int MAX_RAM = 64;
    private static final int MAX_MEMORY = 2048;
    public int getId(){
        return id;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        if (ram <= MAX_RAM && ram > 0) {
            this.ram = ram;
        }else {
            System.out.println("Ram size can not be negative or bigger than 64");
            System.exit(2);
        }
    }
    public int getMemory() {
        return memory;
    }
    public void setMemory(int memory) {
        if (memory <= MAX_MEMORY && memory > 0) {
            this.memory = memory;
        }else {
            System.out.println("Memory size can not be negative or bigger than 2048");
            System.exit(2);
        }
    }
    public Computer(){
        this.id = nextId ++;
        this.memory = 1024;
        this.ram = 16;
    }
    public Computer(int ram, int memory){
        setMemory(memory);
        setRam(ram);
        this.id = nextId++;
    }
    public static Computer generateMegaComputer(int ram, int memory) {
        Computer megaComputer = new Computer();
        megaComputer.id = nextId++;
        megaComputer.ram = ram;
        megaComputer.memory = memory;
        return megaComputer;
    }
    public void printDetails(){
        System.out.println("Computer ID: " + getId());
        System.out.println("RAM: " + getRam() + " GB");
        System.out.println("Memory: " + getMemory() + " GB");
    }
}
