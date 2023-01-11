package class6;

public class SwitchCase {
    public static void main(String[] args) {
        String country = "USA";
        System.out.println(country.toLowerCase());

        switch (country.toLowerCase()) {
            case "usa":
                System.out.println("Burgers");
                break;
            case "Italy":
                System.out.println("Pasta");
                break;
            case "Ukraine":
                System.out.println("Borsh");
                break;
            default:
                System.out.println("Wrong country");
        }
    }
}
