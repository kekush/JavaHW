class VendingMachine:
    def __init__(self):
        # self._name_mach = name
        self._product_list = []

    def init_product(self, prod):
        self._product_list.append(prod)

    def get_product(self, search):
        for i in range(len(self._product_list)):
            if self._product_list[i].name == search:
                print(self._product_list[i])

    def print_products(self):
        for el in self._product_list:
            print(el)