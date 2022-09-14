import java.util.Scanner;

public class Hello {
   public static void main(String[] args) {
      Scanner number=new Scanner(System.in);
      int score=0;
      System.out.println("Lets Play a Quiz");
      System.out.println("What is the full form of Html ? ");
      System.out.println(1+"." + "Hyper Text Mark up Language.");
      System.out.println(2+"." + "Hyper Text Mark up Leader.");
      System.out.println(3+"." + "Hyper Text Mark  Language.");
      System.out.println(4+"." + "Hyper Text Make Language.");
      System.out.println("Choose a Number 1 to 4");
      int answer=number.nextInt();
      if(answer == 1){
         score++;
         System.out.println("Your Score is " + score);
      }else{
         System.out.println("Your Score is " + score);
      }
      System.out.println(" ");
      System.out.println(" ");
//      -------------Second Question------------------
      System.out.println("What is the full form of CSS ? ");
      System.out.println(1+"." + "Cascading Style sign.");
      System.out.println(2+"." + "Cascading Sign Steet.");
      System.out.println(3+"." + "Cascading Style Sheets.");
      System.out.println(4+"." + "Cascading Style Steet.");
      System.out.println("Choose a Number 1 to 4");
      int answer1=number.nextInt();
      if(answer1 == 3){
         score++;
         System.out.println("Your Score is " + score);
      }else{
         System.out.println("Your Score is " + score);
      }

      System.out.println(" ");
      System.out.println(" ");

      System.out.println("Who invented Javascript ? ");
      System.out.println(1+"." + "Linus Torvalds.");
      System.out.println(2+"." + "Rolling.");
      System.out.println(3+"." + "Paul.");
      System.out.println(4+"." + "Brendan Eich.");
      System.out.println("Choose a Number 1 to 4");
      int answer2=number.nextInt();
      if(answer2 == 4){
         score++;
         System.out.println("Your Score is " + score);
      }else{
         System.out.println("Your Score is " + score);
      }

      System.out.println(" ");
      System.out.println(" ");

      System.out.println("Which one is not programming language ? ");
      System.out.println(1+"." + "Bootstrap.");
      System.out.println(2+"." + "Perl.");
      System.out.println(3+"." + "Ruby.");
      System.out.println(4+"." + "C++.");
      System.out.println("Choose a Number 1 to 4");
      int answer3=number.nextInt();
      if(answer3 == 1){
         score++;
         System.out.println("Your Score is " + score);
      }else{
         System.out.println("Your Score is " + score);
      }
      int mistake=4-score;
      System.out.println("you made " + mistake + " mistake");
      System.out.println("Your total score is " + score);


      System.out.println("Here is the answer");
      System.out.println(1);
      System.out.println(3);
      System.out.println(4);
      System.out.println(1);

   }



}
