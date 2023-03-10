class calculator{
    public int add(int a , int b, int c){
      return a + b -c;
    }
    public int add (int a, int b){
        return a + b;
    }
}

public class MethodsOverloading {
    public static void main(String args[]){
        calculator calc = new calculator();
        System.out.println(calc.add(10, 20));
       System.out.println( calc.add(10,14, 10));
    }
}

// same methods but different parameters 
