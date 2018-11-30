package image;

import javafx.scene.paint.Color;

public class BruteRasterImage implements Image {
    public int height;
    public int width;
    Color[][] pixels;

    int[][] indexesOfColors;

    public Color getPixelColor() {
        return pixel.getColor();
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
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
        pixels = new Color[width][height];

    }

    public void setPixelColor(Color color, int x, int y) {

        pixel = new Pixel(x, y, color);
    }

    public Color getPixelColor(int x, int y) {

        return pixel.getColor();
    }

    private void setPixelsColor(Color[][] pixels) {
        for (int i = 0; i < width; i++) {
            for (int y = 0; y < height; i++) {
                setPixelColor(pixels[i][y], i, y);
            }
        }
    }
    private void setPixelsColor(Color color){
        setPixelsColor(color);

    }
    protected void setWidth(int width){
        this.width = width;

    }
    protected void setHeight(int height){
        this.height = height;
    }
}