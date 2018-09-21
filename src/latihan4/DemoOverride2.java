
package latihan4;

public class DemoOverride2 {

    public static void main(String[] args) {
        classB ob = new classB();
        ob.setA(50);
        ob.setB(150);
        //akan memanggil method yang terdapat pada kelas B
        ob.tampilKanNilai();
    }
    
}
