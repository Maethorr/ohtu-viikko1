package statistics.matcher;

import statistics.Player;

/**
 *
 * @author Sara
 */
public class HasFewerThan implements Matcher {
    private Matcher hasAtLeast;
    
    public HasFewerThan(int value, String category) {
        this.hasAtLeast = new HasAtLeast(value, category);
    }

    @Override
    public boolean matches(Player p) {
        return !this.hasAtLeast.matches(p);
    }
}
