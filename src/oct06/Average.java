package oct06;

public class Average {

    public static void main(String[] args) {
        int[] numbers = {10,15,20,10,20,25,15,30,25,10};

        int sum =0;
        int max = numbers[0];
        int min = numbers[0];

        for (int number : numbers){
            System.out.println(number);

            sum = sum+number;

            if (number > max){
                max = number;
            }

            if (number < min){
                min = number;
            }
        }

        double average = sum/numbers.length;

        System.out.println("Sum: "+ sum);
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
        System.out.println("Average: "+average);
    }
}
