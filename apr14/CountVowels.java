public class CountVowels {
    public static int count(String str) {
        int count = 0;
        for(char c : str.toLowerCase().toCharArray()) {
            if("aeiou".indexOf(c) != -1) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count("Hello World"));
    }
}