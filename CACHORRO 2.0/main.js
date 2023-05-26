async function buscarDog(){
    var racaDog = document.querySelector("#racaDog").value;
    //console.log(racaDog);
    var imagens = await retornarImagemDogSinc(racaDog);
      mostrarImagens(imagens);

}
function retornarImagemDog (raca , funcaoCallBack) {
    fetch('https://dog.ceo/api/breed/'+raca+'/images')
    .then(response => response.json())
    .then((data) => { return data; })
    .catch(error => console.error(error))

}
    async function  retornarImagemDogSinc (raca) {
    const response = await fetch('https://dog.ceo/api/breed/'+raca+'/images');
    const data = await response.json();
    return data;
}
function mostrarImagens (listaImagens) {
    console.log("mostrar imagens");
    console.log(listaImagens);

    var imgDog = listaImagens.message[0];
    console.log(imgDog);
    document.querySelector("#racaDog").value = imgDog;

}