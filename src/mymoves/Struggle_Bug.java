package mymoves;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class Struggle_Bug extends SpecialMove {
    public Struggle_Bug(){
        super(Type.BUG, 50, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect l_SA = new Effect().stat(Stat.SPECIAL_ATTACK, -1);
        p.addEffect(l_SA);
    }

    @Override
    protected boolean checkAccuracy(Pokemon p, Pokemon p1) {
        return true;
    }

    @Override
    protected String describe() {
        return "применяет Struggle Bug, наносит урон и понижает показатель специальной атаки цели на 1";
    }
}