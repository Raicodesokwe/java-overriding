package overriding;

public class Bank {
public int RateofInterest(){
    return 0;
}
}
class CBA extends Bank{
    @Override
    public int RateofInterest(){
        return 9;
    }
}
class KCB extends Bank{
    @Override
    public int RateofInterest(){
        return 12;
    }
}
class Equity extends Bank{
    @Override
    public int RateofInterest(){
        return 11;
    }
}
class Test{
    public static void main(String[] args) {
        CBA westy=new CBA();
        KCB tao=new KCB();
        Equity upper=new Equity();

    System.out.println("CBA westy rate is"+westy.RateofInterest());
        System.out.println("KCB tao rate is"+tao.RateofInterest());
        System.out.println("Equity upper rate is"+upper.RateofInterest());
    }
}

