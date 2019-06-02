package Entity;
import Factory.SeatFactory;

public class Airplane {
	public int Leixing;
	public String Name;
	public Seat seat=SeatFactory.getSeat();
	public Seat getSeat() {
		return seat;
	}
	public void setSeat(Seat seat) {
		this.seat = seat;
	}
	public int getLeixing() {
		return Leixing;
	}
	public void setLeixing(int leixing) {
		Leixing = leixing;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

}
