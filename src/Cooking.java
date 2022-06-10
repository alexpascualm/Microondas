
public class Cooking implements Estado {

	public Cooking(Microondas mc) {
		// TODO Auto-generated constructor stub
		mc.getLamp().lamp_off();
		mc.getTurnable().turntable_start();
		mc.getHeating().heating_on();
		mc.setCooking(true);
		mc.setDoorOpen(false);
		mc.setWithItem(true);
	}

	@Override
	public void door_opened(Microondas mc) {
		// TODO Auto-generated method stub
		mc.setEstado(new OpenWithItem(mc));
		
	}

	@Override
	public void door_closed(Microondas mc) {
		// TODO Auto-generated method stub
		// Ya esta cerrada
		
	}

	@Override
	public void item_placed(Microondas mc) {
		// TODO Auto-generated method stub
		// Puerta cerrada
	}

	@Override
	public void item_removed(Microondas mc) {
		// TODO Auto-generated method stub
		// Puerta cerrada
		
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
		}else {
			mc.setEstado(new ClosedWithItem(mc));
		}
		
	}

	@Override
	public void power_reset(Microondas mc) {
		// TODO Auto-generated method stub
		mc.setEstado(new ClosedWithItem(mc));
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
			
		}else {
			mc.setEstado(new ClosedWithItem(mc));
		}
		
	}

	@Override
	public void timer_reset(Microondas mc) {
		// TODO Auto-generated method stub
		mc.setEstado(new ClosedWithItem(mc));
		mc.setTimer(0);
		mc.getDisplay().setDisplay(Integer.toString(mc.getTimer()));
	}

	@Override
	public void cooking_start(Microondas mc) {
		// TODO Auto-generated method stub
		// Ya esta cocinando
	}

	@Override
	public void cooking_stop(Microondas mc) {
		// TODO Auto-generated method stub
		mc.setEstado(new ClosedWithItem(mc));
		
	}

	@Override
	public void tick(Microondas mc) {
		// TODO Auto-generated method stub
		if(mc.getTimer()>1) {
			mc.timer_dec();
		}
		else {
			mc.timer_dec();
			mc.getDisplay().setDisplay("Listo");
			mc.setEstado(new ClosedWithItem(mc));
			mc.getBeeper().beep(3);
		}
		
	}

}
