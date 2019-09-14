import java.lang.reflect.Array;
import java.util.*;

public class SquadFinder {


    public static void main(String args[]){
        ArrayList<Location> userLocations = new ArrayList<Location>();
        //Test Locations for Running
       /* Location one = new Location(40.427002,-86.928026);
        Location two = new Location(40.426619, -86.918429);
        userLocations.add(one);
        userLocations.add(two); */

        Location center = findAverage(userLocations);
        System.out.println(center);

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
    
    public Location findStudyCenter(Location center, ArrayList<Location> StudyLoc){
        double distances[]=new double[StudyLoc.size()];
        double cLat = center.getlatitude();
        double cLong = center.getlongitude();
        for (int i=0; i<StudyLoc.size(); i++){

            double sLat = (StudyLoc.get(i)).getlatitude();
            double sLong = (StudyLoc.get(i)).getlongitude();

            double d = Math.sqrt(Math.pow((cLat-sLat),2)+Math.pow((cLong-sLong),2));
            distances[i]=d;
        }
        double g = Double.MAX_VALUE;
        int arrIndex=0;
        for (int j=0; j<distances.length; j++){
            if (distances[j]<g){
                g = distances[j];
                arrIndex=j;
            }
        }
        return StudyLoc.get(arrIndex);
    }



}
