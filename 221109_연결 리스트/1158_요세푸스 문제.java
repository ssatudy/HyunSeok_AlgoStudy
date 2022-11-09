import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입출력 모듈
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 입력
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        // 큐 생성
        // q.offer() : 큐에 맨 뒤에 데이터 삽입
        // q.poll() : 큐에서 맨 앞 데이터 추출
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i < n + 1; i++) q.offer(i);
        bw.write("<");
        while (q.size() != 1) {
            for (int i = 0; i < k - 1; i++) q.offer(q.poll());
            bw.write(q.poll() + ", ");
        }
        bw.write(q.poll() + ">");
        bw.flush();
        bw.close();
    }
}