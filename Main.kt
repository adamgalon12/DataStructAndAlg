import utils.example
import utils.linkedlist.LinkedList

fun main() {
    /*    println("hello")
        println(measureTimeMillis { sumFromOne(999999999) })
        println(measureTimeMillis { sumFromOne2(999999999) })
        println(measureTimeMillis { sumFromOne3(999999999) })
        println(printSorted(listOf(1, 33, 75, 46, 24, 1, 567, 362, 54, 4)))*/
    /*    "creating and linking nodes" example {
            val node1 = Node(value = 1)
            val node2 = Node(value = 2)
            val node3 = Node(value = 3)

            node1.next = node2
            node2.next = node3
            println(node1)
        }*/
    /*    "fluent interface push" example {
            val list = LinkedList<Int>()

            list.push(1).push(2).push(3)

            println(list)

        }*/
    /*
        "Append" example {
            val list2 = LinkedList<Int>()
            list2.append(12).append(34).append(56)
            list2.append(98)
            list2.append(54)
            list2.append(87)

            println(list2)
            println(list2.isEmpty())

        }*/
    /*"Append String " example {
        val list = LinkedList<String>()
        list.append("ahahah").append("abbabab").append("nanan")

        println(list)
    }
   */
    /*
        "inserting at a particular index" example {
            val list = LinkedList<Int>()
            list.push(1)
            list.push(2)
            list.push(3)

            println("Before inserting: $list")
            var middleNode = list.nodeAt(0)!!
            for (i in 1..3) {
                middleNode = list.insert(-1 * i, middleNode)
            }
            println("After inserting: $list")
        }*/
    /*    "pop" example {
            val list = LinkedList<Int>()
            list.push(3)
            list.push(2)
            list.push(1)

            println("Before popping list: $list")
            val poppedValue = list.pop()
            println("After popping list: $list")
            println("Popped value: $poppedValue")
        }*/
    /*    "removing the last node" example {
            val list = LinkedList<Int>()
            list.push(3)
            list.push(2)
            list.push(1)

            println("Before removing last node: $list")
            val removedValue = list.removeLast()

            println("After removing last node: $list")
            println("Removed value: $removedValue")
        }*/
    /*    "removing a node after a particular node" example {
            val list = LinkedList<Int>()
            list.push(3)
            list.push(2)
            list.push(1)

            println("Before removing at particular index: $list")
            val index = 2
            //TODO:?
            val node = list.nodeAt(index - 1)!!
            val removedValue = list.removeAfter(node)

            println("After removing at index $index: $list")
            println("Removed value: $removedValue")
        }*/

    "printing doubles" example {
        val list = LinkedList<Int>()
        list.push(3)
        list.push(2)
        list.push(1)
        println(list)

        for (item in list) {
            println("Double: ${item * 2}")
        }
    }

}


fun pseudoBinaryContains(value: Int, numbers: List<Int>): Boolean {
    if (numbers.isEmpty()) return false

    val middleIndex = numbers.size / 2

    if (value <= numbers[middleIndex]) {
        for (index in 0..middleIndex) {
            if (numbers[index] == value) {
                return true
            }
        }
    } else {
        for (index in middleIndex until numbers.size) {
            if (numbers[index] == value) {
                return true
            }
        }
    }
    return false
}

fun sumFromOne(n: Int): Int {
    var result = 0
    for (i in 1..n) {
        result += i
    }
    return result
}

fun sumFromOne2(n: Int): Int {
    return (1..n).reduce { sum, element -> sum + element }
}

fun sumFromOne3(n: Int): Int {
    return n * (n + 1) / 2

}

fun printSorted(numbers: List<Int>) {
    if (numbers.isEmpty()) return

    var currentCount = 0
    var minValue = Int.MIN_VALUE

    for (value in numbers) {
        if (value == minValue) {
            println(value)
            currentCount += 1
        }
    }

    while (currentCount < numbers.size) {
        var currentValue = numbers.maxOrNull()!!

        for (value in numbers) {
            if (value < currentValue && value > minValue) {
                currentValue = value
            }
        }

        for (value in numbers) {
            if (value == currentValue) {
                println(value)
                currentCount += 1
            }
        }

        minValue = currentValue
    }
}