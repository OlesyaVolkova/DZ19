import java.util.Arrays;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        Random rand = new Random(0);
        int rows = 3;
        int cols = 4;
        int[][] arr = new int[rows][cols];
        int[] count = new int[rows*cols];
        System.out.println("Start");
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                boolean unigue;
                do
                {
                    unigue = true;
                    arr[i][j]=rand.nextInt(rows*cols);
                    for(int k=0; k<=i; k++)
                    {
                        for(int l=0; l < (k == i? j:arr[k].length); l++)
                        {
                            if(arr[i][j]==arr[k][l])
                            {
                                unigue = false;
                                break;
                            }
                        }
                        if(!unigue)break;
                    }
                } while(!unigue);
                count[arr[i][j]]++;
            }
        }
        for (int i=0; i<arr.length; i++)
            System.out.println(Arrays.toString(arr[i]));
        for (int i=0; i<count.length; i++)
            System.out.println("Значение %d повторяется %d раз".formatted(i, count[i]));
    }
}