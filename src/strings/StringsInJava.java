package strings;
public class StringsInJava {
    public static void main(String[] args) {
        char[] letters = {'R','E','V','A'};
        System.out.println(letters.toString()); // Not correct
        String obj = new String(letters);
        System.out.println(obj);
        String jumbled = "Palak1is1in15th1Semester1CSE1Reva";
        // Palak, is, in, 5th, Semester, CSE, Reva
        String[] words = jumbled.split("1");
        System.out.println(words[0]);
        String withSpaces = "     Reva      University     ";
        String withoutSpaces = withSpaces.trim();
        System.out.println(withoutSpaces);
        System.out.println(withoutSpaces.toUpperCase());
        System.out.println(withoutSpaces);
    }
}
