# - Inserisci dei soldi
# - Stampa le possibili selezioni e prezzi
# - Compra un prodotto e ottieni il resto
#  FALLO CON LE CLASSI


# nello sviluppo web è importante capire , le entità e gli stati 

# rappresentare lo stato della classe :
# 
# -Classe  ; inderire soldi
# -classe :stampare il menu
# -compra un Prodotto e ottieni resto

class Product:
    def __init__(self,nome,prezzo,codice="No code"):
        self.nome = nome;
        self.prezzo = prezzo;
        self.codice= codice;
    
    def __str__(self):
        return self.nome + ": " + str(self.prezzo);


class Macchinetta:
    
    soldi = 0;
    
    
    # menu=[["caffè" , 0.55], ["latte" , 0.45],["macchiato",0.55]];
    
    # menu_dictionary = {
    #     "B15": ["caffè", 0.55],
    #     "B16": ["macchiato", 0.45],
    #     "B17": ["latte", 0.45],
    # }
    
    menu_dictionary_obj = {
        "B15": Product ["caffè", 0.55],
        "B16": Product ["macchiato", 0.45],
        "B17": Product ["latte", 0.45],    
    }
    
    def inserisci_monete(self,moneta) :
        self.soldi += moneta;
        
    def stampa_menu(self):
        print("MENU: ")
        for prodotto in self.menu_dictionary_obj.values():
            print(self.menu_dictionary_obj[prodotto])
        print("---")
    
    def compra(self,codice):
        # ottengo il prezzzo del prodotto rappresentato dal codice
        dizionario_menu = self.menu_dictionary_obj
        prodotto = dizionario_menu[codice] 
        prezzo_del_prodotto=prodotto.prezzo
        
        if prezzo_del_prodotto > self.soldi :
            raise Exception ("Povero") 
        # ottengo il resto
        resto = self.credit - prezzo_del_prodotto
        resto=round(resto,2)
        
        self.credit = 0
        return resto