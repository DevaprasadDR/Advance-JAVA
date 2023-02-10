package StringMethod;

public class CharAtExample1 {
    public static void main(String[] args) {
        String str = "Welcome to Myntra";
        int strLength = str.length();
        System.out.println("Character at 0 index is: "+ str.charAt(0));
        System.out.println("Character at last index is: "+ str.charAt(strLength-1));
    }
}
