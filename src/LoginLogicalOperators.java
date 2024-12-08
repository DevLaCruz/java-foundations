import java.util.Scanner;

public class LoginLogicalOperators {
    public static void main(String[] args) {

        /*String[] usernames = new String[3];
        String[] passwords = new String[3];
        usernames[0] = "andres";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "12345";

        usernames[2] = "pepe";
        passwords[2] = "12345";*/
        String[] usernames = {"alejandro", "admin", "pepe"};
        String[] passwords = {"123", "1234", "12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("type the username");
        String u = scanner.next();

        System.out.println("type the password");
        String p = scanner.next();

        boolean isAuthenticated = false;

        for(int i = 0; i < usernames.length; i++){
            isAuthenticated = (usernames[i].equals(u) && passwords[i].equals(p))? true: isAuthenticated;

            /*if( (usernames[i].equals(u) && passwords[i].equals(p)) ){
                isAuthenticated = true;
                break;
            }*/
        }

        String mensaje = isAuthenticated ? "Bienvenido usuario ".concat(u).concat("!") :
                "Username o contraseña incorrecto!\nLo sentimos, requiere autenticación";
        System.out.println("mensaje = " + mensaje);

        /*if(isAuthenticated){
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else {
            System.out.println("Username o contraseña incorrecto!");
            System.out.println("Los siento, requiere autenticación");
        }*/
    }
}
