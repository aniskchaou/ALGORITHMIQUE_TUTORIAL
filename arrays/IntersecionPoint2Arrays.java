package arrays;

public class IntersecionPoint2Arrays {

    public static int intersection(int[] arrA, int[] arrB) {
        int intersectionPoint = -1;
        int x = 0;
        int y = 0;

        while (x < arrA.length && y < arrB.length) {
           
            if (arrA[x] > arrB[y]) {
                
                y++;
            } else if (arrA[x] < arrB[y]) {
                
                x++;
            } else {
                
                intersectionPoint = arrA[x];
                return intersectionPoint;
            }
        
        }
        return intersectionPoint;

    }

    public static void main(String[] args) throws java.lang.Exception {
        int[] a = {1, 2, 3, 6, 8, 10};
        int[] b = {4, 5, 6, 11, 15, 20};

    }
}
