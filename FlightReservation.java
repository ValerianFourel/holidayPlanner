
public class FlightReservation extends Reservation {

	private static final double kmpergallon = 167.52;
	private static final int priceofgallon = 124;
	private static final int fixedcost = 5375;

	private Airport departure;
	private Airport arrival;


	public FlightReservation(String name, Airport departure, Airport arrival){
		super(name);
		this.arrival = arrival;
		this.departure = departure;

		if(this.arrival.equals(this.departure)){
			throw new IllegalArgumentException();
		}

		/*
		 * Throw an IllegalArgumentException if the two input airports are the same. Ignore
the fact that you did not overrode the equals method in the Airport class.

		 */
	}

	@Override
	public int getCost() {

		double temp;

		if(this.arrival==null){
			return 0;
		}
		/*
		 * Determine what is happening with the getDistance function
		 */
		int totalfees = +this.arrival.getFees()+fixedcost+this.departure.getFees();
		temp = ((Airport.getDistance(this.departure, this.arrival)/kmpergallon)*priceofgallon);
		int sum = (int) Math.ceil(temp);
		sum+=totalfees;

		return sum;
	}

	@Override
public boolean equals(Object obj) {



		if (obj instanceof FlightReservation == false) {
			return false;
		}

		else if (!(((FlightReservation)obj).departure.equals(this.departure))) {
			return false;
		}

		else if (!(((FlightReservation)obj).arrival.equals(this.arrival))) {
			return false;
		}
		else if (!(((FlightReservation)obj).reservationName().equals(this.reservationName()))) {
			return false;
		}



		else return true;

	}

	}
