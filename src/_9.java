/**
 * 回文数
 *
 * @date 2018/12/20
 */
public class _9 {

    //数学做法,反转一下试试
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int origin = x;
        int result = 0;
        while (x > 0) {
            int temp = x % 10;
            x = x / 10;
            result = result * 10 + temp;
        }
        return result == origin;
    }

    //转成字符串做，较慢
    public boolean isPalindrome2(int x) {
        if (x < 0) return false;
        String str = String.valueOf(x);
        for (int i = 0, j = str.length() - 1; i < j; ) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new _9().isPalindrome(1));
    }
}
