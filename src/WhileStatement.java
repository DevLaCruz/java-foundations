public class WhileStatement {
    public static void main(String[] args) {

        int i = 0;
        while(i <= 5){
            System.out.println("i = " + i);
            i++;
        }

        i = 0;
        boolean test = true;

        while(test){

            if(i == 7){
                test = false;
            }
            System.out.println("i = " + i);
            i++;
        }

        test = false;
        do {
            System.out.println("It runs at least once");
        } while (test);

        test = true;
        i = 0;

        do {
            if(i == 10){
                test = false;
            }
            System.out.println("i = " + i);
            i++;
        } while (test);
    }
}
