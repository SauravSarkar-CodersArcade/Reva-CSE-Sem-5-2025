package strings.bufferBuilder;
public class BufferExample {
    public void StringAppend(){
        StringBuffer buffer = new StringBuffer("Reva");
        System.out.println("Original String: " + buffer);
        buffer.append(" University");
        System.out.println("New String: " + buffer);
    }
    public void StringInsert(){
        StringBuffer buffer = new StringBuffer("JA");
        System.out.println("Original String: " + buffer);
        buffer.insert(1, "AV");
        System.out.println("New String: " + buffer);
    }
    public void StringReverse(){
        StringBuffer buffer = new StringBuffer("TOOB-GNIRPS");
        System.out.println("Original String: " + buffer);
        buffer.reverse();
        System.out.println("New String: " + buffer);
    }
    public static void main(String[] args) {
        new BufferExample().StringAppend();
        new BufferExample().StringInsert();
        new BufferExample().StringReverse();
    }
}
