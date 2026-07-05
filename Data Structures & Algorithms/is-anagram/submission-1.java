class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        if(s.length()!=t.length())
          return false;

        int i=0;
        char[] arrs=s.toCharArray();
        char[] arrt=t.toCharArray();

        Arrays.sort(arrs);
        Arrays.sort(arrt);

        while(i<s.length() && s.length()==t.length())
        {
           if(arrs[i]!=arrt[i])
            {
                return false;
            }
            i++;
        }
        return true;
    }
}
