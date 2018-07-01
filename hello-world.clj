;Write a function which returns a personalized greeting.
;(= (__ "Dave") "Hello, Dave!")
;(= (__ "Jenn") "Hello, Jenn!")
;(= (__ "Rhea") "Hello, Rhea!")
(fn [x] (apply str "Hello, " x "!"))
