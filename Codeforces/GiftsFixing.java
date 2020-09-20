import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
 
/**
 *
 * @author Julian_Miranda
 */
public class GiftsFixing {
 
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
 
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(bf.readLine());
 
        while (n > 0) {
            int nums = Integer.parseInt(bf.readLine());
            String[] a1 = bf.readLine().split(" ");
            String[] b1 = bf.readLine().split(" ");
            ArrayList<Long> a = new ArrayList<>();
            ArrayList<Long> b = new ArrayList<>();
            llenar(a, a1);
            llenar(b, b1);
 
            long tot = 0;
            long minA = a.stream().mapToLong(i -> i).min().getAsLong();
            long minB = b.stream().mapToLong(i -> i).min().getAsLong();
 
            for (int i = 0; i < nums; i++) {
                tot += Long.max(a.get(i) - minA, b.get(i) - minB);
            }
            br.write(String.valueOf(tot));
            br.newLine();
            n--;
        }
        br.close();
    }
 
    public static void llenar(ArrayList<Long> nums, String[] a) {
        for (int i = 0; i < a.length; i++) {
            nums.add(Long.parseLong(a[i]));
        }
    }
}
