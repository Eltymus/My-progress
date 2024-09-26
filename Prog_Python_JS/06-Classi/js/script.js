// le funzioni servono a mettere insieme una serie di funzioni

function saluta(){
    let nome = "Lorenzo";
    let cognome = "Tripodi";

    console.log("Ciao " + nome + " " + cognome);
}

// richiamo la funzione saluta

saluta();

let demo = document.getElementById("demo");
//richiamo demo come variabile qua  

function benvenuto(){
    let nome = "Lorenzo";
    let cognome = "Tripodi";

    console.log("Ciao " + nome + " " + cognome);

    demo.innerHTML = "Ciao " + nome + " " + cognome;

    // posso anche passare parametri alla funzione
}

benvenuto(); 

let numero_studenti=12;

function contaStudenti(){
    console.log("Il numero di studenti è: " + numero_studenti);
    demo.innerHTML += "<br>In classe ci sono "+ numero_studenti+ " studenti."
}

contaStudenti(); 

let numeroMult=0;

function calcolaMultiplidi2(){
    let numeri = [1,2,3,4,5];
// DA FINIRE
}

//  FUNZIONI DI FUNZIONI

// posso chiamare una funzione all'interno di un altra funzione e non solo

function descrividocente(){
    let nomeDocente="Fabio Pileggi";

    console.log("Docente : "+nomeDocente)

    descrizioneCorso();
}

function descrizioneCorso(){
    let nomeCorso="Tecnico programmatore in Python";
    
    console.log("Corso : "+nomeCorso)
}

descrividocente();

// IIFE immidiatly invoked function expression (sono molto rare me sono funzuoni che si chiamano da sole e non possono essere richiamate)

(function(){
    console.log("IIFE eseguita");
})();

// Funzioni Parametriche
// JS DOC serve a dare un messaggio ad altri programmatori in questo caso lo abbiamo chiamato con /** e "enter" per poi dichiarare il tipo di variabile
/**
 * 
 * @param {String} nome 
 * @param {String} cognome 
 */
function salutauno(nome, cognome){

    demo.innerHTML = "<h2>Ciao "+ nome +" "+ cognome + " </h2>";

}

salutauno("Lorenzo", "Tripodi");

// Geometria Parametri NUmerici

function Area(b,h) {
    Area = (b * h) / 2;
    return Area;
}

console.log(Area(5, 10)); // Output: 25

// possimao farlo usando il calcolo area

// function Volume(base,altezza,profondità) {
//     Volume = (base * altezza * profondità);
//     return Volume;
// }

// versione ocn calcolo area funzione ( Funzione di Callback )

function Volume(base,altezza,profondità) {
    Volume = Area(base,altezza) * profondità;
    return Volume;
}

console.log(Volume(6, 7, 8)); 

function calcoloVolume2(area,profondità){

    let Volume= area * profondità

    return Volume;

}

console.log(calcoloVolume2(Area(5,6),7))