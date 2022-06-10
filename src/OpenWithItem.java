
public class OpenWithItem implements Estado {

	public OpenWithItem(Microondas mc) {
		// TODO Auto-generated constructor stub
		mc.getLamp().lamp_on();
		mc.getTurnable().turntable_stop();
		mc.getHeating().heating_off();
		mc.setCooking(false);
		mc.setDoorOpen(true);
		mc.setWithItem(true);
	}

	@Override
	public void door_opened(Microondas mc) {
		// TODO Auto-generated method stub
		// Ya esta abierta
		
	}

	@Override
	public void door_closed(Microondas mc) {
		// TODO Auto-generated method stub
		mc.setEstado(new ClosedWithItem(mc));
		
	}

	@Override
	public void item_placed(Microondas mc) {
		// TODO Auto-generated method stub
		//Ya hay un objeto
	}

	@Override
	public void item_removed(Microondas mc) {
		// TODO Auto-generated method stub
		mc.setEstado(new OpenWithNoItem(mc));
	}

	@Override
	public void power_inc(Microondas mc) {
		// TODO Auto-generated method stub
		mc.setPower(mc.getPower()+1);
		mc.getDisplay().setDisplay(Integer.toString(mc.getPower()));
	}

	@Override
	public void power_dec(Microondas mc) {
		// TODO Auto-generated method stub
		if (mc.getPower()!=0) {
			mc.setPower(mc.getPower()-1);
			mc.getDisplay().setDisplay(Integer.toString(mc.getPower()));
			
		}
	}

	@Override
	public void power_reset(Microondas mc) {
		// TODO Auto-generated method stub
		mc.setPower(0);
		mc.getDisplay().setDisplay(Integer.toString(mc.getPower()));
	}

	@Override
	public void timer_inc(Microondas mc) {
		// TODO Auto-generated method stub
		mc.setTimer(mc.getTimer()+1);
		mc.getDisplay().setDisplay(Integer.toString(mc.getTimer()));
	}

	@Override
	public void timer_dec(Microondas mc) {
		// TODO Auto-generated method stub
		if (mc.getTimer()!=0) {
			mc.setTimer(mc.getTimer()-1);
			mc.getDisplay().setDisplay(Integer.toString(mc.getTimer()));
			
		}
		
	}

	@Override
	public void timer_reset(Microondas mc) {
		// TODO Auto-generated method stub
		mc.setTimer(0);
		mc.getDisplay().setDisplay(Integer.toString(mc.getTimer()));
	}

	@Override
	public void cooking_start(Microondas mc) {
		// TODO Auto-generated method stub
		//No se puede cocinar con la puerta abierta
	}

	@Override
	public void cooking_stop(Microondas mc) {
		// TODO Auto-generated method stub
		// No esta cocinando
	}

	@Override
	public void tick(Microondas mc) {
		// TODO Auto-generated method stub
		// No esta cocinando
	}

}
