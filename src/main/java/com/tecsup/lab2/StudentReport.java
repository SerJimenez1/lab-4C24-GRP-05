public class StudentReport {
    public void generateReport(StudentModel student) {
        System.out.println("=== Student Report ===");
        System.out.println("Student: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Report generated successfully!");
    }
}
