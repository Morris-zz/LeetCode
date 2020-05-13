//给定一个字符串 s 和一些长度相同的单词 words。找出 s 中恰好可以由 words 中所有单词串联形成的子串的起始位置。
//
// 注意子串要与 words 中的单词完全匹配，中间不能有其他字符，但不需要考虑 words 中单词串联的顺序。 
//
// 
//
// 示例 1： 
//
// 输入：
//  s = "barfoothefoobarman",
//  words = ["foo","bar"]
//输出：[0,9]
//解释：
//从索引 0 和 9 开始的子串分别是 "barfoo" 和 "foobar" 。
//输出的顺序不重要, [9,0] 也是有效答案。
// 
//
// 示例 2： 
//
// 输入：
//  s = "wordgoodgoodgoodbestword",
//  words = ["word","good","best","word"]
//输出：[]
// 
// Related Topics  哈希表 双指针 字符串


package leetcode.editor.cn;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SubstringWithConcatenationOfAllWords {
    public static void main(String[] args) {
        Solution solution = new SubstringWithConcatenationOfAllWords().new Solution();
        String[] words = {"foo", "bar"};
        solution.findSubstring("barfoothefoobarman", words);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Integer> findSubstring(String s, String[] words) {
            List<Integer> list = new ArrayList<>();
            if (words.length == 0 || s.length() == 0) return list;
            Map<String, Long> collect = new ArrayList<String>(Arrays.asList(words)).stream().parallel().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            int wordLength = words[0].length();
            int allWordLength = wordLength * words.length;

            char[] chars = s.toCharArray();
            int k ;
            for (int i = 0; i < chars.length; i++) {
                if (chars.length - i < allWordLength) break;
                HashMap<String, Long> stringLongHashMap = new HashMap<>(collect);
                for (k = i; k < i + allWordLength; ) {
                    if (k + wordLength > s.length()) break;
                    String target = s.substring(k, k + wordLength);
                    if (stringLongHashMap.containsKey(target) && stringLongHashMap.get(target) > 0) {
                        stringLongHashMap.put(target, stringLongHashMap.get(target) - 1);
                    } else {
                        break;
                    }
//                    System.out.println(target);
                    k = k + wordLength;
//                    System.out.println(k);
                }
                if (k == i + allWordLength) {
                    list.add(i);

                }
//                System.out.println(i);
//                System.out.println(stringLongHashMap);
            }
            return list;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}