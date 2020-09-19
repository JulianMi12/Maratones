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
public class JohnnyAndAncientComputer {
 
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
 
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(bf.readLine());
        while (n > 0) {
            long pc[] = Arrays.stream(bf.readLine().split(" ")).mapToLong(x -> Long.parseLong(x)).toArray();
            long a = pc[0], b = pc[1], cont = 0;
            if (a > b) {
                long temp = a;
                a = b;
                b = temp;
            }
            long r = r(a);
            if (r(b) != r) {
                cont = -1;
            } else {
                b /= a;
                while (b >= 8) {
                    b /= 8;
                    cont++;
                }
                if (b > 1) {
                    cont++;
                }
            }
            System.out.println(cont);
            n--;
        }
    }
 
    public static long r(long r) {
        while (r % 2 == 0) {
            r /= 2;
        }
        return r;
    }
}
