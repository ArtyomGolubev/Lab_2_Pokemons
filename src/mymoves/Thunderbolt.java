package mymoves;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Thunderbolt extends SpecialMove {
    public Thunderbolt(){
        super(Type.ELECTRIC, 90, 100);
    }

    private boolean crit;
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        int chance = (int)(Math.random() * 101);
        if (chance <= 10) {
            crit = true;
            Effect.paralyze(pokemon);
        }
    }

    @Override
    protected boolean checkAccuracy(Pokemon p, Pokemon p1) {
        return true;
    }

    @Override
    protected String describe() {
        if (crit) return "применяет Thunderbolt, парализует противника и наносит урон";
        else return "применяет Thunderbolt и наносит урон";
    }
}