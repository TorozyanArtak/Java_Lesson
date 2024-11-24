package homework_27_10_24;

public class School extends Building {
    private int teachersCount;
    private final int MAX_PUPILS_COUNT;
    private int existingPupilCount;
    private Pupil[] pupils;

    public School(int pupilsCount, int teachersCount) {
        this(5, 220, pupilsCount, teachersCount);
    }

    public School(int drainageSystemCount, int electricityVoltage, int pupilsCount, int teachersCount) {
        super(drainageSystemCount, electricityVoltage);
        setTeachersCount(teachersCount);
        checkPupilsCount(pupilsCount);
        this.MAX_PUPILS_COUNT = pupilsCount;
        existingPupilCount = 0;
        pupils = new Pupil[MAX_PUPILS_COUNT];
    }

    public int getTeachersCount() {
        return teachersCount;
    }

    public void setTeachersCount(int teachersCount) {
        if (teachersCount < 1) {
            System.out.println("Teachers count cannot be less tan 1");
            System.exit(1);
        }
        this.teachersCount = teachersCount;
    }

    public int getMaxPupilsCount() {
        return MAX_PUPILS_COUNT;
    }

    private void checkPupilsCount(int count) {
        if (count < 1) {
            System.out.println("Pupils count cannot be less tan 1");
            System.exit(1);
        }
    }

    public void addPupil(Pupil pupil) {
        if (existingPupilCount < MAX_PUPILS_COUNT) {
            pupils[existingPupilCount] = pupil;
            existingPupilCount ++;
        } else {
            System.out.println("There isn't enough pupil space to add");
        }
    }

    public void print() {
        System.out.println("School drainage system count " + getDrainageSystemCount());
        System.out.println("School electricity voltage is " + getElectricityVoltage());
        System.out.println("School teachers count " + getTeachersCount());
        System.out.println("School maximum pupils count " + getMaxPupilsCount());
        System.out.println("School current pupils count " + existingPupilCount);
        for (int i = 0; i < existingPupilCount; i++) {
            pupils[i].printInfo();
        }
    }

}
