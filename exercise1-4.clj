(def a-plus-abs-b (fn
	[a b]
	((if (> b 0)
		+
		-) a b)))