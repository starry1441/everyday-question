package week2.day1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -18
 * Time: 20:10
 */
class Base{
    public Base(String s){
        System.out.print("B");
    }

    public void aa(String s){
        System.out.print("B");
    }
}
public class Derived extends Base {
    public Derived(String s) {
        super(s);
        System.out.print("D");
    }
    public void aa(String s){
        System.out.print("d");
    }

    public static void main(String[] args){

        Derived a = new Derived("C");
        System.out.println();
        Base b = new Derived("y");
        System.out.println();
        a.aa("r");
    }


}

