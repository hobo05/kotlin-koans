class PropertyExample() {
    var counter = 0
    var propertyWithCounter: Int? = null
        set(property) {
            field = property
            counter++
        }
}
