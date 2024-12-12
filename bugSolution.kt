fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val copyList = list.toList().toMutableList() //creating a copy
    copyList.removeIf { it % 2 == 0 }
    println(copyList)
}