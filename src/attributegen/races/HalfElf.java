package attributegen.races;

import attributegen.BaseRace;

public class HalfElf extends BaseRace {

    public HalfElf() {
        super(2, 5);
    }

    /**
     *
     * @return
     */
    @Override
    public String getName() {
        return "HalfElf";
    }
}
