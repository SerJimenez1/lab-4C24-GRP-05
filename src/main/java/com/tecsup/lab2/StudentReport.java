public class StudentReport {
    public String generateReport(StudentModel student) {
        return "Reporte del estudiante: " + student.getName() + ", edad: " + student.getAge();
    }
}
