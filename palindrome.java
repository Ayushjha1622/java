   
public class palindrome {
    public static boolean checkPalindrome(int n){
        int reverse=0, temp=n; 
        while(temp!=0){
            reverse = (reverse*10)+(temp%10); 
            temp = temp/10;
        }
        return (reverse==n);
    }

    public static void main(String[] args) {
        int n=1222221;
        if (checkPalindrome(n)==true) {
            System.out.println("yes");
        }
        else{
     
            System.out.println("no");
        }
    }
}

