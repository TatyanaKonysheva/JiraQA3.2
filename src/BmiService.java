public class BmiService {
    public double calculate(int weightKg, double heightM) {

        double bmi = weightKg / (heightM * heightM);
        return (int) bmi;
    }
}
