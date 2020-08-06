package creationals.abstractfactory

fun main(args: Array<String>) {
    val channels = FakeChatFactory().getChat().getChannels()
    println(channels)

    for (i in channels.indices){
        println(FakeChatFactory().getChat().getMessages(channels[i].id))
    }
}