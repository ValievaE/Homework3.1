fun main() {

    agoToText(12670)

}


fun agoToText(seconds: Int) {

    when (seconds) {
        in 0..60 -> {
            println("только что")
        }
        in 61..3600 -> {
            val minutes = seconds / 60
            print(minutes)
            agoToTextMinutes(minutes)
        }
        in 3601..86400 -> {
            val hours = seconds / 3600
            print(hours)
            agoToTextHours(hours)
        }
        in 86401..172800 -> {
            println("сегодня")
        }
        in 172801..259200 -> {
            println("вчера")
        }
        else -> {
            println("давно")
        }
    }
}

fun agoToTextHours(hours: Int) {
    if (hours.toString().endsWith("1") && !(hours.toString().endsWith("11"))) {
        println(" час назад")
    } else if (hours.toString().endsWith("2")
        || hours.toString().endsWith("3")
        || hours.toString().endsWith("4")
    ) {
        println(" часа назад")
    } else {
        println(" часов назад")
    }
}

fun agoToTextMinutes(minutes: Int) {
    if (minutes.toString().endsWith("1") && !(minutes.toString().endsWith("11"))) {
        println(" минуту назад")
    } else if (minutes.toString().endsWith("2")
        || minutes.toString().endsWith("3")
        || minutes.toString().endsWith("4")
    ) {
        println(" минуты назад")
    } else {
        println(" минут назад")
    }
}

