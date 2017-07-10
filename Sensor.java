public class Sensor{
	private boolean quake=false;
	private boolean doorsensor=false;

	public boolean doorsenseor(boolean doorsensor){
		boolean open=true;
		boolean close=false;
		if (doorsensor==true) {
			System.out.println("DoorOpen");
			return=open;
		}else{
			return=close;
		}
	}
	public boolean quakeSensor(boolean quake){
		boolean emstop=true;
		boolean go=false;
		if (quake==true) {
			return emstop;
		}else{
			return go;
		}
	}
    public boolean weightSensor(int weight){
      boolean pause=true;
      boolean go=false;
      if (weight>1100) {
         System.out.println("OverWeight");
         return pause;
      }else{
      	System.out.println("fitlyWeight");
         return go;
      }
   }
}