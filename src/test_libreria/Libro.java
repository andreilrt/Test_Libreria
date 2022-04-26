package test_libreria;

public class Libro extends Texto implements IsPrestamo, IsVenta {

    private boolean Prestado;

    public Libro(int Codigo, String Titulo, int AñodePublicacion, boolean P) {
        this.setCodigo(Codigo);
        this.setTitulo(Titulo);
        this.setAñoDePublicacion(AñodePublicacion);
        Prestado = P;
    }

    public boolean getPrestado() {
        return Prestado;
    }

    public void setPrestado(boolean Prestado) {
        this.Prestado = Prestado;
    }

    @Override
    public void MostrarIngresoTexto() {
        System.out.println("Gracias por devolver el libro!!!");
    }

    @Override
    public void MostrarSalidaTexto() {
        System.out.println("Has sacado prestado " + this.getTitulo());
        System.out.println("Gracias por preferir nuestros libros!!!");
    }

    @Override
    public String Astring(int A) {
        String L = Integer.toString(A) + ". Titulo: " + this.getTitulo() + " Año de Publicacion: " + Integer.toString(this.getAñoDePublicacion())
                + " Codigo: " + Integer.toString(this.getCodigo());
        return L;
    }

    @Override
    public void APrestar() {
        this.setPrestado(true);
    }

    @Override
    public void Devovuelto() {
        this.setPrestado(false);
    }

    @Override
    public void EnPrestamo() {
        System.out.println("Este libro está prestado");
    }

    @Override
    public void AVender() {
        System.out.println("Has comprado el libro " + this.getTitulo());
        System.out.println("Gracias por preferirnos!!!");
    }
}
