public class ExceptionH12 {
    public static void main(String[] args) {
        try{
            int a=3/0;
            System.out.println(a);
       }
        catch(ArithmeticException e){
            System.out.println("Invalid devider");
        }
        System.out.println("End of the program");
    }
}