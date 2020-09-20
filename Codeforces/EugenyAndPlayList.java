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
public class EugenyAndPlayList {
 
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
 
    public static void main(String[] args) throws IOException {
        String[] a = bf.readLine().split(" ");
        ArrayList<Integer> times = new ArrayList<>();
        times.add(0);
        
        int prod = 0;
        for (int i = 0; i < Integer.parseInt(a[0]); i++) {
            String[] b = bf.readLine().split(" ");
            int time = Integer.parseInt(b[0]) * Integer.parseInt(b[1]);
            prod += time;
            times.add(prod);
        }
        int s = 1;
        String[] note = bf.readLine().split(" ");
        for (int i = 0; i < note.length; i++) {
            while(Integer.parseInt(note[i]) > times.get(s)){
                s++;
            }
            br.write(String.valueOf(s));
            br.newLine();
        }
 
        br.close();
    }
}
