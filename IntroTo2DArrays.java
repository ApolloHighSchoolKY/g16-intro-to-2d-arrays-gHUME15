import java.util.Arrays;

public class IntroTo2DArrays{
  public static void main(String[] args){
    int[][] ray = new int[2][3];

    ray[0][0] = 1;
    ray[0][1] = 2;
    ray[0][2] = 3;
    ray[1][0] = 4;
    ray[1][1] = 5;
    ray[1][2] = 6;




    System.out.println(Arrays.toString(ray));

    // Print the first array in the array ray

    System.out.println(Arrays.toString(ray[0]));
    System.out.println(Arrays.toString(ray[1]));

    //ray.length repersents the number of rows
    //or how many arraus is this collection of
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }

    //Change every values in the 2D array to 7
    // You must use loopS
    // ray[#].length each array in array
    //or what size
    for(int row=0; row<ray.length; row++)
    for(int col=0; col<ray[row].length; col++)
     ray[row][col]=7;
      
     for(int row=0; row<ray.length; row++)
     {
      System.out.println(Arrays.toString(ray[row]));
     }

     //fill the array with random numbers for 0 - 10 inclusive
     for(int row=0; row<ray.length; row++)
    for(int col=0; col<ray[row].length; col++)
    {
      ray[row][col]= (int)(Math.random()* 11 + 0);
    }
    for(int row=0; row<ray.length; row++)
    {
     System.out.println(Arrays.toString(ray[row]));
    }

    // Find the sum of each row
    int sum = 0;
    for(int row=0; row<ray.length; row++)
    {
      sum = 0;
      for(int col=0; col<ray[row].length; col++)
      {
        sum += ray[row][col];
      }
      System.out.println("The sum of row " + row + " is: " + sum);
    }

    System.out.println("\n\n\nHomwork assignment");
    //Add up all of the values of the array using for each loops...



    int sum1 = 0;
    for(int row=0; row<ray.length; row++)
    {
      sum1 = 0;
      for(int col=0; col<ray[col].length; col++)
      {
        sum1+= ray[col][row];
      }
      System.out.println("The sum of row " + row + " is: " + sum1);

      //for(array: i array ray)
    }

    }
}
