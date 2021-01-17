
public class Basket {

	private Reservation[] Reservations;
	private int size;

	public Basket(){
		this.size =0;
		this.Reservations = new Reservation[5];


	}

	public Reservation[] getProducts(){
		return this.Reservations;
	}



	public int getNumOfReservations(){
		return this.size;


	}

	public int add(Reservation R){

		this.Reservations[this.size++] = R;
		// resize array
		ensureCapacity();
		return this.size;
	}

public boolean remove(Reservation R){

		Reservation[] array = new Reservation[this.size-1];
		int count =0;

		int check =1;
		for(int i =0;i<this.size;i++){
			if(this.Reservations[i] !=null && this.Reservations[i].equals(R) && check ==1){
				check =0;
				continue;
			}
			else {
				array[count]=this.Reservations[i];
				count++;
			}
		}
		if(check==1){
			return false;
		}

		this.Reservations = array;

		return true;


	}


	public int getTotalCost(){
		int totalsum=0;

		for(int i =0; i<this.size;i++){
			totalsum+=Reservations[i].getCost();
		}
		return totalsum;

	}


	public void clear(){

		this.Reservations= new Reservation[0];
		this.size=0;


		}

	/*
	 *
	 * do Clear functions
	 */


private void ensureCapacity(){

		int newSize = this.Reservations.length +(int) (this.Reservations.length/2)+1;

		Reservation[] temp = new Reservation[newSize];
		for(int i=0; i<this.Reservations.length;i++){
			temp[i]=this.Reservations[i];
		}

		this.Reservations=temp;

	}





}
