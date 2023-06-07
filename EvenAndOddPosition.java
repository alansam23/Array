public class EvenAndOddPosition {
    public static void main(String[] args) {
        int[] random = new int[]{12, 23, 34, 45, 65, 5, 23, 12, 32, 34};
        for (int i = 0; i < random.length; i++) {
            if (i % 2 == 0)
                System.out.println(random[i] + " || "+ "Even Position");
         //   else
                //System.out.println(random[i]+ " "+ "Even Position");
        }
        for (int i = 0; i < random.length; i++){
            if (i % 2 != 0)
                System.out.println(random[i] + " || " + "Odd Position");
        }
    }
}