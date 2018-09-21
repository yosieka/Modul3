
package latihan2;

public class classPerson {
    private String nama;
    private int usia;
    
    // konstruktor
    public classPerson(String nama, int usia){
        this.nama = nama;
        this.usia = usia;
    }
    //metode
    public void info(){
        System.out.println("Nama :" + this.nama);
        System.out.println("Usia :" + this.usia);
    }
}
