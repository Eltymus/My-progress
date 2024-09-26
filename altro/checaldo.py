import getpass

# temperatura=int(input("inserisci temperatura :"))

# if temperatura < 15:
#    print("fa freddo")
# elif temperatura >=15 and temperatura < 20:
#    print("prendi una giacca leggera")
# elif temperatura >=20 and temperatura < 27:
#    print("esci tranquillo si sta benissimo vestiti leggeri")
# else:
#    print("raccomando di non uscire fa troppo caldo")

# username = input("scegli il tuo Username :")
# password = getpass.getpass("Scegli la tua password :")

# login = input("quali sono il tuo username e la tua password? :")

# if login == username +" "+ password:
#     print("Accesso riuscito!")
# else:
#     print("Accesso negato!")

# chiedere se un numero input è pari o dispari

numuser=input("Vediamo se il tuo numero è pari o dispari : ")

try:
    numuser = int(numuser)
   
    if int(numuser) % 2 == 0:
        print("il numero è pari")
    else:
        print("il numero è dispari")
except ValueError:
    print("Devi inserire un numero!")


