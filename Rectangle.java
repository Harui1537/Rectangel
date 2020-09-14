
/**
 * 직사각형을 나타내는 클래스
 * 
 * @author (2018315023 야기시타토시유키, 2017315012 이권효) 
 * @version (2020-09-14)
 */
public class Rectangle
{
    private int width;
    private int height;
    public Rectangle(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    public boolean equals(Object obj)
    {
        Rectangle a = (Rectangle)obj;
        if ((this.width * this.height) == (a.width * a.height) )
            return true;
        else
            return false;
    }
}
