
public class Airport {
	private int x;
	private int y;
	private int fees;

	public Airport(int x, int y, int fees){
		this.x = x;
		this.y = y;
		this.fees = fees;

	}

	public int getFees(){
		return this.fees;


	}

	public static int getDistance(Airport airport1,Airport airport2){

		double air1 = (airport1.y-airport2.y);
		double temp =  ((airport1.x-airport2.x)*(airport1.x-airport2.x));
			double temp2 = 	(air1*air1);
			temp +=temp2;
		temp = Math.sqrt(temp);
		int sum = (int) Math.ceil(temp);
		return (int) sum;
	}


}
