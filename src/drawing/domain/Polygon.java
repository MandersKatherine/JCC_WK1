package drawing.domain;

import java.util.ArrayList;

public class Polygon extends  DrawingItem{

    private ArrayList<Point> verticles;


    //todo alleen een getter voor verticles

    private Double weight;
    public Double getWeight() {
        return weight;
    }
    public void setWeight(Double value){
        weight = value;
    }
}
