let persona={
    // proprietà le proprietà sono notazioni

    nome: "Lorenzo",
    cognome: "Tripodi",
    eta: 25,
    presenza:true,

    // metodi i metodi sono verbi

    Studia(){
        console.log(this.nome + " sta studiando");
    }


}

testohtml.innerHTML = persona.nome ;

let automobile={
    marca : "Subaru",
    modello: "Baracca",
    cilindrata : 2000,
    colore : "blu opaco",
    stripLed: true,
    trasmissione : "automata",

    marcia_attuale : 0,
    velocità_attuale : 0, 
    num_giri: 0,
    stato : true,

    descrivi(){
        let descrizione = "auto : " + this.marca + " modello " + this.modello;
        return descrizione
    },

    accendi(){
        if(this.stato) {
            return "L'auto è già accesa"
        }else{
            this.stato = true;
            this.num_giri = 1000;
            return "L'auto è stata accesa"
        }},

        guidaAuto(){
            if(this.stato){
                this.marcia_attuale += 5;
                this.velocità_attuale += 50;
                this.num_giri += 100;
                return "La auto è stata guidata a " + this.marcia_attuale + " km"
            }else{
                return "L'auto non è accesa"
            }
        },

        calcolaVelocità(num_giri, marcia_attuale){
            this.num_giri = num_giri

        },


}

