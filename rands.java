import java.util.*;
import java.io.*;

public class rands{
   public static void main(String[]args)
   {
    String[] rps = {"r","p","s"};
    String computerMove = rps[new Random().nextInt(rps.length)];
   
    Scanner sc = new Scanner(System.in);
    String pMove;
    
    while(true)
    {
    System.out.println("Enter your move(r,p or s)");
    pMove = sc.nextLine();
    if(pMove.equals("r")||pMove.equals("p")||pMove.equals("s"))
    break;
    else
    System.out.println(pMove +"is not a valid move");
    }


    System.out.println("comp's move:" +computerMove);
    
    if(pMove.equals(computerMove))
    System.out.println("Tie");

    else if( pMove.equals("r"))
    {
        if(computerMove.equals("p"))
       
       { System.out.println("You lose");
       }
       else if(computerMove.equals("s"))
       {
        System.out.println("You win");
       }

    }
    else if( pMove.equals("p"))
    {
        if(computerMove.equals("s"))
       
       { System.out.println("You lose");
       }
       else if(computerMove.equals("r"))
       {
        System.out.println("You win");
       }

    }
    else if( pMove.equals("s"))
    {
        if(computerMove.equals("r"))
       
       { System.out.println("You lose");
       }
       else if(computerMove.equals("p"))
       {
        System.out.println("You win");
       }

    }
}

   }
