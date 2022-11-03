import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long ans = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());
            while (!stack.isEmpty() && stack.peek() <= input) {
                stack.pop();
            }
            stack.push(input);
            ans += stack.size() - 1;
        }
        System.out.print(ans);
    }
}