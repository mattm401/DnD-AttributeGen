package attributegen;

public class BaseClass {

    protected int[] _bonuses = {18, 14, 11, 10, 10, 8};
    protected int[] _ranks = {0, 1, 2};

    public int[] getBonuses() {
        return _bonuses;
    }

    public String getName() {
        return "BaseClass";
    }

    public int[] getRank() {
        return _ranks;
    }

    public String getRole() {
        return "Role";
    }
}
