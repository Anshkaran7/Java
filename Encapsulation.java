class Person{
    private int age = 19 ;
    private String name ="Karan";

    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age = a;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name= n;
    }
}

public class Encapsulation {
    public static void main(String args[]){
        Person obj = new Person();
        obj.setName("Karan");
        obj.setAge(19);
        System.out.println(obj.getName()+" "+ obj.getAge());
    }

}
