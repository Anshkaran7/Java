public class floatingPoint {
    
        public static void main(String[] args) {
        float f = 0.2f;
        System.out.println("\nInitial floating number: " + f);
        float next_down = Math.nextDown(f);
        float next_up = Math.nextUp(f);
        System.out.println("Float " + f + " next down is " + next_down);
        System.out.println("Float " + f + " next up is " + next_up);
        double d = 0.2d;
        System.out.println("\nInitial double number: " + d);
        double next_down_d = Math.nextDown(d);
        double next_up_d = Math.nextUp(d);
        System.out.println("Double " + d + " next down is " + next_down);
        System.out.println("Double " + d + " next up is " + next_up);
        }
        }

