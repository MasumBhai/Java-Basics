
public class arrayTraversal {

    public static final int maxx = 100;

    public static void main(String[] args) {
        int arr[] = new int[maxx];
        
        for (int i = 0; i < maxx; i++) {
            arr[i] = i;
        }
        for (int k : arr) {
            System.out.printf("number is now %2d", arr[k]);
            System.out.println();
        }
        int TwoDarray[][] = new int[10][10];
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                TwoDarray[i][j] = i;
            }
        }
        for (int p[] : TwoDarray)   ///so,the benefit of using this is we don't have to worry about size
        {
            for (int k : p) {
                System.out.printf("%d\t",p[k]);
            }
                System.out.println();
        }
    }
}
