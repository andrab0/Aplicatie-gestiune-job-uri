package TEMA_POO;

public class Constraint {
    private int limitSuperior;
    private int limitInferior;

    public Constraint(int limitSuperior, int limitInferior) {
        this.limitSuperior = limitSuperior;
        this.limitInferior = limitInferior;
    }

    public Constraint() {}

    // getteri + setteri:
    public int getLimitSuperior() {
        return limitSuperior;
    }

    public void setLimitSuperior(int limitSuperior) {
        this.limitSuperior = limitSuperior;
    }

    public int getLimitInferior() {
        return limitInferior;
    }

    public void setLimitInferior(int limitInferior) {
        this.limitInferior = limitInferior;
    }
}
