(define (max n1 n2)
	(if (> n1 n2)
		n1
		n2))

(define (square n)
	(* n n))

(define (sum-of-squares n1 n2)
	(+ (square n1) (square n2)))

(define (square-larger n1 n2 n3)
	(cond ((= (max n1 n3) (max n2 n3)) (sum-of-squares (max n1 n2) n3))
		  ((= (max n1 n2) (max n3 n2)) (sum-of-squares (max n1 n3) n2))
		  (else (sum-of-squares (max n2 n3) n1))))