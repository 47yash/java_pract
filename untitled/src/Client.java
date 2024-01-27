public class Client {
    private int id;

    public Client(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj) return true;
        if (obj==null) return false;
        if(getClass() !=obj.getClass()) return false;
        Client other=(Client) obj;
        if(id != other.id)
            return false;
        return true;

    }

    public static void main(String[] args) {
        Client c1=new Client(12);
        Client c2=new Client(12);
        System.out.println(c1.getClass());

        Client c3=c1;
        System.out.println(c1==c2);
        System.out.println(c1==c3);
        System.out.println(c1.equals(c2));


        System.out.println(c2.hashCode());
        System.out.println(c1.hashCode());
        System.out.println(c3.hashCode());


    }
}
