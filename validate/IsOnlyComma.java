package domain.validate;

public class IsOnlyComma implements Validation{
    @Override
    public boolean execute(String s) {
        return s.equals(",");
    }
}
