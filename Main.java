public class Main { // Klasse Main wird erstellt.
    public static void main(String[] args) {
        // Eine neue Person wird erstellt um es auszugeben.
        Employee employee = new Employee("Kinitz", "Mercedes", 18, "572MLM", "7275CQ",5000);
        employee.printAll();

        // Die ausgabe was nach der erhöhung des gehaldes kommt.
        System.out.println("\n\nNach den 10% gehaltserhöhung: ");
        employee.salaryIncresse(10);
        employee.printAll();
    }
}
