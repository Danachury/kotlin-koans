class LazyProperty(val initializer: () -> Int) {
    private var value: Int? = null
    val lazy: Int
        get() {
            if (value == null)
                value = initializer.invoke()
            return value!!
        }
}
