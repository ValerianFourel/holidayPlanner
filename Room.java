


public class Room {



	private String type_of_room;

	private int price;
	private boolean available;

	public Room(String type_of_room){
		this.type_of_room = type_of_room;

		if(!(this.type_of_room.equals("double") || this.type_of_room.equals("queen") || this.type_of_room.equals("king"))){
			throw new IllegalArgumentException();
		}
		if(this.type_of_room.equals("double")){
			final int price_double = 9000;
			this.price = price_double;
		}
		if(this.type_of_room.equals("queen")){
			final int price_queen = 11000;

			this.price = price_queen;
		}
		if(this.type_of_room.equals("king")){
			final int price_king = 15000;

			this.price = price_king;
		}

		this.available = true;

	}

	public Room(Room room){
		this.type_of_room = room.type_of_room;
		this.available = room.available;
		this.price= room.price;
	}

	public String getType(){
		return this.type_of_room;
	}

	public int getPrice(){
		return this.price;
	}

	public void changeAvailability(){
		if(this.available){
			this.available = false;
		} else {
			this.available = true;
		}
	}

	public static Room findAvailableRoom(Room[] Rooms,String type_of_room){

		int i =0;
		for(int k =0;k<Rooms.length;k++){
			if(Rooms[i].getType().equals(type_of_room) && Rooms[i].available){
				return Rooms[i];
			}

			i++;
		}

		return null;

	}

	public static boolean makeRoomAvailable(Room[] Rooms,String type_of_room){

		for(int i =0; i<Rooms.length;i++){
			if(Rooms[i].type_of_room.equals(type_of_room)){
				if(!(Rooms[i].available)){
					Rooms[i].changeAvailability();
					return true;
				}
			}
		}
		return false;
	}

}
