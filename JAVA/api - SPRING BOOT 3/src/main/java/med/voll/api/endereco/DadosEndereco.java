package med.voll.api.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(
            @NotBlank
            String logradouro,
            @NotBlank
            String bairro,
            @NotBlank
            @Pattern(regexp = "\\d{8}") //expressão regular para definir a quantidade de dígitos do cep
            String cep,
            @NotBlank
            String cidade,
            @NotBlank
            String uf,
            String complemento,
            String numero)
    {
}
