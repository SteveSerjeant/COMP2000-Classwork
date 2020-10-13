package com;


public class MotorBike {
    private Engine engine;

    private Colour colour;

    public MotorBike() {
//begin of modifiable zone(JavaSuper).....C/30ee0fde-6734-4097-9623-65437393c215
    engine = new Engine();
    System.out.println("Engine created: " + engine);
//end of modifiable zone(JavaSuper).......E/30ee0fde-6734-4097-9623-65437393c215
//begin of modifiable zone(JavaCode)......C/30ee0fde-6734-4097-9623-65437393c215

//end of modifiable zone(JavaCode)........E/30ee0fde-6734-4097-9623-65437393c215
    }

    Colour getColour() {
//begin of modifiable zone................T/da1c1557-040e-4952-b7d3-8cbe80166d90
        // Automatically generated method. Please delete this comment before entering specific code.
//end of modifiable zone..................E/da1c1557-040e-4952-b7d3-8cbe80166d90
//begin of modifiable zone................T/c4499650-45e7-4486-b2ee-8ff0df508fd6
        return this.colour;
//end of modifiable zone..................E/c4499650-45e7-4486-b2ee-8ff0df508fd6
    }

    void setColour(Colour value) {
//begin of modifiable zone................T/4aeed170-e2e0-4fc7-9a6e-7a2309ae23e5
        // Automatically generated method. Please delete this comment before entering specific code.
        this.colour = value;
//end of modifiable zone..................E/4aeed170-e2e0-4fc7-9a6e-7a2309ae23e5
    }

}
