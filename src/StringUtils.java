public class StringUtils {
    public static String formatName(String firstName, String lastName) {
        // Форматування імені
        return firstName.toUpperCase() + " " + lastName.toUpperCase();
    }

    public static String formatAddress(String city, String country) {
        // Форматування адреси
        return "Город: " + city + ", Країна: " + country;
    }

    public static String formatNameAndAddress(String firstName, String lastName, String city, String country) {
        // Виклик двох окремих методів та форматування результуючого рядка
        String formattedName = formatName(firstName, lastName);
        String formattedAddress = formatAddress(city, country);
        return formattedName + ", " + formattedAddress;
    }
}
