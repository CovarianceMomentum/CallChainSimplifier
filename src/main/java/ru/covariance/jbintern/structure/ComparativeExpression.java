package structure;

public abstract class ComparativeExpression implements BooleanExpression {
    protected Polynomial poly;

    public ComparativeExpression(Polynomial poly) {
        this.poly = poly;
    }

    abstract protected String getSign();

    @Override
    public void compose(Polynomial poly) {
        this.poly.compose(poly);
    }

    @Override
    public String toString() {
        return "(" + poly.toString() + getSign() + "0" + ")";
    }
}