import java.util.HashMap;

/**
 * Created by user on 2017/6/21.
 */
public class test {
    HashMap<Integer,Integer> map = new HashMap<>();

    private static void change(int x[]){
        x[0]=1;
    }

    public static void main(String[] args) {
        int x[] = new int[1];
        x[0]=0;
        change(x);
        System.out.println(x[0]);
    }
}
