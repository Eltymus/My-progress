from ladro import Ladro
from mostro import Mostro

miopg = Ladro("Marco", 20 , 20 , 20 ,11 )

mioMostro = Mostro("Goblin",10)
print (mioMostro.nome)

mio_mostro2= Mostro("Mummia",22);
mio_mostro2.ruggisci()

danni = miopg.attacco()
mioMostro.ferisci(danni)