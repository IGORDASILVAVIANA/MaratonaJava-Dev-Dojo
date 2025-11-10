package Minterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando dados de um Banco de Dados");
    }

    @Override
    public void remover() {
        System.out.println("Removendo dados de um Banco de Dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no Banco de Dados");
    }
}
