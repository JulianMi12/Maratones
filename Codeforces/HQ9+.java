import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
/**
 *
 * @author Julian_Miranda
 */
public class HQ9 {
 
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
 
    public static void main(String[] args) throws IOException {
        String a = bf.readLine();
        boolean flag = false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'H') {
                flag = true;
                break;
            }
            if (a.charAt(i) == 'Q') {
                flag = true;
                break;
            }
            if (a.charAt(i) == '9') {
                flag = true;
                break;
            }
        }
        if (flag) {
            br.write(String.valueOf("YES"));
        }else{
            br.write(String.valueOf("NO"));
        }
        br.newLine();
        br.close();
    }
}
