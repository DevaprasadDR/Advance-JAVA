package StringMethod;

public class ConcatExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Deva";
        String str3 = "Bye";
        String str4 = str1.concat(str2);
        System.out.println(str4);
        String str5 = str1.concat(str2).concat(str3);
        System.out.println(str5);
    }
}
