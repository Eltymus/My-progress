import random

class Ladro:
    def __init__(self, nome , pf, int, dex, str ):
        self.pf = pf
        self.nome = nome
        self.dex = dex
        self.str = str
        self.int = int
        
    def attacco(self):
        print ( self.nome + " ha attaccato rapidamente")
        return random.randint(0,6) + self.dex