public class MyProgram extends ConsoleProgram
{

    public void run()
    {
        System.out.println("This program allows you to calculate sum of odd number between 1 and the input.");
        int query = readInt("Please Enter A Number: ");
        sumOfOdds(query);
        
        
    }
 
    public void sumOfOdds(int q)
    {
      int temp = q;
      int atemp;
      
      if(q % 2 == 0)
      {
          System.out.println("It's Even Already");
          System.out.println("Step 1: " + q + " / 2");
          temp = q / 2;
          System.out.println("Step 2: " + temp + " Squared");
          temp = temp * temp;
          System.out.println("Result: " + temp);
          
      } else if(q % 2 == 1)
      {
          System.out.println("It's Odd!");
          System.out.println("Step 1: " + q + " + 1");
          temp = q + 1;
          System.out.println("Step 2: " + temp + " / 2");
          temp = temp / 2;
          System.out.println("Step 3: " + temp + " Squared");
          temp = temp * temp;
          
          System.out.println("Results: " + temp);
      }
   }
}