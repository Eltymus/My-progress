
// esercizio 0
function benvenuto(){

    let benvenuto = document.getElementById("benvenuto");
    let nome = prompt ("presentiamoci! Dimmi il tuo nome :");
    let cognome = prompt ("e il tuo cognome?");

    let benv=("Benvenuto " + nome +" "+ cognome);

    benvenuto.innerHTML=benv;

}


// esercizio 1

function triangolo(){

console.log("esercizio 1")

let base = 5;
let lato = 6;
let lato2 = 7;

let areaTriangolo = (base * lato) / 2;
let perTriangolo = base + lato + lato2;

console.log("L'area del triangolo è: " + areaTriangolo);
console.log("il perimetro del triangolo: " + perTriangolo);

}


// esercizio 2
document.getElementById('myForm').addEventListener('submit', function(event){
    event.preventDefault();

var eta = parseInt(document.getElementById('eta').value);
var anno = parseInt(document.getElementById('anno').value);

var anno_nascita = anno - eta;

risultato.innerHTML = "il tuo anno di nascita è il " + anno_nascita;

})

// esercizio 3

document.getElementById('MyForm1').addEventListener('submit', function(event){
    event.preventDefault();

var moltiplicando = parseInt(document.getElementById('moltiplicando').value);
var moltiplicatore = parseInt(document.getElementById('moltiplicatore').value);

var prodotto = moltiplicando * moltiplicatore;

prodot.innerHTML = "il risultato della tua moltiplicazione è : " + prodotto;

})

// esercizio 4

document.getElementById('MyForm2').addEventListener('submit', function(event){
    event.preventDefault();

var numero1 = parseInt(document.getElementById('numero1').value);
var numero2 = parseInt(document.getElementById('numero2').value);
var calcolo = document.querySelector('input[name="calcolo"]:checked').value;

var risultato;

if (calcolo === '*') {
    risultato = numero1 * numero2;
} else if (calcolo === '/') {
    if (numero2 !== 0) {
        risultato = numero1 / numero2;
    } else {
        risultato = "Errore: divisione per zero non permessa!";
    }
}  

result.innerHTML = "il risultato della tuo calcolo è : " + risultato;

})

// Esercizio 5

function letturaEstensione(){

    let file = "esercizio5.txt";

    let estensione = file.split(".").pop();

    console.log("L'estensione del file è: " + estensione);

}

// esercizio 6

function testoja(){

let testo = document.getElementById('testo').value.split(" ");

let jatesto = "";

for (let i = 0; i < testo.length; i++){
    console.log(testo[i])

    if (!testo[i].startsWith("ja")){
        testo[i] = "ja" + testo[i];
    }
}

jatesto = testo.join(" ");

console.log(jatesto);

ja.innerHTML = jatesto;

}

// esercizio 7 prova 1

// document.getElementById('myForm3').addEventListener('submit', function(event){
//     event.preventDefault();
//     console.log(event)

//     var num2 = parseInt(document.getElementById('num1').value);
//     var num1 = parseInt(document.getElementById('num2').value);

//     console.log(num1, num2);

//     let maggiore="";

//     if (num1>num2) {

//         maggiore = num1 + " è maggiore di : " + num2;

//     } else if (num1 == num2) {

//         maggiore = num1 + " è uguale a : " + num2;

//     } else {

//         maggiore = num2 + " è maggiore di : " +num1;

//     }

//     let magg = document.getElementById('magg');
//     magg.innerHTML = maggiore; 
//     console.log(maggiore);

// })

// esercizio 7 prova 2 copia incollando

// document.getElementById('myForm3').addEventListener('submit', function(event){
//     event.preventDefault();

// var num1 = parseInt(document.getElementById('num1').value);
// var num2 = parseInt(document.getElementById('num2').value);

// var maggiore;

// if (num1 == num2) {
//     maggiore = num1 + " è uguale a :" + num2;
// } else if (num1 > mun2) {
//     maggiore = num1 + " è minore di :" + num2;
// }  else {
//     maggiore = num2 + " è minore di :" + num1;
// }

// magg.innerHTML = maggiore;

// })
// versione Chat gpt esercizio 7
document.getElementById('numeroForm').addEventListener('submit', function(event) {
    event.preventDefault();

    const numero1 = parseInt(document.getElementById('numero1').value);
    const numero2 = parseInt(document.getElementById('numero2').value);
    const risultato = document.getElementById('risultato');

    console.log(numero1, numero2);
    
    if (numero1 === numero2) {
        risultato.textContent = "I numeri sono uguali!";
    } else {
        const distanza1 = Math.abs(100 - numero1);
        const distanza2 = Math.abs(100 - numero2);

        if (distanza1 < distanza2) {
            risultato.textContent = `Il numero più vicino a 100 è: ${numero1}`;
        } else {
            risultato.textContent = `Il numero più vicino a 100 è: ${numero2}`;
        }
    }
});

// esercizio 8

document.getElementById('myForm4').addEventListener('submit', function(event) {
    event.preventDefault();
 
    var parola = document.getElementById("parola").value;

    arrpar=parola.split("");

    arrpar.reverse();

    var parinv = arrpar.join("");

    invertita.innerHTML = parinv;
})

// esercizio 9

document.getElementById('myForm5').addEventListener('submit', function(event) {
    event.preventDefault();
 
    var frase = document.getElementById("frase").value;

    console.log(frase);

    arrpar=frase.split(" ");

    console.log(arrpar);

    for (var i=0; i<arrpar.length; i++){
        arrpar[i]=arrpar[i].charAt(0).toUpperCase() + arrpar[i].slice(1).toLowerCase() ;}

    console.log(arrpar);

    var parupp = arrpar.join(" ");

    upperCased.innerHTML = parupp;
})

// esercizio 10

document.getElementById('myForm5');{
function generateRandomString() {
    const length = document.getElementById('length').value;
    const characters = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';
    let randomString = '';

    for (let i = 0; i < length; i++) {
        const randomIndex = Math.floor(Math.random() * characters.length);
        randomString += characters[randomIndex];
    }

    document.getElementById('output').innerText = 'Stringa generata: ' + randomString;
}}

// esercizio 11

function numMaggiore(){

let num1 = prompt ("Dammi un numero : ");
let num2 = prompt ("Dammi un secondo numero :");
let mag= 0 ;

if (num1 > num2) {
    mag = "il numero maggiore è : " + num1;
} else if (num1 < num2) {
    mag = "il numero maggiore è : " + num2;
}else {
    mag = "I numeri sono uguali!";
}

maggiore.innerHTML= mag;

}

// esercizio 12
document.getElementById('myForm7').addEventListener('submit', function(event) {
    event.preventDefault();


    var inputWord = document.getElementById('textinv').value;
    var reversedWord = '';
    for (var i = inputWord.length - 1; i >= 0; i--) {
        reversedWord += inputWord[i];
    }

    forinvertita.innerHTML = reversedWord;

});

// esercizio 13

var risultatoFizzBuzz= 0
function fizzBuzz(){

for (var i = 1; i < 101; i++) {
    if (i % 15 == 0) 
        risultatoFizzBuzz += " "+"Ciao - Mondo"+" "; 
    else if (i % 3 == 0) 
        risultatoFizzBuzz += " "+ " Ciao ," + " "; 
    else if (i % 5 == 0) 
        risultatoFizzBuzz += " "+ "Mondo ,"+" "; 
    else 
        risultatoFizzBuzz+= " "+i+ " , ";
}

risultatoFizz.innerHTML= risultatoFizzBuzz;

}

// esercizio 14

 var salamadra = ["S","a","l","a","m","a","n","d","r","a"] ;
 var salamadraJoin = " " ;
 var salamandrafor = " " ;

 function joinSalamadra(){
    salamadraJoin = salamadra.join("");
    joinSalamadratext.innerHTML = salamadraJoin;
 }

 function forSalamadra(){
    for (let i = 0; i < salamadra.length; i++) {
        salamandrafor += salamadra[i] + "";
    }
    forSalamadratext.innerHTML = salamandrafor;
 }

 // esercizio 15

 var dado=[1,2,3,4,5,6];
 function lanciadado() {

    var numero = Math.floor(Math.random() * dado.length);
    risultatoDado.innerHTML =dado[numero];

 }

//  esercizio 16

var testo = "Java Lorem ipsum sit dolor Java aliqua clara et pulcra sunt Java";

function controllaParola() {
    var guess = document.getElementById('guess').value.trim().toLowerCase();

    if (guess === "") {
        document.getElementById("corrispondenza").innerHTML = "Inserisci una parola valida!";
        return;
    }

    var arrTesto = testo.toLowerCase().split(" ");
    var corrispondenzaScript = "La parola non è presente!";
    
    for(var i = 0; i < arrTesto.length; i++){
        if(arrTesto[i] === guess){
            corrispondenzaScript = "La parola è presente!";
            break;
        }
    }
    
    document.getElementById("corrispondenza").innerHTML = corrispondenzaScript;
}

