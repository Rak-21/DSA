import java.util.Arrays;
public class Two_Dimensional {
    int[][] Arr = null;

    public Two_Dimensional(int row, int column)
    {
        Arr = new int[row][column];
        for(int i=0; i<Arr.length; i++)
        {
            for(int j=0; j<Arr[0].length; j++)
            {
                Arr[i][j] = 0;
            }
        }
    }
    public void insert(int row, int col, int data)
    {
        Arr[row][col] = data;
    }

    public void print()
    {
        for(int row=0; row<Arr.length; row++)
        {
            for(int col=0; col<Arr[0].length; col++)
            {
                System.out.print(Arr[row][col]+" ");
            }
            System.out.println();
        }
    }
    public void Access(int row, int col)
    {
        System.out.println(Arr[row][col]);
    }
    public void Search(int key)
    {
        int R = Integer.MIN_VALUE;
        int C = Integer.MIN_VALUE;
        for(int row=0; row<Arr.length; row++)
        {
            for(int col=0; col<Arr[0].length; col++)
            {
                if(Arr[row][col] == key)
                {
                    R = row;
                    C = col;
                    break;
                }
            }
        }
        if(R >= 0 && C >= 0)
        {
            System.out.println("Value Found !");
            System.out.println("Index of "+ key +" is ("+R+","+C+") ");
        }
        else
        {
            System.out.println("Value not Found");
        }
    }
}
