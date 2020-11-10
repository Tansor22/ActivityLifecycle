package core;

public interface Tagged {
    default String getTag() {
        return this.getClass().getSimpleName();
    }
}
