import org.antlr.runtime.*;

public class myChecker_test {
	public static void main(String[] args) throws Exception {

      CharStream input = new ANTLRFileStream(args[0]);
      myCheckerLexer lexer = new myCheckerLexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
 
      myCheckerParser parser = new myCheckerParser(tokens);
      parser.program();
	}
}
