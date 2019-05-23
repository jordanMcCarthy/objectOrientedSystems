package state;

public class Delay implements State {

	@Override
	public void stompPedal(SimpleMultiFXGuitarPedal effect) {
		effect.setCurrentEffect(new Clean());
		System.out.println("Switching to clean");
	}

}
