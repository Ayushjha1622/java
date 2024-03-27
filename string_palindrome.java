public class string_palindrome {
    public static void main(String[] args) {
        String str="eye";
        if (isPalindrome(str)==true) {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }

    public static boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while (left<right) {
            if(str.charAt(left)!=str.charAt(right)){
                return  false;
            }

            left++;
            right--;
            
        }
        return true;
    }
}
