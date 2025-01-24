package org.example;
import java.util.Scanner;

class AgeException extends Exception{
    public AgeException(){
        super("Недостаточный возраст для доступа");
    }

}
