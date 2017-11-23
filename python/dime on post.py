def dime_ont_post():
    numero= input("dime un numero:")
    for cont in range(numero-3,numero,1):
        print cont,
    for cont in range(numero+1,numero+4,1):
        print cont,
dime_ont_post()
