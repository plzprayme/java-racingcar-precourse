package domain.validate;

public class Validator {
    private final Validation validator;

    public Validator(Validation validator) {
        this.validator = validator;
    }

    public boolean validation(String s) {
        return validator.execute(s);
    }
}
