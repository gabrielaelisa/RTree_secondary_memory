public class MBR extends AbstractRectangulo {

    public MBR(int idNodo, int x, int y, int ancho, int alto) {
        super(idNodo, x, y, ancho, alto);
    }

    public int getIdNodo(){
        return idNodo;
    }

    public void setidNodo(int id){ this.idNodo = id;}
    public boolean esDato(){ return  false;}
}
