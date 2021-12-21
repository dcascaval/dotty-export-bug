package foo.b

import foo.a.api.*

object Test1:
  val value = (new Bar).bar(0)

object Test2:
  import foo.a.impl.*
  val value = (new Bar).bar(0)
