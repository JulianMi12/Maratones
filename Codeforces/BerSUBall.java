import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 *
 * @author Julian_Miranda
 */
public class BerSUBall {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int boys = Integer.parseInt(bf.readLine());
        int[] b = Arrays.stream(bf.readLine().split(" ")).mapToInt(x -> Integer.parseInt(x)).toArray();
        int girls = Integer.parseInt(bf.readLine());
        int[] g = Arrays.stream(bf.readLine().split(" ")).mapToInt(x -> Integer.parseInt(x)).toArray();
        Arrays.sort(b);
        Arrays.sort(g);
        int tot = 0;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < g.length; j++) {
                if (Math.abs(b[i]-g[j]) <= 1) {
                    tot++;
                    g[j] = -1;
                    break;
                }
            }
        }
        br.write(String.valueOf(tot));
        br.newLine();
        br.close();
    }
}
