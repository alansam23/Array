public class Reverse {
    public static void main(String[] args) {
        int[] random = new int[]{13, 24, 34, 56, 89};
        System.out.println("Original Order is");
        for (int i = 0; i < random.length; i++) {
            System.out.print(random[i] + " ");
        }
        System.out.println("\n ----------");
        System.out.println("Reverse Order is");
        for (int j = random.length - 1; j >= 0; j--) {
            System.out.print(random[j] + " ");
        }
    }
}
