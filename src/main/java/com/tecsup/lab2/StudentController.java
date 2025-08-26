public class StudentController {
    private StudentModel student;
    private StudentView view;
    private StudentReport report;

    public StudentController(StudentModel student, StudentView view, StudentReport report) {
        this.student = student;
        this.view = view;
        this.report = report;
    }

    public void updateStudent(String name, int age) {
        student.setName(name);
        student.setAge(age);
    }

    public void showStudent() {
        view.displayStudent(student.getName(), student.getAge());
    }

    public void generateStudentReport() {
        report.generateReport(student);
    }

    // Método principal para probar
    public static void main(String[] args) {
        StudentModel student = new StudentModel("Juan", 20);
        StudentView view = new StudentView();
        StudentReport report = new StudentReport();

        StudentController controller = new StudentController(student, view, report);

        controller.showStudent();
        controller.updateStudent("Maria", 22);
        controller.showStudent();
        controller.generateStudentReport();
    }
}
