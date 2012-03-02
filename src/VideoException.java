/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Jaspreet
 */
public class VideoException extends Exception{
    
    public VideoException(){
        System.out.println("Cant render video stream..");
    }
    
    public VideoException(String message) {
	super(message);
    }
 
    public VideoException(Throwable cause) {
	super(cause);
    }
 
    public VideoException(String message, Throwable cause) {
	super(message, cause);
    }
 
}
