import javax.naming.Binding

FirstClass user = new FirstClass(10, "linh")
    println (user)

    println("---Task2----")
groovy.lang.Binding binding = new groovy.lang.Binding()
binding.setVariable("id", 34)
binding.setVariable("nickname", "new nickname")
user.fromBinding(binding)
println user
println ("Task3")
String a ="abc"
Integer b = 234
println a instanceof  String
println a instanceof  Integer
println b instanceof Integer

println user.sum(20,49)

