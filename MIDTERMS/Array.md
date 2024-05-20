# Java Array
 - Array is a collection of similar type of elements that have a contiguous memory location.

## Advantages of Array

 - Code Optimization: It makes the code optimized, we can retrieve or sort the data easily.
 - Random access: We can get any data located at an index position.

## Disadvantages of Array

 - Size Limit: We can store only a fixed size of elements in the array. It doesn't grow its size at runtime. To solve this problem, collection framework is used in Java which grows automatically.
 - Cost of Operations: Performing an insertion or deletion operation is costly because we need to shift elements.

#### Sample Code
```java 
 class Testarray
{
public static void main(String args[])
{
int a[]=new int[5];//declaration and instantiation
a[0]=10;//initialization
a[1]=20;
a[2]=70;
a[3]=40;
a[4]=50;
//printing array
for(int i=0;i<a.length;i++)//length is the property of array
System.out.println(a[i]);
}}
```
