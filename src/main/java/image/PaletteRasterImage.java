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

}
