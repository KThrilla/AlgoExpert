
package easy ;

/**
 * @author diazk2
 * @version 1.0.0 2021-10-21 Initial implementation
 */
public class TwoNumberSum
    {

    public static int[] twoNumberSum( int[] array,
                                      int targetSum )
        {
        // Write your code here.
        for ( int i = 0 ; i < array.length ; i++ )
            {
            for ( int j = i + 1 ; j < array.length ; j++ )
                {
                if ( array[ i ] + array[ j ] == targetSum )
                    {
                    int[] answer = { array[ i ], array[ j ] } ;
                    return answer ;
                    }
                }
            }
        return new int[ 0 ] ;
        }


    /**
     * @param args
     */
    public static void main( String[] args )
        {
        // TODO Auto-generated method stub

        }

    }
// end class TwoNumberSum