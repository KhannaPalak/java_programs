public class BoxWeight extends BoxNew {
    float weight;
    public BoxWeight() {
        super();     
        weight = 0;
    }
    public BoxWeight(float w, float h, float d, float m) {
        super(w, h, d);   
        weight = m;
    }
    public BoxWeight(BoxWeight bw) {
        super(bw);   
        this.weight = bw.weight;
    }
    public void displayWeight() {
        System.out.println("Weight = " + weight);
    }
}