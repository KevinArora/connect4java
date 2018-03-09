package ly.generalassemb;

import processing.core.PApplet;
import processing.core.PApplet.*;

public class Wew extends PApplet{

    public static void main(String[] args) {
        PApplet.main("ly.generalassemb.Wew", args);
    }

public void setup(){

}

Board board = new Board();

public void draw(){
    int startingY = 50;
    for (int i = 0; i < 6; i++) {
        int startingX = 50;
        for (int j = 0; j < 6; j++) {
            if (board.getValue(i, j) == 0) {
                noFill();
                ellipse(startingX, startingY, 100, 100);
                startingX += 105;
            } else if (board.getValue(i, j) == 1){
                fill(255,0,0);
                ellipse(startingX, startingY, 100, 100);
                startingX += 105;
            }
            else if (board.getValue(i, j) == 2){
                fill(255,255,255);
                ellipse(startingX, startingY, 100, 100);
                startingX += 105;
            }
        }
        startingY += 105;
    }

}
public void settings(){
    size(636,636);
}
}
