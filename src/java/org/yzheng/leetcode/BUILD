java_library(
  dependencies = [], 
)

jvm_app(
  name= 'app',
  basename = 'leetcode-solutions',
  dependencies = [
    ':binary'
  ],
)

jvm_binary(
  name = 'binary',
  basename = 'leetcode-solutions',
  dependencies = [
    ':leetcode'
  ],
  source = 'HelloMain.java',
  main = 'HelloMain',
)
