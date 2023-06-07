public class DuplicateArray {
    public static void main(String[] args) {
        double[] r = new double[] {12.3,23.5,45.7,82.4,12.3,45.7};
        System.out.println("Duplicate Elements in Given Array");
        for (double i =0; i<r.length;i++){
            for (double j=i+1;j< r.length;j++){
                if(r[(int) i]==r[(int) j])
                    System.out.println(r[(int) j]);
            }
        }
    }
}
