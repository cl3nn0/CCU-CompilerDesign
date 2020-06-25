run: myCompiler.g
	java -cp ./antlr-3.5.2-complete.jar org.antlr.Tool myCompiler.g
	javac -cp ./antlr-3.5.2-complete.jar *.java

clean:
	rm -rf *.class
	rm -rf *.tokens
	rm -rf myCompilerLexer.java myCompilerParser.java
