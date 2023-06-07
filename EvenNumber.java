public class EvenNumber {
    public static void main(String[] args) {
        int[] random = new int[]{2, 5, 3, 7, 6, 9};
        for (int i = 0; i < random.length; i++) {
            if (random[i] % 2 == 0)
                System.out.println(random[i] +" Is Even Number");
        }
    }
}
