package taking.mobisi.Api.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroEndereco(
        @NotBlank
        String logradouro,
        @NotBlank
        String bairro,
        @NotBlank
        @Pattern(regexp = "\\d{8}")
        String cep,
        String complemento,
        String numero,
        @NotBlank
        String uf,
        @NotBlank
        String cidade)
{
}
