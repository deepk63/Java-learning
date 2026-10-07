package oct06;

public class Sorting {

    public static void main(String[] args) {
                      //  0 1 2 3 4 5 6 7 8 9
        int [] numbers = {5,4,2,6,1,7,8,3,9,};

        for (int i = 0; i < numbers.length; i++){
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

    }
}
