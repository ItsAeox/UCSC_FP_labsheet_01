object price{
    def main(args : Array[String]): Unit = {
        val copies = 60
        println("Total price = " + bookPrice(copies) )
    }

    def bookPrice(num : Int): Double =
    {
        disc(num) + ship(num)
    }

    def disc(num : Int): Double =
    {
        val price = 24.95
        num*price*0.6
    }

    def ship(num : Int): Double = {
        if (num <= 50) 
            {
                3
            }
        else 
            {
                3 + (num-50)*0.75
            }
    }
}