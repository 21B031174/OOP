package problem2Lab3;

public class Library extends Books{
	String nameOfLibrary;
	String GeoPosition;
	Library(String name){
		this.nameOfLibrary = name;
	}
	Library(String name,String geoPos){
		this(name);
		this.GeoPosition = geoPos;
	}
	public String getNameOfLibrary() {
		return nameOfLibrary;
	}
	public void setNameOfLibrary(String nameOfLibrary) {
		this.nameOfLibrary = nameOfLibrary;
	}
	public String getGeoPosition() {
		return GeoPosition;
	}
	public void setGeoPosition(String geoPosition) {
		GeoPosition = geoPosition;
	}
	@Override
	public String toString() {
		return "Library [nameOfLibrary=" + nameOfLibrary + ", GeoPosition=" + GeoPosition + "]";
	}
}
