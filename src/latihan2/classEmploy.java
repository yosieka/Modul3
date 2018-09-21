
package latihan2;

public class classEmploy extends classPerson{
    private String nokaryawan;
    // konstruktor
    public classEmploy(String noKaryawan, String nama, int usia){
        super(nama, usia);
        this.nokaryawan = noKaryawan;
    }
   //method
    public void info(){
            System.out.println("No.Karyawan :" + this.nokaryawan);
            super.info();
}
}
