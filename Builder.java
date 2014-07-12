/*
 * Author:     Trent Russell
 * Date:       July 11, 2014
 * email:      trent.russell.ucsd@gmail.com
 *
 * Description:Builder.java builds a stack of "*" depending on the 
 *             number passed in to it from the commandline.
 *
 *             Part of Credit Karma interview
 **/
public class Builder
{
    /*
     * Main method
     **/
    public static void main(String args[])
    {
        try
        {
            //Check to make sure int is passed in from commandline
            build(Integer.parseInt(args[0]));
        }
        catch(Exception e)
        {
            //catch any exceptions
            System.out.println( "Exception: " + e );
        }
    }//end main()

    /*
     * Called from main(), prints the stack
     * return: void
     **/
    public static void build(int h)
    {
        int level = 0, ws = 0, ds = 0, i = 0;
        
        while(level != h)
        {
            level++;
            ws = h - (level);
            ds++;
            
            for(i = 0; i < ws; i++)
            {
                System.out.print(" ");
            }
            for(i = 0; i < ds + (level - 1); i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }//end build()
}//end Builder class

/*
 
h = 3;

1:2  *
2:1 ***
3:0*****

*/
