package aula20Relacionamento;

public class TesteRelacionamento {

    public static void main(String[] args) {

        Contatos contatos = new Contatos();

        //jeito simples de fazer
        contatos.setNome("Jon");
        //contatos.setEndereco("Winterfell");
        //contatos.setTelefone("11 99999-9999");

        //criar objeto endereço
        Endereco end = new Endereco();
        end.setRua("Rua dos Lobos");
        end.setCidade("Winterfell");
        end.setComplemento("Norte");
        end.setEstado("Westeros");
        end.setNumero(2);
        end.setCep("72.902-221");

        contatos.setEndereco(end);

        //criando objeto telefone
        Telefone tel = new Telefone();
        tel.setNumero("99999-9999");
        tel.setTipo("Celular");
        tel.setDdd("11");

        //criando um array de telefones
        Telefone tel2 = new Telefone();
        tel2.setNumero("88888-8888");
        tel2.setTipo("Residencial");
        tel2.setDdd("11");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = tel;
        telefones[1] = tel2;

        contatos.setTelefones(telefones);

        //contatos.setTelefone(tel);

        System.out.println(contatos.getNome());

        if (contatos != null && contatos.getEndereco() != null){
            System.out.println(contatos.getEndereco().getCidade());
        }
        /*if(contatos.getTelefone() != null){
            System.out.println(contatos.getTelefone().getDdd() + " " + contatos.getTelefone().getNumero());
        }*/

        if(contatos.getTelefones() != null){
            for (Telefone t : contatos.getTelefones()) {
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }

    }
}
