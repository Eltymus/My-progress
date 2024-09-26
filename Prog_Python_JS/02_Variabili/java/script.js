// dichiaro delle Variabili

let mioNome = "Lorenzo";
let mioCognome = "Tripodi";
let eta = 25;

// concateno le 2 stringhe

let saluto = "ciao "+mioNome+" "+mioCognome;

// Backtick permette di usare ${}

let saluto2 = `ciao ${mioNome} ${mioCognome}`;

let saluto3 =`ciao ${mioNome} ${mioCognome}, hai ${eta} anni`

console.log(saluto2);
console.log(saluto);
console.log(saluto3);    

let num3="4";
let num4="5";

let sommaNumeri = num3 + num4; // da come risultato 54 perchè concatena 2 stringhe

console.log(sommaNumeri); 

//tutte le altre operazioni danno il numero vero, se mettiamo testo dirà l'errore NaN Not a Number

//se si vuole addizionare ocmunque , si deve usare il casting

let sommaNumeriCast = Number(num3) + Number(num4);

console.log(sommaNumeriCast);

// conversione da stringa a numero

//Boolean 

    let vero = true;
    let falso = false;

    let acceso=false;

    //aquisisisco l'element elRisultato per scrivere dentro il risultato della somma
