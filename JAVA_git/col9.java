//9. Program to Illustrate Constructor Overloading:
package M_OK;
public class col9 {
    int a;
    col9(){}  // default constructor
    col9(int x){
        a = x;
    }
    public static void main(String[] args) {
        col9 obj1 = new col9();
        col9 obj2 = new col9(5);
        System.out.println(obj1.a);
        System.out.println(obj2.a); }}