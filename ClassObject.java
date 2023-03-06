class Karan{
    public int add(int n1, int n2){
        int r = n1 + n2;
        return r;
    }
}

public class ClassObject {
    public static void main(String args[]){
        int num1 = 7;
        int num2 = 6;

        Karan Obj= new Karan();
        int result = Obj.add(num1, num2);
        System.out.println(result);
    }
}
