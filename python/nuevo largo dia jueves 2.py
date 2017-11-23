def suma(num1,num2):
    resp= num1+num2
    return resp
def resta(num1,num2):
    resp= num1-num2
    return resp
def multiplicacion(num1,num2):
    resp= num1*num2
    return resp
def divisor(num1,num2):
    resp= num1/num2
    return resp
def menu_operacion():
         seguir= "si"
         num1= input("Dime un numero")
         num2= input("Dime otro numero")
         while (seguir== "si"):
            print "Que deseas hacer con los números"
            print "1 sumarlos"
            print "2 restarlos"
            print "3 multiplicarlos"
            print "4 dividirlos" 
            respuesta= input()
            if(respuesta==1):
                print num1, "+", num2, "=", suma(num1,num2)
                if(respuesta==2):        
                    print num1, "-", num2, "=", resta(num1,num2)
                    if(respuesta==3): 
                        print num1, "*", num2, "=", multiplicacion(num1,num2)
                        if(respuesta==4):
                            print num1, "/", num2, "=", division(num1,num2)
menu_operacion()

