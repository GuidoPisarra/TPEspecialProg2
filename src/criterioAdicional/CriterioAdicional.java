package criterioAdicional;

public abstract class CriterioAdicional {
    private String denominacion;

    public CriterioAdicional(String denominacion) {
        this.denominacion = denominacion;
    }

    public abstract double getPorcentaje();
}