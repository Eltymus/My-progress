import random

# random.seed(42)

# scelta=input("testa o croce :")

# tiro= random.randint(0,2)

# if tiro==1:
#     print("pc : testa")
# else:
#     print("pc : croce")

# if (scelta=="testa" and tiro==1) and (scelta=="croce" and tiro==0): 
#     print("hai vinto")
# elif scelta != "testa" and scelta != "croce":
#     print("scegli un valore valido")
# else: 
#     print("hai perso")

# numerouna = input("scrivi un numero e te lo strasformo in unario : ")

# i=0
# unario=""
# while i<int(numerouna):
#     unario +="1"
#     i+=1
# print(unario)

# per 1000 volte sommo alla variabile somma un numero tra uno e 20  compresi
# divido la somma per il numero 1000
# ottengo il valore atteso(media) di un lancio di dado da 20

# somma=0

# i=0

# while i<1000 :
#     tiro= random.randint(0,21)
#     somma = somma + tiro
#     i+=1
# print(somma)

# media = somma / 1000

# print(media)


# fai la stessa cosa con 2 dadi da 6

# somma=0

# i=0

# while i<2 :
#     tiro= random.randint(0,6)
#     somma = somma + tiro
#     i+=1
# print(somma)

# media = somma / 2

# print(media)

# esercizio albero di natale

# numerouna = input("scrivi un numero e te lo strasformo in albero di natale : ")

# count = 1
# width = 20

# for i in range(int(numerouna)):
#     print(("-*-"*count).center(width))
#     count += 1

# print(("*").center(width))

# password1=random.randint(0,999)

# okpass=False


# while okpass==False :
#     passwordbf=random.randint(0,999)
#     # genero password e la trasformo in stringa
#     if passwordbf != password1 :
#         print("brute :" + str(passwordbf))
#         print(password1)
#         # print("password incorretta")
#     else: 
        
#         print("brute :" + str(passwordbf))
#         print(password1)
#         print("password corretta")
#         okpass=True

# risp=""

# stop=False


# while stop==False:

#     risp=input("scrivi si o no : ")
#     print("Questa risposta non è valida , riscrivine un altra")

#     if risp=="no"or risp=="si" :
        
#         print("bravo , hai rovinato tutto")
#         stop=True


# esercizio acqua fuoco più vicino sei a un numero casuale
    
caso=random.randint(0,101)

print(caso)

guess=0

while guess!=caso:
    guess=int(input("indovina il numero , prova quanto vuoi: "))

    if guess < (caso-15) or guess > (caso+15):

        print("Acqua")

    elif (guess > (caso-15)and guess < (caso-1)) or (guess < (caso+15) and guess > (caso+1)):

        print("Fuoco")

    elif guess == caso:
        
        print("Hai indovinato!")

    else:
        
        print("metti un valore valido")

print("gouddo giobbo")