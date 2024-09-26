import random;

arr=[3,4,5,5,2];

for i in range(0,len(arr)):
    print(arr[i]*"*")

# 3 bicchieri

bicchieri = [True, False, False];

print("prova a scegliere uno dei 3 bicchieri...")
random.shuffle(bicchieri);
print("bicchiere numero 0 , numero 1 , numero 2");
print (bicchieri);
random.shuffle(bicchieri);
print (bicchieri);
scelta=input("Scegli uno dei 3 bicchieri : ") ;

if scelta==0 and bicchieri[0]==True or scelta==1 and bicchieri[1]==True or scelta==2 and bicchieri[2]==True :
    print("Hai vinto");
else :
    print("Hai perso");


