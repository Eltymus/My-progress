// raccolgo un pezzo di HTML e lo rendo globale e statico su javascript

// let demo = document.getElementById('demo');
// let btninvia = document.getElementById('btninvia');

// function messaggio() {
//     demo.innerHTML = '"Hai cliccato bravo stupido"';
// }

// let  btn = document.getElementById('btn');

// il sistema on click così è anche vecchio 
// btn.onclick = messaggio;

// sistema moderno 

// btn.addEventListener('click', messaggio);

// function infoutente() {
// // il . value rappresenta il valore del campo input , ovvero il valore che scrive al suo interno
//     let nome = document.getElementById('nome').value;
//     let cognome = document.getElementById('cognome').value;

//         if ( nome!="" && cognome!="" ) {
            
//         demo.innerHTML = "Ciao " + nome +" "+ cognome;

//         document.getElementById('nome').value = "";
//         document.getElementById('cognome').value = "";

//             }else if(nome==""&& cognome!=""){

//                 demo.innerHTML = "Ti manca il nome";
        
//             }else if(nome!=""&& cognome==""){

//                 demo.innerHTML = "Ti manca il conome" ; 

//         }else{

//             demo.innerHTML="Non hai scritto nulla";

//         }
// }

// avvisa l'utente quando manca solo il nome , solo il cognome o entrambi

// btninvia.addEventListener('click', infoutente, false);

let arrprod = [];
let arrpric = [];

let lista = document.getElementById('listaSpesa');
let somma = 0;
let arrtot=[];
let totart = 0;

function scriviLista(){
    // prendere sempre l'ultima posizione di un array e la aggiunge alla lista

    let lastprod = arrprod.pop();
    let lastprice = arrpric.pop();

    lista.innerHTML += "<li>Prodotto: " + lastprod + ", Prezzo: " + lastprice + " € " + "</li>";

}

function mostraTotale(){

    let totlac = arrtot[arrtot.length -1];

    document.getElementById('totale').innerHTML = "Il totale è: " + totlac + " € " + "per i tuoi "+ totart + " articoli selezionati";
 
}

function lacrime(){
// sommare il prezzo totale

    totart +=1;

    somma += parseInt(arrpric[0]);

    arrtot.push(somma)

}


function aggiungiProdotto() {

    let prod = document.getElementById('prodotto').value;
    let price = document.getElementById('prezzo').value;

// funzione che aggiunge il prodotto a entrambi gli array
    if( price.trim()==""&&prod.trim()=="" ){

        alert("Il nome del prodotto e il prezzo non possono essere vuoti");

    } else if (price.trim()==""&&prod.trim()!=""){

        alert("Il prezzo non può essere vuoto");

    } else if (price.trim()!=""&&prod.trim()==""){

        alert("Il nome del prodotto non può essere vuoto");

    } else {

        arrprod.push(prod);
        arrpric.push(price);
        lacrime();
        scriviLista();
    }

}


