let user={
    nome : "",
    email : "",
    password : "",

    // funzione che prendi i dati inseriti dal form
    getUsername(){
        this.nome = document.getElementById('nome').value;  
    },
    
    // funzione che prende l'email 
    getemail(){
    this.email = document.getElementById('email').value;   
    },

    getPasswords(){
    // funzione che prende la password, non può essere più lunga di 8 caratteri
        if(this.password.length >= 8){
            alert("Password troppo corta, deve essere minimo 8 caratteri");
            return false;
        }else{
        this.password = document.getElementById('password').value;
            }
    },

    getdati(){
        // funzione che prende i dati inseriti dal form
        this.getUsername();
        this.getemail();
        this.getPasswords();
        console.log(this.name);
        console.log(this.email);
        console.log(this.password);
    },


}

btnStampa.addEventListener('click',this.getdati());
