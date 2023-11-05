package mypokemons;
import mymoves.Bug_Buzz;
import mymoves.Dragon_Breath;
import mymoves.Facade;
import mymoves.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Flygon extends Pokemon {
    public Flygon(String name, int level) {
        super (name, level);
        super.setType(Type.GROUND, Type.DRAGON);
        super.setStats(80, 100, 80, 80, 80,100);
        super.setMove(new Facade(), new Rest(), new Bug_Buzz(), new Dragon_Breath());
    }
}
