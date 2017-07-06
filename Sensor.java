public class Sensor{
	public int weight=0;
	boolean quake=false;
	boolean doorsens=false;

	Sensor(){
		if (weight<1100) {
			System.out.println("OverWeight");
		}
		if (quake=true) {
			System.out.println("MotorStop");
		}
		if (doorsens=true) {
			System.out.println("DoorOpen");
		}
	}
}