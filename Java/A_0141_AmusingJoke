import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Ayyoub
 */
public class Amusing_Joke {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(new InputStreamReader(System.in));
        String s1=s.next(),s2=s.next(),s3=s.next(),ss=s1+s2;
        char[] c1=ss.toCharArray(),c2=s3.toCharArray();
        int j=0;
        if(c1.length!=c2.length)
        {
            System.out.println("NO");
            System.exit(0);
        }
        for(int i=0;i<c1.length;i++)
        {
            char x=c1[i],y;
            while(j<c2.length)
            {
                y=c2[j];
                if(x!=y && j==c2.length-1)//Character not present in 3rd Pile A.K.A. Something is missing
                {
                    System.out.println("NO");
                        System.exit(0);
                }
                if(c1[i]==c2[j])
                {
                    int found=j;
                    char temp;
                    for(int z=found;z<c2.length;z++)
                    {
                        if(z==c2.length-1)
                        {
                        }
                        else
                        {
                            temp=c2[z+1];
                            c2[z]=temp;
                        }
                     }
                    j=0;
                    break;
                }
                else
                    j++;
            }
            
        }
        System.out.println("YES");
    }
    
}
