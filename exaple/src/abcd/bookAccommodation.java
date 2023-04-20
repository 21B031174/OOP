package abcd;

public class bookAccommodation implements Booking,Comparable<Object> {
	public String name;
	
	public String city;
	public int room;
	
	bookAccommodation(String name){
		this.name = name;
	}
	
	bookAccommodation(String name,String city){
		this(name);
		this.city = city;
	}
	
	public void howManyRooms(int rooms) {
		this.room = rooms;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
	    this.name = name;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
	    this.city = city;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}	 
	public String toString() {
		return super.toString();
	}

	@Override
	public void chek(String name) {
		System.out.println("room is clean");
		
	}

	@Override
	public void booking(String name) {
		System.out.println("room is booking");
		
	}

	@Override
	public int compareTo(Object o) {
		bookAccommodation x = (bookAccommodation)o;
	    if(x.room > this.room) {
	      return x.room;
	    }
	    else if(x.room == this.room) {
	      return room;
	    }
	    else {
	      return this.room;
	    }    

	}	
}

