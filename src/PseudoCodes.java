public class PseudoCodes {
    public static void main(String[] args) {
        char[] letters = {'V','I','J','A','Y'};
        // String name = letters.toString();
        // The toString() method only works for
        // Wrapper Classes
        String name = new String(letters);
        // The String class constructor accepts
        // a char array & converts to a String
        System.out.println(name); // VIJAY

    }
}
