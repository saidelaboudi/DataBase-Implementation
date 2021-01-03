package DB;

public class Trip {
	public int id;
	public Place departure;
	public Place destination;
	public double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Place getDeparture() {
		return departure;
	}
	public void setDeparture(Place departure) {
		this.departure = departure;
	}
	public Place getDestination() {
		return destination;
	}
	public void setDestination(Place destination) {
		this.destination = destination;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Trip(int id, Place departure, Place destination, double price) {
		super();
		this.id = id;
		this.departure = departure;
		this.destination = destination;
		this.price = price;
	}
	
	
	
}
