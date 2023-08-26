import java.util.StringTokenizer;

class frequency {
    public static void main(String args[]) {
        String check = "ajdfheG?!*";
        char ch;
        StringBuffer str = new StringBuffer(check);
        int vowel = 0, consonant = 0, question=0, asterik=0, exclamation=0;
        int length = str.length();
        for(int i=0; i<length; i++)
        {
            ch = check.charAt(i);
            if(ch>= 97 && ch<= 122)
            {
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    vowel++;
                }
                else{
                    consonant++;
                }
            }
            else if(ch == '?')
                question++;
            else if(ch == '*')
                asterik++;
            else if(ch == '!')
                exclamation++;
            else
                continue;
        }
        System.out.println(vowel + "\n" + consonant + "\n" + question + "\n" + asterik + "\n" + exclamation );
    }
}