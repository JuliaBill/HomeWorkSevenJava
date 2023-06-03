package Homework;

public class HomeWorkSeven {

    public static void main(String[] args) {

       // fromOneToHundred();


        //Task 2
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum = sum + i;

            }

        }
        System.out.println("sum" + sum);
    }


    private static void fromOneToHundred() {

        //Task 1
        for (int i = 0; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}