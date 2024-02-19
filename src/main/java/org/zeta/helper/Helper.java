// Helper package to export all necessary objects that will be used by the rest of the code.
package org.zeta.helper;

// Importing required packages
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// Helper class to return the objects required.
public class Helper {
    // Logger Helper
    public static Logger getLogger(Class<?> c){
        return LogManager.getLogger(c);
    }
}
