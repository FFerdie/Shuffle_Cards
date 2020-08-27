new Random().nextInt(10);import java.util.*;
class Main 
{
  public static void main(String[] args)
   {
    //String Cardchracters = Spades, Clubs, Hearts, Aces;
    String randomString = " King, Queen, Jacsk Ace of spades";
    new Random().nextInt(10);
   
    System.out.println("Spade: ");
     System.out.print(" Kings, Queens, Jacks ");
     for (int i= 1 ; i<= 10;i++)
    System.out.print( i);
    //if (i<=10)

    {
     System.out.println();
    System.out.println("Clubs: ");
     System.out.print(" Kings, Quens, Jacks ");
     for (int i= 1 ; i<= 10;i++)
    System.out.print(new Random().nextInt(10)+ i);

     System.out.println();
    System.out.println("Haerts: ");
     System.out.print(" Kings, Quens, Jacks ");
     for (int i= 1 ; i<= 10;i++)
    System.out.print(new Random().nextInt(10) +i);

     System.out.println();
    System.out.println("Aces: ");
     System.out.print(" Kings, Quens, Jacks ");
     for (int i= 1 ; i<= 10;i++)

    System.out.print( new Random().nextInt(10) +i);
    }
   }
      
    
}
