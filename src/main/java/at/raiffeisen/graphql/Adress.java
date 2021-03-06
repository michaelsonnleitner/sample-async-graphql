package at.raiffeisen.graphql;

public class Adress implements AdressCode {
    public long id;

    public String[] lines;

    public String code;

    public Adress() {
    }

    public Adress(long id, String code, String... lines) {
        this.id = id;
        this.lines = lines;
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
