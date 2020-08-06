package creationals.abstractfactory

interface Chat {
    fun getChannels(): List<Channel>
    fun getMessages(channelId: Long): List<Message>
}