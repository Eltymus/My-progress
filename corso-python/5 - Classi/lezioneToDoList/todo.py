from datetime import datetime

class Todo:
    is_completato = False
    
    def __init__(self, nome):
        self.nome = nome
    
    def completa(self):
        self.is_completato = True
    
    