import datetime

class TodoList:
    list=[]
    
    def __init__(self,nome):
        self.nome = nome
        
    def add_todo(self,todo):
        self.list.append(todo)
        
    def __str__(self):
        return self.nome + " " + str(self.list)
    
    