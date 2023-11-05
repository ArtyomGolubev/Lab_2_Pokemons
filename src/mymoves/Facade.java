package mymoves;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL, 70, 100);
    }

    private boolean crit;

    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        super.applyOppDamage(p, damage);
        if (p.getCondition() == Status.PARALYZE){
            crit = true;
            super.applyOppDamage(p, damage);
        }
    }

    @Override
    protected boolean checkAccuracy(Pokemon p, Pokemon p1) {
        return true;
    }

    @Override
    protected String describe() {
        if (crit) return "применяет Facade. Противник парализован! Наносит двойной урон";
        else return "применяет Facade и наносит урон";
    }
}
