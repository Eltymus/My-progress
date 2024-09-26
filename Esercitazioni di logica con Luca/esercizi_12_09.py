#                                     # -- data una frase conteggiare quante vocali e quante consonanti sono presenti

# voc = ["a","e","i","o","u"];

# frase = input("Inserisci una frase: ")

# conteggiovocali=0 ;

# conteggiconsonanti=0;

# frasearr= frase.split();

# for i in frasearr:
#     i.split();
#     for j in i:
#         if j ==voc[0] or j == voc[1] or j == voc[2] or j == voc[3] or j==voc[4] :
#             conteggiovocali +=1  ;
#         else :
#             conteggiconsonanti +=1 ;
            
# print("nella tua frase ci sono : " + str(conteggiovocali) + " vocali.");

# print("nella tua frase ci sono : " + str(conteggiconsonanti) + " consonanti.");

#               # -- data una frase che sceglie l'utente , chiedere una lettera e sostituire con un altro carattere sempre scelte dall'Untente in tutta la frase

# # fraseut=input("Scrivi ciò che preferisci : ")

# # lettut=input("dimmi una lettera presente nella frase che vuoi cambiare:");

# # lettutsos = input(" ora dimmi con cosa vuoi sostituirla : ")

# # lettut=  input ( "dimmi una lettera presente nella frase : ")

# # contatore = 0;

# # for i in fraseut :
# #     if i == fraseut :
# #         contatore += 1;
# #     else : 
# #         if contatore == 0 :
# #             print("se non metti una lettera presente non cambierà nulla !, una volta finito questo ricarica per riprovare");

# # lettutsos = input(" ora dimmi con cosa vuoi sostituirla : ")

# # for i in fraseut :
# #     if i == lettut :
# #         i = lettutsos;

# # fraseCorretta=fraseut.join()
# # print(fraseCorretta)

#                                                     # VERSIONE CHAT GPT

# # Chiedi all'utente di inserire una frase
# frase_utente = input("Scrivi ciò che preferisci: ")

# # Chiedi all'utente la lettera da sostituire
# lettera_da_sostituire = input("Dimmi una lettera presente nella frase che vuoi cambiare: ")

# # Chiedi all'utente con cosa vuole sostituire la lettera
# sostituzione = input("Ora dimmi con cosa vuoi sostituirla: ")

# # Inizializza una variabile per contenere la frase corretta
# frase_corretta = ""

# # Contatore per verificare la presenza della lettera
# contatore = 0

# # Cicla attraverso ogni carattere nella frase
# for carattere in frase_utente:
#     if carattere == lettera_da_sostituire:
#         # Aggiungi il carattere di sostituzione alla frase corretta
#         frase_corretta += sostituzione
#         contatore += 1
#     else:
#         # Altrimenti, aggiungi il carattere originale
#         frase_corretta += carattere

# # Dopo il ciclo, controlla se la lettera era presente
# if contatore == 0:
#     print("Se non metti una lettera presente non cambierà nulla! Ricarica per riprovare.")
# else:
#     print(frase_corretta)


# # --vedere se una frase o una parola è palindroma 

# parola = input("dimmi una parola o una frase ti dirò se è palindroma : ");

# parolacons = parola.replace(" ","");

# parolaInvertita = parola[::-1];
# parolaInvertitaNoSpaces =  parolaInvertita.replace(" ", "");

# if parolacons == parolaInvertitaNoSpaces:
#     print("la parola o la frase è palindroma");
# else:
#     print("la parola o la frase non è palindroma");
    
    
#                                                                  fai il gioco dell'impiccato 

print("Indovina la frase , hai tanti tentativi quante sono le lettere") ;

frase_gioco = "lavora invece di giocare";

tentativi = len(frase_gioco)+1;

frase_gioco_in_array = list(frase_gioco);



for i in range(tentativi):
    inputLettera = input("scrivi una lettera e vediamo se è presente nel testo : ");
    print ("ti rimangono "+ tentativi - 1) ;
    for j in frase_gioco_in_array:
        if j == inputLettera:
                
