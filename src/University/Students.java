package University;

public class Students {
    int grade;
    String name;
    String surname;
    String faculty;
    int averageScore;
    boolean annual;

    @Override
    public String toString() {
        return "Students{" +
                "grade=" + grade +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", faculty='" + faculty + '\'' +
                ", averageScore=" + averageScore +
                ", annual=" + annual +
                '}';
    }
}
