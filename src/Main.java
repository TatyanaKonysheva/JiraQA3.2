public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

       int result = (int) service.calculate(98, 1.87);

        System.out.println("Body mass index: " + result);
        }
    }