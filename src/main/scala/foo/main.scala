package foo

object api:
  export impl.*

object impl:
  class Bar
  extension (rcv: Bar) def bar(a: Int, b: Boolean = false) = ()

object Test1:
  import api.*
  val value = (new Bar).bar(0)

object Test2:
  import impl.*
  val value = (new Bar).bar(0)
