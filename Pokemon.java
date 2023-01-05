public class Pokemon{
    private int level;
    private double baseCatchRate;

    Pokemon(int level, double baseCatchRate){
        this.level = level;
        this.baseCatchRate = baseCatchRate;
    }

    Pokemon(){
    }
    public int getLevel(){
        return level;
    }
    public double getBaseCatchRate(){
        return baseCatchRate;
    }

    public void setLevel(int level){
        this.level = level;
    }
    public void setBaseCatchRate(double baseCatchRate){
        this.baseCatchRate = baseCatchRate;
    }
}