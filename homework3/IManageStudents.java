package homework3;

public interface IManageStudents {
    /* all methods at interface are abstract one */
    public abstract boolean have(Object student);
    public abstract void add(Object student);
    public abstract int size();
    public abstract boolean full();
    public abstract void secureSpace();
    public abstract boolean remove(Object student);
}
