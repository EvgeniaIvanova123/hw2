public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double growth = 1.87; // Рост в метрах
        double weight = 98; // Вес в килограммах
        double index= service.calculate(growth, weight);
        int roundedIndex =  (int) index;
        System.out.println("Индекс массы тела = " + roundedIndex);
    }
}