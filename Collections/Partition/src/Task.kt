// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrders(): Set<Customer> =
        customers
            .partition { it -> it.orders.any { !it.isDelivered } }
            .first
            .toSet()
