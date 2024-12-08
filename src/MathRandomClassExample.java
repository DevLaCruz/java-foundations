import java.util.Random;

public class MathRandomClassExample {
    public static void main(String[] args) {

        String[] colors = {"blue", "yellow", "red", "green", "white", "black"};

        double random = Math.random();
        System.out.println("random = " + random);
        random *= colors.length;

        System.out.println("random = " + random);
        
        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("colores = " + colors[(int) random]);
        
        Random randomObj = new Random();
        int randomInt = 15 + randomObj.nextInt(25-15+1);
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObj.nextInt(colors.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colors = " + colors[randomInt]);
    }
}
