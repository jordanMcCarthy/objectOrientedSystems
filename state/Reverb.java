package state;

public class Reverb implements State {

	@Override
	public void stompPedal(SimpleMultiFXGuitarPedal effect) {
		effect.setCurrentEffect(new Delay());
		System.out.println("Switching to delay");

	}

}
