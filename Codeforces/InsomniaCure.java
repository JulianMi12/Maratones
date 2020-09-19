import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
/**
 *
 * @author Julian_Miranda
 */
public class InsomniaCure {
 
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
 
    public static void main(String[] args) throws IOException {
        int k = Integer.parseInt(bf.readLine());
        int l = Integer.parseInt(bf.readLine());
        int m = Integer.parseInt(bf.readLine());
        int n = Integer.parseInt(bf.readLine());
        int d = Integer.parseInt(bf.readLine());
        int tot = 0;
        for (int i = 1; i <= d; i++) {
            if ((i % k == 0) || (i % l == 0) || (i % m == 0) || (i % n == 0)) {
                tot++;
            }
        }
        br.write(String.valueOf(tot));
        br.newLine();
        br.close();
    }
}
