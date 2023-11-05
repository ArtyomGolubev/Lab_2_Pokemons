package mymoves;
import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest(){
        super(Type.PSYCHIC, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect sleep = new Effect().turns(2).condition(Status.SLEEP);
        p.restore();
        p.addEffect(sleep);
    }

    @Override
    protected boolean checkAccuracy(Pokemon p, Pokemon p1) {
        return true;
    }

    @Override
    protected String describe() {
        return "применяет Rest, восстанавливает HP и спит 2 хода";
    }
}