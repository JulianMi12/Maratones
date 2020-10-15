import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Julian_Miranda
 */
public class CopyCopyCopyCopyCopy {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(bf.readLine());
        while (n > 0) {
            int length = Integer.parseInt(bf.readLine());
            long[] num = Arrays.stream(bf.readLine().split(" ")).mapToLong(x -> Long.parseLong(x)).toArray();
            Arrays.sort(num);
            ArrayList<Long> temp = new ArrayList<>();
            temp.add(num[0]);
            for (int i = 1, j = 0; i < length; i++) {
                if (num[i] != temp.get(j)) {
                    temp.add(num[i]);
                    j++;
                }
            }
            br.write(String.valueOf(temp.size()));
            br.newLine();
            n--;
        }
        br.close();
    }
}
