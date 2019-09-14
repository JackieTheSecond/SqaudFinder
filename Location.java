// only for study spots


public class Location {
    String name;
    private double latitude;
    private double longitude;


    public Location(){
       name = "Purdue";
       this.latitude = 40.423538;
       this.longitude = -86.921738;
    }

    public Location(String name1, double lat1,double long1){
        name = name1;
        latitude = lat1;
        longitude =  long1;
    }

    public Location(double lat1, double long1){
        name = null;
        latitude = lat1;
        longitude = long1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setlatitude(double lattit) {
        this.latitude = lattit;
    }

    public void setlongitude(double longtit) {
        this.longitude = longtit;
    }

    public double getlatitude() {
        return latitude;
    }

    public double getlongitude() {
        return longitude;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        if(name == null){
            return latitude + "," + longitude;
        }
       return name + ":" + latitude + "," + longitude;


    }


}

