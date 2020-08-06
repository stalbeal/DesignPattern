package creationals.abstractfactory

class FakeChatImpl: Chat {
    override fun getChannels(): List<Channel> {
        return listOf(
            Channel(
                id = 1,
                name = "First Channel",
                users = listOf(
                    User.Self,
                    User.Other("Tom")
                )
            )
        )
    }
    override fun getMessages(channelId: Long): List<Message>{
        return listOf(
            Message(id = 1, text = "Hello"),
            Message(id = 2, text = "How are you?")
        )
    }
}