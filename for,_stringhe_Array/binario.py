# byte = "10000101"

# reversed_byte = byte[::-1]
# print(reversed_byte)

# esponenete = 0

# somma=0
# contatore

# for bit in reversed_byte:
#     print(bit, "x 2 alla ", esponenete)
#     esponenete += 1;

# for bit in reversed_byte:
#     print(int(bit)*2**esponenete)
#     esponenete += 1;
# from functools import reduce

# hw=["Hello","World" ,"in", "a", "frame"]

# print(9*"*")
# for w in hw:
#     print("* ", w +" "*(5-len(w))+ " *")

# print(9*"*")
num=[3,4,5,6,7,8,9,10,11,12,2]

nmin = num[0]

for n in num:
    if nmin > n:
        nmin = n
print("Il numero minimo è:", nmin)
