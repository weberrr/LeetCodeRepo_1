import java.util.Stack;

/**
 * 去除重复字母(Remove Duplicate Letters)
 *
 * @date 2018/11/27
 */

public class _316 {
    //贪心算法， 每次在遇到只剩一个的字母的情况时，取出当前记录的字典序最大的字母，并删掉后半部分字串中的该字母
    public String removeDuplicateLetters(String s) {
        int[] charNum = new int[26];
        for (int i = 0; i < s.length(); i++) charNum[s.charAt(i) - 'a']++;
        int pos = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(pos)) pos = i;
            if (--charNum[s.charAt(i) - 'a'] == 0) break;
        }
        return s.length() == 0 ? "" : s.charAt(pos) + removeDuplicateLetters(s.substring(pos + 1).replaceAll("" + s.charAt(pos), ""));
    }

    public static void main(String[] args) {
        System.out.println(new _316().removeDuplicateLetters("cbcdecbc"));
    }
}
