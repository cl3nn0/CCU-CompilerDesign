// Generated from /Users/ccu_demo/Downloads/compiler/406410002_prj4/myCompiler.g by ANTLR 4.8

    // import packages here.
    import java.util.Map;
    import java.util.HashMap;
    import java.util.ArrayList;
    import java.util.AbstractMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class myCompilerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, MAIN=3, PRINTF=4, SCANF=5, STRLEN=6, INT_TYPE=7, SHORT_TYPE=8, 
		LONG_TYPE=9, FLOAT_TYPE=10, DOUBLE_TYPE=11, CHAR_TYPE=12, VOID_TYPE=13, 
		IF=14, ELSE=15, FOR=16, WHILE=17, BREAK=18, RETURN=19, SWITCH=20, CASE=21, 
		DEFAULT=22, SIZEOF=23, INCLUDE=24, ASSIGN_OP=25, PLUS_OP=26, MINUS_OP=27, 
		MOD_OP=28, MULTIPLIED_OP=29, DIVIDED_OP=30, GREATER_THAN=31, LESS_THAN=32, 
		AND_LOGICAL=33, OR_LOGICAL=34, EQ_OP=35, NE_OP=36, LT_OP=37, GT_OP=38, 
		PP_OP=39, MM_OP=40, WHITE_SPACE=41, NEW_LINE=42, SEMICOLON=43, COLON=44, 
		COMMA=45, R_PAREN=46, L_PAREN=47, R_BRACE=48, L_BRACE=49, R_BRACKET=50, 
		L_BRACKET=51, COMMENT_1=52, COMMENT_2=53, ID=54, DEC_NUM=55, FLOAT_NUM=56, 
		LITERAL=57;
	public static final int
		RULE_program = 0, RULE_header_file = 1, RULE_prog = 2, RULE_declarations = 3, 
		RULE_type = 4, RULE_statements = 5, RULE_pre_logic_exprsssion = 6, RULE_pre_logic_2_exprsssion = 7, 
		RULE_pre_compare_exprsssion = 8, RULE_pre_arith_expression = 9, RULE_arith_expression = 10, 
		RULE_multExpr = 11, RULE_signExpr = 12, RULE_primaryExpr = 13, RULE_statement = 14, 
		RULE_assign_statement = 15, RULE_if_statement = 16, RULE_if_block = 17, 
		RULE_else_block = 18, RULE_while_statement = 19, RULE_for_statement = 20, 
		RULE_switch_statement = 21, RULE_case_statement = 22, RULE_return_statement = 23, 
		RULE_block_statement = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "header_file", "prog", "declarations", "type", "statements", 
			"pre_logic_exprsssion", "pre_logic_2_exprsssion", "pre_compare_exprsssion", 
			"pre_arith_expression", "arith_expression", "multExpr", "signExpr", "primaryExpr", 
			"statement", "assign_statement", "if_statement", "if_block", "else_block", 
			"while_statement", "for_statement", "switch_statement", "case_statement", 
			"return_statement", "block_statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#'", "'.h'", "'main'", "'printf'", "'scanf'", "'strlen'", "'int'", 
			"'short'", "'long'", "'float'", "'double'", "'char'", "'void'", "'if'", 
			"'else'", "'for'", "'while'", "'break'", "'return'", "'switch'", "'case'", 
			"'default'", "'sizeof'", "'include'", "'='", "'+'", "'-'", "'%'", "'*'", 
			"'/'", "'>'", "'<'", "'&&'", "'||'", "'=='", "'!='", "'<='", "'>='", 
			"'++'", "'--'", null, "'\n'", "';'", "':'", "','", "')'", "'('", "'}'", 
			"'{'", "']'", "'['"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "MAIN", "PRINTF", "SCANF", "STRLEN", "INT_TYPE", "SHORT_TYPE", 
			"LONG_TYPE", "FLOAT_TYPE", "DOUBLE_TYPE", "CHAR_TYPE", "VOID_TYPE", "IF", 
			"ELSE", "FOR", "WHILE", "BREAK", "RETURN", "SWITCH", "CASE", "DEFAULT", 
			"SIZEOF", "INCLUDE", "ASSIGN_OP", "PLUS_OP", "MINUS_OP", "MOD_OP", "MULTIPLIED_OP", 
			"DIVIDED_OP", "GREATER_THAN", "LESS_THAN", "AND_LOGICAL", "OR_LOGICAL", 
			"EQ_OP", "NE_OP", "LT_OP", "GT_OP", "PP_OP", "MM_OP", "WHITE_SPACE", 
			"NEW_LINE", "SEMICOLON", "COLON", "COMMA", "R_PAREN", "L_PAREN", "R_BRACE", 
			"L_BRACE", "R_BRACKET", "L_BRACKET", "COMMENT_1", "COMMENT_2", "ID", 
			"DEC_NUM", "FLOAT_NUM", "LITERAL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "myCompiler.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    boolean TRACEON = false;

	    // =============================================
	    // Create a symbol table.
	    // ArrayList is easy to extend to add more info. into symbol table.
	    //
	    // The structure of symbol table:
	    // <variable ID, type, memory location>
	    //    - type: the variable type   (please check "enum Type")
	    //    - memory location: the location (locals in VM) the variable will be stored at.
	    //
	    // We use "AbstractMap.SimpleEntry"
	    // type and memory location are stored as a AbstractMap.SimpleEntry<Type, Integer>.
	    //
	    // =============================================
	    HashMap<String, AbstractMap.SimpleEntry> symtab = new HashMap<String, AbstractMap.SimpleEntry>();
	    HashMap<String, String> switch_tab = new HashMap<String, String>();

	    int labelCount = 0;
	    int condition_label = -1;
	    int do_label = -1;
	    int end_label = -1;
	    int for_do_label = -1;
	    int arith_to_assign = -1;
	    int parameter_cnt = 0;
		
	    // storageIndex is used to represent/index the location (locals) in VM.
	    // The first index is 0.
	    int storageIndex = 0;

	    // Record all assembly instructions.
	    List<String> TextCode = new ArrayList<String>();
	    List<String> tmpTextCode = new ArrayList<String>();
	    List<String> tmpTextCode2 = new ArrayList<String>();

	    // Type information.
	    public enum Type{
	        INT,
	        SHORT,
	        LONG,
	        FLOAT,
	        DOUBLE,
	        CHAR,
	        BOOL;
	    }

	    // Output prologue.
	    void prologue()
	    {
	        TextCode.add(";.source");
	        TextCode.add(".class public static myResult");
	        TextCode.add(".super java/lang/Object");
	        TextCode.add(".method public static main([Ljava/lang/String;)V");

	        /* The size of stack and locals should be properly set. */
	        TextCode.add(".limit stack 100");
	        TextCode.add(".limit locals 100");
	    }

	    // Output epilogue.
	    void epilogue()
	    {
	        /* handle epilogue */
	        TextCode.add("return");
	        TextCode.add(".end method");
	    }

	    // Generate a new label
	    String newLabel()
	    {
	        labelCount ++;
	        return (new String("L")) + Integer.toString(labelCount);
	    }

	    String getLabel(int t)
	    {
	        return (new String("L")) + Integer.toString(t);
	    }
	   
	    public List<String> getTextCode()
	    {
	        return TextCode;
	    }

	public myCompilerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Header_fileContext header_file() {
			return getRuleContext(Header_fileContext.class,0);
		}
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			header_file();
			setState(51);
			prog();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Header_fileContext extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(myCompilerParser.INCLUDE, 0); }
		public TerminalNode LESS_THAN() { return getToken(myCompilerParser.LESS_THAN, 0); }
		public TerminalNode ID() { return getToken(myCompilerParser.ID, 0); }
		public TerminalNode GREATER_THAN() { return getToken(myCompilerParser.GREATER_THAN, 0); }
		public Header_fileContext header_file() {
			return getRuleContext(Header_fileContext.class,0);
		}
		public Header_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header_file; }
	}

	public final Header_fileContext header_file() throws RecognitionException {
		Header_fileContext _localctx = new Header_fileContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header_file);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(T__0);
				setState(54);
				match(INCLUDE);
				setState(55);
				match(LESS_THAN);
				setState(56);
				match(ID);
				setState(57);
				match(T__1);
				setState(58);
				match(GREATER_THAN);
				setState(59);
				header_file();
				}
				break;
			case INT_TYPE:
			case VOID_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode VOID_TYPE() { return getToken(myCompilerParser.VOID_TYPE, 0); }
		public TerminalNode MAIN() { return getToken(myCompilerParser.MAIN, 0); }
		public TerminalNode L_PAREN() { return getToken(myCompilerParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(myCompilerParser.R_PAREN, 0); }
		public TerminalNode L_BRACE() { return getToken(myCompilerParser.L_BRACE, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(myCompilerParser.R_BRACE, 0); }
		public TerminalNode INT_TYPE() { return getToken(myCompilerParser.INT_TYPE, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_prog);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(VOID_TYPE);
				setState(64);
				match(MAIN);
				setState(65);
				match(L_PAREN);
				setState(66);
				match(R_PAREN);
				 prologue(); 
				setState(68);
				match(L_BRACE);
				setState(69);
				declarations();
				setState(70);
				statements();
				setState(71);
				match(R_BRACE);
				 epilogue(); 
				}
				break;
			case INT_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(INT_TYPE);
				setState(75);
				match(MAIN);
				setState(76);
				match(L_PAREN);
				setState(77);
				match(R_PAREN);
				 prologue(); 
				setState(79);
				match(L_BRACE);
				setState(80);
				declarations();
				setState(81);
				statements();
				setState(82);
				match(R_BRACE);
				 epilogue(); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(myCompilerParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(myCompilerParser.SEMICOLON, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode ASSIGN_OP() { return getToken(myCompilerParser.ASSIGN_OP, 0); }
		public Pre_logic_exprsssionContext pre_logic_exprsssion() {
			return getRuleContext(Pre_logic_exprsssionContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declarations);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				type();
				setState(88);
				match(ID);
				setState(89);
				match(SEMICOLON);

							if (symtab.containsKey((((DeclarationsContext)_localctx).ID!=null?((DeclarationsContext)_localctx).ID.getText():null)))
							{
								System.out.println("Type Error: " + ((DeclarationsContext)_localctx).ID.getLine() + ": Redeclared identifier.");
				                System.exit(0);
							}
							
				            /* Add ID and its attr_type into the symbol table. */
				            AbstractMap.SimpleEntry<Type, Integer> the_entry = new AbstractMap.SimpleEntry<Type, Integer>(((DeclarationsContext)_localctx).type.attr_type, Integer.valueOf(storageIndex));
				            storageIndex = storageIndex + 1;
				            symtab.put((((DeclarationsContext)_localctx).ID!=null?((DeclarationsContext)_localctx).ID.getText():null), the_entry);
						
				setState(91);
				declarations();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				type();
				setState(94);
				match(ID);
				setState(95);
				match(ASSIGN_OP);
				setState(96);
				pre_logic_exprsssion();
				setState(97);
				match(SEMICOLON);

				            if (symtab.containsKey((((DeclarationsContext)_localctx).ID!=null?((DeclarationsContext)_localctx).ID.getText():null)))
							{
								System.out.println("Type Error: " + ((DeclarationsContext)_localctx).ID.getLine() + ": Redeclared identifier.");
				                System.exit(0);
							}

				            /* Add ID and its attr_type into the symbol table. */
				            AbstractMap.SimpleEntry<Type, Integer> the_entry = new AbstractMap.SimpleEntry<Type, Integer>(((DeclarationsContext)_localctx).type.attr_type, Integer.valueOf(storageIndex));
				            storageIndex = storageIndex + 1;
				            symtab.put((((DeclarationsContext)_localctx).ID!=null?((DeclarationsContext)_localctx).ID.getText():null), the_entry);

				            Type the_type;
				            int the_mem;
				            the_type = (Type) symtab.get((((DeclarationsContext)_localctx).ID!=null?((DeclarationsContext)_localctx).ID.getText():null)).getKey();
							the_mem = ((Integer) ((AbstractMap.SimpleEntry) symtab.get((((DeclarationsContext)_localctx).ID!=null?((DeclarationsContext)_localctx).ID.getText():null))).getValue()).intValue();
				            if (the_type != ((DeclarationsContext)_localctx).pre_logic_exprsssion.attr_type)
				            {
				                System.out.println("Type error!\n");
				                System.exit(0);
							}
				            switch (the_type)
				            {
							    case INT:
				                    TextCode.add("istore " + the_mem);
				                    break;
				                case SHORT:
				                    TextCode.add("istore " + the_mem);
				                    break;
				                case LONG:
				                    TextCode.add("istore " + the_mem);
				                    break;
							    case FLOAT:
				                    TextCode.add("fstore " + the_mem);
							        break;
				                case DOUBLE:
				                    TextCode.add("dstore " + the_mem);
				                    break;
							    case CHAR:
				                    TextCode.add("istore " + the_mem);
							        break;
							}
				        
				setState(99);
				declarations();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Type attr_type;
		public TerminalNode INT_TYPE() { return getToken(myCompilerParser.INT_TYPE, 0); }
		public TerminalNode SHORT_TYPE() { return getToken(myCompilerParser.SHORT_TYPE, 0); }
		public TerminalNode LONG_TYPE() { return getToken(myCompilerParser.LONG_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(myCompilerParser.FLOAT_TYPE, 0); }
		public TerminalNode DOUBLE_TYPE() { return getToken(myCompilerParser.DOUBLE_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(myCompilerParser.CHAR_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(INT_TYPE);
				 ((TypeContext)_localctx).attr_type = Type.INT; 
				}
				break;
			case SHORT_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(SHORT_TYPE);
				 ((TypeContext)_localctx).attr_type = Type.SHORT; 
				}
				break;
			case LONG_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(LONG_TYPE);
				 ((TypeContext)_localctx).attr_type = Type.LONG; 
				}
				break;
			case FLOAT_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				match(FLOAT_TYPE);
				 ((TypeContext)_localctx).attr_type = Type.FLOAT; 
				}
				break;
			case DOUBLE_TYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				match(DOUBLE_TYPE);
				 ((TypeContext)_localctx).attr_type = Type.DOUBLE; 
				}
				break;
			case CHAR_TYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(114);
				match(CHAR_TYPE);
				 ((TypeContext)_localctx).attr_type = Type.CHAR; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statements);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINTF:
			case IF:
			case FOR:
			case WHILE:
			case RETURN:
			case SWITCH:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				statement();
				setState(119);
				statements();
				}
				break;
			case R_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_logic_exprsssionContext extends ParserRuleContext {
		public Type attr_type;
		public Pre_logic_2_exprsssionContext a;
		public Pre_logic_2_exprsssionContext b;
		public List<Pre_logic_2_exprsssionContext> pre_logic_2_exprsssion() {
			return getRuleContexts(Pre_logic_2_exprsssionContext.class);
		}
		public Pre_logic_2_exprsssionContext pre_logic_2_exprsssion(int i) {
			return getRuleContext(Pre_logic_2_exprsssionContext.class,i);
		}
		public List<TerminalNode> OR_LOGICAL() { return getTokens(myCompilerParser.OR_LOGICAL); }
		public TerminalNode OR_LOGICAL(int i) {
			return getToken(myCompilerParser.OR_LOGICAL, i);
		}
		public Pre_logic_exprsssionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_logic_exprsssion; }
	}

	public final Pre_logic_exprsssionContext pre_logic_exprsssion() throws RecognitionException {
		Pre_logic_exprsssionContext _localctx = new Pre_logic_exprsssionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pre_logic_exprsssion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			((Pre_logic_exprsssionContext)_localctx).a = pre_logic_2_exprsssion();
			((Pre_logic_exprsssionContext)_localctx).attr_type =  ((Pre_logic_exprsssionContext)_localctx).a.attr_type;
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR_LOGICAL) {
				{
				{

				                TextCode.add("ifeq " + newLabel());
				                TextCode.add("ldc 1");
				                TextCode.add("goto " + newLabel());
				                labelCount = labelCount - 2;
				                TextCode.add(newLabel() + " :");
				                TextCode.add("ldc 0");
				                TextCode.add(newLabel() + " :");
				            
				setState(127);
				match(OR_LOGICAL);
				setState(128);
				((Pre_logic_exprsssionContext)_localctx).b = pre_logic_2_exprsssion();

				                if (((Pre_logic_exprsssionContext)_localctx).a.attr_type != ((Pre_logic_exprsssionContext)_localctx).b.attr_type)
				                {
				                    System.out.println("Type Error: " + (((Pre_logic_exprsssionContext)_localctx).a!=null?(((Pre_logic_exprsssionContext)_localctx).a.start):null).getLine() + ": Type mismatch for the operator || in an expression.");
				                    System.exit(0);
				                }
				                ((Pre_logic_exprsssionContext)_localctx).attr_type =  Type.BOOL;
				                
				                TextCode.add("ifeq " + newLabel());
				                TextCode.add("ldc 1");
				                TextCode.add("goto " + newLabel());
				                labelCount = labelCount - 2;
				                TextCode.add(newLabel() + " :");
				                TextCode.add("ldc 0");
				                TextCode.add(newLabel() + " :");

				                TextCode.add("ior");
				            
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_logic_2_exprsssionContext extends ParserRuleContext {
		public Type attr_type;
		public Pre_compare_exprsssionContext a;
		public Pre_compare_exprsssionContext b;
		public List<Pre_compare_exprsssionContext> pre_compare_exprsssion() {
			return getRuleContexts(Pre_compare_exprsssionContext.class);
		}
		public Pre_compare_exprsssionContext pre_compare_exprsssion(int i) {
			return getRuleContext(Pre_compare_exprsssionContext.class,i);
		}
		public List<TerminalNode> AND_LOGICAL() { return getTokens(myCompilerParser.AND_LOGICAL); }
		public TerminalNode AND_LOGICAL(int i) {
			return getToken(myCompilerParser.AND_LOGICAL, i);
		}
		public Pre_logic_2_exprsssionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_logic_2_exprsssion; }
	}

	public final Pre_logic_2_exprsssionContext pre_logic_2_exprsssion() throws RecognitionException {
		Pre_logic_2_exprsssionContext _localctx = new Pre_logic_2_exprsssionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pre_logic_2_exprsssion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			((Pre_logic_2_exprsssionContext)_localctx).a = pre_compare_exprsssion();
			((Pre_logic_2_exprsssionContext)_localctx).attr_type =  ((Pre_logic_2_exprsssionContext)_localctx).a.attr_type;
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND_LOGICAL) {
				{
				{

				                TextCode.add("ifeq " + newLabel());
				                TextCode.add("ldc 1");
				                TextCode.add("goto " + newLabel());
				                labelCount = labelCount - 2;
				                TextCode.add(newLabel() + " :");
				                TextCode.add("ldc 0");
				                TextCode.add(newLabel() + " :");
				            
				setState(139);
				match(AND_LOGICAL);
				setState(140);
				((Pre_logic_2_exprsssionContext)_localctx).b = pre_compare_exprsssion();

				                if (((Pre_logic_2_exprsssionContext)_localctx).a.attr_type != ((Pre_logic_2_exprsssionContext)_localctx).b.attr_type)
				                {
				                    System.out.println("Type Error: " + (((Pre_logic_2_exprsssionContext)_localctx).a!=null?(((Pre_logic_2_exprsssionContext)_localctx).a.start):null).getLine() + ": Type mismatch for the operator && in an expression.");
				                    System.exit(0);
				                }
				                ((Pre_logic_2_exprsssionContext)_localctx).attr_type =  Type.BOOL;
				                
				                TextCode.add("ifeq " + newLabel());
				                TextCode.add("ldc 1");
				                TextCode.add("goto " + newLabel());
				                labelCount = labelCount - 2;
				                TextCode.add(newLabel() + " :");
				                TextCode.add("ldc 0");
				                TextCode.add(newLabel() + " :");

				                TextCode.add("iand");
				            
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_compare_exprsssionContext extends ParserRuleContext {
		public Type attr_type;
		public Pre_arith_expressionContext a;
		public Pre_arith_expressionContext b;
		public Pre_arith_expressionContext c;
		public List<Pre_arith_expressionContext> pre_arith_expression() {
			return getRuleContexts(Pre_arith_expressionContext.class);
		}
		public Pre_arith_expressionContext pre_arith_expression(int i) {
			return getRuleContext(Pre_arith_expressionContext.class,i);
		}
		public List<TerminalNode> EQ_OP() { return getTokens(myCompilerParser.EQ_OP); }
		public TerminalNode EQ_OP(int i) {
			return getToken(myCompilerParser.EQ_OP, i);
		}
		public List<TerminalNode> NE_OP() { return getTokens(myCompilerParser.NE_OP); }
		public TerminalNode NE_OP(int i) {
			return getToken(myCompilerParser.NE_OP, i);
		}
		public Pre_compare_exprsssionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_compare_exprsssion; }
	}

	public final Pre_compare_exprsssionContext pre_compare_exprsssion() throws RecognitionException {
		Pre_compare_exprsssionContext _localctx = new Pre_compare_exprsssionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pre_compare_exprsssion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			((Pre_compare_exprsssionContext)_localctx).a = pre_arith_expression();
			((Pre_compare_exprsssionContext)_localctx).attr_type =  ((Pre_compare_exprsssionContext)_localctx).a.attr_type;
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQ_OP || _la==NE_OP) {
				{
				setState(158);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQ_OP:
					{
					setState(150);
					match(EQ_OP);
					setState(151);
					((Pre_compare_exprsssionContext)_localctx).b = pre_arith_expression();

					                if (((Pre_compare_exprsssionContext)_localctx).a.attr_type != ((Pre_compare_exprsssionContext)_localctx).b.attr_type)
					                {
					                    System.out.println("Type Error: " + (((Pre_compare_exprsssionContext)_localctx).a!=null?(((Pre_compare_exprsssionContext)_localctx).a.start):null).getLine() + ": Type mismatch for the operator == in an expression.");
					                    System.exit(0);
					                }
					                ((Pre_compare_exprsssionContext)_localctx).attr_type =  Type.BOOL;
					                
					                if ((((Pre_compare_exprsssionContext)_localctx).a.attr_type == Type.INT) && (((Pre_compare_exprsssionContext)_localctx).b.attr_type == Type.INT))
					                {
					                    TextCode.add("if_icmpeq " + newLabel());
					                    TextCode.add("ldc 0");
					                    TextCode.add("goto " + newLabel());
					                    labelCount = labelCount - 2;
					                    TextCode.add(newLabel() + " :");
					                    TextCode.add("ldc 1");
					                    TextCode.add(newLabel() + " :");
					                }
					                if ((((Pre_compare_exprsssionContext)_localctx).a.attr_type == Type.SHORT) && (((Pre_compare_exprsssionContext)_localctx).b.attr_type == Type.SHORT))
					                {
					                    TextCode.add("if_icmpeq " + newLabel());
					                    TextCode.add("ldc 0");
					                    TextCode.add("goto " + newLabel());
					                    labelCount = labelCount - 2;
					                    TextCode.add(newLabel() + " :");
					                    TextCode.add("ldc 1");
					                    TextCode.add(newLabel() + " :");
					                }
					                if ((((Pre_compare_exprsssionContext)_localctx).a.attr_type == Type.LONG) && (((Pre_compare_exprsssionContext)_localctx).b.attr_type == Type.LONG))
					                {
					                    TextCode.add("if_icmpeq " + newLabel());
					                    TextCode.add("ldc 0");
					                    TextCode.add("goto " + newLabel());
					                    labelCount = labelCount - 2;
					                    TextCode.add(newLabel() + " :");
					                    TextCode.add("ldc 1");
					                    TextCode.add(newLabel() + " :");
					                }
					                if ((((Pre_compare_exprsssionContext)_localctx).a.attr_type == Type.FLOAT) && (((Pre_compare_exprsssionContext)_localctx).b.attr_type == Type.FLOAT))
					                {
					                    TextCode.add("fcmpl");
					                    TextCode.add("ifeq " + newLabel());
					                    TextCode.add("ldc 0");
					                    TextCode.add("goto " + newLabel());
					                    labelCount = labelCount - 2;
					                    TextCode.add(newLabel() + " :");
					                    TextCode.add("ldc 1");
					                    TextCode.add(newLabel() + " :");
					                }
					                if ((((Pre_compare_exprsssionContext)_localctx).a.attr_type == Type.DOUBLE) && (((Pre_compare_exprsssionContext)_localctx).b.attr_type == Type.DOUBLE))
					                {
					                    TextCode.add("dcmpl");
					                    TextCode.add("ifeq " + newLabel());
					                    TextCode.add("ldc 0");
					                    TextCode.add("goto " + newLabel());
					                    labelCount = labelCount - 2;
					                    TextCode.add(newLabel() + " :");
					                    TextCode.add("ldc 1");
					                    TextCode.add(newLabel() + " :");
					                }
					                if ((((Pre_compare_exprsssionContext)_localctx).a.attr_type == Type.CHAR) && (((Pre_compare_exprsssionContext)_localctx).b.attr_type == Type.CHAR))
					                {
					                    TextCode.add("if_icmpeq " + newLabel());
					                    TextCode.add("ldc 0");
					                    TextCode.add("goto " + newLabel());
					                    labelCount = labelCount - 2;
					                    TextCode.add(newLabel() + " :");
					                    TextCode.add("ldc 1");
					                    TextCode.add(newLabel() + " :");
					                }
					            
					}
					break;
				case NE_OP:
					{
					setState(154);
					match(NE_OP);
					setState(155);
					((Pre_compare_exprsssionContext)_localctx).c = pre_arith_expression();

					                if (((Pre_compare_exprsssionContext)_localctx).a.attr_type != ((Pre_compare_exprsssionContext)_localctx).c.attr_type)
					                {
					                    System.out.println("Type Error: " + (((Pre_compare_exprsssionContext)_localctx).a!=null?(((Pre_compare_exprsssionContext)_localctx).a.start):null).getLine() + ": Type mismatch for the operator != in an expression.");
					                    System.exit(0);
					                }
					                ((Pre_compare_exprsssionContext)_localctx).attr_type =  Type.BOOL;
					                
					                if ((((Pre_compare_exprsssionContext)_localctx).a.attr_type == Type.INT) && (((Pre_compare_exprsssionContext)_localctx).c.attr_type == Type.INT))
					                {
					                    TextCode.add("if_icmpne " + newLabel());
					                    TextCode.add("ldc 0");
					                    TextCode.add("goto " + newLabel());
					                    labelCount = labelCount - 2;
					                    TextCode.add(newLabel() + " :");
					                    TextCode.add("ldc 1");
					                    TextCode.add(newLabel() + " :");
					                }
					                if ((((Pre_compare_exprsssionContext)_localctx).a.attr_type == Type.SHORT) && (((Pre_compare_exprsssionContext)_localctx).c.attr_type == Type.SHORT))
					                {
					                    TextCode.add("if_icmpne " + newLabel());
					                    TextCode.add("ldc 0");
					                    TextCode.add("goto " + newLabel());
					                    labelCount = labelCount - 2;
					                    TextCode.add(newLabel() + " :");
					                    TextCode.add("ldc 1");
					                    TextCode.add(newLabel() + " :");
					                }
					                if ((((Pre_compare_exprsssionContext)_localctx).a.attr_type == Type.LONG) && (((Pre_compare_exprsssionContext)_localctx).c.attr_type == Type.LONG))
					                {
					                    TextCode.add("if_icmpne " + newLabel());
					                    TextCode.add("ldc 0");
					                    TextCode.add("goto " + newLabel());
					                    labelCount = labelCount - 2;
					                    TextCode.add(newLabel() + " :");
					                    TextCode.add("ldc 1");
					                    TextCode.add(newLabel() + " :");
					                }
					                if ((((Pre_compare_exprsssionContext)_localctx).a.attr_type == Type.FLOAT) && (((Pre_compare_exprsssionContext)_localctx).c.attr_type == Type.FLOAT))
					                {
					                    TextCode.add("fcmpl");
					                    TextCode.add("ifne " + newLabel());
					                    TextCode.add("ldc 0");
					                    TextCode.add("goto " + newLabel());
					                    labelCount = labelCount - 2;
					                    TextCode.add(newLabel() + " :");
					                    TextCode.add("ldc 1");
					                    TextCode.add(newLabel() + " :");
					                }
					                if ((((Pre_compare_exprsssionContext)_localctx).a.attr_type == Type.DOUBLE) && (((Pre_compare_exprsssionContext)_localctx).c.attr_type == Type.DOUBLE))
					                {
					                    TextCode.add("dcmpl");
					                    TextCode.add("ifne " + newLabel());
					                    TextCode.add("ldc 0");
					                    TextCode.add("goto " + newLabel());
					                    labelCount = labelCount - 2;
					                    TextCode.add(newLabel() + " :");
					                    TextCode.add("ldc 1");
					                    TextCode.add(newLabel() + " :");
					                }
					                if ((((Pre_compare_exprsssionContext)_localctx).a.attr_type == Type.CHAR) && (((Pre_compare_exprsssionContext)_localctx).c.attr_type == Type.CHAR))
					                {
					                    TextCode.add("if_icmpne " + newLabel());
					                    TextCode.add("ldc 0");
					                    TextCode.add("goto " + newLabel());
					                    labelCount = labelCount - 2;
					                    TextCode.add(newLabel() + " :");
					                    TextCode.add("ldc 1");
					                    TextCode.add(newLabel() + " :");
					                }
					            
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_arith_expressionContext extends ParserRuleContext {
		public Type attr_type;
		public Arith_expressionContext a;
		public Arith_expressionContext b;
		public Arith_expressionContext c;
		public Arith_expressionContext d;
		public Arith_expressionContext e;
		public List<Arith_expressionContext> arith_expression() {
			return getRuleContexts(Arith_expressionContext.class);
		}
		public Arith_expressionContext arith_expression(int i) {
			return getRuleContext(Arith_expressionContext.class,i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(myCompilerParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(myCompilerParser.GREATER_THAN, i);
		}
		public List<TerminalNode> LESS_THAN() { return getTokens(myCompilerParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(myCompilerParser.LESS_THAN, i);
		}
		public List<TerminalNode> GT_OP() { return getTokens(myCompilerParser.GT_OP); }
		public TerminalNode GT_OP(int i) {
			return getToken(myCompilerParser.GT_OP, i);
		}
		public List<TerminalNode> LT_OP() { return getTokens(myCompilerParser.LT_OP); }
		public TerminalNode LT_OP(int i) {
			return getToken(myCompilerParser.LT_OP, i);
		}
		public Pre_arith_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_arith_expression; }
	}

	public final Pre_arith_expressionContext pre_arith_expression() throws RecognitionException {
		Pre_arith_expressionContext _localctx = new Pre_arith_expressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pre_arith_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			((Pre_arith_expressionContext)_localctx).a = arith_expression();
			((Pre_arith_expressionContext)_localctx).attr_type =  ((Pre_arith_expressionContext)_localctx).a.attr_type;
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER_THAN) | (1L << LESS_THAN) | (1L << LT_OP) | (1L << GT_OP))) != 0)) {
				{
				setState(181);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GREATER_THAN:
					{
					setState(165);
					match(GREATER_THAN);
					setState(166);
					((Pre_arith_expressionContext)_localctx).b = arith_expression();

					                if (((Pre_arith_expressionContext)_localctx).a.attr_type != ((Pre_arith_expressionContext)_localctx).b.attr_type)
					                {
					                    System.out.println("Type Error: " + (((Pre_arith_expressionContext)_localctx).a!=null?(((Pre_arith_expressionContext)_localctx).a.start):null).getLine() + ": Type mismatch for the operator > in an expression.");
					                    System.exit(0);
					                }
					                ((Pre_arith_expressionContext)_localctx).attr_type =  Type.BOOL;
					                
					                if ((((Pre_arith_expressionContext)_localctx).a.attr_type == Type.INT) && (((Pre_arith_expressionContext)_localctx).b.attr_type == Type.INT))
					                {
					                    TextCode.add("if_icmpgt " + newLabel());
					                    TextCode.add("ldc 0");
					                    TextCode.add("goto " + newLabel());
					                    labelCount = labelCount - 2;
					                    TextCode.add(newLabel() + " :");
					                    TextCode.add("ldc 1");
					                    TextCode.add(newLabel() + " :");
					                }
					                if ((((Pre_arith_expressionContext)_localctx).a.attr_type == Type.SHORT) && (((Pre_arith_expressionContext)_localctx).b.attr_type == Type.SHORT))
					                {
					                    TextCode.add("if_icmpgt " + newLabel());
					                    TextCode.add("ldc 0");
					                    TextCode.add("goto " + newLabel());
					                    labelCount = labelCount - 2;
					                    TextCode.add(newLabel() + " :");
					                    TextCode.add("ldc 1");
					                    TextCode.add(newLabel() + " :");
					                }
					                if ((((Pre_arith_expressionContext)_localctx).a.attr_type == Type.LONG) && (((Pre_arith_expressionContext)_localctx).b.attr_type == Type.LONG))
					                {
					                    TextCode.add("if_icmpgt " + newLabel());
					                    TextCode.add("ldc 0");
					                    TextCode.add("goto " + newLabel());
					                    labelCount = labelCount - 2;
					                    TextCode.add(newLabel() + " :");
					                    TextCode.add("ldc 1");
					                    TextCode.add(newLabel() + " :");
					                }
					                if ((((Pre_arith_expressionContext)_localctx).a.attr_type == Type.FLOAT) && (((Pre_arith_expressionContext)_localctx).b.attr_type == Type.FLOAT))
					                {
					                    TextCode.add("fcmpl");
					                    TextCode.add("ifgt " + newLabel());
					                    TextCode.add("ldc 0");
					                    TextCode.add("goto " + newLabel());
					                    labelCount = labelCount - 2;
					                    TextCode.add(newLabel() + " :");
					                    TextCode.add("ldc 1");
					                    TextCode.add(newLabel() + " :");
					                }
					                if ((((Pre_arith_expressionContext)_localctx).a.attr_type == Type.DOUBLE) && (((Pre_arith_expressionContext)_localctx).b.attr_type == Type.DOUBLE))
					                {
					                    TextCode.add("dcmpl");
					                    TextCode.add("ifgt " + newLabel());
					                    TextCode.add("ldc 0");
					                    TextCode.add("goto " + newLabel());
					                    labelCount = labelCount - 2;
					                    TextCode.add(newLabel() + " :");
					                    TextCode.add("ldc 1");
					                    TextCode.add(newLabel() + " :");
					                }
					                if ((((Pre_arith_expressionContext)_localctx).a.attr_type == Type.CHAR) && (((Pre_arith_expressionContext)_localctx).b.attr_type == Type.CHAR))
					                {
					                    TextCode.add("if_icmpgt " + newLabel());
					                    TextCode.add("ldc 0");
					                    TextCode.add("goto " + newLabel());
					                    labelCount = labelCount - 2;
					                    TextCode.add(newLabel() + " :");
					                    TextCode.add("ldc 1");
					                    TextCode.add(newLabel() + " :");
					                }
					            
					}
					break;
				case LESS_THAN:
					{
					setState(169);
					match(LESS_THAN);
					setState(170);
					((Pre_arith_expressionContext)_localctx).c = arith_expression();

					                if (((Pre_arith_expressionContext)_localctx).a.attr_type != ((Pre_arith_expressionContext)_localctx).c.attr_type)
					                {
					                    System.out.println("Type Error: " + (((Pre_arith_expressionContext)_localctx).a!=null?(((Pre_arith_expressionContext)_localctx).a.start):null).getLine() + ": Type mismatch for the operator < in an expression.");
					                    System.exit(0);
					                }
					                ((Pre_arith_expressionContext)_localctx).attr_type =  Type.BOOL;
					                
					                if ((((Pre_arith_expressionContext)_localctx).a.attr_type == Type.INT) && (((Pre_arith_expressionContext)_localctx).c.attr_type == Type.INT))
					                {
					                    TextCode.add("if_icmplt " + newLabel());
					                    TextCode.add("ldc 0");
					                    TextCode.add("goto " + newLabel());
					                    labelCount = labelCount - 2;
					                    TextCode.add(newLabel() + " :");
					                    TextCode.add("ldc 1");
					                    TextCode.add(newLabel() + " :");
					                }
					                if ((((Pre_arith_expressionContext)_localctx).a.attr_type == Type.SHORT) && (((Pre_arith_expressionContext)_localctx).c.attr_type == Type.SHORT))
					                {
					                    TextCode.add("if_icmplt " + newLabel());
					                    TextCode.add("ldc 0");
					                    TextCode.add("goto " + newLabel());
					                    labelCount = labelCount - 2;
					                    TextCode.add(newLabel() + " :");
					                    TextCode.add("ldc 1");
					                    TextCode.add(newLabel() + " :");
					                }
					                if ((((Pre_arith_expressionContext)_localctx).a.attr_type == Type.LONG) && (((Pre_arith_expressionContext)_localctx).c.attr_type == Type.LONG))
					                {
					                    TextCode.add("if_icmplt " + newLabel());
					                    TextCode.add("ldc 0");
					                    TextCode.add("goto " + newLabel());
					                    labelCount = labelCount - 2;
					                    TextCode.add(newLabel() + " :");
					                    TextCode.add("ldc 1");
					                    TextCode.add(newLabel() + " :");
					                }
					                if ((((Pre_arith_expressionContext)_localctx).a.attr_type == Type.FLOAT) && (((Pre_arith_expressionContext)_localctx).c.attr_type == Type.FLOAT))
					                {
					                    TextCode.add("fcmpl");
					                    TextCode.add("iflt " + newLabel());
					                    TextCode.add("ldc 0");
					                    TextCode.add("goto " + newLabel());
					                    labelCount = labelCount - 2;
					                    TextCode.add(newLabel() + " :");
					                    TextCode.add("ldc 1");
					                    TextCode.add(newLabel() + " :");
					                }
					                if ((((Pre_arith_expressionContext)_localctx).a.attr_type == Type.DOUBLE) && (((Pre_arith_expressionContext)_localctx).c.attr_type == Type.DOUBLE))
					                {
					                    TextCode.add("dcmpl");
					                    TextCode.add("iflt " + newLabel());
					                    TextCode.add("ldc 0");
					                    TextCode.add("goto " + newLabel());
					                    labelCount = labelCount - 2;
					                    TextCode.add(newLabel() + " :");
					                    TextCode.add("ldc 1");
					                    TextCode.add(newLabel() + " :");
					                }
					                if ((((Pre_arith_expressionContext)_localctx).a.attr_type == Type.CHAR) && (((Pre_arith_expressionContext)_localctx).c.attr_type == Type.CHAR))
					                {
					                    TextCode.add("if_icmplt " + newLabel());
					                    TextCode.add("ldc 0");
					                    TextCode.add("goto " + newLabel());
					                    labelCount = labelCount - 2;
					                    TextCode.add(newLabel() + " :");
					                    TextCode.add("ldc 1");
					                    TextCode.add(newLabel() + " :");
					                }
					            
					}
					break;
				case GT_OP:
					{
					setState(173);
					match(GT_OP);
					setState(174);
					((Pre_arith_expressionContext)_localctx).d = arith_expression();

					                if (((Pre_arith_expressionContext)_localctx).a.attr_type != ((Pre_arith_expressionContext)_localctx).d.attr_type)
					                {
					                    System.out.println("Type Error: " + (((Pre_arith_expressionContext)_localctx).a!=null?(((Pre_arith_expressionContext)_localctx).a.start):null).getLine() + ": Type mismatch for the operator >= in an expression.");
					                    System.exit(0);
					                }
					                ((Pre_arith_expressionContext)_localctx).attr_type =  Type.BOOL;
					                
					                if ((((Pre_arith_expressionContext)_localctx).a.attr_type == Type.INT) && (((Pre_arith_expressionContext)_localctx).d.attr_type == Type.INT))
					                {
					                    TextCode.add("if_icmpge " + newLabel());
					                    TextCode.add("ldc 0");
					                    TextCode.add("goto " + newLabel());
					                    labelCount = labelCount - 2;
					                    TextCode.add(newLabel() + " :");
					                    TextCode.add("ldc 1");
					                    TextCode.add(newLabel() + " :");
					                }
					                if ((((Pre_arith_expressionContext)_localctx).a.attr_type == Type.SHORT) && (((Pre_arith_expressionContext)_localctx).d.attr_type == Type.SHORT))
					                {
					                    TextCode.add("if_icmpge " + newLabel());
					                    TextCode.add("ldc 0");
					                    TextCode.add("goto " + newLabel());
					                    labelCount = labelCount - 2;
					                    TextCode.add(newLabel() + " :");
					                    TextCode.add("ldc 1");
					                    TextCode.add(newLabel() + " :");
					                }
					                if ((((Pre_arith_expressionContext)_localctx).a.attr_type == Type.LONG) && (((Pre_arith_expressionContext)_localctx).d.attr_type == Type.LONG))
					                {
					                    TextCode.add("if_icmpge " + newLabel());
					                    TextCode.add("ldc 0");
					                    TextCode.add("goto " + newLabel());
					                    labelCount = labelCount - 2;
					                    TextCode.add(newLabel() + " :");
					                    TextCode.add("ldc 1");
					                    TextCode.add(newLabel() + " :");
					                }
					                if ((((Pre_arith_expressionContext)_localctx).a.attr_type == Type.FLOAT) && (((Pre_arith_expressionContext)_localctx).d.attr_type == Type.FLOAT))
					                {
					                    TextCode.add("fcmpl");
					                    TextCode.add("ifge " + newLabel());
					                    TextCode.add("ldc 0");
					                    TextCode.add("goto " + newLabel());
					                    labelCount = labelCount - 2;
					                    TextCode.add(newLabel() + " :");
					                    TextCode.add("ldc 1");
					                    TextCode.add(newLabel() + " :");
					                }
					                if ((((Pre_arith_expressionContext)_localctx).a.attr_type == Type.DOUBLE) && (((Pre_arith_expressionContext)_localctx).d.attr_type == Type.DOUBLE))
					                {
					                    TextCode.add("dcmpl");
					                    TextCode.add("ifge " + newLabel());
					                    TextCode.add("ldc 0");
					                    TextCode.add("goto " + newLabel());
					                    labelCount = labelCount - 2;
					                    TextCode.add(newLabel() + " :");
					                    TextCode.add("ldc 1");
					                    TextCode.add(newLabel() + " :");
					                }
					                if ((((Pre_arith_expressionContext)_localctx).a.attr_type == Type.CHAR) && (((Pre_arith_expressionContext)_localctx).d.attr_type == Type.CHAR))
					                {
					                    TextCode.add("if_icmpge " + newLabel());
					                    TextCode.add("ldc 0");
					                    TextCode.add("goto " + newLabel());
					                    labelCount = labelCount - 2;
					                    TextCode.add(newLabel() + " :");
					                    TextCode.add("ldc 1");
					                    TextCode.add(newLabel() + " :");
					                }
					            
					}
					break;
				case LT_OP:
					{
					setState(177);
					match(LT_OP);
					setState(178);
					((Pre_arith_expressionContext)_localctx).e = arith_expression();

					                if (((Pre_arith_expressionContext)_localctx).a.attr_type != ((Pre_arith_expressionContext)_localctx).e.attr_type)
					                {
					                    System.out.println("Type Error: " + (((Pre_arith_expressionContext)_localctx).a!=null?(((Pre_arith_expressionContext)_localctx).a.start):null).getLine() + ": Type mismatch for the operator <= in an expression.");
					                    System.exit(0);
					                }
					                ((Pre_arith_expressionContext)_localctx).attr_type =  Type.BOOL;
					                
					                if ((((Pre_arith_expressionContext)_localctx).a.attr_type == Type.INT) && (((Pre_arith_expressionContext)_localctx).e.attr_type == Type.INT))
					                {
					                    TextCode.add("if_icmple " + newLabel());
					                    TextCode.add("ldc 0");
					                    TextCode.add("goto " + newLabel());
					                    labelCount = labelCount - 2;
					                    TextCode.add(newLabel() + " :");
					                    TextCode.add("ldc 1");
					                    TextCode.add(newLabel() + " :");
					                }
					                if ((((Pre_arith_expressionContext)_localctx).a.attr_type == Type.SHORT) && (((Pre_arith_expressionContext)_localctx).e.attr_type == Type.SHORT))
					                {
					                    TextCode.add("if_icmple " + newLabel());
					                    TextCode.add("ldc 0");
					                    TextCode.add("goto " + newLabel());
					                    labelCount = labelCount - 2;
					                    TextCode.add(newLabel() + " :");
					                    TextCode.add("ldc 1");
					                    TextCode.add(newLabel() + " :");
					                }
					                if ((((Pre_arith_expressionContext)_localctx).a.attr_type == Type.LONG) && (((Pre_arith_expressionContext)_localctx).e.attr_type == Type.LONG))
					                {
					                    TextCode.add("if_icmple " + newLabel());
					                    TextCode.add("ldc 0");
					                    TextCode.add("goto " + newLabel());
					                    labelCount = labelCount - 2;
					                    TextCode.add(newLabel() + " :");
					                    TextCode.add("ldc 1");
					                    TextCode.add(newLabel() + " :");
					                }
					                if ((((Pre_arith_expressionContext)_localctx).a.attr_type == Type.FLOAT) && (((Pre_arith_expressionContext)_localctx).e.attr_type == Type.FLOAT))
					                {
					                    TextCode.add("fcmpl");
					                    TextCode.add("ifle " + newLabel());
					                    TextCode.add("ldc 0");
					                    TextCode.add("goto " + newLabel());
					                    labelCount = labelCount - 2;
					                    TextCode.add(newLabel() + " :");
					                    TextCode.add("ldc 1");
					                    TextCode.add(newLabel() + " :");
					                }
					                if ((((Pre_arith_expressionContext)_localctx).a.attr_type == Type.DOUBLE) && (((Pre_arith_expressionContext)_localctx).e.attr_type == Type.DOUBLE))
					                {
					                    TextCode.add("dcmpl");
					                    TextCode.add("ifle " + newLabel());
					                    TextCode.add("ldc 0");
					                    TextCode.add("goto " + newLabel());
					                    labelCount = labelCount - 2;
					                    TextCode.add(newLabel() + " :");
					                    TextCode.add("ldc 1");
					                    TextCode.add(newLabel() + " :");
					                }
					                if ((((Pre_arith_expressionContext)_localctx).a.attr_type == Type.CHAR) && (((Pre_arith_expressionContext)_localctx).e.attr_type == Type.CHAR))
					                {
					                    TextCode.add("if_icmple " + newLabel());
					                    TextCode.add("ldc 0");
					                    TextCode.add("goto " + newLabel());
					                    labelCount = labelCount - 2;
					                    TextCode.add(newLabel() + " :");
					                    TextCode.add("ldc 1");
					                    TextCode.add(newLabel() + " :");
					                }
					            
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arith_expressionContext extends ParserRuleContext {
		public Type attr_type;
		public MultExprContext a;
		public MultExprContext b;
		public MultExprContext c;
		public List<MultExprContext> multExpr() {
			return getRuleContexts(MultExprContext.class);
		}
		public MultExprContext multExpr(int i) {
			return getRuleContext(MultExprContext.class,i);
		}
		public List<TerminalNode> PLUS_OP() { return getTokens(myCompilerParser.PLUS_OP); }
		public TerminalNode PLUS_OP(int i) {
			return getToken(myCompilerParser.PLUS_OP, i);
		}
		public List<TerminalNode> MINUS_OP() { return getTokens(myCompilerParser.MINUS_OP); }
		public TerminalNode MINUS_OP(int i) {
			return getToken(myCompilerParser.MINUS_OP, i);
		}
		public Arith_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_expression; }
	}

	public final Arith_expressionContext arith_expression() throws RecognitionException {
		Arith_expressionContext _localctx = new Arith_expressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arith_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			((Arith_expressionContext)_localctx).a = multExpr();
			((Arith_expressionContext)_localctx).attr_type =  ((Arith_expressionContext)_localctx).a.attr_type;
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS_OP || _la==MINUS_OP) {
				{
				setState(196);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS_OP:
					{
					setState(188);
					match(PLUS_OP);
					setState(189);
					((Arith_expressionContext)_localctx).b = multExpr();

					                if (((Arith_expressionContext)_localctx).a.attr_type != ((Arith_expressionContext)_localctx).b.attr_type)
					                {
					                    System.out.println("Type Error: " + (((Arith_expressionContext)_localctx).a!=null?(((Arith_expressionContext)_localctx).a.start):null).getLine() + ": Type mismatch for the operator + in an expression.");
					                    System.exit(0);
					                }
					                
					                if ((((Arith_expressionContext)_localctx).a.attr_type == Type.INT) && (((Arith_expressionContext)_localctx).b.attr_type == Type.INT))
					                    TextCode.add("iadd");
					                if ((((Arith_expressionContext)_localctx).a.attr_type == Type.SHORT) && (((Arith_expressionContext)_localctx).b.attr_type == Type.SHORT))
					                    TextCode.add("iadd");
					                if ((((Arith_expressionContext)_localctx).a.attr_type == Type.LONG) && (((Arith_expressionContext)_localctx).b.attr_type == Type.LONG))
					                    TextCode.add("iadd");
					                if ((((Arith_expressionContext)_localctx).a.attr_type == Type.FLOAT) && (((Arith_expressionContext)_localctx).b.attr_type == Type.FLOAT))
					                    TextCode.add("fadd");
					                if ((((Arith_expressionContext)_localctx).a.attr_type == Type.DOUBLE) && (((Arith_expressionContext)_localctx).b.attr_type == Type.DOUBLE))
					                    TextCode.add("dadd");
					                if ((((Arith_expressionContext)_localctx).a.attr_type == Type.CHAR) && (((Arith_expressionContext)_localctx).b.attr_type == Type.CHAR))
					                    TextCode.add("iadd");
					            
					}
					break;
				case MINUS_OP:
					{
					setState(192);
					match(MINUS_OP);
					setState(193);
					((Arith_expressionContext)_localctx).c = multExpr();

					                if (((Arith_expressionContext)_localctx).a.attr_type != ((Arith_expressionContext)_localctx).c.attr_type)
					                {
					                    System.out.println("Type Error: " + (((Arith_expressionContext)_localctx).a!=null?(((Arith_expressionContext)_localctx).a.start):null).getLine() + ": Type mismatch for the operator - in an expression.");
					                    System.exit(0);
					                }

					                if ((((Arith_expressionContext)_localctx).a.attr_type == Type.INT) && (((Arith_expressionContext)_localctx).c.attr_type == Type.INT))
					                    TextCode.add("isub");
					                if ((((Arith_expressionContext)_localctx).a.attr_type == Type.SHORT) && (((Arith_expressionContext)_localctx).c.attr_type == Type.SHORT))
					                    TextCode.add("isub");
					                if ((((Arith_expressionContext)_localctx).a.attr_type == Type.LONG) && (((Arith_expressionContext)_localctx).c.attr_type == Type.LONG))
					                    TextCode.add("isub");
					                if ((((Arith_expressionContext)_localctx).a.attr_type == Type.FLOAT) && (((Arith_expressionContext)_localctx).c.attr_type == Type.FLOAT))
					                    TextCode.add("fsub");
					                if ((((Arith_expressionContext)_localctx).a.attr_type == Type.DOUBLE) && (((Arith_expressionContext)_localctx).c.attr_type == Type.DOUBLE))
					                    TextCode.add("dsub");
					                if ((((Arith_expressionContext)_localctx).a.attr_type == Type.CHAR) && (((Arith_expressionContext)_localctx).c.attr_type == Type.CHAR))
					                    TextCode.add("isub");
					            
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultExprContext extends ParserRuleContext {
		public Type attr_type;
		public SignExprContext a;
		public SignExprContext b;
		public SignExprContext c;
		public SignExprContext d;
		public List<SignExprContext> signExpr() {
			return getRuleContexts(SignExprContext.class);
		}
		public SignExprContext signExpr(int i) {
			return getRuleContext(SignExprContext.class,i);
		}
		public List<TerminalNode> MULTIPLIED_OP() { return getTokens(myCompilerParser.MULTIPLIED_OP); }
		public TerminalNode MULTIPLIED_OP(int i) {
			return getToken(myCompilerParser.MULTIPLIED_OP, i);
		}
		public List<TerminalNode> DIVIDED_OP() { return getTokens(myCompilerParser.DIVIDED_OP); }
		public TerminalNode DIVIDED_OP(int i) {
			return getToken(myCompilerParser.DIVIDED_OP, i);
		}
		public List<TerminalNode> MOD_OP() { return getTokens(myCompilerParser.MOD_OP); }
		public TerminalNode MOD_OP(int i) {
			return getToken(myCompilerParser.MOD_OP, i);
		}
		public MultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpr; }
	}

	public final MultExprContext multExpr() throws RecognitionException {
		MultExprContext _localctx = new MultExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_multExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			((MultExprContext)_localctx).a = signExpr();
			((MultExprContext)_localctx).attr_type =  ((MultExprContext)_localctx).a.attr_type;
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MOD_OP) | (1L << MULTIPLIED_OP) | (1L << DIVIDED_OP))) != 0)) {
				{
				setState(215);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULTIPLIED_OP:
					{
					setState(203);
					match(MULTIPLIED_OP);
					setState(204);
					((MultExprContext)_localctx).b = signExpr();

					                if (((MultExprContext)_localctx).a.attr_type != ((MultExprContext)_localctx).b.attr_type)
					                {
					                    System.out.println("Type Error: " + (((MultExprContext)_localctx).a!=null?(((MultExprContext)_localctx).a.start):null).getLine() + ": Type mismatch for the operator * in an expression.");
					                    System.exit(0);
					                }

					                if ((((MultExprContext)_localctx).a.attr_type == Type.INT) && (((MultExprContext)_localctx).b.attr_type == Type.INT))
					                    TextCode.add("imul");
					                if ((((MultExprContext)_localctx).a.attr_type == Type.SHORT) && (((MultExprContext)_localctx).b.attr_type == Type.SHORT))
					                    TextCode.add("imul");
					                if ((((MultExprContext)_localctx).a.attr_type == Type.LONG) && (((MultExprContext)_localctx).b.attr_type == Type.LONG))
					                    TextCode.add("imul");
					                if ((((MultExprContext)_localctx).a.attr_type == Type.FLOAT) && (((MultExprContext)_localctx).b.attr_type == Type.FLOAT))
					                    TextCode.add("fmul");
					                if ((((MultExprContext)_localctx).a.attr_type == Type.DOUBLE) && (((MultExprContext)_localctx).b.attr_type == Type.DOUBLE))
					                    TextCode.add("dmul");
					                if ((((MultExprContext)_localctx).a.attr_type == Type.CHAR) && (((MultExprContext)_localctx).b.attr_type == Type.CHAR))
					                    TextCode.add("imul");
					            
					}
					break;
				case DIVIDED_OP:
					{
					setState(207);
					match(DIVIDED_OP);
					setState(208);
					((MultExprContext)_localctx).c = signExpr();

					               if (((MultExprContext)_localctx).a.attr_type != ((MultExprContext)_localctx).c.attr_type)
					                {
					                    System.out.println("Type Error: " + (((MultExprContext)_localctx).a!=null?(((MultExprContext)_localctx).a.start):null).getLine() + ": Type mismatch for the operator / in an expression.");
					                    System.exit(0);
					                }

					                if ((((MultExprContext)_localctx).a.attr_type == Type.INT) && (((MultExprContext)_localctx).c.attr_type == Type.INT))
					                    TextCode.add("idiv");
					                if ((((MultExprContext)_localctx).a.attr_type == Type.SHORT) && (((MultExprContext)_localctx).c.attr_type == Type.SHORT))
					                    TextCode.add("idiv");
					                if ((((MultExprContext)_localctx).a.attr_type == Type.LONG) && (((MultExprContext)_localctx).c.attr_type == Type.LONG))
					                    TextCode.add("idiv");
					                if ((((MultExprContext)_localctx).a.attr_type == Type.FLOAT) && (((MultExprContext)_localctx).c.attr_type == Type.FLOAT))
					                    TextCode.add("fdiv");
					                if ((((MultExprContext)_localctx).a.attr_type == Type.DOUBLE) && (((MultExprContext)_localctx).c.attr_type == Type.DOUBLE))
					                    TextCode.add("ddiv");
					                if ((((MultExprContext)_localctx).a.attr_type == Type.CHAR) && (((MultExprContext)_localctx).c.attr_type == Type.CHAR))
					                    TextCode.add("idiv");
					            
					}
					break;
				case MOD_OP:
					{
					setState(211);
					match(MOD_OP);
					setState(212);
					((MultExprContext)_localctx).d = signExpr();

					                if (((MultExprContext)_localctx).a.attr_type != ((MultExprContext)_localctx).d.attr_type)
					                {
					                    System.out.println("Type Error: " + (((MultExprContext)_localctx).a!=null?(((MultExprContext)_localctx).a.start):null).getLine() + ": Type mismatch for the operator mod in an expression.");
					                    System.exit(0);
					                }

					                if ((((MultExprContext)_localctx).a.attr_type == Type.INT) && (((MultExprContext)_localctx).d.attr_type == Type.INT))
					                    TextCode.add("irem");
					                if ((((MultExprContext)_localctx).a.attr_type == Type.SHORT) && (((MultExprContext)_localctx).d.attr_type == Type.SHORT))
					                    TextCode.add("irem");
					                if ((((MultExprContext)_localctx).a.attr_type == Type.LONG) && (((MultExprContext)_localctx).d.attr_type == Type.LONG))
					                    TextCode.add("irem");
					                if ((((MultExprContext)_localctx).a.attr_type == Type.FLOAT) && (((MultExprContext)_localctx).d.attr_type == Type.FLOAT))
					                    TextCode.add("frem");
					                if ((((MultExprContext)_localctx).a.attr_type == Type.DOUBLE) && (((MultExprContext)_localctx).d.attr_type == Type.DOUBLE))
					                    TextCode.add("drem");
					                if ((((MultExprContext)_localctx).a.attr_type == Type.CHAR) && (((MultExprContext)_localctx).d.attr_type == Type.CHAR))
					                    TextCode.add("irem");
					            
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignExprContext extends ParserRuleContext {
		public Type attr_type;
		public PrimaryExprContext a;
		public PrimaryExprContext b;
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public TerminalNode MINUS_OP() { return getToken(myCompilerParser.MINUS_OP, 0); }
		public SignExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signExpr; }
	}

	public final SignExprContext signExpr() throws RecognitionException {
		SignExprContext _localctx = new SignExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_signExpr);
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_PAREN:
			case ID:
			case DEC_NUM:
			case FLOAT_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				((SignExprContext)_localctx).a = primaryExpr();
				((SignExprContext)_localctx).attr_type =  ((SignExprContext)_localctx).a.attr_type;
				}
				break;
			case MINUS_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(MINUS_OP);
				setState(224);
				((SignExprContext)_localctx).b = primaryExpr();

				            ((SignExprContext)_localctx).attr_type =  ((SignExprContext)_localctx).b.attr_type;
				            switch (_localctx.attr_type)
				            {
				                case INT: 
				                    TextCode.add("ineg");
				                    break;
				                case SHORT: 
				                    TextCode.add("ineg");
				                    break;
				                case LONG: 
				                    TextCode.add("ineg");
				                    break;
				                case FLOAT:
				                    TextCode.add("fneg");
				                    break;
				                case DOUBLE: 
				                    TextCode.add("dneg");
				                    break;
				                case CHAR:
				                    TextCode.add("ineg");
				                    break;
				            }
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExprContext extends ParserRuleContext {
		public Type attr_type;
		public TerminalNode DEC_NUM() { return getToken(myCompilerParser.DEC_NUM, 0); }
		public TerminalNode FLOAT_NUM() { return getToken(myCompilerParser.FLOAT_NUM, 0); }
		public TerminalNode ID() { return getToken(myCompilerParser.ID, 0); }
		public TerminalNode PP_OP() { return getToken(myCompilerParser.PP_OP, 0); }
		public TerminalNode MM_OP() { return getToken(myCompilerParser.MM_OP, 0); }
		public TerminalNode L_PAREN() { return getToken(myCompilerParser.L_PAREN, 0); }
		public Pre_logic_exprsssionContext pre_logic_exprsssion() {
			return getRuleContext(Pre_logic_exprsssionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(myCompilerParser.R_PAREN, 0); }
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_primaryExpr);
		try {
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(DEC_NUM);

				            ((PrimaryExprContext)_localctx).attr_type =  Type.INT;
				            TextCode.add("ldc " + (((PrimaryExprContext)_localctx).DEC_NUM!=null?((PrimaryExprContext)_localctx).DEC_NUM.getText():null));
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(FLOAT_NUM);

				            ((PrimaryExprContext)_localctx).attr_type =  Type.FLOAT;
				            TextCode.add("ldc " + (((PrimaryExprContext)_localctx).FLOAT_NUM!=null?((PrimaryExprContext)_localctx).FLOAT_NUM.getText():null));
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				match(ID);

				            if (symtab.containsKey((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null)))
				            {
				                ((PrimaryExprContext)_localctx).attr_type =  (Type) ((AbstractMap.SimpleEntry) symtab.get((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null))).getKey();
				                switch (_localctx.attr_type)
				                {
				                    case INT: 
								        TextCode.add("iload " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null))).getValue()).intValue());
								        break;
				                    case SHORT: 
								        TextCode.add("iload " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null))).getValue()).intValue());
								        break;
				                    case LONG: 
								        TextCode.add("iload " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null))).getValue()).intValue());
								        break;
								    case FLOAT:
				                        TextCode.add("fload " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null))).getValue()).intValue());
								        break;
				                    case DOUBLE: 
								        TextCode.add("dload " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null))).getValue()).intValue());
								        break;
								    case CHAR:
				                        TextCode.add("iload " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null))).getValue()).intValue());
								        break;
				                }
				            }
				            else
				            {
				                System.out.println("Type Error: " + ((PrimaryExprContext)_localctx).ID.getLine() + ": Do not exist.");
				                System.exit(0);
				            }
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				match(ID);
				setState(236);
				match(PP_OP);

				            if (symtab.containsKey((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null)))
				            {
				                ((PrimaryExprContext)_localctx).attr_type =  (Type) ((AbstractMap.SimpleEntry) symtab.get((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null))).getKey();
				                switch (_localctx.attr_type)
				                {
				                    case INT: 
								        TextCode.add("iload " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null))).getValue()).intValue());
				                        TextCode.add("ldc 1");
				                        TextCode.add("iadd");
				                        if (arith_to_assign == 1)
				                            TextCode.add("istore " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null))).getValue()).intValue());
								        break;
				                    case SHORT: 
								        TextCode.add("iload " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null))).getValue()).intValue());
				                        TextCode.add("ldc 1");
				                        TextCode.add("iadd");
				                        if (arith_to_assign == 1)
				                            TextCode.add("istore " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null))).getValue()).intValue());
								        break;
				                    case LONG: 
								        TextCode.add("iload " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null))).getValue()).intValue());
				                        TextCode.add("ldc 1");
				                        TextCode.add("iadd");
				                        if (arith_to_assign == 1)
				                            TextCode.add("istore " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null))).getValue()).intValue());
								        break;
								    case CHAR:
								        TextCode.add("iload " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null))).getValue()).intValue());
				                        TextCode.add("ldc 1");
				                        TextCode.add("iadd");
				                        if (arith_to_assign == 1)
				                            TextCode.add("istore " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null))).getValue()).intValue());
								        break;
				                    default:
				                        System.out.println("TYPE ERROR");
				                        System.exit(0);
				                }
				            }
				            else
				            {
				                System.out.println("Type Error: " + ((PrimaryExprContext)_localctx).ID.getLine() + ": Do not exist.");
				                System.exit(0);
				            }
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(238);
				match(ID);
				setState(239);
				match(MM_OP);

				            if (symtab.containsKey((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null)))
				            {
				                ((PrimaryExprContext)_localctx).attr_type =  (Type) ((AbstractMap.SimpleEntry) symtab.get((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null))).getKey();
				                switch (_localctx.attr_type)
				                {
				                    case INT: 
								        TextCode.add("iload " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null))).getValue()).intValue());
				                        TextCode.add("ldc 1");
				                        TextCode.add("isub");
				                        if (arith_to_assign == 1)
				                            TextCode.add("istore " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null))).getValue()).intValue());
								        break;
				                    case SHORT: 
								        TextCode.add("iload " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null))).getValue()).intValue());
				                        TextCode.add("ldc 1");
				                        TextCode.add("isub");
				                        if (arith_to_assign == 1)
				                            TextCode.add("istore " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null))).getValue()).intValue());
								        break;
				                    case LONG: 
								        TextCode.add("iload " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null))).getValue()).intValue());
				                        TextCode.add("ldc 1");
				                        TextCode.add("isub");
				                        if (arith_to_assign == 1)
				                            TextCode.add("istore " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null))).getValue()).intValue());
								        break;
								    case CHAR:
								        TextCode.add("iload " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null))).getValue()).intValue());
				                        TextCode.add("ldc 1");
				                        TextCode.add("isub");
				                        if (arith_to_assign == 1)
				                            TextCode.add("istore " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null))).getValue()).intValue());
								        break;
				                    default:
				                        System.out.println("TYPE ERROR");
				                        System.exit(0);
				                }
				            }
				            else
				            {
				                System.out.println("Type Error: " + ((PrimaryExprContext)_localctx).ID.getLine() + ": Do not exist.");
				                System.exit(0);
				            }
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(241);
				match(L_PAREN);
				setState(242);
				pre_logic_exprsssion();
				setState(243);
				match(R_PAREN);
				((PrimaryExprContext)_localctx).attr_type =  ((PrimaryExprContext)_localctx).pre_logic_exprsssion.attr_type;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Assign_statementContext assign_statement() {
			return getRuleContext(Assign_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statement);
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINTF:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				assign_statement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				if_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				while_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(251);
				for_statement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(252);
				switch_statement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(253);
				return_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_statementContext extends ParserRuleContext {
		public Pre_logic_exprsssionContext a;
		public TerminalNode ID() { return getToken(myCompilerParser.ID, 0); }
		public TerminalNode ASSIGN_OP() { return getToken(myCompilerParser.ASSIGN_OP, 0); }
		public TerminalNode SEMICOLON() { return getToken(myCompilerParser.SEMICOLON, 0); }
		public Pre_logic_exprsssionContext pre_logic_exprsssion() {
			return getRuleContext(Pre_logic_exprsssionContext.class,0);
		}
		public TerminalNode PP_OP() { return getToken(myCompilerParser.PP_OP, 0); }
		public TerminalNode MM_OP() { return getToken(myCompilerParser.MM_OP, 0); }
		public TerminalNode PRINTF() { return getToken(myCompilerParser.PRINTF, 0); }
		public TerminalNode L_PAREN() { return getToken(myCompilerParser.L_PAREN, 0); }
		public TerminalNode LITERAL() { return getToken(myCompilerParser.LITERAL, 0); }
		public TerminalNode R_PAREN() { return getToken(myCompilerParser.R_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(myCompilerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(myCompilerParser.COMMA, i);
		}
		public List<Arith_expressionContext> arith_expression() {
			return getRuleContexts(Arith_expressionContext.class);
		}
		public Arith_expressionContext arith_expression(int i) {
			return getRuleContext(Arith_expressionContext.class,i);
		}
		public Assign_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_statement; }
	}

	public final Assign_statementContext assign_statement() throws RecognitionException {
		Assign_statementContext _localctx = new Assign_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assign_statement);
		int _la;
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(ID);
				setState(257);
				match(ASSIGN_OP);
				setState(258);
				((Assign_statementContext)_localctx).a = pre_logic_exprsssion();
				setState(259);
				match(SEMICOLON);

				            Type the_type;
							int the_mem;
				            the_type = (Type) symtab.get((((Assign_statementContext)_localctx).ID!=null?((Assign_statementContext)_localctx).ID.getText():null)).getKey();
							the_mem = ((Integer) ((AbstractMap.SimpleEntry) symtab.get((((Assign_statementContext)_localctx).ID!=null?((Assign_statementContext)_localctx).ID.getText():null))).getValue()).intValue();
				            if (the_type != ((Assign_statementContext)_localctx).pre_logic_exprsssion.attr_type)
				            {
				                System.out.println("Type error!\n");
				                System.exit(0);
							}
				            switch (the_type)
				            {
							    case INT:
				                    TextCode.add("istore " + the_mem);
				                    break;
				                case SHORT:
				                    TextCode.add("istore " + the_mem);
				                    break;
				                case LONG:
				                    TextCode.add("istore " + the_mem);
				                    break;
							    case FLOAT:
				                    TextCode.add("fstore " + the_mem);
							        break;
				                case DOUBLE:
				                    TextCode.add("dstore " + the_mem);
				                    break;
							    case CHAR:
				                    TextCode.add("istore " + the_mem);
							        break;
							}
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				match(ID);
				setState(263);
				match(PP_OP);
				setState(264);
				match(SEMICOLON);

				            Type the_type;
							int the_mem;
				            the_type = (Type) symtab.get((((Assign_statementContext)_localctx).ID!=null?((Assign_statementContext)_localctx).ID.getText():null)).getKey();
							the_mem = ((Integer) ((AbstractMap.SimpleEntry) symtab.get((((Assign_statementContext)_localctx).ID!=null?((Assign_statementContext)_localctx).ID.getText():null))).getValue()).intValue();
				            switch (the_type)
				            {
				                case INT:
				                    TextCode.add("iload " + the_mem);
				                    TextCode.add("ldc 1");
				                    TextCode.add("iadd");
				                    TextCode.add("istore " + the_mem);
				                    break;
				                case SHORT:
				                    TextCode.add("iload " + the_mem);
				                    TextCode.add("ldc 1");
				                    TextCode.add("iadd");
				                    TextCode.add("istore " + the_mem);
				                    break;
				                case LONG:
				                    TextCode.add("iload " + the_mem);
				                    TextCode.add("ldc 1");
				                    TextCode.add("iadd");
				                    TextCode.add("istore " + the_mem);
				                    break;
				                case CHAR:
				                    TextCode.add("iload " + the_mem);
				                    TextCode.add("ldc 1");
				                    TextCode.add("iadd");
				                    TextCode.add("istore " + the_mem);
				                    break;
				                default:
				                    System.out.println("TYPE ERROR");
				                    System.exit(0);
				            }
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				match(ID);
				setState(267);
				match(MM_OP);
				setState(268);
				match(SEMICOLON);

				            Type the_type;
							int the_mem;
				            the_type = (Type) symtab.get((((Assign_statementContext)_localctx).ID!=null?((Assign_statementContext)_localctx).ID.getText():null)).getKey();
							the_mem = ((Integer) ((AbstractMap.SimpleEntry) symtab.get((((Assign_statementContext)_localctx).ID!=null?((Assign_statementContext)_localctx).ID.getText():null))).getValue()).intValue();
				            switch (the_type)
				            {
				                case INT:
				                    TextCode.add("iload " + the_mem);
				                    TextCode.add("ldc 1");
				                    TextCode.add("isub");
				                    TextCode.add("istore " + the_mem);
				                    break;
				                case SHORT:
				                    TextCode.add("iload " + the_mem);
				                    TextCode.add("ldc 1");
				                    TextCode.add("isub");
				                    TextCode.add("istore " + the_mem);
				                    break;
				                case LONG:
				                    TextCode.add("iload " + the_mem);
				                    TextCode.add("ldc 1");
				                    TextCode.add("isub");
				                    TextCode.add("istore " + the_mem);
				                    break;
				                case CHAR:  
				                    TextCode.add("iload " + the_mem);
				                    TextCode.add("ldc 1");
				                    TextCode.add("isub");
				                    TextCode.add("istore " + the_mem);
				                    break;
				                default:
				                    System.out.println("TYPE ERROR");
				                    System.exit(0);
				            }
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				match(PRINTF);

				            TextCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
				        
				setState(272);
				match(L_PAREN);
				setState(273);
				match(LITERAL);

				            TextCode.add("ldc " + (((Assign_statementContext)_localctx).LITERAL!=null?((Assign_statementContext)_localctx).LITERAL.getText():null));

				            // move TextCode to tmp
				            tmpTextCode.addAll(TextCode);
				            TextCode = new ArrayList<String>();

				            TextCode.add("anewarray java/lang/Object");
				        
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(275);
					match(COMMA);

					                TextCode.add("dup");
					                TextCode.add("ldc " + Integer.toString(parameter_cnt));
					                parameter_cnt ++;
					            
					setState(277);
					arith_expression();

					                if (((Assign_statementContext)_localctx).arith_expression.attr_type == Type.INT)
					                    TextCode.add("invokestatic java/lang/Integer.valueOf(I)Ljava/lang/Integer;");
					                if (((Assign_statementContext)_localctx).arith_expression.attr_type == Type.SHORT)
					                    TextCode.add("invokestatic java/lang/Integer.valueOf(I)Ljava/lang/Integer;");
					                if (((Assign_statementContext)_localctx).arith_expression.attr_type == Type.LONG)
					                    TextCode.add("invokestatic java/lang/Integer.valueOf(I)Ljava/lang/Integer;");
					                if (((Assign_statementContext)_localctx).arith_expression.attr_type == Type.FLOAT)
					                    TextCode.add("invokestatic java/lang/Float.valueOf(F)Ljava/lang/Float;");
					                if (((Assign_statementContext)_localctx).arith_expression.attr_type == Type.DOUBLE)
					                    TextCode.add("invokestatic java/lang/Double.valueOf(D)Ljava/lang/Double;");
					                if (((Assign_statementContext)_localctx).arith_expression.attr_type == Type.CHAR)
					                {
					                    TextCode.add("i2c");
					                    TextCode.add("invokestatic java/lang/Character.valueOf(C)Ljava/lang/Character;");
					                }
					                TextCode.add("aastore");
					            
					}
					}
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(285);
				match(R_PAREN);

				            TextCode.add("invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;");
				            TextCode.add("pop");

				            // add parameter_cnt and others
				            tmpTextCode.add("ldc " + Integer.toString(parameter_cnt));
				            tmpTextCode.addAll(TextCode);

				            TextCode = new ArrayList<String>();
				            TextCode.addAll(tmpTextCode);
				            tmpTextCode = new ArrayList<String>();
				            parameter_cnt = 0;
				        
				setState(287);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			if_block();
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(291);
				else_block();
				}
			}


			            // finish if-else
			            TextCode.add(((If_statementContext)_localctx).if_block.end_label + " :");
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_blockContext extends ParserRuleContext {
		public String end_label;
		public TerminalNode IF() { return getToken(myCompilerParser.IF, 0); }
		public TerminalNode L_PAREN() { return getToken(myCompilerParser.L_PAREN, 0); }
		public Pre_logic_exprsssionContext pre_logic_exprsssion() {
			return getRuleContext(Pre_logic_exprsssionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(myCompilerParser.R_PAREN, 0); }
		public Block_statementContext block_statement() {
			return getRuleContext(Block_statementContext.class,0);
		}
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_if_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(IF);
			setState(297);
			match(L_PAREN);
			setState(298);
			pre_logic_exprsssion();

			                if (((If_blockContext)_localctx).pre_logic_exprsssion.attr_type != Type.BOOL)
			                {
			                    System.out.println("Type Error: " + (((If_blockContext)_localctx).pre_logic_exprsssion!=null?(((If_blockContext)_localctx).pre_logic_exprsssion.start):null).getLine() + ": type error in IF");
			                    System.exit(0);
			                }
			            
			setState(300);
			match(R_PAREN);

			            // goto else_block
			            TextCode.add("ifeq " + newLabel());
			        
			setState(302);
			block_statement();

			            // finish if_block , goto end_label
			            TextCode.add("goto " + newLabel());

			            labelCount = labelCount - 2;
			            
			            // else_block label
			            TextCode.add(newLabel() + " :");
			            ((If_blockContext)_localctx).end_label =  newLabel();
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_blockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(myCompilerParser.ELSE, 0); }
		public Block_statementContext block_statement() {
			return getRuleContext(Block_statementContext.class,0);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(ELSE);
			setState(306);
			block_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(myCompilerParser.WHILE, 0); }
		public TerminalNode L_PAREN() { return getToken(myCompilerParser.L_PAREN, 0); }
		public Pre_logic_exprsssionContext pre_logic_exprsssion() {
			return getRuleContext(Pre_logic_exprsssionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(myCompilerParser.R_PAREN, 0); }
		public Block_statementContext block_statement() {
			return getRuleContext(Block_statementContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(WHILE);
			setState(309);
			match(L_PAREN);

			                    labelCount ++;
			                    condition_label = labelCount;
			                    labelCount ++;
			                    end_label = labelCount;
			                    TextCode.add(getLabel(condition_label) + " :");
			                
			setState(311);
			pre_logic_exprsssion();

			                    if (((While_statementContext)_localctx).pre_logic_exprsssion.attr_type != Type.BOOL)
			                    {
			                        System.out.println("Type Error: " + (((While_statementContext)_localctx).pre_logic_exprsssion!=null?(((While_statementContext)_localctx).pre_logic_exprsssion.start):null).getLine() + ": type error in WHILE");
			                        System.exit(0);
			                    }
			                    TextCode.add("ifeq " + getLabel(end_label));
			                
			setState(313);
			match(R_PAREN);
			setState(314);
			block_statement();

			                    TextCode.add("goto " + getLabel(condition_label));
			                    TextCode.add(getLabel(end_label) + " :");
			                    condition_label = -1;
			                    end_label = -1;
			                
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(myCompilerParser.FOR, 0); }
		public TerminalNode L_PAREN() { return getToken(myCompilerParser.L_PAREN, 0); }
		public Assign_statementContext assign_statement() {
			return getRuleContext(Assign_statementContext.class,0);
		}
		public Pre_logic_exprsssionContext pre_logic_exprsssion() {
			return getRuleContext(Pre_logic_exprsssionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(myCompilerParser.SEMICOLON, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(myCompilerParser.R_PAREN, 0); }
		public Block_statementContext block_statement() {
			return getRuleContext(Block_statementContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(FOR);
			setState(318);
			match(L_PAREN);
			setState(319);
			assign_statement();

			                    labelCount ++;
			                    condition_label = labelCount;
			                    labelCount ++;
			                    do_label = labelCount;
			                    labelCount ++;
			                    for_do_label = labelCount;
			                    labelCount ++;
			                    end_label = labelCount;
			                    TextCode.add(getLabel(condition_label) + " :");
			                
			setState(321);
			pre_logic_exprsssion();
			setState(322);
			match(SEMICOLON);

			                    if (((For_statementContext)_localctx).pre_logic_exprsssion.attr_type != Type.BOOL)
			                    {
			                        System.out.println("Type Error: " + (((For_statementContext)_localctx).pre_logic_exprsssion!=null?(((For_statementContext)_localctx).pre_logic_exprsssion.start):null).getLine() + ": type error in FOR");
			                        System.exit(0);
			                    }
			                    TextCode.add("ifeq " + getLabel(end_label));
			                    TextCode.add("goto " + getLabel(do_label));
			                    TextCode.add(getLabel(for_do_label) + " :");
			                    arith_to_assign = 1;
			                
			setState(324);
			arith_expression();

			                    arith_to_assign = -1;
			                    TextCode.add("goto " + getLabel(condition_label));
			                    TextCode.add(getLabel(do_label) + " :");
			                
			setState(326);
			match(R_PAREN);
			setState(327);
			block_statement();

			                    TextCode.add("goto " + getLabel(for_do_label));
			                    TextCode.add(getLabel(end_label) + " :");
			                    condition_label = -1;
			                    do_label = -1;
			                    end_label = -1;
			                
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_statementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(myCompilerParser.SWITCH, 0); }
		public TerminalNode L_PAREN() { return getToken(myCompilerParser.L_PAREN, 0); }
		public TerminalNode ID() { return getToken(myCompilerParser.ID, 0); }
		public TerminalNode R_PAREN() { return getToken(myCompilerParser.R_PAREN, 0); }
		public TerminalNode L_BRACE() { return getToken(myCompilerParser.L_BRACE, 0); }
		public TerminalNode R_BRACE() { return getToken(myCompilerParser.R_BRACE, 0); }
		public List<Case_statementContext> case_statement() {
			return getRuleContexts(Case_statementContext.class);
		}
		public Case_statementContext case_statement(int i) {
			return getRuleContext(Case_statementContext.class,i);
		}
		public Switch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statement; }
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_switch_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(SWITCH);
			setState(331);
			match(L_PAREN);
			setState(332);
			match(ID);
			setState(333);
			match(R_PAREN);

			            if (symtab.containsKey((((Switch_statementContext)_localctx).ID!=null?((Switch_statementContext)_localctx).ID.getText():null)))
			            {
			                Type the_type;
			                int the_mem;
			                the_type = (Type) symtab.get((((Switch_statementContext)_localctx).ID!=null?((Switch_statementContext)_localctx).ID.getText():null)).getKey();
			                the_mem = ((Integer) ((AbstractMap.SimpleEntry) symtab.get((((Switch_statementContext)_localctx).ID!=null?((Switch_statementContext)_localctx).ID.getText():null))).getValue()).intValue();
			                if (the_type == Type.FLOAT || the_type == Type.DOUBLE)
			                {
			                    System.out.println("Type Error: " + ((Switch_statementContext)_localctx).ID.getLine() + ": type error in SWITCH.");
			                    System.exit(0);
			                }
			                TextCode.add("iload " + the_mem);
			                labelCount ++;
			                end_label = labelCount;

			                // move TextCode to tmp
			                tmpTextCode2.addAll(TextCode);
			                TextCode = new ArrayList<String>();
			            }
			            else
			            {
			                System.out.println("Type Error: " + ((Switch_statementContext)_localctx).ID.getLine() + ": Do not exist.");
			                System.exit(0);
			            }
			        
			setState(335);
			match(L_BRACE);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(336);
				case_statement();
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342);
			match(R_BRACE);

			            tmpTextCode2.add("lookupswitch");
			            for (Map.Entry<String,String> tmp_case : switch_tab.entrySet())
			            {
			                if (tmp_case.getKey().matches("default"))
			                    continue;
			                tmpTextCode2.add("\t" + tmp_case.getKey() + "\t:\t" + tmp_case.getValue());
			            }
			            for (Map.Entry<String,String> tmp_case : switch_tab.entrySet())
			            {
			                if (tmp_case.getKey().matches("default"))
			                    tmpTextCode2.add("\t" + tmp_case.getKey() + "\t:\t" + tmp_case.getValue());
			            }

			            tmpTextCode2.addAll(TextCode);
			            TextCode = new ArrayList<String>();
			            TextCode.addAll(tmpTextCode2);
			            TextCode.add(getLabel(end_label) + " :");

			            tmpTextCode2 = new ArrayList<String>();
			            end_label = -1;
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_statementContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(myCompilerParser.CASE, 0); }
		public TerminalNode DEC_NUM() { return getToken(myCompilerParser.DEC_NUM, 0); }
		public TerminalNode COLON() { return getToken(myCompilerParser.COLON, 0); }
		public TerminalNode BREAK() { return getToken(myCompilerParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(myCompilerParser.SEMICOLON, 0); }
		public TerminalNode DEFAULT() { return getToken(myCompilerParser.DEFAULT, 0); }
		public List<Assign_statementContext> assign_statement() {
			return getRuleContexts(Assign_statementContext.class);
		}
		public Assign_statementContext assign_statement(int i) {
			return getRuleContext(Assign_statementContext.class,i);
		}
		public Case_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_statement; }
	}

	public final Case_statementContext case_statement() throws RecognitionException {
		Case_statementContext _localctx = new Case_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_case_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				{
				setState(345);
				match(CASE);
				setState(346);
				match(DEC_NUM);
				setState(347);
				match(COLON);

				                if (!switch_tab.containsKey((((Case_statementContext)_localctx).DEC_NUM!=null?((Case_statementContext)_localctx).DEC_NUM.getText():null)))
				                {
				                    TextCode.add(newLabel() + " :");
				                    labelCount --;
				                    switch_tab.put((((Case_statementContext)_localctx).DEC_NUM!=null?((Case_statementContext)_localctx).DEC_NUM.getText():null), newLabel());
				                }
				                else
				                    System.exit(0);
				            
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PRINTF || _la==ID) {
					{
					{
					setState(349);
					assign_statement();
					}
					}
					setState(354);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(355);
				match(BREAK);
				setState(356);
				match(SEMICOLON);

				                TextCode.add("goto " + getLabel(end_label));
				            
				}
				break;
			case DEFAULT:
				{
				setState(358);
				match(DEFAULT);
				setState(359);
				match(COLON);

				                if (!switch_tab.containsKey((((Case_statementContext)_localctx).DEFAULT!=null?((Case_statementContext)_localctx).DEFAULT.getText():null)))
				                {
				                    TextCode.add(newLabel() + " :");
				                    labelCount --;
				                    switch_tab.put((((Case_statementContext)_localctx).DEFAULT!=null?((Case_statementContext)_localctx).DEFAULT.getText():null), newLabel());
				                }
				                else
				                    System.exit(0);
				            
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PRINTF || _la==ID) {
					{
					{
					setState(361);
					assign_statement();
					}
					}
					setState(366);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(367);
				match(BREAK);
				setState(368);
				match(SEMICOLON);

				                TextCode.add("goto " + getLabel(end_label));
				            
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(myCompilerParser.RETURN, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(myCompilerParser.SEMICOLON, 0); }
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(RETURN);
			setState(373);
			arith_expression();
			setState(374);
			match(SEMICOLON);

			            TextCode.add("return");
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_statementContext extends ParserRuleContext {
		public List<Assign_statementContext> assign_statement() {
			return getRuleContexts(Assign_statementContext.class);
		}
		public Assign_statementContext assign_statement(int i) {
			return getRuleContext(Assign_statementContext.class,i);
		}
		public TerminalNode L_BRACE() { return getToken(myCompilerParser.L_BRACE, 0); }
		public TerminalNode R_BRACE() { return getToken(myCompilerParser.R_BRACE, 0); }
		public Block_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_statement; }
	}

	public final Block_statementContext block_statement() throws RecognitionException {
		Block_statementContext _localctx = new Block_statementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_block_statement);
		int _la;
		try {
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINTF:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				assign_statement();
				}
				break;
			case L_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				match(L_BRACE);
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PRINTF || _la==ID) {
					{
					{
					setState(379);
					assign_statement();
					}
					}
					setState(384);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(385);
				match(R_BRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u0187\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3@\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4X\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5i\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6w\n\6\3\7\3\7\3\7\3\7\5\7}\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0086"+
		"\n\b\f\b\16\b\u0089\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0092\n\t\f\t"+
		"\16\t\u0095\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00a1\n\n"+
		"\f\n\16\n\u00a4\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00b8\n\13\f\13\16\13\u00bb"+
		"\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00c7\n\f\f\f\16\f"+
		"\u00ca\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7"+
		"\r\u00da\n\r\f\r\16\r\u00dd\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u00e6\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00f9\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u0101\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\7\21\u011b\n\21\f\21\16\21\u011e\13\21\3\21\3\21\3\21\5\21\u0123\n\21"+
		"\3\22\3\22\5\22\u0127\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0154\n\27\f\27\16\27\u0157\13\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\7\30\u0161\n\30\f\30\16\30\u0164"+
		"\13\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u016d\n\30\f\30\16\30\u0170"+
		"\13\30\3\30\3\30\3\30\5\30\u0175\n\30\3\31\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\7\32\u017f\n\32\f\32\16\32\u0182\13\32\3\32\5\32\u0185\n\32\3"+
		"\32\2\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\2\2"+
		"\u019a\2\64\3\2\2\2\4?\3\2\2\2\6W\3\2\2\2\bh\3\2\2\2\nv\3\2\2\2\f|\3\2"+
		"\2\2\16~\3\2\2\2\20\u008a\3\2\2\2\22\u0096\3\2\2\2\24\u00a5\3\2\2\2\26"+
		"\u00bc\3\2\2\2\30\u00cb\3\2\2\2\32\u00e5\3\2\2\2\34\u00f8\3\2\2\2\36\u0100"+
		"\3\2\2\2 \u0122\3\2\2\2\"\u0124\3\2\2\2$\u012a\3\2\2\2&\u0133\3\2\2\2"+
		"(\u0136\3\2\2\2*\u013f\3\2\2\2,\u014c\3\2\2\2.\u0174\3\2\2\2\60\u0176"+
		"\3\2\2\2\62\u0184\3\2\2\2\64\65\5\4\3\2\65\66\5\6\4\2\66\3\3\2\2\2\67"+
		"8\7\3\2\289\7\32\2\29:\7\"\2\2:;\78\2\2;<\7\4\2\2<=\7!\2\2=@\5\4\3\2>"+
		"@\3\2\2\2?\67\3\2\2\2?>\3\2\2\2@\5\3\2\2\2AB\7\17\2\2BC\7\5\2\2CD\7\61"+
		"\2\2DE\7\60\2\2EF\b\4\1\2FG\7\63\2\2GH\5\b\5\2HI\5\f\7\2IJ\7\62\2\2JK"+
		"\b\4\1\2KX\3\2\2\2LM\7\t\2\2MN\7\5\2\2NO\7\61\2\2OP\7\60\2\2PQ\b\4\1\2"+
		"QR\7\63\2\2RS\5\b\5\2ST\5\f\7\2TU\7\62\2\2UV\b\4\1\2VX\3\2\2\2WA\3\2\2"+
		"\2WL\3\2\2\2X\7\3\2\2\2YZ\5\n\6\2Z[\78\2\2[\\\7-\2\2\\]\b\5\1\2]^\5\b"+
		"\5\2^i\3\2\2\2_`\5\n\6\2`a\78\2\2ab\7\33\2\2bc\5\16\b\2cd\7-\2\2de\b\5"+
		"\1\2ef\5\b\5\2fi\3\2\2\2gi\3\2\2\2hY\3\2\2\2h_\3\2\2\2hg\3\2\2\2i\t\3"+
		"\2\2\2jk\7\t\2\2kw\b\6\1\2lm\7\n\2\2mw\b\6\1\2no\7\13\2\2ow\b\6\1\2pq"+
		"\7\f\2\2qw\b\6\1\2rs\7\r\2\2sw\b\6\1\2tu\7\16\2\2uw\b\6\1\2vj\3\2\2\2"+
		"vl\3\2\2\2vn\3\2\2\2vp\3\2\2\2vr\3\2\2\2vt\3\2\2\2w\13\3\2\2\2xy\5\36"+
		"\20\2yz\5\f\7\2z}\3\2\2\2{}\3\2\2\2|x\3\2\2\2|{\3\2\2\2}\r\3\2\2\2~\177"+
		"\5\20\t\2\177\u0087\b\b\1\2\u0080\u0081\b\b\1\2\u0081\u0082\7$\2\2\u0082"+
		"\u0083\5\20\t\2\u0083\u0084\b\b\1\2\u0084\u0086\3\2\2\2\u0085\u0080\3"+
		"\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\17\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\5\22\n\2\u008b\u0093\b\t\1"+
		"\2\u008c\u008d\b\t\1\2\u008d\u008e\7#\2\2\u008e\u008f\5\22\n\2\u008f\u0090"+
		"\b\t\1\2\u0090\u0092\3\2\2\2\u0091\u008c\3\2\2\2\u0092\u0095\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\21\3\2\2\2\u0095\u0093\3\2\2"+
		"\2\u0096\u0097\5\24\13\2\u0097\u00a2\b\n\1\2\u0098\u0099\7%\2\2\u0099"+
		"\u009a\5\24\13\2\u009a\u009b\b\n\1\2\u009b\u00a1\3\2\2\2\u009c\u009d\7"+
		"&\2\2\u009d\u009e\5\24\13\2\u009e\u009f\b\n\1\2\u009f\u00a1\3\2\2\2\u00a0"+
		"\u0098\3\2\2\2\u00a0\u009c\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\23\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6"+
		"\5\26\f\2\u00a6\u00b9\b\13\1\2\u00a7\u00a8\7!\2\2\u00a8\u00a9\5\26\f\2"+
		"\u00a9\u00aa\b\13\1\2\u00aa\u00b8\3\2\2\2\u00ab\u00ac\7\"\2\2\u00ac\u00ad"+
		"\5\26\f\2\u00ad\u00ae\b\13\1\2\u00ae\u00b8\3\2\2\2\u00af\u00b0\7(\2\2"+
		"\u00b0\u00b1\5\26\f\2\u00b1\u00b2\b\13\1\2\u00b2\u00b8\3\2\2\2\u00b3\u00b4"+
		"\7\'\2\2\u00b4\u00b5\5\26\f\2\u00b5\u00b6\b\13\1\2\u00b6\u00b8\3\2\2\2"+
		"\u00b7\u00a7\3\2\2\2\u00b7\u00ab\3\2\2\2\u00b7\u00af\3\2\2\2\u00b7\u00b3"+
		"\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\25\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\5\30\r\2\u00bd\u00c8\b\f\1"+
		"\2\u00be\u00bf\7\34\2\2\u00bf\u00c0\5\30\r\2\u00c0\u00c1\b\f\1\2\u00c1"+
		"\u00c7\3\2\2\2\u00c2\u00c3\7\35\2\2\u00c3\u00c4\5\30\r\2\u00c4\u00c5\b"+
		"\f\1\2\u00c5\u00c7\3\2\2\2\u00c6\u00be\3\2\2\2\u00c6\u00c2\3\2\2\2\u00c7"+
		"\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\27\3\2\2"+
		"\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\5\32\16\2\u00cc\u00db\b\r\1\2\u00cd"+
		"\u00ce\7\37\2\2\u00ce\u00cf\5\32\16\2\u00cf\u00d0\b\r\1\2\u00d0\u00da"+
		"\3\2\2\2\u00d1\u00d2\7 \2\2\u00d2\u00d3\5\32\16\2\u00d3\u00d4\b\r\1\2"+
		"\u00d4\u00da\3\2\2\2\u00d5\u00d6\7\36\2\2\u00d6\u00d7\5\32\16\2\u00d7"+
		"\u00d8\b\r\1\2\u00d8\u00da\3\2\2\2\u00d9\u00cd\3\2\2\2\u00d9\u00d1\3\2"+
		"\2\2\u00d9\u00d5\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\31\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\5\34\17"+
		"\2\u00df\u00e0\b\16\1\2\u00e0\u00e6\3\2\2\2\u00e1\u00e2\7\35\2\2\u00e2"+
		"\u00e3\5\34\17\2\u00e3\u00e4\b\16\1\2\u00e4\u00e6\3\2\2\2\u00e5\u00de"+
		"\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e6\33\3\2\2\2\u00e7\u00e8\79\2\2\u00e8"+
		"\u00f9\b\17\1\2\u00e9\u00ea\7:\2\2\u00ea\u00f9\b\17\1\2\u00eb\u00ec\7"+
		"8\2\2\u00ec\u00f9\b\17\1\2\u00ed\u00ee\78\2\2\u00ee\u00ef\7)\2\2\u00ef"+
		"\u00f9\b\17\1\2\u00f0\u00f1\78\2\2\u00f1\u00f2\7*\2\2\u00f2\u00f9\b\17"+
		"\1\2\u00f3\u00f4\7\61\2\2\u00f4\u00f5\5\16\b\2\u00f5\u00f6\7\60\2\2\u00f6"+
		"\u00f7\b\17\1\2\u00f7\u00f9\3\2\2\2\u00f8\u00e7\3\2\2\2\u00f8\u00e9\3"+
		"\2\2\2\u00f8\u00eb\3\2\2\2\u00f8\u00ed\3\2\2\2\u00f8\u00f0\3\2\2\2\u00f8"+
		"\u00f3\3\2\2\2\u00f9\35\3\2\2\2\u00fa\u0101\5 \21\2\u00fb\u0101\5\"\22"+
		"\2\u00fc\u0101\5(\25\2\u00fd\u0101\5*\26\2\u00fe\u0101\5,\27\2\u00ff\u0101"+
		"\5\60\31\2\u0100\u00fa\3\2\2\2\u0100\u00fb\3\2\2\2\u0100\u00fc\3\2\2\2"+
		"\u0100\u00fd\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\37"+
		"\3\2\2\2\u0102\u0103\78\2\2\u0103\u0104\7\33\2\2\u0104\u0105\5\16\b\2"+
		"\u0105\u0106\7-\2\2\u0106\u0107\b\21\1\2\u0107\u0123\3\2\2\2\u0108\u0109"+
		"\78\2\2\u0109\u010a\7)\2\2\u010a\u010b\7-\2\2\u010b\u0123\b\21\1\2\u010c"+
		"\u010d\78\2\2\u010d\u010e\7*\2\2\u010e\u010f\7-\2\2\u010f\u0123\b\21\1"+
		"\2\u0110\u0111\7\6\2\2\u0111\u0112\b\21\1\2\u0112\u0113\7\61\2\2\u0113"+
		"\u0114\7;\2\2\u0114\u011c\b\21\1\2\u0115\u0116\7/\2\2\u0116\u0117\b\21"+
		"\1\2\u0117\u0118\5\26\f\2\u0118\u0119\b\21\1\2\u0119\u011b\3\2\2\2\u011a"+
		"\u0115\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120\7\60\2\2\u0120"+
		"\u0121\b\21\1\2\u0121\u0123\7-\2\2\u0122\u0102\3\2\2\2\u0122\u0108\3\2"+
		"\2\2\u0122\u010c\3\2\2\2\u0122\u0110\3\2\2\2\u0123!\3\2\2\2\u0124\u0126"+
		"\5$\23\2\u0125\u0127\5&\24\2\u0126\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u0129\b\22\1\2\u0129#\3\2\2\2\u012a\u012b\7\20\2"+
		"\2\u012b\u012c\7\61\2\2\u012c\u012d\5\16\b\2\u012d\u012e\b\23\1\2\u012e"+
		"\u012f\7\60\2\2\u012f\u0130\b\23\1\2\u0130\u0131\5\62\32\2\u0131\u0132"+
		"\b\23\1\2\u0132%\3\2\2\2\u0133\u0134\7\21\2\2\u0134\u0135\5\62\32\2\u0135"+
		"\'\3\2\2\2\u0136\u0137\7\23\2\2\u0137\u0138\7\61\2\2\u0138\u0139\b\25"+
		"\1\2\u0139\u013a\5\16\b\2\u013a\u013b\b\25\1\2\u013b\u013c\7\60\2\2\u013c"+
		"\u013d\5\62\32\2\u013d\u013e\b\25\1\2\u013e)\3\2\2\2\u013f\u0140\7\22"+
		"\2\2\u0140\u0141\7\61\2\2\u0141\u0142\5 \21\2\u0142\u0143\b\26\1\2\u0143"+
		"\u0144\5\16\b\2\u0144\u0145\7-\2\2\u0145\u0146\b\26\1\2\u0146\u0147\5"+
		"\26\f\2\u0147\u0148\b\26\1\2\u0148\u0149\7\60\2\2\u0149\u014a\5\62\32"+
		"\2\u014a\u014b\b\26\1\2\u014b+\3\2\2\2\u014c\u014d\7\26\2\2\u014d\u014e"+
		"\7\61\2\2\u014e\u014f\78\2\2\u014f\u0150\7\60\2\2\u0150\u0151\b\27\1\2"+
		"\u0151\u0155\7\63\2\2\u0152\u0154\5.\30\2\u0153\u0152\3\2\2\2\u0154\u0157"+
		"\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0158\u0159\7\62\2\2\u0159\u015a\b\27\1\2\u015a-\3\2\2"+
		"\2\u015b\u015c\7\27\2\2\u015c\u015d\79\2\2\u015d\u015e\7.\2\2\u015e\u0162"+
		"\b\30\1\2\u015f\u0161\5 \21\2\u0160\u015f\3\2\2\2\u0161\u0164\3\2\2\2"+
		"\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0165\3\2\2\2\u0164\u0162"+
		"\3\2\2\2\u0165\u0166\7\24\2\2\u0166\u0167\7-\2\2\u0167\u0175\b\30\1\2"+
		"\u0168\u0169\7\30\2\2\u0169\u016a\7.\2\2\u016a\u016e\b\30\1\2\u016b\u016d"+
		"\5 \21\2\u016c\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0172\7\24"+
		"\2\2\u0172\u0173\7-\2\2\u0173\u0175\b\30\1\2\u0174\u015b\3\2\2\2\u0174"+
		"\u0168\3\2\2\2\u0175/\3\2\2\2\u0176\u0177\7\25\2\2\u0177\u0178\5\26\f"+
		"\2\u0178\u0179\7-\2\2\u0179\u017a\b\31\1\2\u017a\61\3\2\2\2\u017b\u0185"+
		"\5 \21\2\u017c\u0180\7\63\2\2\u017d\u017f\5 \21\2\u017e\u017d\3\2\2\2"+
		"\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0183"+
		"\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0185\7\62\2\2\u0184\u017b\3\2\2\2"+
		"\u0184\u017c\3\2\2\2\u0185\63\3\2\2\2\35?Whv|\u0087\u0093\u00a0\u00a2"+
		"\u00b7\u00b9\u00c6\u00c8\u00d9\u00db\u00e5\u00f8\u0100\u011c\u0122\u0126"+
		"\u0155\u0162\u016e\u0174\u0180\u0184";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}