import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        IntStream.range(0,n).forEach(x-> list.add(in.nextInt()));
        Integer ans = list.stream().max(Integer::compare).get();
        System.out.println(ans);
    }
}