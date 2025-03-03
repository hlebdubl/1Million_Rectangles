public class Rectangle {
    private int length;
    private int width;
    private int x;
    private int y;
    private boolean touches = false;



    public Rectangle(int length, int width, int x, int y){
        this.length = length;
        this.width = width;
        this.x = x;
        this.y = y ;

        if(((x >= 10 && x <= 30) || (x + length >= 5 && x + length <= 30)) && (y >= 5 || y - width >= 5) && (y <= 15 || y - width <= 15)){
            touches = true;
        }
    }


    public boolean isTouches() {
        return touches;
    }
}
