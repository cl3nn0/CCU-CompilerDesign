// how to use

1. use commands below , to compile
	java -cp ./antlr-3.5.2-complete.jar org.antlr.Tool myCompiler.g
	javac -cp ./antlr-3.5.2-complete.jar *.java

2. you can also use "make" to accomplish step1 , and use "make clean" to remove files that generated by makefile

3. use commands below , to execute with .c file , and output corresponding .j file (already exists)
	java -cp ./antlr-3.5.2-complete.jar:. myCompiler_test test1.c > test1.j
	java -cp ./antlr-3.5.2-complete.jar:. myCompiler_test test2.c > test2.j
	java -cp ./antlr-3.5.2-complete.jar:. myCompiler_test test3.c > test3.j

4. use commands below , to generate and execute myResult for each .j file
	java -jar ./jasmin.jar test1.j
	java myResult

	java -jar ./jasmin.jar test2.j
	java myResult

	java -jar ./jasmin.jar test3.j
	java myResult

------------------------------------------------------------------------------------------

// features

this project is based on my project3 , so there are some features (as spec you provided in project3) remain , as follows

1. both side of operators must be the same type

2. the result of > , >= , < , <= , == , != , && , || , type must be boolean

3. the condition part of for-loop , while-loop , if-then , if-then-else , type must be boolean

4. each variable can only declare once , and must declare before it is use
