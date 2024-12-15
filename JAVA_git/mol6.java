package M_OK;
public class mol6 {
    int add(int a,int b){return a+b;}
    int add(int a,int b,int c){return a+b+c;}
    public static void main(String[] args) {
        mol6 obj=new mol6();
        System.out.println(obj.add(10,20));
        System.out.println(obj.add(10,20,30));}}