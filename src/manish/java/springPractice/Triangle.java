package manish.java.springPractice;

/**
 * Created by manish on 21-05-2017.
 */
public class Triangle {


    public String getType() {
        return type;
    }

   /* public void setType(String type) {
        this.type = type;
    }*/

    public Triangle(String type, int height) {
        this.type = type;
        this.height = height;
    }

    public Triangle(String type) {
        this.type = type;
    }

    public Triangle(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    private int height;
    private String type;

    public void draw() {
        System.out.println(getType() + " triangle drawn of height-->" + getHeight());
    }
}
