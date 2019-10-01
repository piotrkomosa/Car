public class Cars {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.company = "VW";
        car1.model = "Golf";
        car1.age = 2006;

        Car car2 = new Car();
        car2.company = "Ford";
        car2.model = "Focus";
        car2.age = 2015;

        System.out.println("Samochod pierwszy: " + car1.company + " " + car1.model + ", rocznik " + car1.age);
        System.out.println("Samochod pierwszy: " + car2.company + " " + car2.model + ", rocznik " + car2.age);
    }
}
