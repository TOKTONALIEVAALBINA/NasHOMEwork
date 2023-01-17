public class Singer extends Person{


    Singer(String name , String designator){
        super(name, designator);

    }
    @Override
    public String toString(){
        return "name: " + getName()+" " + " designation" + getDesignator();
    }
    public void eat(){
        super.eat();
    }
    public void walk(){
        super.walk();
    }
    public void learn(){
        super.learn();
    }
    public void singing(){
        System.out.println(getName()+ " " + " is singing");
    }
    public void playGuitar(){
        System.out.println(getName()+" " + " is playing the guitar");



    }
}
