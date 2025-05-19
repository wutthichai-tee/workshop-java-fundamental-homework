public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, JAVA Homework!");

        System.out.println("=============== HW JAVA : Implement Interface ===============");
        Vaccine vaccine = new Vaccine("Flu Vaccine", 2.0, 2);
        System.out.println("Vaccine Name: " + vaccine.getName());
        System.out.println("Vaccine Price: " + vaccine.getPrice());
        System.out.println("Vaccine Quantity: " + vaccine.getQuantity());
        System.out.println("Vaccine Total Price: " + vaccine.calculatePrice());
        
        System.out.println("=============== HW JAVA : Extend Class ===============");
        FreeDrug freeDrug = new FreeDrug("Aspirin", 25.5, 10);
        System.out.println("Free Drug Name: " + freeDrug.getName());
        System.out.println("Free Drug Price: " + freeDrug.getPrice());
        System.out.println("Free Drug Quantity: " + freeDrug.getQuantity());
        System.out.println("Free Drug Total Price: " + freeDrug.calculatePrice());
    }
}