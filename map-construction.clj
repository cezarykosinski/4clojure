;Write a function which takes a vector of keys and a vector of values and constructs a map from them.
;(= (__ [:a :b :c] [1 2 3]) {:a 1, :b 2, :c 3})
;(= (__ [1 2 3 4] ["one" "two" "three"]) {1 "one", 2 "two", 3 "three"})
;(= (__ [:foo :bar] ["foo" "bar" "baz"]) {:foo "foo", :bar "bar"})
;Special Restrictions
;zipmap
#(reduce conj (map hash-map %1 %2))
