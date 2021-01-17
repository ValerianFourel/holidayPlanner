
public class BnBReservation extends HotelReservation{

	private static final int breakfast = 1000;

	public BnBReservation(String name, Hotel hotel, String type_of_room, int NumOfNights) {
		super(name, hotel, type_of_room, NumOfNights);
		// TODO Auto-generated constructor stub
	}


	public int getCost(){
		int sum = super.getNumOfNights()*breakfast+super.getCost();
		return sum;


	}


}
