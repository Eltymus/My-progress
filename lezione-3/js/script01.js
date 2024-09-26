//gli array sono contenitori di oggetti simili fra loro
//gli array sono 0 based

let colori = ["rosso", "giallo", "blu", "verde"];

//leggo i valori dei miei colori
console.log(colori[0]);//rosso
let primocolore = colori[0];
console.log(primocolore);

let terzocolore = colori[2];
console.log(terzocolore);

colori.push("viola");
console.log(colori);

//console.log("il mio array è composto da : " + colori.length);

//aggiungo un colore al mio array

//push() -> aggiunge un elemento
//pop() -> elimina l'ultimo elemento
//sort()-> ordina in ordine alfabetico o numerico
//reverse() -> inverte

let persona = [
    "Mario",
    "Pippo",
    "Laura",
    "Anna",
    "Maria",
];

//console.log(persona.sort());

console.log(persona[persona.length - 1]);

//Non fare array miste

//unire 2 array
let frutta = ["pesca", "anguria", "ciliegia", "nespole"];
let verdura = ["insalata", "zucchina", "melanzana", "peperone", "valeriana"];

let fruttaEverdura = [...frutta, ...verdura];//operatore spread senza crea un array bidimensionale
console.log(fruttaEverdura.sort());

let nomearr = ["L", "O", "R", "E", "N","Z", "O"];
let nome = nomearr.join("");
console.log(nome);

//split forma un array da una string

let nome2 = "Lorenzo impara js";
let caratteri = nome2.split("");
console.log(caratteri);

//ottieni il nome al contrario

let nomeAlContrario = nome.split("").reverse().join("").toLocaleUpperCase();
console.log(nomeAlContrario);