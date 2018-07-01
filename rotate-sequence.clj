;Write a function which can rotate a sequence in either direction.
;(= (__ 2 [1 2 3 4 5]) '(3 4 5 1 2))
;(= (__ -2 [1 2 3 4 5]) '(4 5 1 2 3))
;(= (__ 6 [1 2 3 4 5]) '(2 3 4 5 1))
;(= (__ 1 '(:a :b :c)) '(:b :c :a))
;(= (__ -4 '(:a :b :c)) '(:c :a :b))
(fn [x list] (
              if (> x 0)
              (
              concat 
              (drop (mod x (count list)) list) 
              (take (mod x (count list)) list))
;;              (take (- (- (count list) (mod x (count list))) 1) list)
              (concat 
              (drop (- (count list) (mod (* -1 x) (count list))) list) 
              (take (- (count list) (mod (* -1 x) (count list))) list))))
