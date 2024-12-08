public class PassByReference {
    public static void main(String[] args) {

        int[] age = {10, 11, 12};

        System.out.println("Start the main method");
        for(int i = 0; i < age.length; i++){
            System.out.println("age[i] = " + age[i]);
        }
        System.out.println("Before of call to 'test' method");
        test(age);
        System.out.println("After of call to 'test' method");
        for(int i = 0; i < age.length; i++){
            System.out.println("age[i] = " + age[i]);
        }

        System.out.println("Finish the main method with modified array data!");
    }

    public static void test(int[] ageArr){
        System.out.println("Start the 'test' method");
        for(int i = 0; i < ageArr.length; i++){
            ageArr[i] = ageArr[i] + 20;
        }
        System.out.println("Finish the 'test' method");
    }
}

