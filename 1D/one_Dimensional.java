import java.util.Arrays;
public class one_Dimensional {
    int[] Arr = null;
    public one_Dimensional(int index)
    {
        Arr = new int[index];
        for(int i=0; i<Arr.length ; i++)
        {
            Arr[i] = 0;
        }
    }

    public void print()
    {
        for(int i=0; i<Arr.length; i++)
        {
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
    }

    public void insert(int index, int value)
    {
        Arr[index] = value;
    }

    public void Search(int key)
    {
        int index = Integer.MIN_VALUE;
        for(int i=0; i<Arr.length; i++)
        {
            if(Arr[i] == key)
            {
                index = i;
                break;
            }
        }
        if(index >= 0)
        {
            System.out.println("Value Found !");
            System.out.println("Index of "+ key +" is \""+ index +"\"");
        }
        else
        {
            System.out.println("Value not Found");
        }
    }
}
