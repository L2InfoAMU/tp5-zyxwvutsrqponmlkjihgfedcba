package image;

import javafx.scene.paint.Color;
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
        this.indexeofcolors = new int [width][height];
        palettes.add(color);
        for(int i = 0 ; i< height ; i++){
            for(int y = 0 ; y<width ; y++){
                indexesOfColors[y][i] = palettes.indexOf(color);
            }
        }

    }

}
