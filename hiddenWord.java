import java.util.*;
class hiddenWord
{
    String word="";
    public hiddenWord(String h)
    {
        word=h;
    }
    String getHint(String guess)
    {
        if(word.length()!=guess.length())
        {System.out.println("INVALID GUESS. NOT THE SAME LENGTH"); return "";}
        guess=guess.toUpperCase();
        char str[]=new char[word.length()];
        for(int i=0;i<str.length;i++)
        str[i]='-';
        for(int i=0;i<word.length();i++)
        {
            if(guess.charAt(i)==word.charAt(i))
            str[i]=guess.charAt(i);
            else
            {
                for(int j=0;j<word.length();j++)
                {
                    if(guess.charAt(j)==word.charAt(i))
                    {
                        str[j]='+';
                    }
                }
            }
        }
        return String.valueOf(str);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        hiddenWord puzzle=new hiddenWord("HARPS");
        String guess;
        System.out.print("THE LENGTH OF WORD= "+puzzle.word.length()+"\nEnter your guess: ");
        guess=sc.next();
        guess=puzzle.getHint(guess);
        while(!(guess.equals(puzzle.word)))
        {
            System.out.print("HINT: "+guess+"\nEnter another guess: ");
            guess=puzzle.getHint(sc.next());
        }
        System.out.println("CORRECT WORD! \nHIDDEN WORD: "+puzzle.word);
    }
}
