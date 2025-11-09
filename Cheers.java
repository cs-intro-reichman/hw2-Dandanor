// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String word = args[0].toUpperCase();
                char ch ;
                String an= "AEFHILMNORSX";
                int num = Integer.parseInt(args[1]);

                for (int i=0; i<=word.length()-1; i++)
                {
                        ch=word.charAt(i);
                        if(an.indexOf(ch)==-1)
                        {
                                System.out.println("Give me a  "+ch+": "+ch+"!");
                        }
                        else
                        {
                                System.out.println("Give me an "+ch+": "+ch+"!");
                        }
                }
                System.out.println("What does that spell?");
                for (int i=1; i<=num;i++)
                {
                        System.out.println(word +"!!!");
                }
        }
}
