package attributegen.classes;

import attributegen.BaseClass;

public class Warlock extends BaseClass {

    /**
     *
     * @return
     */
    @Override
    public int[] getBonuses() {
        int[] local = {_bonuses[3], _bonuses[4], _bonuses[1], _bonuses[2], _bonuses[5], _bonuses[0]};
        return local;
    }

    /**
     *
     * @return
     */
    @Override
    public String getName() {
        return "Warlock";
    }

    /**
     *
     * @return
     */
    @Override
    public int[] getRank() {
        int[] local = {5, 2, 3};
        return local;
    }

    /**
     *
     * @return
     */
    @Override
    public String getRole() {
        return "Striker";
    }
}
