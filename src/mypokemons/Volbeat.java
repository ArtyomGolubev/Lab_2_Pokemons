package mypokemons;
import mymoves.Struggle_Bug;
import mymoves.Thunder_Wave;
import mymoves.Thunderbolt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Volbeat extends Pokemon {
    public Volbeat (String name, int level) {
        super (name, level);
        super.setType(Type.BUG);
        super.setStats(65, 73, 75, 47, 85,85);
        super.setMove(new Thunderbolt(), new Thunder_Wave(), new Struggle_Bug());
    }
}
