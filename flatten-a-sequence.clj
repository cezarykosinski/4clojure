;Write a function which flattens a sequence.
;(= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))
;(= (__ ["a" ["b"] "c"]) '("a" "b" "c"))
;(= (__ '((((:a))))) '(:a))
(fn f [a]
  (loop [l a acc []]
    (if (empty? l)
      acc
      (if (coll? (first l))
        (recur (rest l) (apply conj acc (f (first l))))
        (recur (rest l) (conj acc (first l)))))))
