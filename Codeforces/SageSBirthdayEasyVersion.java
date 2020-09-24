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
public class SageSBirthdayEasyVersion {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(bf.readLine());
        int[] ice = Arrays.stream(bf.readLine().split(" ")).mapToInt(x -> Integer.parseInt(x)).toArray();
        int[] iceTemp = new int[ice.length];
        Arrays.sort(ice);
        for (int i = ice.length - 1, j = 0; i >= 0; i--, j++) {
            iceTemp[j] = ice[i];
        }
        ArrayList<Integer> sell = new ArrayList<>();
        sell.add(ice[ice.length - 1]);
        int i = 0, j = 1, a = 0;
        while (sell.size() != ice.length) {
            if (a % 2 == 0) {
                sell.add(ice[i]);
                i++;
            } else {
                sell.add(iceTemp[j]);
                j++;
            }
            a++;
        }
        br.write(String.valueOf((n-1)/2)+"\n");
        for (int k = 0; k < sell.size(); k++) {
            br.write(sell.get(k)+" ");
        }
        br.newLine();
        br.close();
    }
}
