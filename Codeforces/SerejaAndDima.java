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
public class SerejaAndDima {
 
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
 
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(bf.readLine());
        String[] a = bf.readLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            list.add(Integer.parseInt(a[i]));
        }
        int sereja = 0, dima = 0, i = 1;
        while (!list.isEmpty()) {
            if (i == 1) {
                if (list.get(0) > list.get(list.size() - 1)) {
                    sereja += list.get(0);
                    list.remove(0);
                } else {
                    sereja += list.get(list.size()-1);
                    list.remove(list.size()-1);
                }
                i++;
            }else{
                if (list.get(0) > list.get(list.size() - 1)) {
                    dima += list.get(0);
                    list.remove(0);
                } else {
                    dima += list.get(list.size()-1);
                    list.remove(list.size()-1);
                }
                i = 1;
            }
        }
        br.write(String.valueOf(String.valueOf(sereja + " " + dima)));
        br.newLine();
        br.close();
    }
}
