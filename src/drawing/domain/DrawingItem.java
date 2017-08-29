package drawing.domain;

public abstract class DrawingItem {

    private Color color;


    public drawing.domain.Color getColor() {
        return color;
    }

    public void setColor(Color value){
        color = value;
    }

    public abstract Point getAncor();
    public abstract Double getWidth();
    public abstract Double getHeight();


    public DrawingItem(Color color) {
        this.color = color;
    }


}
