package domain.validate;

public class IsNumeric implements Validation {
    @Override
    public boolean execute(String s) {
        return s.matches("\\d+");
    }
}
