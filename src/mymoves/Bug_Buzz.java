package mymoves;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class Bug_Buzz extends SpecialMove {
    public Bug_Buzz(){
        super(Type.BUG, 90, 100);
    }
    private boolean crit;
    @Override
    protected void applyOppEffects(Pokemon p) {
        int chance = (int) (Math.random() * 101);
        if (chance <= 10) {
            crit = true;
            Effect l_SD = new Effect().stat(Stat.SPECIAL_DEFENSE, -1);
            p.addEffect(l_SD);
        }
    }

    @Override
    protected boolean checkAccuracy(Pokemon p, Pokemon p1) {
        return true;
    }

    @Override
    protected String describe() {
        if (crit) return "применяет Bug Buzz, наносит урон и понижает показатель специальной защиты цели на 1";
        else return "применяет Bug Buzz и наносит урон";
    }
}
