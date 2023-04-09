from VendingMachine import *
from VendingMachineBottle import *

from Product import *
from BottleOfWater import *
from WeightingProduct import *


prod1 = BottleOfWater("cola", 100, 500)
prod2 = WeightingProduct("biscuit", 120, 15.5)
products = VendingMachine() 
products.init_product(prod1)
products.init_product(prod2)
print("Все товары в автомате:")
products.print_products()
print()
print("Поиск товара:")
products.get_product("biscuit")