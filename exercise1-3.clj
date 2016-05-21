(def max2 (fn
	[n1 n2] 
	(if (> n1 n2)
		n1
		n2)))

(def square (fn
	[n]
	(* n n)))

(def sum-of-squares (fn
	[n1 n2]
	(+ (square n1) (square n2))))

(def square-larger (fn 
	[n1 n2 n3]
	(cond
		(= (max2 n1 n3) (max2 n2 n3)) (sum-of-squares (max2 n1 n2) n3)
		(= (max2 n1 n2) (max2 n3 n2)) (sum-of-squares (max2 n1 n3) n2)
		:else (sum-of-squares (max n3 n2) n1))))