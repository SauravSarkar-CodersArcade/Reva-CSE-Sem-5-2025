package strings.bufferBuilder;
public class BufferBuilderPerformance {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("Reva");
        for (int i=1; i<1000000; i++){
            buffer.append(" University");
        }
        System.out.println("Buffer Time: " + (System.currentTimeMillis()-startTime) +
                "ms");
        startTime = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("Reva");
        for (int i=1; i<1000000; i++){
            builder.append(" University");
        }
        System.out.println("Builder Time: " + (System.currentTimeMillis()-startTime) +
                "ms");
    }
}
