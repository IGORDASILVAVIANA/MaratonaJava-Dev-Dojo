package ExerciciosPOO.Enum.exercicio1.dominio;

public class Pedido{
    private int id;
    private String nome;
    private StatusPedido statusPedido;

    public Pedido(int id, String nome, StatusPedido statusPedido) {
        this.id = id;
        this.nome = nome;
        this.statusPedido = statusPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", statusPedido=" + statusPedido +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }
}
