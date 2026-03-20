import java.util.Scanner;
public class StringOperations {
    static String reverseManual(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }
    static boolean isPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // Function to count words, vowels, consonants
    static void countWordsVowelsConsonants(String str) {
        int words = 0, vowels = 0, consonants = 0;
        str = str.trim();
        String[] wordArray = str.split("\\s+");
        words = wordArray.length;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if ("aeiou".indexOf(ch) != -1) {
                vowels++;
            } else if (Character.isLetter(ch)) {
                consonants++;
            }
        }

        System.out.println("No. of words: " + words);
        System.out.println("No. of vowels: " + vowels);
        System.out.println("No. of consonants: " + consonants);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str1 = sc.nextLine();
        System.out.println("The string after changing the case is: " + str1.toUpperCase());
        System.out.println("The string after reversing manually is: " + reverseManual(str1));
        StringBuilder sb = new StringBuilder(str1);
        System.out.println("The string after reversing using function is: " + sb.reverse());
        System.out.print("Enter the second string for comparison: ");
        String str2 = sc.nextLine();
        int diff = str1.compareTo(str2);
        System.out.println("The difference between ASCII value is: " + diff);
        System.out.print("Enter the string to be inserted into first string: ");
        String insertStr = sc.nextLine();
        String combined = str1 + " " + insertStr;
        System.out.println("The string after insertion is: " + combined);
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        int pos = str1.indexOf(ch);
        if (pos != -1)
            System.out.println("Position of entered character: " + pos);
        else
            System.out.println("Entered character is not present");
        if (isPalindrome(str1))
            System.out.println("Entered string is palindrome");
        else
            System.out.println("Entered string is not a palindrome");
        countWordsVowelsConsonants(str1);

        sc.close();
    }
}
