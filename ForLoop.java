public class ForLoop {
    public static void main(String args[]){
        // int i = 1;
        // for(int i=0; i<4; i++){
        //     System.out.println("Hey Karan");
        // }
        for(int i=1;i<=7;i++)
		{
			System.out.println("Day"+i);
			for(int j=1;j<=9;j++)
			{
				System.out.println(" "+(j+8)+"-"+(j+9));
			}
		}
    }
}
