# Introduction To Java

# Phases Of Java
 - Java Program -> Compile -> Bytecode -> JVM -> Output

# Java IDE
  - Integrated Development Environment
  - Programming environment that packages the basic tools you need to write, test, and debug code.


# Java Codes
- **class** keyword is used to declare a class in Java.
- **public** keyword is an access modifier that represents visibility. It means it is visible to all.
- **static** is a keyword. If we declare any method as static, it is known as a static method. The core advantage of the static method is that there is no need to create an object to invoke the static method. The main method is executed by the JVM, so it doesn't require creating an object to invoke the main method. So it saves memory.
- **void** is the return type of the method. It means it doesn't return any value.
- **main** represents the starting point of the program.
- **String[] args** is used for command line arguments. We will learn it in the next section.
- **System.out.println()** is used to print statement. Here, System is a class, out is an object of PrintStream class, println() is a method of PrintStream class.
- **JVM** *Java Virtual Machine*is the heart of Java programming language. When we run the Java program, it converts the bytecode into machine language.
- **JRE** is an acronym for *Java Runtime Environment*. It is used to provide runtime environment. It is the implementation of JVM. It physically exists. It contains a set of libraries + other files that JVM uses at runtime.
- **JDK** is an acronym for *Java Development Kit*. It is a software development kit used to develop Java applications and applets. It physically exists. It contains JRE + development tools.

# Java Fundamentals
 - *Statements*is one or more lines of code that perform an operation.
 - *Blocks* are a group of statements that are enclosed in curly braces.

## Java Identifiers
 - identifiers are tokens tha represent the names of variables, methods, classes, packages, and 
 interfaces.

## Java Keywords 
 - Keywords are reserved words that have a specific meaning in the Java programming language. These keywords cannot be used as identifiers.

## Java Literals
 - Literals are data used in Java programs. These are constant values that are used in the program.
  - Integer Literals
  - Floating-Point Literals
  - Character Literals
  - String Literals
  - Boolean Literals

## Data Types
  - Data types represent the different values that a variable can store. In Java, data types are classified into two categories:
    1. Primitive Data Types
    2. Non-Primitive Data Types
### Variables 
  - are containers for storing data values.
    1. **Local Variables**: Variables defined inside methods, constructors, or blocks are called local variables.
    2. **Instance Variables**: Variables declared inside the class but outside the method are called instance variables.
    3. **Static Variables**: Variables that are declared as static are called static variables.

