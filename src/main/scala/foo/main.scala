package foo

object api:
  export impl.*

object impl:
  class Bar[T](foo: T)

object Test1:
  import api.*
  val value = Bar(0)

object Test2:
  import impl.*
  val value = Bar(0)
