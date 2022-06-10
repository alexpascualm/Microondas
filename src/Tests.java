import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

public class Tests {
	
	private Microondas mc=new Microondas();
	
	 @Test
	 public void testlamp() {
		 assertEquals(false,mc.getLamp().isLampOn());
		 mc.getLamp().lamp_on();
		 assertEquals(true,mc.getLamp().isLampOn());
		 mc.getLamp().lamp_off();
		 assertEquals(false,mc.getLamp().isLampOn()); 
	 }
	 
	 @Test
	 public void testHeating() {
		 assertEquals(false,mc.getHeating().isHeating());
		 mc.getHeating().heating_on();
		 assertEquals(true,mc.getHeating().isHeating());
		 mc.getHeating().heating_off();
		 assertEquals(false,mc.getHeating().isHeating());
	 }
	 
	 @Test
	public void testTurtable() {
		assertEquals(false,mc.getTurnable().isMoving());
		 mc.getTurnable().turntable_start();
		 assertEquals(true,mc.getTurnable().isMoving());
		 mc.getTurnable().turntable_stop();
		 assertEquals(false,mc.getTurnable().isMoving());
		 
	 }
	 @Test
	 public void testDisplay() {
		 assertEquals("",mc.getDisplay().getDisplay());
		 mc.getDisplay().setDisplay("Probando display");
		 assertEquals("Probando display",mc.getDisplay().getDisplay());
		 mc.getDisplay().cleardisplay();
		 assertEquals("",mc.getDisplay().getDisplay());	 
	 }
	 @Test
	 public void testMicroCerradoNoItem() {
		 assertEquals(false,mc.getLamp().isLampOn()); 
		 assertEquals(false,mc.getHeating().isHeating());
		 assertEquals(false,mc.getTurnable().isMoving());
		 assertEquals(false,mc.isCooking());
		 assertEquals(false,mc.isDoorOpen());
		 assertEquals(false,mc.isWithItem());
		 mc.timer_inc();
		 assertEquals("1",mc.getDisplay().getDisplay());
		 mc.timer_dec();
		 assertEquals("0",mc.getDisplay().getDisplay());
		 mc.door_opened();
		 assertEquals(true,mc.getLamp().isLampOn()); 
		 assertEquals(false,mc.getHeating().isHeating());
		 assertEquals(false,mc.getTurnable().isMoving());
		 assertEquals(false,mc.isCooking());
		 assertEquals(true,mc.isDoorOpen());
		 assertEquals(false,mc.isWithItem()); 	 
	 }
	 
	 @Test 
	 public void testMicroAbiertoNoItem() {
		 mc.door_opened();
		 assertEquals(true,mc.getLamp().isLampOn()); 
		 assertEquals(false,mc.getHeating().isHeating());
		 assertEquals(false,mc.getTurnable().isMoving());
		 assertEquals(false,mc.isCooking());
		 assertEquals(true,mc.isDoorOpen());
		 assertEquals(false,mc.isWithItem()); 
		 mc.door_closed();
		 assertEquals(false,mc.getLamp().isLampOn()); 
		 assertEquals(false,mc.getHeating().isHeating());
		 assertEquals(false,mc.getTurnable().isMoving());
		 assertEquals(false,mc.isCooking());
		 assertEquals(false,mc.isDoorOpen());
		 assertEquals(false,mc.isWithItem());
		 mc.door_opened();
		 mc.item_placed();
		 assertEquals(true,mc.getLamp().isLampOn()); 
		 assertEquals(false,mc.getHeating().isHeating());
		 assertEquals(false,mc.getTurnable().isMoving());
		 assertEquals(false,mc.isCooking());
		 assertEquals(true,mc.isDoorOpen());
		 assertEquals(true,mc.isWithItem()); 
	 }
	 
	 @Test 
	 public void testMicroabiertoItem() {
		 mc.door_opened();
		 mc.item_placed();
		 assertEquals(true,mc.getLamp().isLampOn()); 
		 assertEquals(false,mc.getHeating().isHeating());
		 assertEquals(false,mc.getTurnable().isMoving());
		 assertEquals(false,mc.isCooking());
		 assertEquals(true,mc.isDoorOpen());
		 assertEquals(true,mc.isWithItem()); 
		 mc.item_removed();
		 assertEquals(false,mc.isWithItem());
		 mc.item_placed();
		 assertEquals(true,mc.isWithItem());
		 mc.door_closed();
		 assertEquals(false,mc.getLamp().isLampOn()); 
		 assertEquals(false,mc.getHeating().isHeating());
		 assertEquals(false,mc.getTurnable().isMoving());
		 assertEquals(false,mc.isCooking());
		 assertEquals(false,mc.isDoorOpen());
		 assertEquals(true,mc.isWithItem());
	 }
	 @Test 
	 
	 public void testMicroCerradoConItem() {
		 mc.door_opened();
		 mc.item_placed();
		 mc.door_closed();
		 mc.power_inc();
		 mc.timer_inc();
		 mc.cooking_start();
		 assertEquals(false,mc.getLamp().isLampOn()); 
		 assertEquals(true,mc.getHeating().isHeating());
		 assertEquals(true,mc.getTurnable().isMoving());
		 assertEquals(true,mc.isCooking());
		 assertEquals(false,mc.isDoorOpen());
		 assertEquals(true,mc.isWithItem());
		 
	 }
	 
	 @Test
	 public void testCooking() {
		 mc.door_opened();
		 mc.item_placed();
		 mc.door_closed();
		 mc.power_inc();
		 mc.timer_inc();
		 mc.cooking_start();
		 mc.power_inc();
		 assertEquals("2",mc.getDisplay().getDisplay());
		 mc.tick();
		 assertEquals("Listo",mc.getDisplay().getDisplay());
		 mc.tick();
		 assertEquals("Listo",mc.getDisplay().getDisplay());
		 
	 }
	 
	
	

}
