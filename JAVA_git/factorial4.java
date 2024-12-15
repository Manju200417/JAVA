//4. Write a program to find factorial of N numbers reading N as command line argumenpackage Collage;
package M_OK;
public class factorial4{
    public static void main(String[] m) {
        int fact=1;
        int n = Integer.parseInt(m[0]);
        for(int i=1;i<=n;i++){
            fact *=i;}
        System.out.println("factorial of a number :"+fact);
    }
}