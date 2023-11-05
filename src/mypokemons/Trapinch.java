package mypokemons;
import mymoves.Rest;
import mymoves.Facade;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Trapinch extends Pokemon {
    public Trapinch(String name, int level) {
        super (name, level);
        super.setType(Type.GROUND);
        super.setStats(45, 100, 45, 45, 45,10);
        super.setMove(new Facade(), new Rest());
    }
}