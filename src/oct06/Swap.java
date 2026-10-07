package oct06;

public class Swap {

    public static void main(String[] args) {
                    //  0  1  2  3  4  5  6  7
        int[] numbers ={10,20,30,40,50,60,70,80};

//        int temp = numbers[0];
//        numbers[0] = numbers[1];
//        numbers[1] = temp;
//
//        System.out.println("Swapping 2 Numbers");
//
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);

            // 0-->7
//            int temp = numbers[0];
//            numbers[0] = numbers[7];
//            numbers[7] = temp;
//
//            // 1-->6
//            temp = numbers[1];
//            numbers[1] = numbers[6];
//            numbers[6] = temp;
//
//            // 2-->5
//            temp = numbers[2];
//            numbers[2] = numbers[5];
//            numbers[5] = temp;
//
//            // 3-->4
//            temp = numbers[3];
//            numbers[3] = numbers[4];
//            numbers[4] = temp;

        for (int i = 0; i < numbers.length/2; i++){
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length-1-i];
            numbers[numbers.length-1-i] = temp;
        }

        System.out.println("Reversing an array");

            for (int i =0; i < numbers.length; i++){
                System.out.println(numbers[i]);
            }

        }
    }

