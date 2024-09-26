class Mostro:
    def __init__(self, nome, pf): 
        self.nome = nome
        self.pf = pf
    
    def ruggisci(self):
        print("GrrR sono ", self.nome);

    def ferisci(self, danni):
        self.pf -= danni
        if self.pf <= 0 :
            print(self.nome + " è M O R T O")
            self.pf=0;

