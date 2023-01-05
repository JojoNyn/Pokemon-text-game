class Caterpie extends Pokemon{

    Caterpie(int level){
        setLevel(level);
        setBaseCatchRate(0.5);
    }
    @Override
    public String toString() {
        return "A level " + getLevel() + " Caterpie\n";
    }
}