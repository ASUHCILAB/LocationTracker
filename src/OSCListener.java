import oscP5.*;

public class OSCListener {
	int port = 9000;
	OscP5 osc;
	
	private PendaphoneGestures pendaphoneGestures;
	
	public OSCListener(PendaphoneGestures pg) {
		osc = new OscP5(this, port);
		osc.plug(this, "ir", "/wii/1/ir");
		
		this.pendaphoneGestures = pg;
	}
	
	public void ir(float _x, float _y) {
		System.out.println("----------------------------------------------");
		System.out.println("OSCX:" + _x);
		System.out.println("OSCY:" + _y);
		System.out.println("----------------------------------------------");
		
		//this.pendaphoneGestures.updateLocation([])
	}
}
