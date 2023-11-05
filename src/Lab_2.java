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
        Volbeat volbeat = new Volbeat("Волбит", 5);
        Vibrava vibrava = new Vibrava("Вибрава", 5);
        Trapinch trapinch = new Trapinch("Трапинч", 5);
        Sunkern sunkern = new Sunkern("Санкерн", 5);
        Sunflora sunflora = new Sunflora("Санфлора", 5);
        Flygon flygon = new Flygon("Флайгон", 5);
        b.addAlly(volbeat);
        b.addAlly(vibrava);
        b.addAlly(sunflora);
        b.addFoe(trapinch);
        b.addFoe(sunkern);
        b.addFoe(flygon);
        b.go();
    }
}
