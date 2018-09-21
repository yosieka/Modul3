
package latihan5;

public class MountainTruck  extends Truck{
public int seatHeight;

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
public MountainTruck(int startHeight, int startCadence, int startSpeed, int startGear){
    super(startCadence, startSpeed, startGear);
    seatHeight = startHeight;
}

    public static void main(String[] args) {
        System.out.println("Mulai berjalan");
        MountainTruck mb = new MountainTruck(0,0,0,0);
        System.out.println("gear =" + mb.gear);
        System.out.println("speed =" + mb.speed);
        mb.setGear(2);
        mb.speedUp(2);
        System.out.println("Gear =" + mb.gear);
        System.out.println("Speed =" + mb.speed);
        mb.speedUp(2);
        System.out.println("Gear =" + mb.gear);
        System.out.println("Speed =" + mb.speed);
        
        
    }
    
}
