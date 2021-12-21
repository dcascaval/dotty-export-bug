object api:
  export impl.*

object impl:
  class Bar
  extension (rcv: Bar)
    def foo(a: Int) = ()
    def bar(a: Int, b: Boolean = false) = ()

object Test1:
  import api.*
  val value = (new Bar).bar(0) // Missing argument

object Test2:
  import impl.*
  val value = (new Bar).bar(0) // Works

object Test3:
  import api.*
  val value = (new Bar).foo(0) // Works
