
package latihan4;

public class classB extends classA{
    private int b;
     public void setB(int nilai) {
        b = nilai;
    }

    public int getB() {
        return b;
    }
// melakukan ovvrride terhadap method tampilKanNilai
    //yang terdapat pada kelas A
    public void tampilKanNilai(){
        super.tampilKanNilai();//memanggil method pada kelas A
        System.out.println("Nilai b :" + getB());
    }
   
    
}
