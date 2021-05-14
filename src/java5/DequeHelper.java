
package java5;

import java.util.*;

public final class DequeHelper {

    public static Object pop( LinkedList list ) {
        return list.removeFirst();
    }

    public static void push( LinkedList list, Object value ) {
        list.addFirst( value );
    }

}
