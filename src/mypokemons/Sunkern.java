package mypokemons;
import mymoves.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Sunkern extends Pokemon {
    public Sunkern(String name, int level) {
        super (name, level);
        super.setType(Type.GRASS);
        super.setStats(30, 30, 30, 30, 30,30);
        super.setMove(new Rest());
    }
}