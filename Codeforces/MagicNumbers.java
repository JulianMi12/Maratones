import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
/**
 *
 * @author Julian_Miranda
 */
public class MagicNumbers {
 
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
 
    public static void main(String[] args) throws IOException {
        int a = Integer.parseInt(bf.readLine());
        String leng = a + "";
        boolean flag = true;
        for (int i = 0; i < leng.length(); i++) {
            if (leng.charAt(i) != '1' && leng.charAt(i) != '4') {
                flag = false;
                break;
            }
        }
 
        if (flag) {
            if (Integer.toString(a).replaceAll("144", "").replaceAll("14", "").replaceAll("1", "").length() != 0 || Integer.toString(a).contains("444")) {
                br.write(String.valueOf("NO"));
            } else {
                br.write(String.valueOf("YES"));
            }
        } else {
            br.write(String.valueOf("NO"));
        }
        br.newLine();
        br.close();
    }
}
