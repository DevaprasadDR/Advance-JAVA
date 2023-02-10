package StringMethod;

public class StringComparisonEquals {
    public static void main(String args[]) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = "JavaLanguage";
        String s5 = "JAVA";

        System.out.println("check the value s1 and s2= " + s1.equals(s2));
        System.out.println("check the value s1 and s3= " + s1.equals(s3));
        System.out.println("check the value s1 and s4= " + s1.equals(s4));

        System.out.println("check the value s1 and s5= " + s1.equals(s5));
        System.out.println("check the value s1 and s5= " + s1.equalsIgnoreCase(s5));
    }

}
