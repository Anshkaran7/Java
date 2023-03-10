// There are three types of Variables : a) Local b) Instance c) Static 

// local Variables 
// public class Variables {
//     public static void main (String args[]){
//         int n = 10; // local varibale
//         System.out.println(n);
//     }
// }



// Instance Variables 

// import java.util.*;

// public class Variables {
//     public String name; // Declared Instance Variable
//     public Variables(){
//         // Default Constructor
 
//         this.name="Karan";  // initializing Instance Variable
//     }

// //Main Method
//     public static void main (String args[]){
//         Variables name = new Variables();
//         System.out.println("My name is " + name.name);
//     }
// }


// Static Varibales

import java.util.*;

public class Variables {

    public static String name= "Ansh";
    public static void main(String args[]){
        System.out.println(name);
    }
}
