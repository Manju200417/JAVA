//1. Write a Java program to read the radius of a circle and to find the area and circumference
// package M_OK;
import java.util.Scanner;
public class area_circumference1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of a circle:");
        int radius = sc.nextInt();
        double cir = 2 * Math.PI * radius;
        double Area = Math.PI * radius * radius;
        System.out.println("cir of a circle is :"+cir);
        System.out.println("Area of a circle :"+ Area); }}