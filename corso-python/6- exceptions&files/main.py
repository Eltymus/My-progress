from macchinacaffe import Macchinetta

macchina = Macchinetta()

macchina.stampa_menu()

try:
    resto=macchina.compra(B15)
    print (resto)
except Exception as error:
    print(error)