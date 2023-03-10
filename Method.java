class calculator {
    public void add() {
        System.out.println("Music Playing...");
    }

    public String getmePen(int cost) {
        if(cost>=10){
            return "pen";
        }
        else{
            return "Nothing";
        }
    }
}

public class Method {
    public static void main(String args[]) {
        calculator OBJ= new calculator();
        OBJ.add();
        String src=OBJ.getmePen(10);
        System.out.println(src);
        
    }
}

// class calculator{
//     public void add (int a, int b){
//       int result = a + b;
//       System.out.println(result);
//     }
// }
// // public class Method {
//     public static void main(String args[]){
//         calculator calc = new calculator();
//         calc.add(10, 9);

//     }
// }
// class calculator {
//     public int add(int a, int b) {
//         return a + b;
//     }
// }

// public class Method {
//     public static void main(String args[]) {
//         calculator calc = new calculator();
//         int res = calc.add(10, 6);
//         System.out.println(res);
//     }
// }
