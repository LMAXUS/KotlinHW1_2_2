fun main(){
    val likes: Int = 0
    if(likes==1) println("Лайк поставил $likes человек")
    else if(likes%100 !in 12..14 && likes%10 in 2..4) println("Лайки поставили $likes человека")
    else println("Лайки поставили $likes человек")
}