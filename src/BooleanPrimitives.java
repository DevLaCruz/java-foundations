public class BooleanPrimitives {
    public static void main(String[] args) {
        
        boolean logisticData = true;
        System.out.println("logisticData = " + logisticData);
        
        double d = 98765.43e-3; // 98.76543
        System.out.println("d = " + d);
        
        float f = 1.2345e2f; // 123.45
        System.out.println("f = " + f);
        
        logisticData = d < f;
        System.out.println("logisticData = " + logisticData);
        
        boolean isEqual = (3-2 == 1);
        System.out.println("isEqual = " + isEqual);
    }
}
