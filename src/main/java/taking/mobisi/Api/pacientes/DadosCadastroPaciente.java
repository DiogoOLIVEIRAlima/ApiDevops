package taking.mobisi.Api.pacientes;

import taking.mobisi.Api.endereco.DadosCadastroEndereco;

public record DadosCadastroPaciente(String nome, String email, String telefone, String cpf, DadosCadastroEndereco endereco) {
}
