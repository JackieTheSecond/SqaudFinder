import java.lang.reflect.Array;
import java.util.*;

public class SquadFinder {


    public static void main(String args[]){
        ArrayList<Location> userLocations = new ArrayList<Location>();
        Location center = findAverage(userLocations);

    }
    
    public int calc(){

        return 3;
    }

    public static Location findAverage(ArrayList<Location> arrayList){

        double latitudeSum = 0;
        double longitudeSum = 0;
       double[] latTitArray = new double[arrayList.size()];
       double[] longTitArray = new double[arrayList.size()];


       for(int x = 0; x < arrayList.size(); x++){
           latTitArray[x] = arrayList.get(x).getlatitude();
           longTitArray[x] = arrayList.get(x).getlongitude();
       }

       for(int i = 0; i < arrayList.size(); i++){
           latitudeSum = latTitArray[i] + latitudeSum;
           longitudeSum = longTitArray[i] + longitudeSum;
       }

       double latAvg = (latitudeSum/arrayList.size());
       double longAvg = (longitudeSum/arrayList.size());


    Location result = new Location(latAvg,longAvg);

    return result;


    }






}
