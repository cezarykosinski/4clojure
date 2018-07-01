;Given a vector of integers, find the longest consecutive sub-sequence of increasing numbers. If two sub-sequences have the same length, use the one that occurs first. An increasing sub-sequence must have a length of 2 or greater to qualify.
;(= (__ [1 0 1 2 3 0 4 5]) [0 1 2 3])
;(= (__ [5 6 1 3 2 7]) [5 6])
;(= (__ [2 3 3 4 5]) [3 4 5])
;(= (__ [7 6 5 4]) [])
(fn lis [xs]
  (if (empty? xs)
    []
    (loop [max_l [] curr_l [(first xs)] lst (rest xs)]
      (if (empty? lst)
        (if (= (count max_l) 1)
          []
          (reverse (if (< (count max_l) (count curr_l)) 
            curr_l
            max_l)))
        (if (> (first lst) (first curr_l))
          (recur max_l (cons (first lst) curr_l) (rest lst))
          (recur (if (< (count max_l) (count curr_l)) curr_l max_l) [(first lst)] (rest lst)))))))
