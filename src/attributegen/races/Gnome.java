package attributegen.races;

import attributegen.BaseRace;

public class Gnome extends BaseRace {

    public Gnome() {
        super(3, 5);
    }

    /**
     *
     * @return
     */
    @Override
    public String getName() {
        return "Gnome";
    }
}
