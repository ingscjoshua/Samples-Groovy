class CalculaFizzBuzz{
    def mapa=[:];
    def calcula(int limite){
       for(int cont=1;cont<=limite;cont++){
         mapa.put(cont, (cont % (3 * 5) == 0) ? "FIZZBUZZ" : 
         (cont % 3 == 0) ? "FIZZ":
         (cont % 5 == 0) ? "BUZZ": "$cont")
       }
    }
}

CalculaFizzBuzz fizzBuzz= new CalculaFizzBuzz()
fizzBuzz.calcula(100)
fizzBuzz.mapa.each { println "recorriendo: $it.key : $it.value" }

