package mypokemons;
import mymoves.Bullet_Seed;
import mymoves.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Sunflora extends Pokemon {
    public Sunflora(String name, int level) {
        super (name, level);
        super.setType(Type.GRASS);
        super.setStats(75, 75, 55, 105, 85,30);
        super.setMove(new Bullet_Seed(), new Rest());
    }
}
