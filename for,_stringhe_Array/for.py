# for i in range(11): 
#     print(i)


    # esercizio albero con for

# alb=int(input("grandezza labero: "))

# for i in range(alb):
#     ramo_albero=" +" * i
#     print(ramo_albero.center(20))



# for i in range(11):
#     for j in range(11):
#      print(j*i, end=", ")
#     print(" ")

class bcolors:
    HEADER = '\033[95m'
    OKBLUE = '\033[94m'
    OKCYAN = '\033[96m'
    OKGREEN = '\033[92m'
    WARNING = '\033[93m'
    FAIL = '\033[91m'
    ENDC = '\033[0m'
    BOLD = '\033[1m'
    UNDERLINE = '\033[4m'
     
import os
import time

# class boom:
#     par=list("BOOM")
#     for i in par:
#         print(bcolors.OKBLUE + i)

for i in range(-10, 1):
    if i <= -5 :
        os.system("cls||clear")
        print(bcolors.OKGREEN + str(i) + bcolors.ENDC)
        time.sleep(1)
    elif i > -5:
        os.system("cls||clear")
        print(bcolors.WARNING + str(i) + bcolors.ENDC)
        time.sleep(0.5)
    if i == 0:
        os.system("cls||clear")
        print(bcolors.HEADER + "BOOM" + bcolors.FAIL)
        break
