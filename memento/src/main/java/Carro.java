import java.util.ArrayList;

public class Carro {

    private CarroEstado estado = new CarroEstadoLigado();
    private List<CarroEstado> memento = new ArrayList<CarroEstado>();


    public CarroEstado getEstado() {
        return estado;
    }

    public Carro setEstado(CarroEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice){
        if (indice < 0 || indice >this.memento.size()-1){
            throw  new IllegalArgumentException("Indice invalido");
        }
        this.estado = this.memento.get(indice);
    }

    public void ligado(){
        estado.ligado();
    }

    public void desligado(){
        estado.desligado();
    }

}
