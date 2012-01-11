;; The sum of the squares of the first ten natural numbers is,
;; 
;; 12 + 22 + ... + 102 = 385
;; The square of the sum of the first ten natural numbers is,
;; 
;; (1 + 2 + ... + 10)2 = 552 = 3025
;; Hence the difference between the sum of the squares of the first 
;; ten natural numbers and the square of the sum is 3025  385 = 2640.
;; 
;; Find the difference between the sum of the squares of the first 
;; one hundred natural numbers and the square of the sum.
(ns euler006)

(defn square [x]
  "Get the Square of x."
  (* x x))

(defn sumOfSquares [n]
  "Get the sum of all squares from 1 to n."
  (reduce + (map square (range 1 (+ n 1)))))
  
(defn squareOfSums [n]
  "Get the square of all sums from 1 to n"
  (square (reduce + (range 1 (+ n 1)))))
  
(defn euler006 [n]
  "Get the difference between the sum of the squares and the square of the sums."
  (- (squareOfSums n) (sumOfSquares n)))