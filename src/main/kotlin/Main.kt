fun foo() : String {
    println("Calculating foo...")
    return "foo"
}

fun main() {
    println("First ${foo()}, second ${foo()}")
}