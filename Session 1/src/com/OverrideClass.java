package com;


public class OverrideClass extends MoveableClass {
    public void move() {
//begin of modifiable zone(JavaCode)......C/72d8f7f9-9253-4fe1-8406-a3daab1a68fd
    System.out.println("Overriding move...");
    super.move();
//end of modifiable zone(JavaCode)........E/72d8f7f9-9253-4fe1-8406-a3daab1a68fd
    }

}
