package foo.b

import foo.a.api.*

object Test1:
  val value = Bar(0)

object Test2:
  import foo.a.impl.*
  val value = Bar(0)
