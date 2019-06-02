package Factory;
import Entity.Seat;
import Entity.FlightSeat;

public class SeatFactory {
	public static Seat getSeat(){
		Seat seat=null;
		seat=new FlightSeat();
		return seat;
	}

}
