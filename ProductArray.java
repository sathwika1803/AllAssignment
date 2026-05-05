public class ProductArray {
    public static void main(String[] args) {
        int product=1;
        int[] marks={32,45,34};
        for (int i=0;i<marks.length;i++){
            product=product*marks[i];

        }
        System.out.println(product);
    }
}
