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
public class Coins {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int main = Integer.parseInt(bf.readLine());
        ArrayList<Integer> coins = new ArrayList<>();
        coins.add(main);
        int div = 2;
        while(main != 1){
            if (main%div == 0) {
                main /= div;
                coins.add(main);
            }else{
                div++;
            }
        }
        for (int i = 0; i < coins.size(); i++) {
            if (i == coins.size()-1) {
                br.write(String.valueOf(coins.get(i)));
            }else{
                br.write(String.valueOf(coins.get(i)+" "));
            }
        }
        br.newLine();
        br.close();
    }
}
