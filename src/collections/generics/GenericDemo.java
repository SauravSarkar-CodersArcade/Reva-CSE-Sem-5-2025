package collections.generics;
class Response<T> {
    private T data;
    private String message;
    public Response(T data, String message){
        this.data = data;
        this.message = message;
    }
    public void show(){
        System.out.println("Data: " + data + " | Message: " + message);
    }
}
public class GenericDemo {
    public static void main(String[] args) {
        Response<Integer> r1 = new Response<>(200, "success");
        Response<String> r2 = new Response<>("Logged In", "User Message");
        r1.show();
        r2.show();
    }
}
