run: myChecker.g
	java -cp ./antlr-3.5.2-complete.jar org.antlr.Tool myChecker.g
	javac -cp ./antlr-3.5.2-complete.jar *.java

clean:
	rm -rf *.class
	rm -rf *.tokens
	rm -rf myCheckerLexer.java myCheckerParser.java
