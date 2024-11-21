package homework_20_11_24;

import java.util.Random;

public abstract class Developer extends ITWorker {
    protected String[] ide;
    protected Random randomStatus = new Random();
    public Developer(String name, String lastname, String[] skills, String[] ide) {
        super(name, lastname, skills);
        this.ide = ide;
    }

    public abstract boolean doHealthCheck() ;

    public String[] usesIDE() {
        return ide;
    }
}