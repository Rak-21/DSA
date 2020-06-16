import java.util.Arrays;
public class One_Dimensional_Main {
    public static void main(String[] args)
    {
        one_Dimensional Arr = new one_Dimensional(10);
        Arr.insert(0,0);
        Arr.insert(1,10);
        Arr.insert(2,20);
        Arr.insert(3,30);
        Arr.insert(4,40);
        Arr.insert(5,50);
        Arr.insert(6,60);
        Arr.insert(7,70);
        Arr.insert(8,80);
        Arr.insert(9,90);

        Arr.print();

        Arr.Search(38);
    }
}
