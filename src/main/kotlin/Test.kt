import java.sql.Timestamp
import java.time.Instant
import java.time.ZoneId

fun main(args: Array<String>) {

    val test1 = Timestamp(12321323)
        .toLocalDateTime()
        .atZone(ZoneId.systemDefault())
        .withZoneSameInstant(ZoneId.of("UTC")).toLocalDateTime()

    val test2 = Instant.ofEpochMilli(12321323)
        .atZone(ZoneId.systemDefault())
        .withZoneSameInstant(ZoneId.of("UTC")).toLocalDateTime()

    val e = 1
    println(e)
    println(test1)
    println(test2)
}