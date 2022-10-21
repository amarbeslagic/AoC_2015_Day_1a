import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("inputs//input_AoC_1a.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String s = br.readLine();

        int countOpen = 0;
        int countClose = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(')
                countOpen++;
            else countClose++;
        }

        int floor = countOpen - countClose;

        System.out.println(floor);
    }
}