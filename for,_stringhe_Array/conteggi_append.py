import random

# append sostituisce il numero al posto dell'index inserito

conteggi=[]

numero_classi = 5

for i in range(numero_classi):
    conteggi.append(0)

conteggi[4] += 1

print (conteggi) 

# converte un range in lista

print (list(range(0,5)))

# shuffle randomizza la lista data

print(random.shuffle(list(range(0,5))))

#copie CLONE SHALLOW AND DEEP
#in questo caso fa il print e restituisce var 1 diverso da var 2, con gli array è diverso

# CLONE SHALLOW

var1 = 20
var2 = var1

print (var1 , var2)

var1 = 30

print (var1, var2)

# qui  di seguito darà lo stesso risultato

# CLONE DEEP


var1 = [20, 30, 40, 50, 60]
var2 = var1

# [:] shallow copy per gli array

var3= var1 [:]

print(var1, var2)

var1[0] = 10

print(var1, var2)

# trovare elemti uguali in 2 array diversi

nomi=["marco","luca","monica", "jeff", "anthony", "cole"]
nomi_vietati=["marco", "jeff" , "cole"]

nomi_ok=False

while nomi_ok==False:
    for n in nomi :
     if n in nomi_vietati:
        nomi_ok=True

print(nomi_ok)

#esercizio censura

testo = "non mi toglieranno mai il 4° emendamento"
analisi_testo=testo.split()
parole_vietate=["4°", "5°", "emendamento", "non", "legge", "libero", "aiuto"]


for i in range(len(analisi_testo)):
   if analisi_testo[i].lower() in parole_vietate:
      analisi_testo[i] =  (len(analisi_testo[i])-2 ) * "*"

print(" ".join(analisi_testo))
























# import random

# incontri = ["moneta", "carta", "forbice", "gioco dell'asso", "gioco dei dadi"]

# encounter = random.choice(incontri)

# print("Hai incontrato:", encounter)