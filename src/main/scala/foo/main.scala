object api:
  export impl.*

object impl:
  class Foo(a: Int)
  class Bar[T](foo: T)

object Test1:
  import api.*
  val value = new Bar[Int](0) // Not Found: Bar

object Test2:
  import impl.*
  val value = Bar(0) // Works

object Test3:
  import api.*
  val value = Foo(0) // Works
