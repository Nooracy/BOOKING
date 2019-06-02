package Entity;

public class Airline {
	public int Code;
	public String Name;
	public double OwnDiscount;
	public Airplane airplane=new Airplane();
	
	public Airplane getAirplane() {
		return airplane;
	}
	public void setAirplane(Airplane airplane) {
		this.airplane = airplane;
	}
	public int getCode() {
		return Code;
	}
	public void setCode(int code) {
		Code = code;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getOwnDiscount() {
		return OwnDiscount;
	}
	public void setOwnDiscount(double ownDiscount) {
		OwnDiscount = ownDiscount;
	}

}
