class Solution {
    public String frequencySort(String s) {
        int[][] charFreq = new int[126][2];
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            charFreq[c][0] = c;
            charFreq[c][1]++;
        }

        Arrays.sort(charFreq, (a, b) -> Integer.compare(b[1], a[1]));

        for (int[] e : charFreq) {
            while(e[1]-->0) {
                result.append((char) e[0]);
            }
        }

        return result.toString();
    }
}