;; 2520 is the smallest number that can be divided by each 
;; of the numbers from 1 to 10 without any remainder.
;; 
;; What is the smallest positive number that is evenly 
;; divisible by all of the numbers from 1 to 20?
(ns euler005)

(defn gcd
  "Computes the greatest common divisor of a and b."
  [a b]
  (if (zero? b)
    a
    (recur b (mod a b))))
  
(defn lcm
  "Computes the least common mulitiple of a and b."
  [a b]
  (/ (* a b) (gcd a b)))
  
(defn euler005
  "Computes the smallest positive number that is evenly divisible 
  by all of the numbers from a to b"
  [a b]
  (reduce lcm (range from to)))