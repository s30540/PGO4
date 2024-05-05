package zadanie2;

public class Address {

    // Metoda createAddress przyjmująca kraj jako parametr
    public String createAddress(String country) {
        return String.format("Kraj: %s", country);
    }

    // Metoda createAddress przyjmująca kraj i miasto jako parametry
    public String createAddress(String country, String city) {
        return String.format("Kraj: %s, Miasto: %s", country, city);
    }

    // Metoda createAddress przyjmująca kraj, miasto i kod pocztowy jako parametry
    public String createAddress(String country, String city, String zipCode) {
        return String.format("Kraj: %s, Miasto: %s, Kod pocztowy: %s", country, city, zipCode);
    }

    // Metoda createAddress przyjmująca kraj, miasto, kod pocztowy i nazwę ulicy jako parametry
    public String createAddress(String country, String city, String zipCode, String streetName) {
        return String.format("Kraj: %s, Miasto: %s, Kod pocztowy: %s, Ulica: %s", country, city, zipCode, streetName);
    }

    // Metoda createAddress przyjmująca kraj, miasto, kod pocztowy, nazwę ulicy i numer mieszkania jako parametry
    public String createAddress(String country, String city, String zipCode, String streetName, int houseNumber) {
        return String.format("Kraj: %s, Miasto: %s, Kod pocztowy: %s, Ulica: %s, Numer domu: %d", country, city, zipCode, streetName, houseNumber);
    }
}

