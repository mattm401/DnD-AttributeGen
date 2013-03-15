package attributegen.races;

import attributegen.BaseRace;

public class Halfling extends BaseRace {

    public Halfling() {
        super(1, 5);
    }

    /**
     *
     * @return
     */
    @Override
    public String getName() {
        return "Halfling";
    }
}
