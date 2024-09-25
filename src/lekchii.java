import java.util.Arrays;
import java.util.Scanner;


public class lekchii {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        naslclass n = new naslclass();
        naslclass2 n2 = new naslclass2();
        n.go();

    }

    public void save1(){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }

    public void save2(){
        Scanner in = new Scanner(System.in);
        int[][]arr2d = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(arr2d));
    }

    public void save3(){Scanner in = new Scanner(System.in);
        int i = 0;
        do{
            i++;
        }while (i < 2);
    }

    public void save4(){}

    public void save5(){}
}

abstract class Aclass{
    abstract void go();
}

class naslclass extends Aclass{
    @Override
    void go(){
        System.out.println("jscvj");
    }
}

class naslclass2 extends Aclass{
    @Override
    void go(){
        System.out.println("sk");
    }
}