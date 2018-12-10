package image;

import javafx.scene.paint.Color;

import java.awt.*;
import java.util.ArrayList;

public class PaletteRasterImage implements Image{

    private int width;
    private int height;
    private List<Color> palettes;
    private int [][] indexesOfColors;

    public PaletteRasterImage (Color color, int width, int height){
        this.width = width;
        this.height = height;
        this.palettes = new ArrayList<color>;
        this.indexesOfColors = new int [width][height];
        palettes.add(color);
        for(int i = 0 ; i< height ; i++){
            for(int y = 0 ; y<width ; y++){
                indexesOfColors[y][i] = palettes.indexOf(color);
            }
        }

    }
    public PaletteRasterImage(Color[][] pixels){
        this.width = pixels.length;
        this.height = pixels[0].length;
        this.palettes = new ArrayList<Color>();
        this.indexesOfColors = new int [width][height];
        for(int i = 0 ; i< height ; i++){
            for(int y= 0 ; y<width ; y++){
                indexesOfColors[y][i] = palettes.indexOf(pixels[y][i]);
            }
        }

    }

    public void createRepresentation(){


    }
    public void setPixelColor(Color color, int x, int y){
        palettes.add(palettes.size(),color);
        this.indexesOfColors[x][y]=palettes.indexOf(color);

        }
        public Color getPixelColor (int x, int y){
        return palettes.get(this.indexesOfColors[x][y]);

    }
    public void setPixelsColor(Color[][] pixels){
        for (int i = 0 ; i<width ; i++){
            for(int y = 0 ; y<height ; y++){
                setPixelColor(pixels[i][y]),i,y);
            }
        }
    }

    private void setPixelsColor(Color color){
        if(!palettes.contains(color)){
            palettes.add(0,color);
        }
        for(int i = 0;i<width;i++){
            for(int j=0;i<height;j++){
                this.indexesOfColors[i][j]=0;
            }
    }

        public int getHeight() {
            return this.height;
        }

        public int getWidth() {
            return this.width;
        }

        protected void setWidth(int width){
            this.width = width;

        }
        protected void setHeight(int height){
            this.height = height;
        }
}
