//给定一个正整数，返回它在 Excel 表中相对应的列名称。 
//
// 例如， 
//
//     1 -> A
//    2 -> B
//    3 -> C
//    ...
//    26 -> Z
//    27 -> AA
//    28 -> AB 
//    ...
// 
//
// 示例 1: 
//
// 输入: 1
//输出: "A"
// 
//
// 示例 2: 
//
// 输入: 28
//输出: "AB"
// 
//
// 示例 3: 
//
// 输入: 701
//输出: "ZY"
// 
// Related Topics 数学


package leetcode.editor.cn;

/**
 * 在遇到进制转换时，与10进制采用相同的逻辑。先 取模 ，得到‘个位’进行转换，然后在 / 除 进制，对下一位进行处理。
 * 逻辑使用与起始位为1的，当范围为0~X，则在 mod 为0时，对 target -1
 *
 */
public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        Solution solution = new ExcelSheetColumnTitle().new Solution();
        solution.convertToTitle(52);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String convertToTitle(int n) {
            StringBuilder sb = new StringBuilder();
            while (n != 0) {
                int c = n % 26;
                if (c == 0) {
                    c = 26;
                    n -= 1;
                }
                sb.insert(0, (char) ('A' + c - 1));
                n = n / 26;
            }
            return sb.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}






