public class StudentModel {
    private String name;
    private int age;
    private String email; // 👈 Nuevo atributo agregado por el colaborador

    public StudentModel(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {   // 👈 Nuevo getter
        return email;
    }
}
