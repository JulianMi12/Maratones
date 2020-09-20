import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
/**
 *
 * @author Julian_Miranda
 */
public class NearlyLuckyNumber {
 
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
 
    public static void main(String[] args) throws IOException {
        long a = Long.parseLong(bf.readLine());
        int cont = 0;
        while (a != 0) {
            if (a % 10 == 4 || a % 10 == 7) {
                cont++;
            }
            a /= 10;
        }
        
        if (cont == 4 || cont == 7) {
            br.write(String.valueOf("YES"));
        }else{
            br.write(String.valueOf("NO"));
        }
 
        br.newLine();
        br.close();
    }
}
