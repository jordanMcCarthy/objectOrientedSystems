package state;

public class Distortion implements State {

	@Override
	public void stompPedal(SimpleMultiFXGuitarPedal effect) {
		effect.setCurrentEffect(new Reverb());
		System.out.println("Switching to reverb");

	}

}
