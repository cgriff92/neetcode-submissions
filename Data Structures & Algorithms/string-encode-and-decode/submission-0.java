class Solution {

    public String encode(List<String> strs) 
    {
        String output = "";
        for (String str : strs) {
            output += str.length() + "#" + str;
        }
        return output;
    }

    public List<String> decode(String str) 
    {
        List<String> output = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            output.add(str.substring(j + 1, j + 1 + length));
            i = j + 1 + length;
        }
        return output;
    }
}
