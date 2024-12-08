import java.util.Map;

public class EnvironmentVariableExample {
    public static void main(String[] args) {

        Map<String, String> varEnv = System.getenv();
        System.out.println("Environment Variables of system = " + varEnv);

        System.out.println("------ List Enviroment Variables of system ------");
        for(String key: varEnv.keySet()){
            System.out.println(key + " => " + varEnv.get(key));
        }
        
        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);
        
        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String temDir = System.getenv("TEMP");
        System.out.println("temDir = " + temDir);

        String path = System.getenv("Path");
        System.out.println("path = " + path);

        String path2 = varEnv.get("Path");
        System.out.println("path2 = " + path2);

        String appEnv = varEnv.get("APPLICATION_ENV");
        System.out.println("appEnv = " + appEnv);

        String hola = varEnv.get("SALUDAR_HOLA");
        System.out.println("hola = " + hola);
    }
}
