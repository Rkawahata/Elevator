public class Sensor{
	private int weight=0;
	private boolean quake=false;
	private boolean doorsensor=false;

	public void StartSens(){
		if (weight>1100) {
			System.out.println("OverWeight");
		}
		if (quake==true) {
			System.out.println("MotorStop");
		}
		if (doorsensor==true) {
			System.out.println("DoorOpen");
		}
	}
}