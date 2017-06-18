package com.javaee.examples.SOLID;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by krishna1bhat on 6/17/17.
 */

/*
    Liskov Substitution Principle(LSP)
*/
//https://www.javacodegeeks.com/2011/11/solid-liskov-substitution-principle.html

class Bird {
    public void fly(){}
    public void eat(){}
}

class Crow extends Bird {}

class Ostrich extends Bird{
    public void fly(){

        throw new UnsupportedOperationException();
    }
}

public class LSP{
    public static void main(String[] args){
        List<Bird> birdList = new ArrayList<>();
        birdList.add(new Bird());
        birdList.add(new Crow());
        birdList.add(new Ostrich());

        letTheBirdsFly ( birdList );
    }
    static void letTheBirdsFly ( List<Bird> birdList ){
        for ( Bird b : birdList ) {
            b.fly();
        }
    }
}


//One Solution - In the above scenario we can factor out the fly feature into- Flight and NonFlight birds.

//class Bird{
//    public void eat(){}
//}
//class FlightBird extends Bird{
//    public void fly()()
//}
//class NonFlight extends Bird{}