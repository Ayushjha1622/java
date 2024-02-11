public class practice_multi {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        arr[0][0] = 111;
        arr[0][1] = 112;
        arr[0][2] = 113;
        arr[1][0] = 114;
        arr[1][1] = 115;
        arr[1][2] = 116;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

    }
}



// public class multidimensional {
//     public static void main(String[] args) {
//         int [][] flats = new int [2][3];
//         // flats = new int[2][3];
//         flats[0][0] = 101; 
//         flats[0][1] = 102; 
//         flats[0][2] = 103; 
//         flats[1][0] = 104; 
//         flats[1][1] = 105; 
//         flats[1][2] = 106; 

//         // displaying the 2-D array (for loop)
//         System.out.println("printing a 2-D array using for loop");
//         for (int i = 0; i < flats.length; i++) {
//             for (int j = 0; j < flats[i].length; j++) {
//                 System.out.print(flats[i][j]);
//                 System.out.print(" ");
//             }
//             System.out.println("");
//         }

//     }
// }

