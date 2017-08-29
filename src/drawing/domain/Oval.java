package drawing.domain;

public class Oval extends DrawingItem{

    private Point anchor;
    public Point getAnchor() {
        return anchor;
    }
    public void setAnchor(Point value){
        anchor = value;
    }

    private Double width;

    public Double getWidth() {
        return width;
    }
    public void setWidth(Double value){
        width = value;
    }

    private Double height;
    public Double getHeight() {
        return height;
    }
    public void setHeight(Double value){
        height = value;
    }

    private Double weight;
    public Double getWeight() {
        return weight;
    }
    public void setWeight(Double value){
        weight = value;
    }




}
