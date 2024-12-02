package models.genericos;

public class Par<K, V> {
    private K clave;
    private V valor;

    // Constructor para inicializar la clave y el valor
    public Par(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
    }

    // Métodos para establecer y obtener la clave y el valor
    public void establecerClave(K clave) {
        this.clave = clave;
    }

    public void establecerValor(V valor) {
        this.valor = valor;
    }

    public K obtenerClave() {
        return clave;
    }

    public V obtenerValor() {
        return valor;
    }

    // Sobrescribir el método toString() para una mejor representación
    @Override
    public String toString() {
        return "Clave: " + clave + ", Valor: " + valor;
    }
}
