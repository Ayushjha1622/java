public class pr_03 {
    public static void main(String[] args) {
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>","harry");
        System.out.println(letter);

    }
}
