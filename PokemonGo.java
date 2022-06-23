import java.util.ArrayList;

public class PokemonGo {
    public static void main(String[] args) {
        String bug;
        String dark;
        String dragon;
        String elektric;
        String fairy;

        ArrayList<PokemonGo> pokemon = new ArrayList<>();
        try {
            PokemonGo s = new PokemonGo();
            s.setbug(bug);
            s.setdark(dark);
            s.setdragon(dragon);
            s.setelectrick(elektric);
            s.setfairy(fairy);
            PokemonGo.add(s);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

