import org.antlr.runtime.*;

public class myC_hw2_test {
	public static void main(String[] args) throws Exception {

      CharStream input = new ANTLRFileStream(args[0]);
      myC_hw2Lexer lexer = new myC_hw2Lexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
 
      myC_hw2Parser parser = new myC_hw2Parser(tokens);
      parser.program();
	}
}
