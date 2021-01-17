
public class Customer {

	private String name;
	private int balance;
	private Basket basket;

	public Customer(String name, int balance){
		this.name = name;
		this.balance = balance;
		this.basket = new Basket();
	}

	public String getName(){
		return this.name;
	}

	public int getBalance(){
		return this.balance;
	}

	public int addFunds(int amount){
		if(amount<0){
			System.out.println("Amount added negative. Error");
			throw new IllegalArgumentException();
		}
		this.balance += amount;
		return this.balance;
	}

	public Basket getBasket(){
		return this.basket;
	}


	public int addToBasket(Reservation R){
		if(R.reservationName().equals(this.name)){
		int i = this.basket.add(R);
		return i;
		} else {
			throw new IllegalArgumentException();
		}
	}


	public int addToBasket(Hotel hotel, String type_of_room, int NumOfNights, boolean breakfast){
		if(breakfast){
			BnBReservation BnB = new BnBReservation(this.name,hotel,type_of_room,NumOfNights);
			this.basket.add(BnB);
		} else {
			HotelReservation Hotel = new HotelReservation(this.name,hotel,type_of_room,NumOfNights);
				this.basket.add(Hotel);
		}
		return this.basket.getNumOfReservations();

	}

	public int addToBasket(Airport departure, Airport arrival){
		FlightReservation flight = new FlightReservation(this.name,departure,arrival);
		this.basket.add(flight);

		return this.basket.getNumOfReservations();

	}

	public boolean removeFromBasket(Reservation R){
		return this.basket.remove(R);
	}

	public int checkOut(){
		if(this.basket.getTotalCost()>this.balance){
			throw new IllegalStateException();
		} else {
			this.balance -= this.basket.getTotalCost();
			this.basket.clear();
		}


		return this.balance;
	}

}
