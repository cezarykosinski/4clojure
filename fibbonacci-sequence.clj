;Write a function which returns the first X fibonacci numbers.
;(= (__ 3) '(1 1 2))
;(= (__ 6) '(1 1 2 3 5 8))
;(= (__ 8) '(1 1 2 3 5 8 13 21))
(fn [x] (take x ((fn fib [a b] (cons a (lazy-seq (fib b (+ a b))))) 1 1)))
