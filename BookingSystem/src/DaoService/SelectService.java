package DaoService;

import java.sql.ResultSet;
import java.sql.SQLException;
import Entity.Passenger;
import Entity.Flight;
import Entity.Airline;
import Util.DBUtil;

public class SelectService extends DBUtil{

	/**
	 * @param sql
	 * @param sqlParams
	 * @return Passenger
	 * @方法说明  以用户名和用户密码做作为查询乘客是否存在
	 */
	public Passenger selectNameAndPNM(String sql, Object[] obj) {
		// TODO Auto-generated method stub
		ResultSet  rs =  doQuery(sql, obj);
		Passenger passenger = null;
		try {
			if (rs.next()) {
				passenger = new Passenger();
				passenger.setName(rs.getString(1));
				passenger.setPassportNumber(rs.getInt(2));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return passenger;
	}

	public Flight selectFlight(String sql, Object[] obj) {
		// TODO Auto-generated method stub
		ResultSet rs = doQuery(sql,obj);
		Flight flight=new Flight();
		try{
			while (rs.next()){
				
				flight.setFlightCode(rs.getInt(1));
				flight.setDepatureTime(rs.getString(2));
				flight.setArrivalTime(rs.getString(3));
				flight.setDepaturePlace(rs.getString(4));
				flight.setArrivalPlace(rs.getString(5));
				flight.setAirlineName(rs.getString(6));
				flight.setAirplaneName(rs.getString(7));
				flight.setFare(rs.getInt(8));
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flight;
	}

}
