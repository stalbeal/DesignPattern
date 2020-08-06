package creationals.abstractfactory

sealed class User {
    object Self: User()
    class Other(val name: String): User()
}