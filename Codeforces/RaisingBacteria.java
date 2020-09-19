import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author Julian_Miranda
 */
public class RaisingBacteria {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        long n = Long.parseLong(bf.readLine());
        long bacteria = 0;
        while (n >= 1) {
            if (n % 2 == 1) {
                bacteria++;
                n--;
            } else {
                n /= 2;
            }
        }
        br.write(String.valueOf(bacteria));
        br.newLine();
        br.close();
    }
}
