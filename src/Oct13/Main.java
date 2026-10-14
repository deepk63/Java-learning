package Oct13;

public class Main {
    public static void main(String[] args) {
//        int[][] arr = new int[3][4]; // 3rows 4 column
//
//        arr[0][0] = 10;
//        arr[0][1] = 20;
//        arr[0][2] = 20;
//        arr[0][3] = 20;
//
//        arr[1][0] = 30;
//        arr[1][1] = 40;
//        arr[1][2] = 20;
//        arr[1][3] = 10;
//
//        System.out.print(arr[0][0] + " ");
//        System.out.print(arr[0][1] + " ");
//        System.out.print(arr[0][2] + " ");
//        System.out.print(arr[0][3] + " ");
//        System.out.println();
//        System.out.print(arr[1][0] + " ");
//        System.out.print(arr[1][1] + " ");
//        System.out.print(arr[1][2] + " ");
//        System.out.print(arr[1][3] + " ");
//        System.out.println();
//
//        int[][] grid = {
//                {1,2,3}, // row 1
//                {4,5,6}, // row 2
//                {7,8,9}  // row 3
//        };
//
//        System.out.println("==========");
//
//        System.out.print(grid[0][0] + " ");
//        System.out.print(grid[0][1] + " ");
//        System.out.print(grid[0][2] + " ");
//        System.out.println();
//        System.out.print(grid[1][0] + " ");
//        System.out.print(grid[1][1] + " ");
//        System.out.print(grid[1][2] + " ");
//        System.out.println();
//        System.out.println("====Length====");
//
//        System.out.println(arr[0].length);
//        System.out.println(grid.length);
//        System.out.println(grid[0].length);
//
//        System.out.println("===For loop===");
//
//        for (int i = 0; i < grid.length; i++){  // access rows
//            for ( int j = 0; j < grid[i].length; j++){ // access column
//                System.out.print(grid[i][j] + " ");
//            }
//            System.out.println();
//
//        }
//
//        System.out.println("===For each===");
//        for (int[] row : grid){
//            for (int ele : row){
//                System.out.print(ele + " ");
//            }
//            System.out.println();
//        }

        // Available seats in theatre

        int[][] seat = {
                {0,1,0},
                {1,0,1}
        };
        for ( int i = 0; i < seat.length; i++){
            for ( int j = 0; j < seat[i].length; j++){
                if (seat[i][j] == 0){
                    System.out.println("Row: " + (i+1) + " Seat: " + (j+1) + " is available.");
                }
            }
        }

    }
}
