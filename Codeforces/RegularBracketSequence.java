import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

/**
 *
 * @author Julian_Miranda
 */
public class RegularBracketSequence {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String a = bf.readLine();
        Stack bracket = new Stack();
        int tot = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '(') {
                bracket.push(a.charAt(i));
            }
            if (!bracket.isEmpty()) {
                if (a.charAt(i) == ')' && bracket.peek().equals('(')) {
                    bracket.pop();
                    tot += 2;
                }
            }
        }
        br.write(String.valueOf(tot));
        br.newLine();
        br.close();
    }
}
