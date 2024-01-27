public class Bird  implements flyable
{
    private int len=10;
    @Override
    public void fly() {
        System.out.println("bird  is flying ");
    }
    public int  getLen(){
        return this.len;

    }

    public void fly(int n){

    }

    public static void main(String[] args) {
        Bird b=new Bird();
        System.out.println(b.getLen());

    }
}
