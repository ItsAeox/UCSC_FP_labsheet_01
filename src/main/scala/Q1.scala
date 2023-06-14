object area{
    def main(args : Array[String]): Unit = {
        val r = 5;
        val area = Area(r)
        println(s"Area = $area")
    }

    def Area(r : Double): Double = {
        val pi = 3.14
        pi * r * r
    }
}

