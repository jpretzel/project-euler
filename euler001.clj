;; If we list all the natural numbers below 10 that are 
;; multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of 
;; these multiples is 23.
;; 
;; Find the sum of all the multiples of 3 or 5 below 1000.
(ns euler001)

(defn divides? [a b]
  "Can a be divides by b evenly?"
  (zero? (rem a b)))

(defn euler001 [n]
  "Get the sum of all natural numbers below n, that are multiples of 3 or 5."
  (reduce + 
    (filter (fn [e] (or (divides? e 3) (divides? e 5))) (range n))))