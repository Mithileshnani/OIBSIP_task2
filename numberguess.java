//import java.io.*;
import java.util.Scanner;
import java.util.Random;
public class numberguess{
    public  static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int Specialnum,guess=5,levels=1,count=0,score=0,totalscore=0;
        Random randomnumber=new Random();
        int upperlimit=50;
        System.out.println("Hello Folks I welcome you all to the Number guessing game are you excited to play??\nHere are the rules to be followed to play the game");
        System.out.println("This game consists of atmost 3 levels\n Level 1 has 5 chances\n Level 2 has 3 chances\n Level 3 has 2 chances");
        System.out.println("Completing all the  Levels make you the Winner ");
       // int level1=5,levels=1;;
       while(levels<4)
       {  count=0;
        Specialnum=randomnumber.nextInt(upperlimit-1);
         System.out.println("Level " +levels +" \n Special Number is : " + Specialnum);
         int chance=1;
        for(chance=1;chance<=guess;chance++)
        {   
            System.out.println(" Chance "+chance +"\n Guess the number between 0 to 50");
            int guessnum=in.nextInt();
        if(guessnum>50||guessnum<0)
        System.out.println("Range Exceeded ");
        else
        {if(guessnum>Specialnum) 
        {
        System.out.println("The number you have Guessed is Higher than Special number");
        }
        else if(guessnum<Specialnum) 
        {
            System.out.println("The number you have Guessed is Lower than Special number");
        }
        else if(guessnum==Specialnum) 
        {
        System.out.println("Congratulations you have guessed the Special number");
        count=count+1;
       
       if(count==1 && guess<=5)
       { 
        switch(chance)
        {
        case 1: System.out.printf("You have scored %d in level %d\n",(10*levels)*(guess+1-chance),levels);
         score= (10*levels)*(guess+1-chance);
        break;
        case 2: System.out.printf("You have scored %d in level %d\n",(10*levels)*(guess+1-chance),levels);
        score= (10*levels)*(guess+1-chance);
        break;
        case 3: System.out.printf("You have scored %d in level %d\n",(10*levels)*(guess+1-chance),levels);
        score= (10*levels)*(guess+1-chance);
        break;
        case 4: System.out.printf("You have scored %d in level %d\n",(10*levels)*(guess+1-chance),levels);
        score= (10*levels)*(guess+1-chance);
        break;
        case 5: System.out.printf("You have scored %d in level %d\n",(10*levels)*(guess+1-chance),levels);
        score= (10*levels)*(guess+1-chance);
        break;
        default: System.out.printf("You have scored %d in level %d\n",(10*levels)*0,levels);
       }
       if(levels!=3)
       {
        System.out.println("Are you excited to play next Level?");
        totalscore=totalscore+score;
       }
       else
       { totalscore=totalscore+score; 
        System.out.printf("Bravo You are the Winner\nTotal Score is %d\n",totalscore);
       } 
      //  System.out.printf("You have scored %d points\n",levels*10);
         break;
        } 
      } }
   }
       if(count==0)
       { 
        System.out.printf("Your Score is %d\nBetter luck next time\n",totalscore);
       break;
       }
       
       levels=levels+1;
       guess=(guess/2)+1;
       
       }
       in.close(); 
       System.out.println("Do you want to Play Again??");
    }
    
}
