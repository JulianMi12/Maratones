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
public class HelpfulMaths {
 
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws IOException {
        String a = bf.readLine();
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != '+') {
                b.add(Integer.parseInt(a.charAt(i)+""));
            }
        }
        Collections.sort(b);
        for (int i = 0; i < b.size(); i++) {
            br.write(String.valueOf(b.get(i)));
            if (i < b.size()-1) {
                br.write("+");
            }
        }
        br.newLine();
        br.close();
    }
}
