import ehUmCPF from "./valida-cpf";
import ehMaiorDeIdade from "./valida-idade";

const camposDoFormulario = document.querySelectorAll("[required");

camposDoFormulario.forEach((campo) => {
    campo.addEventListener("blur", () => verificaCampo(campo));
    campo.addEventListener("invalid", evento => evento.preventDefault());
})

function verificaCampo(campo){
    if(campo.name == "cpf" && campo.value.length >= 11){
        ehUmCPF(campo);
    }
    if (campo.name == "aniversario" && campo.value != "") {
        ehMaiorDeIdade(campo);
    }

    console.log(campo.validity);

}