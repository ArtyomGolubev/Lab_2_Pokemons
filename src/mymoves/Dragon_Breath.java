package mymoves;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Dragon_Breath extends SpecialMove {
    public Dragon_Breath(){
        super(Type.DRAGON, 60, 100);
    }

    private boolean crit;
    @Override
    protected void applyOppEffects(Pokemon p) {
        int chance = (int)(Math.random() * 101);
        if (chance <= 30) {
            crit = true;
            Effect.paralyze(p);
        }
    }

    @Override
    protected boolean checkAccuracy(Pokemon p, Pokemon p1) {
        return true;
    }

    @Override
    protected String describe() {
        if (crit) return "применяет Dragon Breath, парализует противника и наносит урон";
        else return "применяет Dragon Breath и наносит урон";
    }
}
