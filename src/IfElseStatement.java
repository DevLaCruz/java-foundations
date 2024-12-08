public class IfElseStatement {
    public static void main(String[] args) {

        float average = 5.5f;

        if(average >= 6.5) {
            System.out.println("Congratulations, excellent average!");
        } else if(average >= 6.0){
            System.out.println("Very good average!");
        } else if(average >= 5.5){
            System.out.println("Good average!");
        } else if(average >= 5.0){
            System.out.println("Regular, you need to try a little harder!");
        } else if(average >= 4.0){
            System.out.println("Insufficient, you need study more!");
        } else {
            System.out.println("Failing!");
        }

        System.out.println("Your average es " + average);
    }
}
