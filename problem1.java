import java.util.*;
public class problem1 {
    public static void main(String[] args) {
        int N = 6, x = 3;
        System.out.println(game(N, x));
    }
    static List<Integer> game(int N, int x) {
        List<Integer> out = new ArrayList<>();
        List<Integer> In = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            In.add(i);
        }
        while (In.size() >= x) {
            for (int i = 0; i < In.size(); i++) {
                if ((i + 1) % x == 0) {
                    out.add(In.get(i));
                }
            }
            In.removeAll(out);
        }
        return out;
    }
}
