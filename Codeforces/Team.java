import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author Julian_Miranda
 */
public class Team {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws IOException {
        int a = Integer.parseInt(bf.readLine());
        int[][] team = new int[a][3];
        for (int i = 0; i < team.length; i++) {
            String[] b = bf.readLine().split(" ");
            for (int j = 0; j < b.length; j++) {
                team[i][j] = Integer.parseInt(b[j]);
            }
        }
        int finalS = 0;
        for (int i = 0; i < team.length; i++) {
            int cont = 0;
            for (int j = 0; j < team[i].length; j++) {
                cont += team[i][j];
            }
            if (cont >= 2) {
                finalS++;
            }
        }
        br.write(String.valueOf(finalS));
        br.newLine();
        br.close();
    }
}
