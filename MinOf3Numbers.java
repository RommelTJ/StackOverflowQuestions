import java.util.*;

public class MinOf3Numbers {

    public static void main(String[] args) {
        System.out.println(findMinNumber(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])));
    }
    
    public static int findMinNumber(int a, int b, int c) {
        List<Integer> array = new ArrayList<Integer>();
        array.add(a);
        array.add(b);
        array.add(c);
        Collections.sort(array);
        int answer = array.get(0);
        return answer;
    }

}

