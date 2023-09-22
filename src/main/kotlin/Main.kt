fun main(args: Array<String>) {
    val year = 1900
    var leap = false

    if (year % 4 == 0) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                leap = true
            }
        } else {
            leap = true
        }
    } else {
        leap = false
    }

    println(if (leap) "$year is a leap year." else "$year is not a leap year.")
}
