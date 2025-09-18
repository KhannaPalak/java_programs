public class BoxNew {
    float width, height, depth;
    public BoxNew() {
        width = height = depth = 0;
    }
    public BoxNew(float w, float h, float d) {
        width = w;
        height = h;
        depth = d;
    }
    public BoxNew(BoxNew b) {
        this.width = b.width;
        this.height = b.height;
        this.depth = b.depth;
    }
    public float getVolume() {
        return width * height * depth;
    }
    public void displayVolume() {
        System.out.println("Volume = " + getVolume());
    }
}