package strings.bufferBuilder;
public class BuilderExample {
    public void StringAppend(){
        StringBuilder buffer = new StringBuilder("Reva");
        System.out.println("Original String: " + buffer);
        buffer.append(" University");
        System.out.println("New String: " + buffer);
    }
    public void StringInsert(){
        StringBuilder buffer = new StringBuilder("JA");
        System.out.println("Original String: " + buffer);
        buffer.insert(1, "AV");
        System.out.println("New String: " + buffer);
    }
    public void StringReverse(){
        StringBuilder buffer = new StringBuilder("TOOB-GNIRPS");
        System.out.println("Original String: " + buffer);
        buffer.reverse();
        System.out.println("New String: " + buffer);
    }
    public static void main(String[] args) {
        new BuilderExample().StringAppend();
        new BuilderExample().StringInsert();
        new BuilderExample().StringReverse();
    }
}
