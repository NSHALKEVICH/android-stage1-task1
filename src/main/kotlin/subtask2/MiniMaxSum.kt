package subtask2

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {

        val input1: IntArray = input


        val sum: Int = input1.sum()
        val minItem: Int = input1.min()!!
        val maxItem: Int = input1.max()!!
        val miniSum = sum - maxItem
        val maxSum = sum - minItem

        val result: IntArray = intArrayOf(miniSum, maxSum)
        return (result)

    }

}