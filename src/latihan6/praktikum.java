
package latihan6;

public class praktikum {
    public int tambah (int a, int b){
        return a+b;
    }
    static double tambah(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        int a =3;
        int b=4;
        int c=8;
        double d = 0.5;
        System.out.println("1." + (a+b));
        System.out.println("2.a<" + a+ "> +" +" b<" +b+"> = " +(a+b));
        System.out.println("3." + (a+b+c));
        System.out.println("4." + (a+b+c-d));
    }
    
}
