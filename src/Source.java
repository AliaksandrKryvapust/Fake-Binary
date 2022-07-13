public class Source {
    public static void main(String[] args) {
    String str = "45385593107843568";
        System.out.println(fakeBin(str).equals("01011110001100111"));
    }
    public static String fakeBin(String numberString) {
        return numberString.replaceAll("[0-4]","0").replaceAll("[5-9]","1");
    }
}
