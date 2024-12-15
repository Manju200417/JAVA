package M_OK;

public class String_o2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Uppercase of str1: " + str1.toUpperCase());
        System.out.println("Lowercase of str2: " + str2.toLowerCase());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));
        System.out.println("Substring (1 to 4) in str2: " + str2.substring(1, 4));
        System.out.println("Replace 'o' with 'a' in str1: " + str1.replace("o", "a"));
    }
}
