package aula27InterfacesHerença;

public interface BancoDados extends SqlDDL, SqlDML, SqlDCL{

    void abrirConexao();
    void fecharConexao();
}
