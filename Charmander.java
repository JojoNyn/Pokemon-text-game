class Charmander extends Pokemon{

    Charmander(int level){
        setLevel(level);
        setBaseCatchRate(0.2);
    }
    @Override
    public String toString() {
        return "A level " + getLevel() + " Charmander\n";
    }
}