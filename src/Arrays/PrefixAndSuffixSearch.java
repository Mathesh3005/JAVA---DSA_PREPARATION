import java.util.HashMap;

class WordFilter {
    private final HashMap<Long, Integer> map = new HashMap<>();

    public WordFilter(String[] words) {

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int n = word.length();

            int[] suffix = new int[n + 1];

            for (int s = 1; s <= n; s++) {
                int value = 0;

                for (int j = n - s; j < n; j++) {
                    value = value * 27 + (word.charAt(j) - 'a' + 1);
                }

                suffix[s] = value;
            }

            int prefix = 0;

            for (int p = 1; p <= n; p++) {
                prefix = prefix * 27 + (word.charAt(p - 1) - 'a' + 1);

                for (int s = 1; s <= n; s++) {
                    long key = ((long) prefix << 32)
                             | (suffix[s] & 0xffffffffL);

                    map.put(key, i);
                }
            }
        }
    }

    public int f(String pref, String suff) {
        int prefix = 0;

        for (char c : pref.toCharArray()) {
            prefix = prefix * 27 + (c - 'a' + 1);
        }

        int suffix = 0;

        for (char c : suff.toCharArray()) {
            suffix = suffix * 27 + (c - 'a' + 1);
        }

        long key = ((long) prefix << 32) | (suffix & 0xffffffffL);

        return map.getOrDefault(key, -1);
    }
}
