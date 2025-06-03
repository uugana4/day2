
public class Main {
    public static void main(String[] args) {
        AvtoMashin mashin = new AvtoMashin();
        mashin.setKompani("Toyota");
        mashin.setZagvar("Corolla");
        mashin.setOn(2020);
        mashin.setHurd(60);

        System.out.println("Анхны хурд: " + mashin.getHurd() + " км/ц");
    }
}
