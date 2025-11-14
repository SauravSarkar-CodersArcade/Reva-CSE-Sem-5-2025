package oops.basicOOPs.variables;
public class ThisKeywordExample {
    String i; // this keyword is used to access the current class instance variables
    void change(String i){
        this.i = i;
    }
    void show(){
        System.out.println("The value of i is: " + i);
    }
    public static void main(String[] args) {
        ThisKeywordExample obj = new ThisKeywordExample();
        obj.change("Reva");
        obj.show();
    }
}




