package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {


        val a = sadArray.toMutableList()

        for(i in 1 until a.size - 1){
            if (a[i] > a[i+1] + a[i-1]){
                a.removeAt(i)
            }
        }
        return  a.toIntArray()

    }

}
