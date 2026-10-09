public class CountCharacterFromString {
    public int countCharacter(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountCharacterFromString CC = new CountCharacterFromString();
        int ans = CC.countCharacter("Shwetha", 'h');
        System.out.println("Count of character 'h' in 'Shwetha' is: " + ans);
    }
}
