package DB;

public interface PlaceDao {
	public Long createPlace(Place p);
	public Place findPlace(Long id);
	public boolean updatePlace(Place p);
	public boolean removePlace(Place p);
}
