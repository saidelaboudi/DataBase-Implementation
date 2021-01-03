package DB;

public interface TripDao {
	public Long createTrip(Trip t);
	public Trip findTripById(Long id);
	public boolean removeTrip(Trip t);
}
