import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 括号匹配
 */
public class KuohaoMatch {
    private static Map<Character, Character> map = new HashMap<Character, Character>();

    static {
        map.put(')', '(');
        map.put(']', '[');
        map.put('>', '<');
        map.put('}', '{');
    }

    public static boolean isValid(String s) {
        if (null == s ) {
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char chara = s.charAt(i);
            if (map.containsKey(chara)) {
                char item = stack.empty() ? '#' : stack.pop();
                if (item != map.get(chara)) {
                    return false;
                }
            } else {
                stack.push(chara);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }
}
