package resol.RossoA.ejercicio2;

public abstract class Vehiculo implements Mantenimiento {
    private String marca;
    private int kilometraje;

    public Vehiculo(String marca, int kilometraje) {
        this.marca = marca;
        setKilometraje(kilometraje);
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public int getKilometraje() { return kilometraje; }
    public void setKilometraje(int kilometraje) { if (kilometraje >= 0) this.kilometraje = kilometraje; }
    public void recorrer(int km) { if (km > 0) this.kilometraje += km; }
    public abstract int proximoServicio();
}
