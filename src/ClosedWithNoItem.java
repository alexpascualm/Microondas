
public class ClosedWithNoItem implements Estado {
	public ClosedWithNoItem(Microondas mc) {
		mc.getLamp().lamp_off();
		mc.getTurnable().turntable_stop();
		mc.getHeating().heating_off();
		mc.setCooking(false);
		mc.setDoorOpen(false);
		mc.setWithItem(false);

	}

	@Override
	public void door_opened(Microondas mc) {
		// TODO Auto-generated method stub
		mc.setEstado(new OpenWithNoItem(mc));
	}

	@Override
	public void door_closed(Microondas mc) {
		// TODO Auto-generated method stub
		// La puerta ya esta cerrada. No hace nada
	}

	@Override
	public void item_placed(Microondas mc) {
		// TODO Auto-generated method stub
		// No se pueden introducir objetos
	}

	@Override
	public void item_removed(Microondas mc) {
		// TODO Auto-generated method stub
		// No se pueden sacar objetos

	}

	@Override
	public void power_inc(Microondas mc) {
		// TODO Auto-generated method stub
		mc.setPower(mc.getPower() + 1);
		mc.getDisplay().setDisplay(Integer.toString(mc.getPower()));
	}

	@Override
	public void power_dec(Microondas mc) {
		// TODO Auto-generated method stub
		if (mc.getPower() != 0) {
			mc.setPower(mc.getPower() - 1);
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
		mc.setTimer(mc.getTimer() + 1);
		mc.getDisplay().setDisplay(Integer.toString(mc.getTimer()));
	}

	@Override
	public void timer_dec(Microondas mc) {
		// TODO Auto-generated method stub
		if (mc.getTimer() != 0) {
			mc.setTimer(mc.getTimer() - 1);
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
		// No se puede cocinar sin alimentos
	}

	@Override
	public void cooking_stop(Microondas mc) {
		// TODO Auto-generated method stub
		// No se puede cocinar sin alimentos
	}

	@Override
	public void tick(Microondas mc) {
		// TODO Auto-generated method stub
		// No esta cocinando
	}

}
