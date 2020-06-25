run: mylexer.g
	java -cp ./antlr-3.5.2-complete.jar org.antlr.Tool mylexer.g
	javac -cp ./antlr-3.5.2-complete.jar testLexer.java mylexer.java

clean:
	rm -rf *.class
	rm -rf mylexer.java mylexer.tokens
