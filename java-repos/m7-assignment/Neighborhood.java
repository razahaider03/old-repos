package src;

import java.io.FileNotFoundException;
import java.io.PrintStream;


/**
 * This Neighborhood utility class provides static helper methods the
 * print a Building List and calculate the area of a Building list.
 * A utility class in Java should always be final and have a private
 * constructor, as per https://en.wikipedia.org/wiki/Utility_class.
 */
public final class Neighborhood {


    // TODO - Put your code here.
    public static
    void print ( Building[] buildings, String header ) {
    System.out.println(header);
    System.out.println("--------------");
        for ( Building build : buildings ){
            System.out.println(build.toString());
        }
        
    }
    public static
    int calcArea (Building[] buildings ) {
        int totalBuild = 0;
        for ( Building build : buildings ){
            totalBuild += build.calcLotArea();
        }
        return totalBuild;
    }
}
