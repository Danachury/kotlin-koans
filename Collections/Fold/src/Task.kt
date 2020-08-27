// Return the set of products that were ordered by all customers
fun Shop.getProductsOrderedByAll(): Set<Product> {
    val allProducts = customers.flatMap(Customer::getOrderedProducts).toSet()
    val foldOp: (Set<Product>, Customer) -> Set<Product> = { orderedByAll, customer ->
        orderedByAll.intersect(customer.getOrderedProducts())
    }
    return customers
            .fold(allProducts, foldOp)
            .toSet()
}

fun Customer.getOrderedProducts(): List<Product> =
        orders.flatMap(Order::products)