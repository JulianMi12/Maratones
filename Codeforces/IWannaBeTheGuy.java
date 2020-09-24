import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *
 * @author Julian_Miranda
 */
public class IWannaBeTheGuy {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(bf.readLine());
        int[] littleX = Arrays.stream(bf.readLine().split(" ")).mapToInt(x -> Integer.parseInt(x)).toArray();
        int[] littleY = Arrays.stream(bf.readLine().split(" ")).mapToInt(x -> Integer.parseInt(x)).toArray();
        boolean flag = true;
        littleX[0] = 0;
        littleY[0] = 0;
        for (int i = 0, j = 1; i < n; i++, j++) {
            int b = j;
            boolean c1 = IntStream.of(littleX).anyMatch(x -> x == b);
            if (!c1) {
                boolean c2 = IntStream.of(littleY).anyMatch(x -> x == b);
                if (!c2) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            br.write(String.valueOf("I become the guy."));
        }else{
            br.write(String.valueOf("Oh, my keyboard!"));
        }
        br.newLine();
        br.close();
    }
}
