package state;

public class Clean implements State{
	
	@Override
	public void stompPedal(SimpleMultiFXGuitarPedal effect) {
		effect.setCurrentEffect(new Distortion());
		System.out.println("Switching to distortion");
	}
	
	

}
