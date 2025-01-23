package homework_19_01_24;

public class StudentGrades implements Comparable<StudentGrades> {
    private int mathKnowledge;
    private int physicsKnowledge;
    private int historyKnowledge;
    private String name;

    public StudentGrades(String name, int mathKnowledge, int physicsKnowledge, int historyKnowledge) {
        this.name = name;
        this.mathKnowledge = mathKnowledge;
        this.physicsKnowledge = physicsKnowledge;
        this.historyKnowledge = historyKnowledge;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(StudentGrades o) {
        int averageGrade1 = (this.mathKnowledge + this.physicsKnowledge + this.historyKnowledge) / 3;
        int averageGrade2 = (o.mathKnowledge + o.physicsKnowledge + o.historyKnowledge) / 3;
        return averageGrade1 - averageGrade2;

    }

    @Override
    public String toString() {
        return "{" + this.name + ", " + this.mathKnowledge + ", " + this.physicsKnowledge + ", " + this.historyKnowledge + "}";
    }
    @Override
    public boolean equals(Object o) {
        return this.toString().equals(o.toString());
    }

}
