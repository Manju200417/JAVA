package M_OK;
class A extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("A");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("B");
        }
    }
}
public class MThread11 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.start();
        b.start();
    }
}