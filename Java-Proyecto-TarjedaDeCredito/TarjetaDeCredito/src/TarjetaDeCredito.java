import java.util.List;

public class TarjetaDeCredito {

    private double limite;
    double saldo;
    List <Compra> listaDeCompras;

    public TarjetaDeCredito(double limite) {
        this.limite = limite;
        this.saldo = saldo;
        this.listaDeCompras = listaDeCompras;
    }

    public boolean lanzarCompra (Compra compra){
        if (this.saldo >= compra.getValor()){
            this.saldo -= compra.getValor();
            this.listaDeCompras.add(compra);
            return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getListaDeCompras() {
        return listaDeCompras;
    }


}


