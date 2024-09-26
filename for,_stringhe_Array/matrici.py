# dato un nurome dall'utente fare una matrice quadrata (altezza e larghezza uguali)
import math

lato=int(input('dammi un numero :'))

altezza=lato

matrice=[]

while lato > 0 :
    matrice.append(int(lato))
    lato = lato-1

    if lato < 0 :

        print("dammi un valore valido :")
        lato = int(input("scrivi il valore in numeri interi positivi:"))

print(matrice)

lunriga = int(math.sqrt(lato))

riga=[]

while lunriga >= 0 :
    for i in matrice:
        for j in riga:
            riga.append(int(i))
            lunriga = lunriga - 1
        matrice.append(riga)
        
print(matrice)