;Write a function which multiplies two numbers and returns the result as a sequence of its digits.
;(= (__ 1 1) [1])
;(= (__ 99 9) [8 9 1])
;(= (__ 999 99) [9 8 9 0 1])
(fn xyz [a b]
  (let [x (* a b)
        len (count (str x))
        fun (fn f [tmp] (cons (mod tmp 10) (lazy-seq (f (int (/ tmp 10))))))]
  (reverse (take len (fun x)))))
