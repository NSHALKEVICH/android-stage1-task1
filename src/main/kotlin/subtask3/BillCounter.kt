package subtask3

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {

        val bill1: IntArray = bill
        val k1: Int = k
        val b1: Int = b
        //val fairlySplit: String = "bon appetit"

        val billA: Int = bill1.sum() - bill1[k1]
        val billA2: Int = billA/2
        val overPaid: Int = b1 - billA2

        if (b1 != billA2) return (overPaid.toString())
        return ("bon appetit")
    }

}
