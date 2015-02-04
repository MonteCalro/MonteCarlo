import java.math.*;
import java.io.*;
import java.util.Random;
/**
 * Author: Kevin Thai and Eugene Lu
 * Date created: 1/29/15
 */
public class MonteCarlo
{
    public double h;
    public double k;
    public double r;
    private Random rndm = new Random();
    /**
     * Assigns the value to the field of the same name
     */
    public MonteCarlo(double h, double k, double r)
    {
        this.h = h;
        this.k = k;
        this.r = r;
    }
    
    /**
     * @returns a random x-coordinate.
     */
    public double nextRainDrop_x()
    {
        return (rndm.nextDouble() * 2 * r) + (h-r);
    }
    
    /**
     * @returns a random y-coordinate.
     */
    public double nextRainDrop_y()
    {
        return (rndm.nextDouble() * 2 * r) + (k-r);
    }
    
    /**
     * @returns whether or not a point is inside or on the circle.
     */
    public boolean insideCircle(double x, double y)
    {
        boolean pi = Math.pow((x-h),2) + Math.pow((y-k), 2) <= Math.pow(r,2);
        return pi;
    }
    
}