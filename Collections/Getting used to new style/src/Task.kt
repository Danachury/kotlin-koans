fun doSomethingWithCollection(collection: Collection<String>): Collection<String>? {

    val groupsByLength = collection.groupBy(String::length)

    val maximumSizeOfGroup = groupsByLength.values.map(List<String>::size).max()

    return groupsByLength.values.firstOrNull { group -> group.size == maximumSizeOfGroup }
}
