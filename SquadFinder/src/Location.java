public class Location {
    String name;
    private double lattit;
   private double longtit;


    public Location(){
        name = "Purdue";
        this.lattit = 40.423538;
       this.longtit = -86.921738;
    }

    public Location(String name1, double lat1,double long1){
        name = name1;
        lattit = lat1;
        longtit =  long1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLattit(double lattit) {
        this.lattit = lattit;
    }

    public void setLongtit(double longtit) {
        this.longtit = longtit;
    }

    public double getLattit() {
        return lattit;
    }

    public double getLongtit() {
        return longtit;
    }

    public String getName() {
        return name;
    }


}

