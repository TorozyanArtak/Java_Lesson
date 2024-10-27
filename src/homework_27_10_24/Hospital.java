package homework_27_10_24;

public class Hospital extends Building {
    private int roomsCount;

    private int maxDoctorsCount;
    private int doctorCount;

    private String[] illnesses;

    private String[] doctors;

    public Hospital(int roomsCount, int doctorsCount, String... illnesses) {
        super(7, 110);
        setRoomsCount(roomsCount);
        setMaxDoctorsCount(doctorsCount);
        setIllnesses(illnesses);
    }

    public int getRoomsCount() {
        return roomsCount;
    }

    public void setRoomsCount(int roomsCount) {
        if (roomsCount < 1) {
            System.out.println("Rooms count cannot be less tan 1");
            System.exit(1);
        }
        this.roomsCount = roomsCount;
    }

    public int getMaxDoctorsCount() {
        return maxDoctorsCount;
    }

    public void setMaxDoctorsCount(int maxDoctorsCount) {
        if (maxDoctorsCount < 1) {
            System.out.println("Doctors count cannot be less tan 1");
            System.exit(1);
        }
        this.maxDoctorsCount = maxDoctorsCount;
    }

    public String[] getIllnesses() {
        return illnesses;
    }

    public void setIllnesses(String[] illnesses) {
        if (illnesses.length < 1) {
            System.out.println("Illnesses length cannot be less tan 1");
            System.exit(1);
        }
        this.illnesses = illnesses;
    }

    public void addDoctors(String[] doctors) {
        if (getMaxDoctorsCount() < doctors.length) {
            System.out.println("Hospital maximum doctors count cannot be less than set doctors count");
            System.exit(1);
        }
        this.doctors = doctors;
        doctorCount = doctors.length;
    }

    public void removeDoctor(String name) {
        int i;
        for (i = 0; i < doctors.length; i++) {
            if (doctors[i].equals(name)) {
                System.out.println(name + " doctor was removed from the hospital");
                doctors[i] = null;
                doctorCount--;
            }
        }
        if (i == doctors.length) {
            System.out.println("There isn't a doctor with " + name + " name");
        }

    }

    public void printDoctors() {
        System.out.println("Currently there are " + doctorCount + " doctors in the hospital");
        for (String doctor : doctors) {
            if (null != doctor) {
                System.out.println(doctor);
            }
        }
    }

}
