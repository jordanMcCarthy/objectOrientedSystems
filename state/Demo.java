package state;

public class Demo {
	
	public static void main(String args[]) {
		
		SimpleMultiFXGuitarPedal guitarPedal = new SimpleMultiFXGuitarPedal();
		
		// guitar pedal is cycled through all states
		guitarPedal.stompPedal();
		guitarPedal.stompPedal();
		guitarPedal.stompPedal();
		guitarPedal.stompPedal();
		
	}
}
