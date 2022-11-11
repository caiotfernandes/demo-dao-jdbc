package db;

public class DbExcception  extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public DbExcception(String message) {
        super(message);
    }
}
