package creationals.prototype

data class Email(var recipient: String, var subject: String?, var message: String?) {
    fun quote(startIndex: Int) : String {
        return "> ${message?.substring(startIndex)}"
    }
}