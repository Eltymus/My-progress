// recupero l'elemento nel quale stamperò la lista

let elElencoStudenti = document.getElementById("elElencoStudenti");
let elNumStudenti = document.getElementById("elNumStudenti");
let sOre = document.getElementById("sOre");

let elEncoStudenti=[

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

elEncoStudenti.push("Pippo");

elElencoStudenti.innerHTML += "<li>"+ elElencoStudenti[0]+"</li>";

for (let i=0; i<elEncoStudenti.length;i++){
    elElencoStudenti.innerHTML += "<li>"+ elEncoStudenti[i]+"</li>";
}

elNumStudenti.innerHTML = "Il numero di studenti è: " + elEncoStudenti.length;

//risultato della somma delle ore di una giornata

let sommaore = 0

for (let i = 0; i < 25; i++) {
    sommaore += i
    }

    console.log(sommaore)
sOre.innerHTML = sommaore