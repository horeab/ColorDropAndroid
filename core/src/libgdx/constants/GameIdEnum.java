package libgdx.constants;

import libgdx.game.GameId;
import libgdx.game.SubGameDependencyManager;
import libgdx.implementations.iq.SkelGameDependencyManager;

public enum GameIdEnum implements GameId {

    colordrop(SkelGameDependencyManager.class),;

    private Class<? extends SubGameDependencyManager> dependencyManagerClass;

    GameIdEnum(Class<? extends SkelGameDependencyManager> dependencyManagerClass) {
        this.dependencyManagerClass = dependencyManagerClass;
    }

    @Override
    public SubGameDependencyManager getDependencyManager() {
        try {
            return dependencyManagerClass.newInstance();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
