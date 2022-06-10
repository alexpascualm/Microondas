 
public class Microondas {
	private boolean doorOpen;
	private int power;
	private int timer;
	private boolean cooking;
	private boolean withItem;
	private Estado estado;
	private Beeper beeper;
	private Turntable turntable;
	private Display display;
	private Lamp lamp;
	private Heating heating;
	
	public Microondas() {
		beeper=new Beeper();
		turntable= new Turntable();
		display=new Display();
		lamp=new Lamp();
		heating=new Heating();
		doorOpen = false;
		power = 0;
		timer = 0;
		cooking = false;
		withItem = false;
		estado = new ClosedWithNoItem(this);
		
		
		
	}
	
	public boolean isDoorOpen() {
		return doorOpen;
	}

	public void setDoorOpen(boolean doorOpen) {
		this.doorOpen = doorOpen;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getTimer() {
		return timer;
	}

	public void setTimer(int timer) {
		this.timer = timer;
	}

	public boolean isCooking() {
		return cooking;
	}

	public void setCooking(boolean cooking) {
		this.cooking = cooking;
	}

	public boolean isWithItem() {
		return withItem;
	}

	public void setWithItem(boolean withItem) {
		this.withItem = withItem;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Beeper getBeeper() {
		return beeper;
	}

	public Turntable getTurnable() {
		return turntable;
	}

	public Display getDisplay() {
		return display;
	}

	public Lamp getLamp() {
		return lamp;
	}

	public Heating getHeating() {

		return heating;
	}
	
	public void door_opened() {
		
		estado.door_opened(this);
	}

	
	public void door_closed() {
		
		estado.door_closed(this);
	}

	
	public void item_placed() {
		
		estado.item_placed(this);
	}


	public void item_removed() {
		
		estado.item_removed(this);
	}

	
	public void power_inc() {
		
		estado.power_inc(this);
	}

	
	public void power_dec() {
		estado.power_dec(this);
		
	}

	
	public void power_reset() {
		estado.power_reset(this);
		
	}

	
	public void timer_inc() {
		
		estado.timer_inc(this);
	}

	
	public void timer_dec() {
		
		estado.timer_dec(this);
	}

	
	public void timer_reset() {
		
		estado.timer_reset(this);
	}


	public void cooking_start() {
		
		estado.cooking_start(this);
	}

	
	public void cooking_stop() {
		
		estado.cooking_stop(this);
	}

	
	public void tick() {
		estado.tick(this);
		
	}
	
	
	
	
	

}
