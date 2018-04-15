fun renderProductTable(): String {
    return html {
        table {
            tr (getTitleColor()){
                td {
                    text("Product")
                }
                td {
                    text("Price")
                }
                td {
                    text("Popularity")
                }
            }
            val products = getProducts()
            for ((index, product) in products.withIndex()) {
                var row = 0
                tr {
                    tdColored(index, row++) {
                        text(product.description)
                    }
                    tdColored(index, row++) {
                        text(product.price)
                    }
                    tdColored(index, row++) {
                        text(product.popularity)
                    }
                }
            }
        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, row: Int) = if ((index + row) %2 == 0) "#dce4ff" else "#eff2ff"

fun TR.tdColored(index: Int, row: Int, align : String = "left", init : TD.() -> Unit)
        = doInit(TD(), init)
        .set("align", align)
        .set("bgcolor", getCellColor(index, row))
