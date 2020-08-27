fun renderProductTable(): String {
    return html {
        table {
            tr(getTitleColor()) {
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
            for ((i, p) in products.withIndex()) {
                tr {
                    td(getCellColor(i, i)) { text(p.description) }
                    td(getCellColor(i, i)) { text(p.price) }
                    td(getCellColor(i, i)) { text(p.popularity) }
                }
            }
        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, row: Int) = if ((index + row) % 2 == 0) "#dce4ff" else "#eff2ff"
