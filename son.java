package overriding;

public class son extends Father{
    @Override
    public void eat(){
        System.out.println("son eats a lot of food");
    }
    @Override
    public void istall(){
        System.out.println("son is 3'4 tall");
    }
    @Override
    public void Strong(){
        super.Strong();
    }

    public static void main(String[] args) {
       son Matthew=new son();
        Matthew.eat();
        Matthew.istall();
        Matthew.Strong();
    }
}
