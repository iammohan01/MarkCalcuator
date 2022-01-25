
import java.util.Arrays;
import java.util.Scanner;

public class Main{

    static void wrong (){
        System.out.println("You entered wrong value. Restart the program");
    }

   public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String userName = input.nextLine();
        
        System.out.println("Hello "+ userName.toUpperCase()+", Enter NoOF papers : ");
        int noOfpapers = input.nextInt();
        
        System.out.println("Enter total marks Of Single Paper : ");
        byte singlePaper = input.nextByte();

        int total =  noOfpapers *  singlePaper ;

        int totalOfAll = 0 ;
           
            int[] mark = new int[noOfpapers+1];
        for (int i=1 ; i <= noOfpapers ; i++ ){
           
            System.out.println("Enter Your " + i + " mark : ");
            
            mark[i]=input.nextInt();

            totalOfAll =totalOfAll + mark[i];
  
                if (mark[i]>singlePaper){
                    wrong();
                    break;}
        
                else if(i==noOfpapers) {
                    double percentage = (double) totalOfAll*100 ;
                    percentage /= total;
                System.out.println("Your Total Marks  : "+totalOfAll + "/" + total);
                System.out.println("Your Percentage was  : " + percentage );break;
                }    
          } 
    }
}
