package attributegen.races;

import attributegen.BaseRace;

public class Dwarf extends BaseRace {

    public Dwarf() {
        super(2, 4);
    }

    /**
     *
     * @return
     */
    @Override
    public String getName() {
        return "Dwarf";
    }
}
