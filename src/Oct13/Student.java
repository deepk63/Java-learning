package Oct13;

public class Student {

    public static void main(String[] args) {

        int[][] marks = {
                {10,9,10,9},
                {9,9,8,9},
                {8,7,9,10}
        };

        for ( int i = 0; i < marks.length; i++){
            int total = 0;
            for ( int j = 0; j < marks[i].length; j++){
                total = total + marks[i][j];
            }
            System.out.println("Student " + (i+1) + " is having total marks of " + total);
        }
    }
}
