package Project.Common;

public class PointsPayload extends Payload {
    
    int points;





    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }


    public String toString() {
        return "points" + points;
    }



}


