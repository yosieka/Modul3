
package latihan3;

public class classGajah extends classHewan{
    public static void testClassMethod(){
        System.out.println("The class method in hewan...");
    }
// meng-override method pada class Animal
    public void testInstanceMethod(){
        System.out.println("The instance method in Gajah...");
    }
    public static void main(String[] args) {
        classGajah myGajah = new classGajah();
        classHewan myHewan = myGajah;
        classGajah.testClassMethod();
        classHewan.testClassMethod();
        myHewan.testInstansceMethod();
    }
    
    
}
