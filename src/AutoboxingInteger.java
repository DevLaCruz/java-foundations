public class AutoboxingInteger {
    public static void main(String[] args) {

        Integer[] integers = {Integer.valueOf(1), 2, 3, 4, 5, 6, 7,
                8, 9, 10, 11, 12, 13, 14, 15};

        int addition = 0;

        for(Integer i: integers){
            if(i.intValue() % 2 == 0){
                addition += i.intValue();
            }
        }
        System.out.println("addition = " + addition);

        addition = 0;
        for(Integer i: integers){
            if(i % 2 == 0){
                addition += i;
            }
        }
        System.out.println("addition = " + addition);
    }
}
