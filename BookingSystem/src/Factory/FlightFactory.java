package Factory;
import Entity.Flight;
import Entity.FlightInstance;


public class FlightFactory {
	public static Flight getFlight(){
		Flight flight=null;
		flight=new FlightInstance();
		return flight;
	}

}
