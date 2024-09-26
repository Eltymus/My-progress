# si chiede al soggetto di scrivere sei numeri da 1 a 90 si confrontano con 6 numeri estratti dal random e si informa il soggetto di quanti e quali numeir ha indovinato

import random


numerivincenti=[]
controllodoppioni=[]

for i in range(6):
    numcas=random.randint(1,91)
    numerivincenti.append(numcas)
    controllodoppioni.append(numcas) 
    numerivincenti.sort()

for i in numerivincenti:
    for j in controllodoppioni:
        if i==j:
            numerivincenti.remove(i)
            numerivincenti.append(numcas)

print("vediamo se hai fortuna alla lotteria scegli 6 numeri da 1 a 90")

numut=[]

for i in range(6):
    sceltaut=int(input("dammi il numero : "))
    numut.append(int(sceltaut))
    if sceltaut<1 or sceltaut>90:
        print("il numero non è valido, riprova")
        i-=1

for i in numut:
    if i==numut[i+1] or i==numut[i+2] or i==numut[i+3] or i==numut[i+4] or i==numut[i+5]:
        print("c'è un doppione")
        i=int(input("dammi un altro numero : "))    

condizionivittoria=0

for i in numerivincenti:
    for j in numut:
        if i==j:
            condizionivittoria+=1
            
if condizionivittoria==0:
    print("non hai indovinato nessuno dei numeri, sei scarso")
elif condizionivittoria==1:
    print("hai indovinato un numero, sei fortunatino, hai vinto un caffè")
elif condizionivittoria==2:
    print("hai indovinato due numeri, sei molto fortunato, hai vinto due caffè")
elif condizionivittoria==3:
    print("hai indovinato tre numeri, sei molto molto fortunato, hai vinto tre caffè")
elif condizionivittoria==4:
    print("hai indovinato quattro numeri, sei molto molto molto fortunato, hai vinto quattro caffè")
elif condizionivittoria==5:
    print("hai indovinato cinque numeri, sei molto molto molto molto fortunato, hai vinto cinque caffè")
elif condizionivittoria==6:
    print("hai indovinato sei numeri, sei molto molto molto molto molto fortunato, hai vinto una casa e una pizza gratis")






# ordinazione pizzeria , pizza small 5€ , medium 7€ , large 10€ , scelta di mozzarella bufala 2€ per smalle  med  e +3 per large scelta ingredienti +1€ a ingrediente , consegna a casa si - no + 2 euro gratis per large totale prezzo

# prezzos = 5
# prezzom = 7
# prezzol = 10
# mozzbuf = 2
# mozzbufl = 3
# toppings = 1
# consegna = 2

# totale=0

# print("pronto pizzeria jamme'ja, cosa vuole ordinare?")

# scelta=input("pizza small, medium o large? : ")

# if scelta=="small":
#     totale +=prezzos
#     buf=input("vuole la nostra mozzarella di bufala sopra la pizza ? risponda si o no :")
#     if buf == "si":
#         totale += mozzbuf
#         extra = input("vuole altro sopra la pizza ? risponda si o no :")
#     else:
#         extra = input("vuole altro sopra la pizza ? risponda si o no :")
#     if extra == "si":
#         while extra != "":
#             totale += toppings
#             extra = input("vuole altro sopra la pizza? se non vuole nient'altro non aggiunga niente :")
# elif scelta=="medium " or "media":
#     totale +=prezzom
#     buf=input("vuole la nostra mozzarella di bufala sopra la pizza ? risponda si o no :")
#     if buf == "si":
#         totale += mozzbuf
#         extra = input("vuole altro sopra la pizza ? risponda si o no :")
#     else:
#         extra = input("vuole altro sopra la pizza ? risponda si o no :")
#     if extra == "si":
#         while extra != "":
#             totale += toppings
#             extra = input("vuole altro sopra la pizza? se non vuole nient'altro non aggiunga niente :")
# elif scelta=="large":   
#     totale +=prezzom
#     buf=input("vuole la nostra mozzarella di bufala sopra la pizza ? risponda si o no :")
#     if buf == "si":
#         totale += mozzbuf
#         extra = input("vuole altro sopra la pizza ? risponda si o no :")
#     else:
#         extra = input("vuole altro sopra la pizza ? risponda si o no :")
#     if extra == "si":
#         while extra != "":
#             totale += toppings
#             extra = input("vuole altro sopra la pizza? se non vuole nient'altro non aggiunga niente :")

# ordcasa=input("vuole la consegna a casa? se prende una large è gratis altrimenti sono 2 euro in più : ")
# if ordcasa == "si" and scelta != "large":
#     totale += consegna
#     print ("l'ordine le sarà cosegnato a casa , buon appetito il totale è " + str(totale))
# elif scelta=="large":
#     print ("l'ordine le sarà cosegnato a casa , buon appetito il totale è " + str(totale))
# else:
#     print("la aspettiamo in negozio , il totale è : " + str(totale))





