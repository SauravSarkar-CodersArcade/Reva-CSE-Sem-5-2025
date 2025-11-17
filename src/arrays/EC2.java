package arrays;
public class EC2 {
    public static void main(String[] args) {
        String msg = "Great Job! 👍🔥";
        int count = 0;
        for (int i=0; i<msg.length(); ){
            // UNICODE can't be stored properly in char (16 bits)
            int cp = msg.codePointAt(i);
            // BMP -> Basic Multilingual Plane
            // The emojis generally lie outside BMP (More than 16 bits)
            if(cp > 0xFFFF) count++;
            i+= Character.charCount(cp);
        }
        System.out.println("Emoji Count: " + count);
    }
}
