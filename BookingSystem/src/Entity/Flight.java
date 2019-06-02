package Entity;

public class Flight {
	public int FlightCode;
	public String DepatureTime;
	public String ArrivalTime;
	public String DepaturePlace;
	public String ArrivalPlace;
	public String AirlineName;
	public String AirplaneName;
	public int Fare;
	
	
	public String getAirlineName() {
		return AirlineName;
	}
	public void setAirlineName(String airlineName) {
		AirlineName = airlineName;
	}
	public String getAirplaneName() {
		return AirplaneName;
	}
	public void setAirplaneName(String airplaneName) {
		AirplaneName = airplaneName;
	}
	public int getFlightCode() {
		return FlightCode;
	}
	public void setFlightCode(int flightCode) {
		FlightCode = flightCode;
	}
	public String getDepatureTime() {
		return DepatureTime;
	}
	public void setDepatureTime(String depatureTime) {
		DepatureTime = depatureTime;
	}
	public String getArrivalTime() {
		return ArrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		ArrivalTime = arrivalTime;
	}
	
	public String getDepaturePlace() {
		return DepaturePlace;
	}
	public void setDepaturePlace(String depaturePlace) {
		DepaturePlace = depaturePlace;
	}
	public String getArrivalPlace() {
		return ArrivalPlace;
	}
	public void setArrivalPlace(String arrivalPlace) {
		ArrivalPlace = arrivalPlace;
	}
	public int getFare() {
		return Fare;
	}
	public void setFare(int fare) {
		Fare = fare;
	}
	@Override
	public String toString() {
		return "Flight [FlightCode=" + FlightCode + ", DepatureTime="
				+ DepatureTime + ", ArrivalTime=" + ArrivalTime
				+ ", DepaturePlace=" + DepaturePlace + ", ArrivalPlace="
				+ ArrivalPlace + ", AirlineName=" + AirlineName
				+ ", AirplaneName=" + AirplaneName + ", Fare=" + Fare + "]";
	}
	
	
	
}
