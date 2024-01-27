public class Animal
{
    private String name;
    private String type;


    public Animal() {
    }

    public Animal(String name, String type){
        this.name=name;
        this.type=type;



    }
    public String bark(){
        return "idk";
    }



    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Animal an=new Animal("kangaroo","mammal");
        System.out.println(an);
    }
}
