package image;

import javafx.scene.paint.Color;

public class BruteRasterImage implements Image {
        private int height;
        private int width;
        Color[][] pixels;





    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public BruteRasterImage(Color color, int width, int height) {
        setWidth(width);
        setHeight(height);
        createRepresentation();
        for (int i = 0; i < width; i++) {
            for (int y = 0; y < height; y++) {
                this.pixels[i][y] = color;
            }

        }
    }

    public BruteRasterImage(Color[][] colors) {
        for (int i = 0; i < width; i++) {
            for (int y = 0; y < height; i++) {
                this.pixels[i][y] = colors[i][y];
            }

        }


    }

    public void createRepresentation() {
        this.pixels = new Color[width][height];

    }

    public void setPixelColor(Color color, int x, int y) {

        pixels[x][y] = color;
    }

    public Color getPixelColor(int x, int y) {

        return this.pixels[x][y];
    }

    private void setPixelsColor(Color[][] pixels) {
            this.pixels = pixels;

    }
    private void setPixelsColor(Color color){
        for (int i = 0; i < height; i++) {
            for (int y = 0; y < width; y++) {
                pixels[i][y] = color;
            }
        }

    }
    protected void setWidth(int width){
        this.width = width;

    }
    protected void setHeight(int height){
        this.height = height;
    }
}