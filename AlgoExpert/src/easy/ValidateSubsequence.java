
package easy ;

import java.util.ArrayList ;
import java.util.List ;

/**
 * @author diazk2
 * @version 1.0.0 2021-11-13 Initial implementation
 */
public class ValidateSubsequence
    {

    public static boolean isValidSubsequence( List<Integer> array,
                                              List<Integer> sequence )
        {
        int arrayIndex = 0 ;
        int sequenceIndex = 0 ;

        while ( arrayIndex < array.size() && sequenceIndex < sequence.size() )
            {
            if ( array.get( arrayIndex ).equals( sequence.get( sequenceIndex ) ) )
                {
                sequenceIndex++ ;
                }
            arrayIndex++ ;
            }

        return sequenceIndex == sequence.size() ;
        }


    /**
     * @param args
     */
    public static void main( String[] args )
        {

        List<Integer> a = new ArrayList<Integer>() ;
        List<Integer> b = new ArrayList<Integer>() ;
        List<Integer> c = new ArrayList<Integer>() ;

        a.add( 1 ) ;
        a.add( 2 ) ;
        a.add( 3 ) ;
        a.add( 4 ) ;
        a.add( 5 ) ;

        b.add( 3 ) ;
        b.add( 4 ) ;
        b.add( 5 ) ;

        c.add( 1 ) ;
        c.add( 3 ) ;
        c.add( 6 ) ;

        System.out.println( isValidSubsequence( a, b ) ) ;
        System.out.println( isValidSubsequence( a, c ) ) ;

        }

    }
// end class ValidateSubsequence