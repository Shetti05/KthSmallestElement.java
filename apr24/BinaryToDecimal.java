public class BinaryToDecimal {
    public static void main(String[] args) {
        String bin = "1011";
        int decimal = Integer.parseInt(bin, 2);
        System.out.println(decimal);
    }
}