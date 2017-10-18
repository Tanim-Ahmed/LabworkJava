package lab;

public class mainclass  {
public static void main(String[]args)
{
	
	Ship s=new Ship();
	Land l=new Land();
	Water w=new Water();
	Air a=new Air();
	Car c=new Car();
	Bus b=new Bus();
	Ship sh=new Ship();
	Boat bo=new Boat();
	Aeroplane ae=new Aeroplane();
	Helicupter hp=new Helicupter();
	s.shipspeed();
	c.carspeed();
	ae.Aerospeed();
	hp.hpspeed();
	b.busspeed();
	b.busspeed();
	Vehicle v=new Land();
	try
	{
		System.out.println(l instanceof Land);
		System.out.println(c instanceof Vehicle);
		System.out.println(sh instanceof Ship);
		System.out.println(v instanceof Land);
		
	}
	
	catch(Exception e)
	{
		System.out.println("Error");
	}
	
	
}
}
