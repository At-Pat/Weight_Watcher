import java.util.Random;

   public class random 
  {
   private static int i,a=0,small=500;


  public static void main(String[] args)
  { 
    Random ran=new Random();
    for(i=0;i<500;i++)//enter the range here
    {

    a=ran.nextInt(500);//gives you any number from 0-99
    System.out.println(a);

    if(a<small)//if given number is < than previous, make this number small
    small=a;
    }

    System.out.println("small is :"+small);
    }
 }