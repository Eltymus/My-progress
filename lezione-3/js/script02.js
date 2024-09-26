let elencostudenti=[
    "Avagliano Simone",
    "Currà Domenico",
    "Espinoza Jesse",
    "Monello Luca",
    "Palazzo Mattia",
    "Pia Martina",
    "Pistone Daniele",
    "PourPour Lorenzo",
    "Sette Francesca",
    "Tripodi Lorenzo",
    "Adrianò Roberto",
    "Gillardi Francesco",
    "Khallafa Hamza",
]

console.log(elencostudenti);

for(let i=0; i<elencostudenti.length; i++){
    console.log(elencostudenti[i]);
}

for(let i=0; i<=5 ; i++) {
    console.log("l'indice vale: "+i);
    console.log("ciclo numero: "+ (i+1));
}

//stampare cognome : cognome e nome: nome 

for(let i=0; i<elencostudenti.length; i++){
    let nomecognome = elencostudenti[i].split(" ");
    console.log("nome: "+nomecognome[1]+" cognome: "+nomecognome[0]);
}

// forEach() si usa solo per gli array
elencostudenti.forEach( studente => {
    console.log(studente);
})

console.log("stampo al contrario");

elencostudenti.reverse().forEach(studente => {
    console.log(studente);
})

console.log("stampo nome e cognome");

elencostudenti.forEach(studente => {
    let nomecognome = studente.split(" ");
    console.log("nome: "+nomecognome[1]+" cognome: "+nomecognome[0]);
})