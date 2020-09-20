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
public class TheNumberOfPositions {
 
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
 
    public static void main(String[] args) throws IOException {
        int[] n = Arrays.stream(bf.readLine().split(" ")).mapToInt(x -> Integer.parseInt(x)).toArray();
        int pos = Integer.min(n[0]-n[1], n[2]+1);
        br.write(String.valueOf(pos));
        br.newLine();
        br.close();
    }
}
