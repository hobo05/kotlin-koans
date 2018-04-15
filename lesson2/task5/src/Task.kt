import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

enum class TimeInterval { DAY, WEEK, YEAR }

data class RepeatedTimeInterval(val timeInterval: TimeInterval, val times: Int)

operator fun TimeInterval.times(times: Int): RepeatedTimeInterval = RepeatedTimeInterval(this, times)

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = addTimeIntervals(timeInterval, 1)

operator fun MyDate.plus(rti: RepeatedTimeInterval): MyDate = addTimeIntervals(rti.timeInterval, rti.times)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
