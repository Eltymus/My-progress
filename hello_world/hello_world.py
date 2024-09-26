# hw="hello world"
# #casting into array hello world
# list_hello_world=list(hw)

# print(list_hello_world)



# nome = input("dimmi il tuo nome : ")
# print("benvenuto "+ nome)

# numlen=len(nome)

# print("il tuo nome ha : " + str(numlen)+ " lettere")
def calcolare_area_rettangolo():

    b=input("dammi la base del tuo rettangolo ＼(ﾟ ｰﾟ＼) : ")
    h=input("dammi l'altezza del tuo rettangolo ( ノ ^o^)ノ : ")

    if h>b :
        print("l'altezza non può essere maggiore della base ༼ಠ ل ಠ༽")
        calcolare_area_rettangolo()


    area=int(b)*int(h)

    print("prem invio e calcolerò l'area del tuo rettangolo")
    input("\t \t \t ᕙ(⇀‸↼‶)ᕗ")

    print("l'area del tuo rettangolo è : (づ ◕‿◕ )づ" + str(area))

calcolare_area_rettangolo()