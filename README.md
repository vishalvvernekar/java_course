1) What is Java?
 * Java is the high-level, object-oriented, robust, secure programming language, platform-independent, high performance, Multithreaded, and    portable programming language. 
 * It was developed by James Gosling in June 1991. 
 * It can also be known as the platform as it provides its own JRE and API.

2) What are the differences between C++ and Java?
	              C++	                                            Java
	       1. C++ is platform-dependent.	                        1. Java is platform-independent.
      	       2. C++ is mainly used for system programming.	        2. Java is mainly used for application programming. It is widely                                                                                   used in window, web-based, enterprise and mobile applications.
               3. C++ supports multiple inheritance.	                3. Java doesn't support multiple inheritance through class. It can be                                                                            achieved by interfaces in java.

3) List the features of Java Programming language.
    * Simple           		* Object-Oriented
    * Portable        	 	* Platform Independent
    * Secured           	* Robust                
    * Architecture Neutral      * Interpreted
    * High Performance		* Multithreaded
    * Distributed		* Dynamic
4) What do you understand by Java virtual machine?
Java Virtual Machine is a virtual machine that enables the computer to run the Java program. JVM acts like a run-time engine which calls the main method present in the Java code. JVM is the specification which must be implemented in the computer system. The Java code is compiled by JVM to be a Bytecode which is machine independent and close to the native code.

5) What is the difference between JDK, JRE, and JVM?
JVM
JVM is an acronym for Java Virtual Machine; it is an abstract machine which provides the runtime environment in which Java bytecode can be executed. It is a specification which specifies the working of Java Virtual Machine. Its implementation has been provided by Oracle and other companies. Its implementation is known as JRE.

JVMs are available for many hardware and software platforms (so JVM is platform dependent). It is a runtime instance which is created when we run the Java class. There are three notions of the JVM: specification, implementation, and instance.

JRE
JRE stands for Java Runtime Environment. It is the implementation of JVM. The Java Runtime Environment is a set of software tools which are used for developing Java applications. It is used to provide the runtime environment. It is the implementation of JVM. It physically exists. It contains a set of libraries + other files that JVM uses at runtime.

JDK
JDK is an acronym for Java Development Kit. It is a software development environment which is used to develop Java applications and applets. It physically exists. It contains JRE + development tools.

6) What is the static variable?
The static variable is used to refer to the common property of all objects (that is not unique for each object), e.g., The company name of employees, college name of students, etc. Static variable gets memory only once in the class area at the time of class loading. Using a static variable makes your program more memory efficient (it saves memory). Static variable belongs to the class rather than the object.

7) Why is the main method static?
Because the object is not required to call the static method. If we make the main method non-static, JVM will have to create its object first and then call main() method which will lead to the extra memory allocation. 

8) What is the Inheritance?
Inheritance is a mechanism by which one object acquires all the properties and behavior of another object of another class. It is used for Code Reusability and Method Overriding. The idea behind inheritance in Java is that you can create new classes that are built upon existing classes. When you inherit from an existing class, you can reuse methods and fields of the parent class. Moreover, you can add new methods and fields in your current class also. Inheritance represents the IS-A relationship which is also known as a parent-child relationship.

There are five types of inheritance in Java.

*Single-level inheritance
*Multi-level inheritance
*Multiple Inheritance
*Hierarchical Inheritance
*Hybrid Inheritance

9)Explain public static void main(String args[]) in Java.
main() in Java is the entry point for any Java program. It is always written as public static void main(String[] args).

public: Public is an access modifier, which is used to specify who can access this method. Public means that this Method will be accessible by any Class.
static: It is a keyword in java which identifies it is class-based. main() is made static in Java so that it can be accessed without creating the instance of a Class. In case, main is not made static then the compiler will throw an error as main() is called by the JVM before any objects are made and only static methods can be directly invoked via the class. 
void: It is the return type of the method. Void defines the method which will not return any value.
main: It is the name of the method which is searched by JVM as a starting point for an application with a particular signature only. It is the method where the main execution occurs.
String args[]: It is the parameter passed to the main method.

