object run{
    def main(args : Array [String]) : Unit = {
        val time = easy(4) + tempo(3)
        println(s"Time = $time")
    }

    def easy(distance : Double): Double = {
        val time = 8
        time * distance
    }

    def tempo(distance : Double): Double = {
        val time = 7
        time * distance
    }


}