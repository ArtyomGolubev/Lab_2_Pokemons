import mypokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Lab_2 {
    public static void main(String[] args) {
        // List of pokemons:
        // https://pokemondb.net/pokedex/volbeat
        // https://pokemondb.net/pokedex/sunkern
        // https://pokemondb.net/pokedex/sunflora
        // https://pokemondb.net/pokedex/trapinch
        // https://pokemondb.net/pokedex/vibrava
        // https://pokemondb.net/pokedex/flygon

        Battle b = new Battle();
        Volbeat volbeat = new Volbeat("Волбит", 10);
        Vibrava vibrava = new Vibrava("Вибрава", 10);
        Trapinch trapinch = new Trapinch("Трапинч", 10);
        Sunkern sunkern = new Sunkern("Санкерн", 10);
        Flygon flygon = new Flygon("Флайгон", 10);
        b.addAlly(volbeat);
        b.addAlly(flygon);
        b.addFoe(trapinch);
        b.addFoe(sunkern);
        b.addFoe(vibrava);
        b.go();
    }
}