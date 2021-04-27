package week2.day2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -19
 * Time: 13:25
 */
public class Test1 {
    public static void main(String [] args){
        B b = new B();
        int res = b.getValue();
        System.out.println(res);
    }
    static class A{
        protected int value;
        public A(int v) {
            setValue(v);
        }
        public void setValue(int value){
            this.value = value;
        }
        public int getValue(){
            try{
                value++;
                return value;
            } catch(Exception e){
                System.out.println(e.toString());
            } finally {
                this.setValue(value);
                System.out.println(value);
            }
            return value;
        }
    }
    static class B extends A{
        public B() {
            super(5);
            int a = getValue() - 3;
            setValue(a);
        }
        public void setValue(int value){
            super.setValue(2 * value);
        }
    }
}