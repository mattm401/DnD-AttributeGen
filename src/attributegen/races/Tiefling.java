package attributegen.races;

import attributegen.BaseRace;

public class Tiefling extends BaseRace {

    public Tiefling() {
        super(0, 5);
    }

    /**
     *
     * @return
     */
    @Override
    public String getName() {
        return "Tiefling";
    }
}
