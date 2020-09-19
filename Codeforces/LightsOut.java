import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
 
/**
 *
 * @author Julian_Miranda
 */
public class LightsOut {
    
    static Scanner en = new Scanner(System.in);
    static BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws IOException {
        int[][] mat = new int[4][4];
        int[][] tem = new int[4][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat[i][j] = en.nextInt();
//                tem[i][j] = mat[i][j];
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tem[i][j] += mat[i][j];
                if (i>0) {
                    tem[i-1][j] += mat[i][j];
                }
                if (i<2) {
                    tem[i+1][j] += mat[i][j];
                }
                if (j>0) {
                    tem[i][j-1] += mat[i][j];
                }
                if (j<2) {
                    tem[i][j+1] += mat[i][j];
                }
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tem[i][j] %2 != 0) {
                    br.write(String.valueOf("0"));
                }else{
                    br.write(String.valueOf("1"));
                }
            }
            br.newLine();
        }
        br.close();
    }
}
