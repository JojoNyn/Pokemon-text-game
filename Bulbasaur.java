class Bulbasaur extends Pokemon{

    Bulbasaur(int level){
        setLevel(level);
        setBaseCatchRate(0.2);
    }
    @Override
    public String toString() {
        return "A level " + getLevel() + " Bulbasaur\n";
    }
}