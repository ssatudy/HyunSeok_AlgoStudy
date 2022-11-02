import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int x = Integer.parseInt(br.readLine());
        br.close();

        Arrays.sort(arr);
        int start = 0;
        int end = n - 1;
        int mid = 0;
        int res = 0;
        while (start < end) {
            mid = arr[start] + arr[end];
            if (mid == x) res++;
            if (mid <= x) start++;
            else end--;
        }
        bw.write(res + "\n");
        bw.flush();
        bw.close();
    }
}