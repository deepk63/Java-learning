package oct06;

public class Main {

    public static void main(String[] args) {
       // data type     ref/var          allocating 10 memory location
//        int[]             marks   =       new int[10];
//        marks[0] = 49;
//        marks[1] = 50;
//        marks[2] = 48;
//        marks[3] = 47;
//        marks[4] = 46;
//        marks[5] = 49;
//        marks[6] = 50;
//        marks[7] = 42;
//        marks[8] = 45;
//        marks[9] = 50;
//
//        System.out.println(marks[2]);
//
//        System.out.println("//=====================================================//");
//
//        int[] score = {85,89,99,89,99};
//
//        System.out.println(score[0]);
//        System.out.println(score[2]);
//
//        System.out.println(marks.length);// length of the array
//
//        System.out.println("Printing arrays with loop");
//        for (int i = 0; i < score.length; i++) {
//            System.out.println(score[i]);
//        }
//
//        System.out.println("Using for each loop");
//        // For Each Loop
//
//        for ( int ele : score ){
//            System.out.println(ele);
//        }

        int[] day = new int[7];

        day[0] = 36;
        day[1] = 31;
        day[2] = 40;
        day[3] = 37;
        day[4] = 33;
        day[5] = 32;
        day[6] = 34;

        System.out.println(day[0]);
        System.out.println(day[3]);
        System.out.println(day.length);
        day[5] = 40;
        System.out.println(day[4]);

    }
}
