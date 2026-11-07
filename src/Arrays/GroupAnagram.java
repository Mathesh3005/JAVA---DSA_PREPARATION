package Arrays;
import java.util.*;

//Input: strs = ["eat","tea","tan","ate","nat","bat"]
//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

public class GroupAnagram {

        public static void groupAnagrams(String[] strs) {

            Map<String, List<String>> map = new HashMap<>();

            for (String str : strs) {

                char[] arr = str.toCharArray();

                Arrays.sort(arr);

                String key = new String(arr);

                map.putIfAbsent(key, new ArrayList<>());

                map.get(key).add(str);
            }

            System.out.print(new ArrayList<>(map.values()));
        }
    }


