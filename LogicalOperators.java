public class LogicalOperators {
    public static void main(String args[]) {
        int a = 6;
        int b = 7;
        int x = 5;
        int y = 3;

        // boolean result = a>b && a<x && x>y;
        boolean result = a > b || b < x || y > x;
        // boolean result= x>y && a<b ;
        // boolean result= x>y || a<b ;
        // boolean result= x>y && a>b ;
        // boolean result= x>y || a>b ;
        // boolean result= x<y && a<b ;
        // boolean result= x<y || a<b ;
        // boolean result= x<y || a<b || a>1 ;
        System.out.println(result);
    }
}
