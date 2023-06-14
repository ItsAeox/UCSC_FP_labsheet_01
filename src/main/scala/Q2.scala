object temp{
    def main(args : Array[String]): Unit = {
        val c = 35
        val f = conv(c)
        println(s"$c c = $f f")
    }

    def conv(c : Double): Double = {
        c * 1.8 + 32
    }
}