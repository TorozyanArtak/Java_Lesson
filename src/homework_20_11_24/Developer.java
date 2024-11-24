package homework_20_11_24;

import java.util.Random;

public abstract class Developer extends ITWorker {

    public Developer(String name, String lastname) {
        super(name, lastname);

    }

    public abstract boolean doHealthCheck();

    public String[] usesIDE() {

        return new String[]{"IntellijIdea", "PyCharm"};
    }

}