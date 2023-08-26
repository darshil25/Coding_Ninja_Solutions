public class Solution 
{
    public static String removeDuplicates(String str) 
    {
        StringBuilder sb = new StringBuilder();
        boolean map[] = new boolean[26];
        
        for(int i=0; i<str.length(); i++){
            int currch = str.charAt(i);
            if(map[currch - 'a'] != true){
                sb.append(str.charAt(i));
                map[currch - 'a'] = true;
            }
            else{
                continue;
            }
        }
        str = sb.toString();
        return str;
    }
}
