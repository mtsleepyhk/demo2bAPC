public class Person { // Klasse Person wird erstellt.
    // Die Attribute
    private String name;
    private String firstName;
    public int age;

    public Person(String name, String firstName, int age) {
         this.name = name;
         this.firstName = firstName;
         this.age = age;
    }

    // Eine Setter für den Namen. Das wird gemacht damit der Name geschrieben wird.
    public void setName(String name, String firstName) {
        this.name = name;
        this.firstName = firstName;
    }

    // Zusammensetzung von dem ganzen Namen.
    public String fullName() {
        return firstName + " " + name;
    }
}
