class Person {
    private String nombre;

    public void modifyName(String nuevoNombre){
        nombre = nuevoNombre;
    }

    public String readName(){
        return this.nombre;
    }
}
public class PassByReference2 {
    public static void main(String[] args) {

        Person person = new Person();
        person.modifyName("Andrés");

        System.out.println("Start the main method");

        System.out.println("person.name = " + person.readName());
        System.out.println("Before to call that test method");
        test(person);
        System.out.println("After to call that test method");

        System.out.println("person.name = " + person.readName());

        System.out.println("Finish the main method with the modified person data!");
    }

    public static void test(Person person){
        System.out.println("Start the test method");
        person.modifyName("Pepe");
        System.out.println("Finish the test method");
    }
}

