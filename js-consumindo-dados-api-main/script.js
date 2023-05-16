async function buscaEndereco(){

try{
var consultaCEP = await fetch ('https://viacep.com.br/ws/01001000/json/')
const consultaCEPConvertida = await consultaCEP.json();
if(consultaCEPConvertida.erro){
    throw Error('CEP não existente!');
}
console.log(consultaCEPConvertida);
} catch(erro){
    console.log(erro);
}
}
// .then(resposta => resposta.json())
// .then(r => {
//     if (r.erro){
//         throw Error('Esse cep não existe')
//     } else
//     console.log(r)
// })
// .catch(erro => console.log(erro))
// .finally(mensagem => console.log('processamento concluído!'));


buscaEndereco();