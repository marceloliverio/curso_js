const pesquisar = document.querySelector(".pesquisar");
const salvar = document.querySelector(".save");
const img = document.querySelector("#imagem");
const div = document.querySelector(".listar_imagem");
const raca = document.querySelector(".dog-selector").value;


pesquisar.addEventListener("click", searchDogs);



const dogsData =  JSON.parse(localStorage.getItem("lista")) || [];

dogsData.forEach(dog => {
    createElement(dog);
});


async function searchDogs(){
    const raca = document.querySelector(".dog-selector").value;
    const response =  await fetch(`https://dog.ceo/api/breed/${raca}/images/random`);
    const data = await response.json();
    img.src = data.message;
    salvar.style.visibility = "visible";
}

salvar.addEventListener("click",()=> {
    const img = document.querySelector("#imagem");
    save(raca, img.src);
});

function save(raca, img){
    var existe = dogsData.find(e =>  e.image == img);

    if(!existe){
        let dog = {
            idDog: Math.floor(Math.random() * 100000),
            raca: raca,
            image: img
        }
        dogsData.push(dog);
        localStorage.setItem("lista", JSON.stringify(dogsData))
        createElement(dog);
    }else{
        alert("Imagem cadastrada!");
    } 
}


function createElement(dog){
    const imagem = document.createElement("img");
    imagem.id = dog.idDog;
    imagem.src = dog.image;
    imagem.alt = dog.raca;
    div.appendChild(imagem);
}
div.addEventListener("dblclick", (e)=>{
    var id = e.target.attributes;
    deleteElement(id[0].value);
});


function deleteElement(id){
   let dogs = JSON.parse(localStorage.getItem("lista"));
   let index = dogs.findIndex(e => e.idDog == id);
   dogs.splice(index, 1);
   localStorage.setItem("lista", JSON.stringify(dogs))
   location.reload();

}