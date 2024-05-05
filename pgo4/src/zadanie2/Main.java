package zadanie2;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();

        String address1 = address.createAddress("Polska");
        System.out.println(address1); // Output: Kraj: Polska

        String address2 = address.createAddress("Polska", "Warszawa");
        System.out.println(address2); // Output: Kraj: Polska, Miasto: Warszawa

        String address3 = address.createAddress("Polska", "Warszawa", "01-783");
        System.out.println(address3); // Output: Kraj: Polska, Miasto: Warszawa, Kod pocztowy: 01-783

        String address4 = address.createAddress("Polska", "Warszawa", "01-783", "Broniewskiego");
        System.out.println(address4); // Output: Kraj: Polska, Miasto: Warszawa, Kod pocztowy: 01-783, Ulica: Broniewskiego

        String address5 = address.createAddress("Polska", "Warszawa", "01-783", "Broniewskiego", 43);
        System.out.println(address5); // Output: Kraj: Polska, Miasto: Warszawa, Kod pocztowy: 01-783, Ulica: Broniewskiego, Numer domu: 43

    }
}
