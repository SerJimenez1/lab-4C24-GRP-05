public class StudentModel {

    private String name;
    private int age;
    private double grade;

    // Constructor
    public StudentModel(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    // Método nuevo para ver si aprueba
    public boolean isApproved() {
        return this.grade >= 13.0; // nota mínima aprobatoria
    }

    @Override
    public String toString() {
        return "Estudiante: " + name + ", Edad: " + age + ", Nota: " + grade;
    }
}
