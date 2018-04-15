fun task(): List<Boolean> {
    val isEven: Int.() -> Boolean = { this % 2 == 0 }
    val isOdd: Int.() -> Boolean = { !this.isEven() }

//    fun Int.isEven() = this % 2 == 0
//    fun Int.isOdd() = !this.isEven()

    return listOf(42.isOdd(), 239.isOdd(), 294823098.isEven())
}
