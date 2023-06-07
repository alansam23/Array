public class OddNumber {
    public static void main(String[] args) {
        int[] random = new int[]{2,8,22,45,97};
        for(int i =0; i<random.length;i++){
            if(random[i]%2 !=0)
                System.out.println(random[i] + " Is Odd Number");
        }
    }
}
