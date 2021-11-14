
package easy ;

import java.util.Arrays ;

/**
 * @author diazk2
 * @version 1.0.0 2021-11-14 Initial implementation
 */
public class SortedSquaredArray
    {

    /**
     * Squares each element in an array then sorts them least to greatest 
     *
     * @param array
     * @return the sorted squared number of each element in the array
     */
    public static int[] sortedSquaredArray( int[] array )
        {
        int[] newArray = new int[ array.length ] ;

        for ( int i = 0 ; i < array.length ; i++ )
            {
            newArray[ i ] = array[ i ] * array[ i ] ;
            }

        Arrays.sort( newArray ) ;
        return newArray ;
        }


    /**
     * @param args
     */
    public static void main( String[] args )
        {
        int[] array = {1, 2, 4, 5, 7, 8, 15, 3};
        
        System.out.println(Arrays.toString( sortedSquaredArray(array)));

        }

    }
// end class SortedSquaredArray