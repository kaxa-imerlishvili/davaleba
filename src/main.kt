fun main(){

    var a = Point(x = 2F, y = 4F)
    var b = Point(x = 1F, y = 4F)
    println(a)

    a.moveToX(m = 3F)
    println(a)
    a.moveToY(n = 1F)
    println(a)
}

class Point( private var x : Float, private var y : Float){

    override fun toString(): String {
        return "x = $x  y = $y"
    }

    override fun equals(other: Any?): Boolean {
        if(other is Point){
            if(x==other.x && y==other.y){
                return true
            }
        }
        return false
    }

    fun moveToX(m : Float){
        y+=m
    }
    fun moveToY(n : Float){
        x+=n
    }
}