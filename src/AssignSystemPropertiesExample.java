import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class AssignSystemPropertiesExample {
    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("my.custom.property","My value save in the property object");
            System.setProperties(p);

            Properties ps = System.getProperties();
            System.out.println("ps.getProperty(...) = " + ps.getProperty("my.custom.property"));
            System.out.println(System.getProperty("config.port.server"));
            System.out.println(System.getProperty("config.author.name"));
            System.out.println(System.getProperty("config.author.email"));

            ps.list(System.out);
        } catch(Exception e){
            System.err.println("file don't exist = " + e);
            System.exit(1);
        }
    }
}
