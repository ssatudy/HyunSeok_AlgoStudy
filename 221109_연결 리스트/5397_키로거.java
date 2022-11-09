import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입출력 모듈
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            // 좌, 우 스택
            Stack<String> leftStack = new Stack<>();
            Stack<String> rightStack = new Stack<>();
            // 문자열 입력 -> 문자열을 한 글자씩 쪼개서 스택에 넣는다.
            String[] input = br.readLine().split("");
            for (int j = 0; j < input.length; j++) {
                // 문자를 기준으로 스위치
                String c = input[j];
                switch (c) {
                    case "<":
                        if (!leftStack.isEmpty()) rightStack.push(leftStack.pop());
                        break;
                    case ">":
                        if (!rightStack.isEmpty()) leftStack.push(rightStack.pop());
                        break;
                    case "-":
                        if (!leftStack.isEmpty()) leftStack.pop();
                        break;
                    default:
                        leftStack.push(c);
                        break;
                }
            }
            // 출력
            while (!leftStack.isEmpty()) rightStack.push(leftStack.pop());
            while (!rightStack.isEmpty()) bw.write(rightStack.pop());
            bw.write("\n");
        }
        bw.flush();
    }
}