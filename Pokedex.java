import java.util.ArrayList;

class Pokedex {
    private ArrayList<Pokemon> myPokedexofPokemon = new ArrayList<Pokemon>();

    public void addToDex(Pokemon p){
        myPokedexofPokemon.add(p);
    }
    public String resultPokeDex(){
        String result = "";
        for(Pokemon p : myPokedexofPokemon){
            result = result + p.toString();}
        return result;
    }
    @Override
    public String toString() {
        return "You have the following:\n" + resultPokeDex();
    }
}