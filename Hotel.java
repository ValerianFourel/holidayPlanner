



public class Hotel {
	private String name;
	private Room[] Rooms;

	public Hotel(String name,Room[] Rooms){
		this.name = name;
		//deepCopy(this.Rooms,Rooms);
		this.Rooms = new Room[Rooms.length];
		for(int i=0;i<Rooms.length;i++){
			this.Rooms[i]=new Room(Rooms[i]);
		}

	}



	public int reserveRoom(String type_of_room){




		Room current = Room.findAvailableRoom(this.Rooms, type_of_room);

		if(!(current==null)){
		current.changeAvailability();

		return current.getPrice();
		}else{
			throw new IllegalArgumentException();
		}

		}






	public boolean cancelRoom(String type_of_room){
		return Room.makeRoomAvailable(this.Rooms, type_of_room);
	}





}
