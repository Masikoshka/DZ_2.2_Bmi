public class BmiService {
    public double calculate(double bodyWeight, double height) {
        double bmi = bodyWeight / (height * height);
        return bmi;
    }
}
