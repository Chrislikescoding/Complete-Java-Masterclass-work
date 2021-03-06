public class Wall {
    private double width = 0;
    private double height = 0;

    public Wall(double width, double height) {
        if (width <0) width = 0;
        if (height < 0) height = 0;
        this.width = width;
        this.height = height;
    }

    public Wall() {
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        if (width <0) width = 0;
        this.width = width;
    }

    public double getHeight() {
        if (height < 0) height = 0;
        return height;
    }
    public double getArea() {
        return height * width;
}
