//5. Write a program to read N numbers and sort them using one-dimensional arrays.
package M_OK;
public class sortarray5 {
    public static void main(String[] args) {
    int[] a={55,40,80,65,72};
    int n=a.length;
        System.out.print("Given List is :");
        for(int i:a){System.out.print(i + " ");}
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(a[i]>a[j]){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp; }}}
    System.out.print("\nSorted Practice.list :");
        for(int i:a){System.out.print(i+" ");}}}