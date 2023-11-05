package mymoves;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Bullet_Seed extends PhysicalMove {
    public Bullet_Seed(){
        super(Type.GRASS, 25, 100);
    }

    String c = new String();

    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        int chance = (int) (Math.random() * 8) + 1;
        switch (chance) {
            case 1, 2, 3 -> {
                for(int i = 2; i > 0; i--) {
                    super.applyOppDamage(p, damage);
                }
            }
            case 4, 5, 6 -> {
                for(int i = 3; i > 0; i--) {
                    super.applyOppDamage(p, damage);
                }
            }
            case 7 -> {
                for(int i = 4; i > 0; i--) {
                    super.applyOppDamage(p, damage);
                }
            }
            case 8 -> {
                for(int i = 5; i > 0; i--) {
                    super.applyOppDamage(p, damage);
                }
            }
        }
    }

    @Override
    protected boolean checkAccuracy(Pokemon p, Pokemon p1) {
        return true;
    }

    @Override
    protected String describe() {
        return "применяет Bullet Seed и наносит урон";
    }
}
