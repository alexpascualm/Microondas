
public class Heating {
	private boolean heating;
	private int power=0;
	
	public void heating_on() {
		heating=true;
	}
	public void heating_off() {
		heating=false;
	}
	public void setPower(int p) {
		power=p;
	}
	public int getPower() {
		return power;
	}
	public Boolean isHeating() {
		return heating;
	}
	
}

