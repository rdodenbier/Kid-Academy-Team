/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.view;

import java.util.ArrayList;
import java.util.Scanner;
import kidacademy.control.HighScoreControl;
import kidacademy.model.HighScore;

/**
 *
 * @author Rudy Edit by Rudy
 */

    public class HighScoreMenuView extends View {
    
    public HighScoreMenuView () {
        super("\n-----------------------------------------"
                + "\nQ - Quit"
                + "\n-----------------------------------------");
        
        HighScoreControl displayHighScores = new HighScoreControl();
        ArrayList<HighScoreControl.HighScore> displayScores;
        displayScores = displayHighScores.getHighScores();
        
        System.out.println("\n" 
                       + "\n-----------------------------------------"
                       + "\n |High Scores                 |"
                       + "\n-----------------------------------------");
        
        for (int i = 0; i < displayScores.size(); i++){
            System.out.println(i+1 + ": " + displayScores.get(i));
        }
}

        @Override
        public boolean doAction(String value) {
          value = value.toUpperCase(); //convert choice to upper case

          switch (value) {            
              default: //get and start an existing game
                  System.out.println("\n*** Invalid Selection *** Try Again");
                  break;
          }

          return false;
    }    

}
