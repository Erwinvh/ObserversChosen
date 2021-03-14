package DataClasses;

public class GPSCoordinate {

    public double Latitude;

    public double Longitude;


    public void setCoords(double Longitude, double Latitude){
        this.Longitude = Longitude;
        this.Latitude = Latitude;
    }

    public double getLatitude() {
        return Latitude;
    }

    public double getLongitude() {
        return Longitude;
    }

    public double distanceTo(GPSCoordinate other){
        //TODO: pythagoras with gps coords.


        return 0;
    }
}
