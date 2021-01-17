
public class HotelReservation extends Reservation {

	private Hotel hotel;
	private String type_of_room;
	private int NumOfNights;
	private int price_of_1night;


	public HotelReservation(String name, Hotel hotel, String type_of_room,int NumOfNights){
		super(name);
		this.hotel = hotel;
		this.type_of_room = type_of_room;
		this.NumOfNights = NumOfNights;
		hotel.reserveRoom(type_of_room);
		this.price_of_1night = new Room(type_of_room).getPrice();
	}

	protected int getNumOfNights(){
		return this.NumOfNights;
	}


	@Override
	public int getCost() {


		int sum = this.price_of_1night* this.NumOfNights;
		return sum;
	}


	@Override
public boolean equals(Object obj) {


		if (obj instanceof HotelReservation == false) {
			return false;
		}
		else if (!(((HotelReservation)obj).hotel.equals(this.hotel))) {
			return false;
		}
		else if (!(((HotelReservation)obj).type_of_room.equals(this.type_of_room))) {
			return false;
		}
		else if (!(((HotelReservation)obj).reservationName().equals(this.reservationName()))) {
			return false;
		}
		else if (!(((HotelReservation)obj).NumOfNights == this.NumOfNights)) {
			return false;
		}
		else if (!(((HotelReservation)obj).getCost() == this.getCost())) {
			return false;
		}
		else return true;

	}

}
