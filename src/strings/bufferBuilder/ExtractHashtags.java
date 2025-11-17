package strings.bufferBuilder;
public class ExtractHashtags {
    public static void main(String[] args) {
        String caption =
                "Had a great trip! #travel #beachlife #sunset";
        String[] words = caption.split(" ");
        for (String w : words){
            if(w.charAt(0) == '#'){
                System.out.println(w);
            }
            if (w.startsWith("#")){
                System.out.println(w);
            }
        }
    }
}
