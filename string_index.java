public class string_index {
    public static void main(String[] args) {
        String[] arr= {"red","blue","green","black","brown"};
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]=="black") {
                index=i;
            }
        }
        System.out.println(index);
    }
}
