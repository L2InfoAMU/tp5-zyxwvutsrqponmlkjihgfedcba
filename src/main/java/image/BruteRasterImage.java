package image;

import javafx.scene.paint.Color;

public class BruteRasterImage implements Image {

    public Pixel pixel;
    public int height;
    public int width;

    public Color getPixelColor(){
        return pixel.getColor();
    }
    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }

    public BruteRasterImage(Color color, int width, int height){
        Color[][]pixels;
        for(int i=0; i< width ; i++){
            for (int y =0 ; y< height ; i++){
                pixels[i][y] = new Pixel  (i, y, color);
            }

        }
    }
    public BruteRasterImage(Color[][] colors){
        for(int i=0; i< width ; i++){
            for (int y =0 ; y< height ; i++){
                pixel = new Pixel  (i, y, Color[i][y]);
            }

        }


    }
    public void createRepresentation(){


    }
    public void setPixelColor(Color color, int x, int y){

        pixel = new Pixel  (x, y, color);
    }
    public Color getPixelColor(int x, int y){

        return pixel.getColor();
    }
    private void setPixelsColor(Color[][] pixels){}
}
