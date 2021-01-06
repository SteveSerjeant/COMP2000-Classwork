package com;

//import com.mvc1.*;
import com.mvc2.*;

public class Main {

    public static void main (String[] args){

        /* level 1*/
//        App app = new App();

        /* level 2*/
        Model model = new Model();

        EditView editView = new EditView();
        Controller editController = new Controller(model, editView);

        DisplayView displayView = new DisplayView();
        Controller displayController = new Controller(model, displayView);
    }
}
