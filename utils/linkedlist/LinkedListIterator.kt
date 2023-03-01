package utils.linkedlist

class LinkedListIterator<T : Any>(private val list: List<T>) : Iterator<T> {
    private val index = 0
    override fun hasNext(): Boolean {
        return index < list.size
    }

    override fun next(): T {
        TODO("Not yet implemented")
    }
}