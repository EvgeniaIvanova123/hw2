public class BmiService {
    public double calculate( double growth, double weight) {
        int a1= 2;
        double index  = weight / Math.pow (growth, a1) ;
        return index;
    }
}