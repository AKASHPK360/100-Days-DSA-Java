public class CharacterFrequency {

    public static void main(String[] args) {

        String s = "programming";

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            count[ch - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                System.out.println((char)(i + 'a') + " -> " + count[i]);
            }
        }
    }
}
