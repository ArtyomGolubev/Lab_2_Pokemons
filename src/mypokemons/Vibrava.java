package mypokemons;
import mymoves.Bug_Buzz;
import mymoves.Facade;
import mymoves.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Vibrava extends Pokemon//extends Trapinch {
    public Vibrava(String name, int level) {
        super (name, level);
        super.setType(Type.GROUND, Type.DRAGON); // super.setType(Type.Dragon);
        super.setStats(50, 70, 50, 50, 50,70);
        super.setMove(new Facade(), new Rest(); new Bug_Buzz()); //super.setMove(new Bug_Buzz());
    }
}
