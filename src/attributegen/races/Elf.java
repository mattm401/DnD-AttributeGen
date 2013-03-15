package attributegen.races;

import attributegen.BaseRace;

public class Elf extends BaseRace {

    public Elf() {
        super(1, 4);
    }

    /**
     *
     * @return
     */
    @Override
    public String getName() {
        return "Elf";
    }
}
