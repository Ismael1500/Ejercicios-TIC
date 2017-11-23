def sumadedigitos():
    numero= input ("dime un numero")
    suma=0
    n_pares=0
    n_impares=0
    while numero>0:
        cifra=numero%10
        if cifra%2==0:
            n_pares=n_pares+1
        if cifra%2==1:
            n_impares=n_impares+1
        numero=numero/10
    print "tiene",n_pares,"par y tiene",n_impares,"impar "
sumadedigitos()

    
    
    
