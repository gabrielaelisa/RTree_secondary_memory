public class Dato extends AbstractRectangulo {

    protected Dato(int x, int y, int ancho, int alto) {
        super(-1, x, y, ancho, alto);
    }

    public boolean esDato(){ return  true;}

    @Override
    public void setidNodo(int id) {
        return;
    }
}
