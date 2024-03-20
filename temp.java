import java.lang.*;
import java.util.*;
class TempFind
{
    public static void main(String[] args) 
    {
       String cities[] = {"Delhi","Mumbai","Kolkata","Chennai","Dehradun"};
       int temp[][] = {
                        {16, 18, 25, 42, 23},
                        {17, -19, 37, 47, 29},
                        {36, -28, 25, -42, 33},
                        {44, -18, 25, 12, 53},
                        {21, 48, 05, 52, 32}
                      };
       int max = temp[0][0];
       int min = temp[0][0];
       int minrow, mincol, maxrow, maxcol;
       for(int i = 0; i < 5; i++) {
         for(int j = 0; j < 5; j++) {
           if(max < temp[i][j]) {
             max = temp[i][j];
             maxrow = j;
             maxcol = i;
           }
           if(min > temp[i][j]) {
             min = temp[i][j];
             minrow = j;
             mincol = i;
           }
         }
       }
      System.out.println("Day \tDelhi \tMumbai \tKolkata \tChennai \tDehradun");
      for(int i = 0; i < 5; i++) {
        System.out.print(i+1);
        for(int j=0; j<5; j++) {
         System.out.print("\t" + temp[i][j]);
        }
        System.out.println();
      }
      System.out.println("Highest temp. record is " + max);
      System.out.println("Lowest temperature recorded is " + min);
    }
}
