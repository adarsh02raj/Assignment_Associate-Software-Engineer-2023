import java.util.*;

public class PangramChecker {

    public static boolean isPangram(String input) {
        input = input.toLowerCase();
        boolean[] letters = new boolean[26];
        
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z') {
                letters[currentChar - 'a'] = true;
            }
        }
        
        for (boolean letter : letters) {
            if (!letter) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPangram(str));
    }
}
