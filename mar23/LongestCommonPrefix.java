class LongestCommonPrefix {
    public static String lcp(String[] strs) {
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        System.out.println(lcp(new String[]{"flower","flow","flight"}));
    }
}