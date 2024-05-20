# Introduction to Java

## Java Operators
 - Operators are special symbols that perform specific operations on one, two, or three operands, and then return a result.
 
 | Operator Type | Category       | Precedence         |
|---------------|----------------|--------------------|
| Unary         | Postfix        | `expr++` `expr--`  |
|               | Prefix         | `++expr` `--expr` `+expr` `-expr` `~` `!` |
| Arithmetic    | Multiplicative | `*` `/` `%`        |
|               | Additive       | `+` `-`            |
| Shift         | Shift          | `<<` `>>` `>>>`    |
| Relational    | Comparison     | `<` `>` `<=` `>=` `instanceof` |
|               | Equality       | `==` `!=`          |
| Bitwise       | AND            | `&`                |
|               | Exclusive OR   | `^`                |
|               | Inclusive OR   | `|`                |
| Logical       | AND            | `&&`               |
|               | OR             | `||`               |
| Ternary       | Ternary        | `? :`              |
| Assignment    | Assignment     | `=` `+=` `-=` `*=` `/=` `%=` `&=` `^=` `|=` `<<=` `>>=` `>>>=` |

### Java Unary Operators
 - Unary operators require only one operand. Unary operators are used to perform various operations i.e., incrementing/decrementing a value by one, negating an expression, or inverting the value of a boolean.


| Operator Type | Category       | Precedence         | Description                                                                 |
|---------------|----------------|--------------------|-----------------------------------------------------------------------------|
| Unary         | Postfix        | `expr++` `expr--`  | `val = a++;` Store the value of `a` in `val` then increments.<br>`val = a--;` Store the value of `a` in `val` then decrements. |
|               | Prefix         | `++expr` `--expr` `+expr` `-expr` `~` `!` | `val = ++a;` Increments `a` then store the new value of `a` in `val`.<br>`val = --a;` Decrements `a` then store the new value of `a` in `val`. |
| Arithmetic    | Multiplicative | `*` `/` `%`        |                                                                             |
|               | Additive       | `+` `-`            |                                                                             |
| Shift         | Shift          | `<<` `>>` `>>>`    |                                                                             |
| Relational    | Comparison     | `<` `>` `<=` `>=` `instanceof` |                                                                |
|               | Equality       | `==` `!=`          |                                                                             |
| Bitwise       | AND            | `&`                |                                                                             |
|               | Exclusive OR   | `^`                |                                                                             |
|               | Inclusive OR   | `|`                |                                                                             |
| Logical       | AND            | `&&`               |                                                                             |
|               | OR             | `||`               |                                                                             |
| Ternary       | Ternary        | `? :`              |                                                                             |
| Assignment    | Assignment     | `=` `+=` `-=` `*=` `/=` `%=` `&=` `^=` `|=` `<<=` `>>=` `>>>=` |                                          |

### Java Arithmetic Operators
 - Arithmetic operators are used to perform the basic mathematical operations between two operands.

| Operator | Description | Example |
|----------|-------------|---------|
| `+`      | Addition    | `a + b` |
| `-`      | Subtraction | `a - b` |
| `*`      | Multiplication | `a * b` |
| `/`      | Division    | `a / b` |
| `%`      | Modulus     | `a % b` |


### Java Left Shift Operator
 - The left shift operator shifts the bits of the number to the left by a specified number of bits.
 - The left operand's value is moved left by the number of bits specified by the right operand.
 - The left shift operator is denoted by `<<`.
 - The left shift operator is used to multiply a number by 2.
 - The general syntax of the left shift operator is `a << b`, where `a` is the number to be shifted left, and `b` is the number of positions to shift the bits.
### Java Right Shift Operator
 - The right shift operator shifts the bits of the number to the right by a specified number of bits.
 - The right operand's value is moved right by the number of bits specified by the right operand.
 - The right shift operator is denoted by `>>`.
 - The right shift operator is used to divide a number by 2.
 - The general syntax of the right shift operator is `a >> b`, where `a` is the number to be shifted right, and `b` is the number of positions to shift the bits.

### Java Bitwise Operator
- Bitwise operators are used to perform operations on individual bits of a number.
- The bitwise operators are used to perform bit-level operations on the binary representation of the operands.

| Operator | Description | Example |
|----------|-------------|---------|
| `&`      | Bitwise AND | `a & b` |
| `\`      | Bitwise OR  | `a \ b` |
| `^`      | Bitwise XOR | `a ^ b` |
| `~`      | Bitwise Complement | `~a` |
| `<<`     | Left Shift  | `a << b` |
| `>>`     | Right Shift | `a >> b` |

### Java Ternary Operator
 - The ternary operator is a conditional operator that evaluates a boolean expression and returns one of the two expressions based on the result of the evaluation.
### Java Assignment Operator
 - The assignment operator is used to assign a value to a variable.
 - The assignment operator is denoted by `=`.
 - The general syntax of the assignment operator is `variable = value`, where `variable` is the name of the variable, and `value` is the value to be assigned to the variable.

### Java Relational Operator
 - Relational operators are used to compare two values and determine the relationship between them.

| Operator | Description | Example |
|----------|-------------|---------|
| `==`     | Equal to    | `a == b` |
| `!=`     | Not equal to | `a != b` |
| `>`      | Greater than | `a > b` |
| `<`      | Less than   | `a < b` |
| `>=`     | Greater than or equal to | `a >= b` |
| `<=`     | Less than or equal to | `a <= b` |

### Java Logical Operator
 - Logical operators are used to perform logical operations on boolean values.
 - The logical operators are used to combine two or more boolean expressions and determine the truth value of the combined expression.

| Operator | Description | Example |
|----------|-------------|---------|
| `&&`     | Logical AND | `a && b` |
| `||`     | Logical OR  | `a || b` |
| `!`      | Logical NOT | `!a` |