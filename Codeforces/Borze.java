import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
/**
 *
 * @author Julian_Miranda
 */
public class Borze {
 
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
 
    public static void main(String[] args) throws IOException {
        String a = bf.readLine();
        String finall = "";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '.') {
                finall += "0";
            } else if (a.charAt(i) == '-' && a.charAt(i + 1) == '.') {
                finall += "1";
                i++;
            } else if (a.charAt(i) == '-' && a.charAt(i + 1) == '-') {
                finall += "2";
                i++;
            }
        }
 
        br.write(String.valueOf(finall));
        br.newLine();
        br.close();
    }
}
