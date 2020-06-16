import java.util.Arrays;
public class Two_Dimensional_Main {
    public static void main(String[] args)
    {
        Two_Dimensional Arr = new Two_Dimensional(5,5);
        Arr.insert(0,0,0);
        Arr.insert(0,1,5);
        Arr.insert(0,2,10);
        Arr.insert(0,3,15);
        Arr.insert(0,4,20);
        Arr.insert(1,0,25);
        Arr.insert(1,1,30);
        Arr.insert(1,2,35);
        Arr.insert(1,3,40);
        Arr.insert(1,4,45);
        Arr.insert(2,0,50);
        Arr.insert(2,1,55);
        Arr.insert(2,2,60);
        Arr.insert(2,3,65);
        Arr.insert(2,4,70);
        Arr.insert(3,0,75);
        Arr.insert(3,1,80);
        Arr.insert(3,2,85);
        Arr.insert(3,3,90);
        Arr.insert(3,4,95);
        Arr.insert(4,0,100);
        Arr.insert(4,1,105);
        Arr.insert(4,2,110);
        Arr.insert(4,3,115);
        Arr.insert(4,4,120);

        Arr.print();
        Arr.Access(3,4);
        Arr.Search(65);
        Arr.Search(620);
    }
}
