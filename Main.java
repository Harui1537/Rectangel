
/**
 * 여기에 Main 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Main
{
   public static void main(String[] arg)
   {
       Rectangle Rect = new Rectangle(10,20);
       Rectangle Rect2 = new Rectangle(10,20);
       Rectangle Rect3 = new Rectangle(10,30);
       
       System.out.println(Rect.equals(Rect2));
       System.out.println(Rect.equals(Rect3));
   }
}
