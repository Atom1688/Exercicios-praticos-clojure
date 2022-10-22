;;RAFAEL BAUER SAMPAIO

;; 1. Na aula disponível em: https://replit.com/@frankalcantara/ClojureAula2?v=1 foram destacadas diversas funções (expressões), como funções de primeira ordem, disponíveis em Clojure. Sua primeira tarefa será descrever cada uma destas funções e apresentar dois exemplos de uso de cada uma delas. Lembre-se os exemplos precisam ser utilizados de forma que o resutado da função possa ser visto no terminal.
;; into

;;assoc
(println "assoc - 'associa', insere um dado valor em uma dada chave")
(println "Exemplo de assoc 1: 
         {:chave1 'valor1' :chave2 'chave2'} :chave3 'valor3' ->"
       (assoc {:chave1 "valor1" :chave2 "chave2"} :chave3 "valor3"))
(println "Exemplo de assoc 2:
         {:chave1 'valor1' :chave2 'chave2' :chave3 'valor3'} :chave1 'novoValor1' ->"
       (assoc {:chave1 "valor1" :chave2 "chave2" :chave3 "valor3"} :chave1 "novoValor1"))
(println " ")

;;dissoc
(println "dissoc - 'dissocia', remove uma dada chave e seu respectivo valor")
(println "Exemplo de dissoc 1:
         {:chave1 'valor1' :chave2 'chave2'} :chave2 ->"
       (dissoc {:chave1 "valor1" :chave2 "chave2"} :chave2))
(println "Exemplo de dissoc 2:
         {:chave1 'valor1' :chave2 'chave2' :chave3 'valo3'} :chave1 ->"
       (dissoc {:chave1 "valor1" :chave2 "chave2" :chave3 "valor3"} :chave1))
(println " ")

;;range
(println "range - retorna uma sequencia de inteiros de n tamanho iniciando em 0 por padrao. Tambem aceita 'inicio', 'fim', e 'tamanho do passo'")
(println "Exemplo de range 1: range(10) ->"
         (range 10))
(println "Exemplor de range 2: range(0 51 5)"
         (range 0 51 5))
(println " ")

;;map
(println "map - aplica uma funcao em um dado conjunto de valores")
(println "Exemplo de map 1: map + [1 2 3] [3 2 1] ->"
         (map + [1 2 3] [3 2 1]))
(println "Exemplo de map 2: map * [2 2 2] [5 6 7] ->"
         (map * [2 2 2] [5 6 7]))
(println " ")

;;inc
(println "inc - soma 1 ao valor dado")
(println "Exemplo de inc 1: inc 5 ->"
         (inc 5))
(println "Exemplo de inc 2: inc -5 ->"
         (inc -5))
(println " ")

;;filter
(println "filter - retorna uma sequencia com os valores que cumprem com uma dada condicao")
(println "Exemplo de filter 1: filter even? [1 2 3 4 5 6 7 8 9 10] ->"
         (filter even? [1 2 3 4 5 6 7 8 9 10]))
(println "Exemplo de filter 2: filter string? [1 2 'tres' 4 'cinco'] ->"
         (filter string? [1 2 "tres" 4 "cinco"]))
(println " ")

;;odd
(println "odd - retorna true se o valor for impar")
(println "Exemplo de odd 1: odd? 5 ->"
         (odd? 5))
(println "Exemplo de odd 2: odd? 4 ->"
         (odd? 4))
(println " ")

;;into
(println "into - retorna uma lista do tipo dado com os elementos dados")
(println "Exemplo de into 1: into [] '(3 4 5) ->"
         (into [] '(3 4 5)))
(println "Exemplo de into 2: into () '(7 8 9) ->"
         (into () '(7 8 9)))
(println " ")

;;nth
(println "nth - retorna o valor armazenado no dado indice em uma lista")
(println "Exemplo de nth 1: nth [0 1 2 3 4 5] 2 ->"
         (nth [0 1 2 3 4 5] 2))
(println "Exemplo de nth 2: nth ['a' 'b' 'c' 'd'] 1 ->"
         (nth ["a" "b" "c" "d"] 1))
(println " ")

;;conj
(println "conj - 'conjoin', adiciona o(s) dado elemento(s) na dada lista")
(println "Exemplo de conj 1: conj [1 2 3] 4 ->"
         (conj [1 2 3] 4))
(println "Exemplo de conj 2: conj [1 2 3] [4 5 6] 7 ->"
         (conj [1 2 3] [4 5 6] 7))
(println " ")

;;sort
(println "sort - ordena uma lista seguindo um dado criterio")
(println "Exemlo de sort 1: sort [4 2 5 3 6 1] ->"
         (sort [4 2 5 3 6 1]))
(println "Exemplo de sort 2: sort [8 6 9 4 3 6 1 3 88] ->"
         (sort [8 6 9 4 3 6 1 3 88]))
(println " ")

;;partition-by
(println "partition-by - testa uma dada funcao nos elementos de uma lista e divide a mesma cada vez que o resultado do teste for diferente dos resultados anteriores")
(println "Exemplo partition-by 1: partition-by odd? [2 4 3 8 10 1 0 7] ->"
         (partition-by odd? [2 4 3 8 10 1 0 7]))
(println "Exemplo partition-by 2: partition-by identity [1 1 2 2 2 2 3 4 5 5] ->"
         (partition-by identity [1 1 2 2 2 2 3 4 5 5]))
(println " ")

;;empty
(println "empty - retorna o mesmo tipo de sequencia dada porém vazia")
(println "empty? - retorna true se a lista dada for vazia")
(println "Exemplo empty 1: empty [1 2 3] ->"
         (empty [1 2 3]))
(println "Exemplo de empty 2: empty? [1 2 3] ->"
         (empty? [1 2 3]))
(println " ")

;;count
(println "count - retorna o numero de itens da dada lista")
(println "Exemplo de count 1: count [1 2 3 4 5] ->"
         (count [1 2 3 4 5]))
(println "Exemplo de count 2: count 'alegria' ->"
         (count "alegria"))
(println " ")

;;char
(println "char - força para um char")
(println "char? - retorna true se for um char")
(println "Exemplo de char 1: char 18 -> "
         (char 18))
(println "Exemplo de char 2: char? 18 ->"
         (char? 18))
(println " ")
(println " ")

;; 2. Utilizando a linguagem Clojure, crie uma função chamada ehPrimo que receba um inteiro e devolva True caso este inteiro seja verdadeiro e False caso contrário.
(def todosOsNumeros ;;funcao auxiliar
    (cons 1 (lazy-seq (map inc todosOsNumeros))))

(defn divisores ;;funcao auxiliar
    [x]
    (->> todosOsNumeros
        (take-while 
            (fn [i] (<= i x)))
        (filter 
            (fn [i] (zero? (rem x i))))))

(defn ePrimo
  "testa se o numero e primo"
    [x]
    (= [1 x] (divisores x)))

(print "2. É primo, entrada: 37, saida: ")
(println(ePrimo 37))

;; 3. Utilizando a linguagem Clojure, crie uma função chamada fatoresPrimos que receba um inteiro e devolva uma lista dos seus fatores primos. Decomposição em fatores primos é uma tarefa fundamental da aritmética.
(defn fatoresPrimos
  "retorna os fatores primos de x"
  [x]
  (loop [numero x talvez 2 fatores []]
    (cond (= numero 1)
      fatores
      (zero? (mod numero talvez))
      (recur (/ numero talvez) talvez (conj fatores talvez))
      :else
      (recur numero (inc talvez) fatores))))

(print "3. Fatores primos, entrada: 57, saida: ")
(println(fatoresPrimos 57))

;; 4. Utilizando a linguagem Clojure, crie uma função chamada todosPrimos que receba dois valores inteiros e devolve todos os números primos que existam entre estes dois valores.
(defn todosPrimos
  "retorna todos os valores primos entre dois numeros"
  [x y]
  (filter ePrimo (range x (inc y))))

(print "4. Todos primos, entrada: 1 80, saida: ")
(println(todosPrimos 1 80))