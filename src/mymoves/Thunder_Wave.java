package mymoves;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Thunder_Wave extends StatusMove {
    public Thunder_Wave(){
        super(Type.ELECTRIC, 0, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.paralyze(p);
    }

    @Override
    protected String describe() {
        return "применяет Thunder Wave и парализует противника";
    }
}
