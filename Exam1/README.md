EXAM 1
============

* <b> In class Utils: </b>
  * method 'sort'
###### This is a **utility** method `sort`, that sorts a **copy of the given** `List`, and returns it. 

  * method 'reverse'
###### This is a **utility** method `reverse`, that takes a `List`, **reverses** a copy of it and returns the reversed copy.

  * method 'isMonotonous'
###### This is a **utility** method, that returns **boolean** whenever the `List` given is monotonic.

* <b> In class Logger: </b>
  *A *logger* class is a class that people use when they want something written on the console. Of course, one can always use     `System.out.println()`, but it is a churn, and logger classes tend to offer good methods for writing a little more complicated stuff to the   console. 

 ######  A logger class also has something called `LEVEL`, which is usually an integer. 
`LEVEL` represents the **importance** of the message logged. For instance, `logger.log(3, "something)` means that the priority for message   **"something"** is **3**.

  ###### And when a `LEVEL` is **set to the logger**, the logger **ignores logging calls for higher levels**. 

* <b> In class DateLogger: </b>
  * Extends class Logger but date and time is added to every logged message.
