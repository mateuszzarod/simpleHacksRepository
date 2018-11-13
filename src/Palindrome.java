//odwróć string reverse i porównaj zwróc boolean

public class Palindrome {
    public static boolean isPalindrome(String str) {
        String reverse = new StringBuffer(str).reverse().toString();
        boolean result = str.equals(reverse);
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        isPalindrome("elo");
    }
}
