package com.sherry;

/**
 * custom Exception 
 */
public class InValidNameException extends  Exception{
    InValidNameException(){super();}
    public InValidNameException(String Message){
        super(Message);

    }
}
