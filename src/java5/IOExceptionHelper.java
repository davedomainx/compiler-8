
package java5;

import java.io.*;

public final class IOExceptionHelper {

    public static IOException init( String message, Throwable cause ) {
        IOException e = new IOException( message );
        e.initCause( cause );
        return e;
    }

    public static IOException init( Throwable cause ) {
        IOException e = new IOException();
        e.initCause( cause );
        return e;
    }

    public static void initCause( IOException ioe, Throwable cause ) {
        ioe.initCause( cause );
    }

}
