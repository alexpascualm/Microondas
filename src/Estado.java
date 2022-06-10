
public interface Estado {
	public void door_opened(Microondas mc);
	public void door_closed(Microondas mc);
	public void item_placed(Microondas mc);
	public void item_removed(Microondas mc);
	public void power_inc(Microondas mc);
	public void power_dec(Microondas mc);
	public void power_reset(Microondas mc);
	public void timer_inc(Microondas mc);
	public void timer_dec(Microondas mc);
	public void timer_reset(Microondas mc);
	public void cooking_start(Microondas mc);
	public void cooking_stop(Microondas mc);
	public void tick(Microondas mc);
	
}
