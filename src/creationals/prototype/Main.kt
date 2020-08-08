package creationals.prototype

fun main(args: Array<String>) {
    val mail = Email("abc@example.com", "Hello", "Don't know what to write.")

    val copy = mail.copy(recipient = "other@example.com")

    println("Email1 goes to " + mail.recipient + " with subject " + mail.subject)
    println("Email2 goes to " + copy.recipient + " with subject " + copy.subject)
}