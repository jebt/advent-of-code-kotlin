fun main() {
    fun part1(input: List<String>): Int {
        val inputValues = input.map { it.toInt() }
        var increaseCount = 0
        inputValues.forEachIndexed { index, int ->
            if (index == 0) {
                return@forEachIndexed
            } else {
                if (int > inputValues[index - 1]) {
                    increaseCount++
                }
            }
        }
        return increaseCount
    }

    fun part2(input: List<String>): Int {
        val inputValues = input.map { it.toInt() }
        var increaseCount = 0
        inputValues.forEachIndexed { index, int ->
            if (index < 3) {
                return@forEachIndexed
            } else {
                if (int + inputValues[index-1] + inputValues[index-2] > inputValues[index-1] +
                            inputValues[index-2] + inputValues[index-3]) {
                    increaseCount++
                }
            }
        }
        return increaseCount
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 7)
    check(part2(testInput) == 5)

    val input = readInput("Day01")
    println(part1(input)) // 1754
    println(part2(input)) // 1789
}
