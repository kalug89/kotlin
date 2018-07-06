
    interface math{
        fun sum(a:Int, b:Int):Int
        fun div(a:Int, b:Int):Int
        fun mul(A:Int, B:Int):Int

    }

    class person:math{
        override fun sum(a: Int, b: Int): Int {
            return a/b
        }

        override fun div(a: Int, b: Int): Int {
            return a+b
        }

        override fun mul(A: Int, B: Int): Int {
            return A*B
        }

    }


    class user:math{
        override fun sum(a: Int, b: Int): Int {
            return a+b
        }

        override fun div(a: Int, b: Int): Int {
            return a/b
        }

        override fun mul(A: Int, B: Int): Int {
            return A*B
        }

    }