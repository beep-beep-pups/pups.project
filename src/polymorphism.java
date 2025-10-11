class CSGamers {
    public void shouts() {
        System.out.println("Some generic CS gamers shouts");
    }
}

class French extends CSGamers{
    public void shouts(){
        System.out.println("Nice boys");
    }
}

class russian extends CSGamers{
    public void shouts(){
        System.out.println("lie");
    }
}

public class polymorphism{
    public static void main(String[] args){
        CSGamers myFrench = new French();
        CSGamers myrussian = new russian();
        myFrench.shouts(); //Nice boys
        myrussian.shouts(); //lie
    }
}
