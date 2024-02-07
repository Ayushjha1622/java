public class practice {
    public static void main(String[] args) {
        int [][] arr = new int [2][3];
        arr[0][0]=101;
        arr[0][1]=102;
        arr[0][2]=103;
        arr[1][0]=104;
        arr[1][1]=105;
        arr[1][2]=106;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        // int arr[] = {2,4,5,6,7};
        // System.out.println(arr[4]);

        //  print the array
        // for (int element: arr) {
        //     System.out.println(element);
        // }
        // for(int i=0;i<arr.length;i++) {
        //     System.out.println(arr[i]);
        // }

        // reverse array
        // for (int i = arr.length-1; i>=0; i--) {
        //     System.out.println(arr[i]);
        // }
    }
}
