class Clubs{
    String title;
    public void start(){
        System.out.println("Clubs is starting...");
    }
}

class Ural extends Clubs{
    int footbalers;
    public void celebrate(){
        System.out.println("Team is celebrating");
    }
}

class inheritance{
    static void main(String[] args){
        Ural myclubs = new Ural();
        myclubs.title = "Ural";
        myclubs.footbalers = 25;
        myclubs.start(); //Clubs is starting...
        myclubs.celebrate(); //Team is celebrating
        System.out.println(myclubs.title); //Ural
        System.out.println(myclubs.footbalers); //25
    }
}