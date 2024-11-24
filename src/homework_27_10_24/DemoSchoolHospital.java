package homework_27_10_24;

public class DemoSchoolHospital {
    public static void main(String[] args) {
        School school1 = new School(700, 50);
        school1.addPupil(new Pupil("Poxos", "Poxosyan", 7));
        school1.addPupil(new Pupil("Anna", "Gevorgyan", 10));
        school1.addPupil(new Pupil("Garnik", "Sargsyan", 8));
        school1.addPupil(new Pupil("Ani", "Minasyan", 15));
        school1.print();

        Hospital hospital = new Hospital(10, 10, "Korona", "Grip");
        hospital.addDoctors(new String[]{"Vladik", "Gexam", "Vartush", "Poxos", "Anush"});
        hospital.removeDoctor("Anus");
        hospital.printDoctors();

    }

}
