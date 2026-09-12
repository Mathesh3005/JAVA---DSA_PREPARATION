package Strings;

//Input: s = "egg", t = "add"
//
//Output: true

public class IsomarphicStrings {

        public static void isIsomorphic(String s, String t) {

            int[] mapS = new int[256];
            int[] mapT = new int[256];

            for (int i = 0; i < s.length(); i++) {

                char a = s.charAt(i);
                char b = t.charAt(i);

                if (mapS[a] != mapT[b]) {
                    System.out.print("false");
                    return;
                }

                mapS[a] = i + 1;
                mapT[b] = i + 1;
            }

            System.out.print("true");
        }
    }

