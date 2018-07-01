;Write a function which takes a string and returns a new string containing only the capital letters.
;(= (__ "HeLlO, WoRlD!") "HLOWRD")
;(empty? (__ "nothing"))
;(= (__ "$#A(*&987Zf") "AZ")
(fn [x] (apply str (concat (re-seq #"[A-Z]+" x))))
