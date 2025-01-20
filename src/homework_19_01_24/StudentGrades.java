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

    public int getMathKnowledge() {
        return mathKnowledge;
    }

    public void setMathKnowledge(int mathKnowledge) {
        this.mathKnowledge = mathKnowledge;
    }

    public int getPhysicsKnowledge() {
        return physicsKnowledge;
    }

    public void setPhysicsKnowledge(int physicsKnowledge) {
        this.physicsKnowledge = physicsKnowledge;
    }

    public int getHistoryKnowledge() {
        return historyKnowledge;
    }

    public void setHistoryKnowledge(int historyKnowledge) {
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
}
