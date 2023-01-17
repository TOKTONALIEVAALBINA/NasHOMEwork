public class Dancer extends Person{
    Dancer(String name , String designator){
        super(name, designator);
    }
    @Override
    public String toString (){
        return "name: " + getName()+" " + "designation" + getDesignator();
    }

    public void eat() {
        super.eat();
    }

    public void learn() {
        super.learn();
    }


    public void walk() {
        super.walk();
    }
    public void dancing(){
        System.out.println(getName()+" " + "is dancing");
    }
}
