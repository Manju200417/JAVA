package M_OK;
class person {
    void showrole(){
        System.out.println("A person is human");
    }
}
class student extends person {
    void showrole(){
        System.out.println("A person is a student");
    }
}
public class MOverriding10 {
        public static void main(String[] args) {
         student obj = new student();
         obj.showrole();
        }
    }