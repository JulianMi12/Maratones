
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
public class BoyOrGirl {
 
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
 
    public static void main(String[] args) throws IOException {
        String name = bf.readLine();
        char[] a = name.toCharArray();
        Arrays.sort(a);
        int cont = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1]) {
                cont--;
            }
            cont++;
        }
        if (cont % 2 == 0) {
            br.write(String.valueOf("IGNORE HIM!"));
        } else {
            br.write(String.valueOf("CHAT WITH HER!"));
        }
        br.newLine();
        br.close();
    }
}
