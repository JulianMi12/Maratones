import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author Julian_Miranda
 */
public class Main {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(bf.readLine());
        while(n > 0){
            long x = Long.parseLong(bf.readLine());
            br.write(String.valueOf(Long.bitCount(x)));
            br.newLine();
            n--;
        }
        br.close();
    }
}
