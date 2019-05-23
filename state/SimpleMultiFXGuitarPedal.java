package state;

public class SimpleMultiFXGuitarPedal {
	
	private State currentEffect;
	
	public SimpleMultiFXGuitarPedal(){
		currentEffect = new Clean();
	}
	
	public void setCurrentEffect(State effect) {
		currentEffect = effect;
	}
	
	public void stompPedal() {
		currentEffect.stompPedal(this);
	}
	
	public State getCurrentEffect() {
		return currentEffect;
	}
	

}
