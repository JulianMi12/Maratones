import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
 
/**
 *
 * @author Julian_Miranda
 */
public class RegistrationSystem {
 
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
 
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(bf.readLine());
        Map<String, Integer> system = new HashMap<String, Integer>();
        while (n > 0) {
            String a = bf.readLine();
            int cont = system.getOrDefault(a, 0);
            system.put(a, cont+1);
            if (cont == 0) {
                br.write(String.valueOf("OK"));
            }else{
                br.write(String.valueOf(a+cont));
            }
            br.newLine();
            n--;
        }
        br.close();
    }
}
