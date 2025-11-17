package arrays;
public class EmojiCounter {
    public static void main(String[] args) {
        String msg = "GreatJob!👍🔥";
        int count = 0;
        for (int i=0; i<msg.length(); i++){
            if(msg.charAt(i) > 255){
                count++;
            }
        }
        System.out.println("Emoji count is: " + count);
    }
}
