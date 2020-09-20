import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
 
/**
 *
 * @author Julian_Miranda
 */
public class RemoveSmallest {
 
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
 
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(bf.readLine());
 
        while (n > 0) {
            long a = Long.parseLong(bf.readLine());
            String[] b = bf.readLine().split(" ");
            ArrayList<Long> small = new ArrayList<>();
            boolean flag = true;
 
            for (int i = 0; i < b.length; i++) {
                small.add(Long.parseLong(b[i]));
            }
            Collections.sort(small);
 
            if (small.size() == 1) {
                br.write(String.valueOf("YES"));
            } else {
                for (int i = 0, j = 1; i < small.size() - 1 && j < small.size(); i++, j++) {
                    if ((small.get(j) - small.get(i)) != 1) {
                        if (small.get(j) != small.get(i)) {
                            flag = false;
                            break;
                        }
                    }
                }
                if (flag) {
                    br.write(String.valueOf("YES"));
                } else {
                    br.write(String.valueOf("NO"));
                }
            }
 
            br.newLine();
            n--;
        }
        br.close();
    }
}
