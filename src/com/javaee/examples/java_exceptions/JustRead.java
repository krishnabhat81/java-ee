package com.javaee.examples.java_exceptions;

/**
 * Created by krishna1bhat on 7/29/17.
 */
public class JustRead {
    /*
        +-----------+
        | Throwable |
        +-----------+
        /         \
        /           \
+-------+          +-----------+
| Error |          | Exception |
+-------+          +-----------+
/  |  \           / |           \
\________/	    \______/    	 \
                            +------------------+
 unchecked	    checked	    | RuntimeException |
                            +------------------+
                            /   |    |      \
                            \_________________/

                                unchecked



Q. Should we make our exceptions checked or unchecked?
Following is the bottom line from Java documents:

If a client can reasonably be expected to recover from an exception,
make it a checked exception.

If a client cannot do anything to recover from the exception,
make it an unchecked exception
*/

}
