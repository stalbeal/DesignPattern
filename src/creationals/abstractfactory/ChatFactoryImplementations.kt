package creationals.abstractfactory

class FakeChatFactory: ChatFactory() {
    override fun getChat() = FakeChatImpl()
}
class SDKChatFactory: ChatFactory() {
    override fun getChat() = TODO()
}

