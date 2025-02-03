// Klasse Employee wird erstellt und Person wird mit extends weiter vererbt.
public class Employee extends Person{
    private String emloyeeId;
    private String supervisorId;
    private double salary;

    // Konstruktur
    public Employee(String name, String firstName, int age, String emloyeeId, String supervisorId, double salary) {
        super(name, firstName, age);
        this.emloyeeId = emloyeeId;
        this.supervisorId = supervisorId;
        this.salary = salary;
    }

    // Getter und Setter beginn.
    public String getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(String supervisorId) {
        this.supervisorId = supervisorId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmloyeeId() {
        return emloyeeId;
    }

    public void setEmloyeeId(String emloyeeId) {
        this.emloyeeId = emloyeeId;
    }
    // Getter und Setter ende.

    // Eine Methode damit später von salary die 10% dazu gerechnet werden.
    public void salaryIncresse(float percentage) {
        this.salary += this.salary * (percentage / 100);
    }

    // Die Ausgabe der Person.
    public void printAll() {
        System.out.println("Name: " + fullName());
        System.out.println("Alter: " + age);
        System.out.println("Angestellten ID" + emloyeeId);
        System.out.println("Vorgesetzter: " + supervisorId);
        System.out.println("Dein Gehalt: " + salary + "€");
    }

}
