public class HelloWorld {
    public static void main(String[] args) {
        
        String greet = "Hello World from Java";
        System.out.println(greet);
        System.out.println("greet.toUpperCase() = " + greet.toUpperCase());

        int number = 11;

        boolean value = true;
        int number2 = 5;
        if(value){
            System.out.println("number = " + number);
            number2 = 10;
        }
        System.out.println("number2 = " + number2);

        var number3 = "15";

        String name;

        name = "Andrés";

        if(number >10){
            name = "Juan";
        }

        System.out.println("name = " + name);

        int agePerson = 5;
    }

}
