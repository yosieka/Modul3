package tugasPraktikum;

public class guru {

    public String jnsKel1 = "Perempuan";
    public String jnsKel2 = "Laki-Laki";
    public String kls = "X RPL 6";

    protected void pertama() {
        System.out.println("=============================================");
        System.out.println("Guru-guru yang terdapat di SMK Telkom Malang");
        System.out.println("=============================================");
    }

    protected void cetak1() {
        System.out.println("Jenis Kelamin : " + jnsKel2);
        System.out.println("Mengajar kelas : " + kls);

    }

    protected void cetak2() {
        System.out.println("Jenis Kelamin : " + jnsKel1);
        System.out.println("Mengajar Kelas : " + kls);
    }
}
