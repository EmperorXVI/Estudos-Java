package aula27InterfacesHerença;

public interface SqlDCL {

    void grant(String access);
    void revoke(String access);
}
