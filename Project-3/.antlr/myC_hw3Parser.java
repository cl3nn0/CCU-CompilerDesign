// Generated from /Users/ccu_demo/Downloads/compiler/406410002_prj3/myC_hw3.g by ANTLR 4.7.1

    // import packages here.
    import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class myC_hw3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, MAIN=4, PRINTF=5, SCANF=6, STRLEN=7, INT_TYPE=8, 
		SHORT_TYPE=9, LONG_TYPE=10, FLOAT_TYPE=11, DOUBLE_TYPE=12, CHAR_TYPE=13, 
		VOID_TYPE=14, IF=15, ELSE=16, FOR=17, WHILE=18, BREAK=19, RETURN=20, SWITCH=21, 
		CASE=22, DEFAULT=23, SIZEOF=24, INCLUDE=25, ASSIGN_OP=26, PLUS_OP=27, 
		MINUS_OP=28, MOD_OP=29, MULTIPLIED_OP=30, DIVIDED_OP=31, GREATER_THAN=32, 
		LESS_THAN=33, AND_LOGICAL=34, OR_LOGICAL=35, EQ_OP=36, NE_OP=37, LT_OP=38, 
		GT_OP=39, PP_OP=40, MM_OP=41, WHITE_SPACE=42, NEW_LINE=43, SEMICOLON=44, 
		COLON=45, COMMA=46, R_PAREN=47, L_PAREN=48, R_BRACE=49, L_BRACE=50, R_BRACKET=51, 
		L_BRACKET=52, COMMENT_1=53, COMMENT_2=54, ID=55, DEC_NUM=56, FLOAT_NUM=57, 
		LITERAL=58;
	public static final int
		RULE_program = 0, RULE_header_file = 1, RULE_prog = 2, RULE_declarations = 3, 
		RULE_type = 4, RULE_statements = 5, RULE_pre_logic_exprsssion = 6, RULE_pre_logic_2_exprsssion = 7, 
		RULE_pre_compare_exprsssion = 8, RULE_pre_arith_expression = 9, RULE_arith_expression = 10, 
		RULE_multExpr = 11, RULE_signExpr = 12, RULE_primaryExpr = 13, RULE_statement = 14, 
		RULE_if_statements = 15;
	public static final String[] ruleNames = {
		"program", "header_file", "prog", "declarations", "type", "statements", 
		"pre_logic_exprsssion", "pre_logic_2_exprsssion", "pre_compare_exprsssion", 
		"pre_arith_expression", "arith_expression", "multExpr", "signExpr", "primaryExpr", 
		"statement", "if_statements"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#'", "'.h'", "'&'", "'main'", "'printf'", "'scanf'", "'strlen'", 
		"'int'", "'short'", "'long'", "'float'", "'double'", "'char'", "'void'", 
		"'if'", "'else'", "'for'", "'while'", "'break'", "'return'", "'switch'", 
		"'case'", "'default'", "'sizeof'", "'include'", "'='", "'+'", "'-'", "'%'", 
		"'*'", "'/'", "'>'", "'<'", "'&&'", "'||'", "'=='", "'!='", "'<='", "'>='", 
		"'++'", "'--'", null, "'\n'", "';'", "':'", "','", "')'", "'('", "'}'", 
		"'{'", "']'", "'['"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "MAIN", "PRINTF", "SCANF", "STRLEN", "INT_TYPE", 
		"SHORT_TYPE", "LONG_TYPE", "FLOAT_TYPE", "DOUBLE_TYPE", "CHAR_TYPE", "VOID_TYPE", 
		"IF", "ELSE", "FOR", "WHILE", "BREAK", "RETURN", "SWITCH", "CASE", "DEFAULT", 
		"SIZEOF", "INCLUDE", "ASSIGN_OP", "PLUS_OP", "MINUS_OP", "MOD_OP", "MULTIPLIED_OP", 
		"DIVIDED_OP", "GREATER_THAN", "LESS_THAN", "AND_LOGICAL", "OR_LOGICAL", 
		"EQ_OP", "NE_OP", "LT_OP", "GT_OP", "PP_OP", "MM_OP", "WHITE_SPACE", "NEW_LINE", 
		"SEMICOLON", "COLON", "COMMA", "R_PAREN", "L_PAREN", "R_BRACE", "L_BRACE", 
		"R_BRACKET", "L_BRACKET", "COMMENT_1", "COMMENT_2", "ID", "DEC_NUM", "FLOAT_NUM", 
		"LITERAL"
	};
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
	public String getGrammarFileName() { return "myC_hw3.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    boolean TRACEON = false;
	    HashMap<String,Integer> symtab = new HashMap<String,Integer>();

		/*
	    public enum TypeInfo {
	        Integer,
			Short,
			Long,
			Float,
			Double,
			Char,
			Unknown,
			No_Exist,
			Error
	    }
	    */

	    /* attr_type:
	       1 => integer,
	       2 => short,
		   3 => long,
		   4 => float,
		   5 => double,
		   6 => char,
		   7 => boolean,
	       -1 => do not exist,
	       -2 => error
	     */	   

	public myC_hw3Parser(TokenStream input) {
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
			setState(32);
			header_file();
			setState(33);
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
		public TerminalNode INCLUDE() { return getToken(myC_hw3Parser.INCLUDE, 0); }
		public TerminalNode ID() { return getToken(myC_hw3Parser.ID, 0); }
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
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				match(T__0);
				setState(36);
				match(INCLUDE);
				setState(37);
				match(LESS_THAN);
				setState(38);
				match(ID);
				setState(39);
				match(T__1);
				setState(40);
				match(GREATER_THAN);
				setState(41);
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
		public TerminalNode VOID_TYPE() { return getToken(myC_hw3Parser.VOID_TYPE, 0); }
		public TerminalNode MAIN() { return getToken(myC_hw3Parser.MAIN, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode INT_TYPE() { return getToken(myC_hw3Parser.INT_TYPE, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_prog);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(VOID_TYPE);
				setState(46);
				match(MAIN);
				setState(47);
				match(L_PAREN);
				setState(48);
				match(R_PAREN);
				setState(49);
				match(L_BRACE);
				setState(50);
				declarations();
				setState(51);
				statements();
				setState(52);
				match(R_BRACE);
				if (TRACEON) System.out.println("VOID MAIN () {declarations statements}");
				}
				break;
			case INT_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(INT_TYPE);
				setState(56);
				match(MAIN);
				setState(57);
				match(L_PAREN);
				setState(58);
				match(R_PAREN);
				setState(59);
				match(L_BRACE);
				setState(60);
				declarations();
				setState(61);
				statements();
				setState(62);
				match(R_BRACE);
				if (TRACEON) System.out.println("INT MAIN () {declarations statements}");
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
		public TerminalNode ID() { return getToken(myC_hw3Parser.ID, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public Pre_logic_exprsssionContext pre_logic_exprsssion() {
			return getRuleContext(Pre_logic_exprsssionContext.class,0);
		}
		public TerminalNode DEC_NUM() { return getToken(myC_hw3Parser.DEC_NUM, 0); }
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declarations);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				type();
				setState(68);
				match(ID);
				setState(69);
				match(SEMICOLON);

							if (TRACEON) System.out.println("declarations: type ID : declarations");

							if (symtab.containsKey((((DeclarationsContext)_localctx).ID!=null?((DeclarationsContext)_localctx).ID.getText():null)))
							{
								System.out.println("Type Error: " + ((DeclarationsContext)_localctx).ID.getLine() + ": Redeclared identifier.");
							}
							else
							{
								symtab.put((((DeclarationsContext)_localctx).ID!=null?((DeclarationsContext)_localctx).ID.getText():null), ((DeclarationsContext)_localctx).type.attr_type);
							}
						
				setState(71);
				declarations();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				type();
				setState(74);
				match(ID);
				setState(75);
				match(ASSIGN_OP);
				setState(76);
				pre_logic_exprsssion();
				setState(77);
				match(SEMICOLON);

							if (TRACEON) System.out.println("declarations: type ID : declarations");

							if (symtab.containsKey((((DeclarationsContext)_localctx).ID!=null?((DeclarationsContext)_localctx).ID.getText():null)))
							{
								System.out.println("Type Error: " + ((DeclarationsContext)_localctx).ID.getLine() + ": Redeclared identifier.");
							}
							else
							{
								symtab.put((((DeclarationsContext)_localctx).ID!=null?((DeclarationsContext)_localctx).ID.getText():null), ((DeclarationsContext)_localctx).type.attr_type);
							}

							if (((DeclarationsContext)_localctx).type.attr_type != ((DeclarationsContext)_localctx).pre_logic_exprsssion.attr_type)
							{
								System.out.println("Type Error: " + ((DeclarationsContext)_localctx).ID.getLine() + ": Type mismatch for the two silde operands in an assignment statement.");
							}
						
				setState(79);
				declarations();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				type();
				setState(82);
				match(ID);
				setState(83);
				match(L_BRACKET);
				setState(84);
				match(DEC_NUM);
				setState(85);
				match(R_BRACKET);
				setState(86);
				match(SEMICOLON);
				setState(87);
				declarations();
				if (TRACEON) System.out.println("declarations: type ID[INT] : declarations");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				if (TRACEON) System.out.println("declarations: ");
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
		public int attr_type;
		public TerminalNode INT_TYPE() { return getToken(myC_hw3Parser.INT_TYPE, 0); }
		public TerminalNode SHORT_TYPE() { return getToken(myC_hw3Parser.SHORT_TYPE, 0); }
		public TerminalNode LONG_TYPE() { return getToken(myC_hw3Parser.LONG_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(myC_hw3Parser.FLOAT_TYPE, 0); }
		public TerminalNode DOUBLE_TYPE() { return getToken(myC_hw3Parser.DOUBLE_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(myC_hw3Parser.CHAR_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(INT_TYPE);
				if (TRACEON) System.out.println("type: INT");  ((TypeContext)_localctx).attr_type =  1;
				}
				break;
			case SHORT_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(SHORT_TYPE);
				if (TRACEON) System.out.println("type: SHORT");  ((TypeContext)_localctx).attr_type =  2;
				}
				break;
			case LONG_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				match(LONG_TYPE);
				if (TRACEON) System.out.println("type: LONG");  ((TypeContext)_localctx).attr_type =  3;
				}
				break;
			case FLOAT_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				match(FLOAT_TYPE);
				if (TRACEON) System.out.println("type: FLOAT");  ((TypeContext)_localctx).attr_type =  4;
				}
				break;
			case DOUBLE_TYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				match(DOUBLE_TYPE);
				if (TRACEON) System.out.println("type: DOUBLE");  ((TypeContext)_localctx).attr_type =  5;
				}
				break;
			case CHAR_TYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(103);
				match(CHAR_TYPE);
				if (TRACEON) System.out.println("type: CHAR");  ((TypeContext)_localctx).attr_type =  6;
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
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINTF:
			case SCANF:
			case IF:
			case FOR:
			case WHILE:
			case RETURN:
			case SWITCH:
			case PP_OP:
			case MM_OP:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				statement();
				setState(108);
				statements();
				}
				break;
			case BREAK:
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
		public int attr_type;
		public Pre_logic_2_exprsssionContext a;
		public Pre_logic_2_exprsssionContext b;
		public List<Pre_logic_2_exprsssionContext> pre_logic_2_exprsssion() {
			return getRuleContexts(Pre_logic_2_exprsssionContext.class);
		}
		public Pre_logic_2_exprsssionContext pre_logic_2_exprsssion(int i) {
			return getRuleContext(Pre_logic_2_exprsssionContext.class,i);
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
			setState(113);
			((Pre_logic_exprsssionContext)_localctx).a = pre_logic_2_exprsssion();
			((Pre_logic_exprsssionContext)_localctx).attr_type =  ((Pre_logic_exprsssionContext)_localctx).a.attr_type;
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR_LOGICAL) {
				{
				{
				setState(115);
				match(OR_LOGICAL);
				setState(116);
				((Pre_logic_exprsssionContext)_localctx).b = pre_logic_2_exprsssion();

								if (((Pre_logic_exprsssionContext)_localctx).a.attr_type != ((Pre_logic_exprsssionContext)_localctx).b.attr_type)
								{
									System.out.println("Type Error: " + (((Pre_logic_exprsssionContext)_localctx).a!=null?(((Pre_logic_exprsssionContext)_localctx).a.start):null).getLine() + ": Type mismatch for the operator || in an expression.");
									((Pre_logic_exprsssionContext)_localctx).attr_type =  -2;
								}
								else
								{
									((Pre_logic_exprsssionContext)_localctx).attr_type =  7;
								}
							
				}
				}
				setState(123);
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
		public int attr_type;
		public Pre_compare_exprsssionContext a;
		public Pre_compare_exprsssionContext b;
		public List<Pre_compare_exprsssionContext> pre_compare_exprsssion() {
			return getRuleContexts(Pre_compare_exprsssionContext.class);
		}
		public Pre_compare_exprsssionContext pre_compare_exprsssion(int i) {
			return getRuleContext(Pre_compare_exprsssionContext.class,i);
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
			setState(124);
			((Pre_logic_2_exprsssionContext)_localctx).a = pre_compare_exprsssion();
			((Pre_logic_2_exprsssionContext)_localctx).attr_type =  ((Pre_logic_2_exprsssionContext)_localctx).a.attr_type;
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND_LOGICAL) {
				{
				{
				setState(126);
				match(AND_LOGICAL);
				setState(127);
				((Pre_logic_2_exprsssionContext)_localctx).b = pre_compare_exprsssion();

								if (((Pre_logic_2_exprsssionContext)_localctx).a.attr_type != ((Pre_logic_2_exprsssionContext)_localctx).b.attr_type)
								{
									System.out.println("Type Error: " + (((Pre_logic_2_exprsssionContext)_localctx).a!=null?(((Pre_logic_2_exprsssionContext)_localctx).a.start):null).getLine() + ": Type mismatch for the operator && in an expression.");
									((Pre_logic_2_exprsssionContext)_localctx).attr_type =  -2;	
								}
								else
								{
									((Pre_logic_2_exprsssionContext)_localctx).attr_type =  7;
								}
							
				}
				}
				setState(134);
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
		public int attr_type;
		public Pre_arith_expressionContext a;
		public Pre_arith_expressionContext b;
		public Pre_arith_expressionContext c;
		public List<Pre_arith_expressionContext> pre_arith_expression() {
			return getRuleContexts(Pre_arith_expressionContext.class);
		}
		public Pre_arith_expressionContext pre_arith_expression(int i) {
			return getRuleContext(Pre_arith_expressionContext.class,i);
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
			setState(135);
			((Pre_compare_exprsssionContext)_localctx).a = pre_arith_expression();
			((Pre_compare_exprsssionContext)_localctx).attr_type =  ((Pre_compare_exprsssionContext)_localctx).a.attr_type;
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQ_OP || _la==NE_OP) {
				{
				setState(145);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQ_OP:
					{
					setState(137);
					match(EQ_OP);
					setState(138);
					((Pre_compare_exprsssionContext)_localctx).b = pre_arith_expression();

									if (((Pre_compare_exprsssionContext)_localctx).a.attr_type != ((Pre_compare_exprsssionContext)_localctx).b.attr_type)
									{
										System.out.println("Type Error: " + (((Pre_compare_exprsssionContext)_localctx).a!=null?(((Pre_compare_exprsssionContext)_localctx).a.start):null).getLine() + ": Type mismatch for the operator == in an expression.");
										((Pre_compare_exprsssionContext)_localctx).attr_type =  -2;	
									}
									else
									{
										((Pre_compare_exprsssionContext)_localctx).attr_type =  7;
									}
								
					}
					break;
				case NE_OP:
					{
					setState(141);
					match(NE_OP);
					setState(142);
					((Pre_compare_exprsssionContext)_localctx).c = pre_arith_expression();

									if (((Pre_compare_exprsssionContext)_localctx).a.attr_type != ((Pre_compare_exprsssionContext)_localctx).c.attr_type)
									{
										System.out.println("Type Error: " + (((Pre_compare_exprsssionContext)_localctx).a!=null?(((Pre_compare_exprsssionContext)_localctx).a.start):null).getLine() + ": Type mismatch for the operator != in an expression.");
										((Pre_compare_exprsssionContext)_localctx).attr_type =  -2;	
									}
									else
									{
										((Pre_compare_exprsssionContext)_localctx).attr_type =  7;
									}
								
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(149);
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
		public int attr_type;
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
			setState(150);
			((Pre_arith_expressionContext)_localctx).a = arith_expression();
			((Pre_arith_expressionContext)_localctx).attr_type =  ((Pre_arith_expressionContext)_localctx).a.attr_type;
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER_THAN) | (1L << LESS_THAN) | (1L << LT_OP) | (1L << GT_OP))) != 0)) {
				{
				setState(168);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GREATER_THAN:
					{
					setState(152);
					match(GREATER_THAN);
					setState(153);
					((Pre_arith_expressionContext)_localctx).b = arith_expression();

									if (((Pre_arith_expressionContext)_localctx).a.attr_type != ((Pre_arith_expressionContext)_localctx).b.attr_type)
									{
										System.out.println("Type Error: " + (((Pre_arith_expressionContext)_localctx).a!=null?(((Pre_arith_expressionContext)_localctx).a.start):null).getLine() + ": Type mismatch for the operator > in an expression.");
										((Pre_arith_expressionContext)_localctx).attr_type =  -2;	
									}
									else
									{
										((Pre_arith_expressionContext)_localctx).attr_type =  7;
									}
								
					}
					break;
				case LESS_THAN:
					{
					setState(156);
					match(LESS_THAN);
					setState(157);
					((Pre_arith_expressionContext)_localctx).c = arith_expression();

									if (((Pre_arith_expressionContext)_localctx).a.attr_type != ((Pre_arith_expressionContext)_localctx).c.attr_type)
									{
										System.out.println("Type Error: " + (((Pre_arith_expressionContext)_localctx).a!=null?(((Pre_arith_expressionContext)_localctx).a.start):null).getLine() + ": Type mismatch for the operator < in an expression.");
										((Pre_arith_expressionContext)_localctx).attr_type =  -2;	
									}
									else
									{
										((Pre_arith_expressionContext)_localctx).attr_type =  7;
									}
								
					}
					break;
				case GT_OP:
					{
					setState(160);
					match(GT_OP);
					setState(161);
					((Pre_arith_expressionContext)_localctx).d = arith_expression();

									if (((Pre_arith_expressionContext)_localctx).a.attr_type != ((Pre_arith_expressionContext)_localctx).d.attr_type)
									{
										System.out.println("Type Error: " + (((Pre_arith_expressionContext)_localctx).a!=null?(((Pre_arith_expressionContext)_localctx).a.start):null).getLine() + ": Type mismatch for the operator >= in an expression.");
										((Pre_arith_expressionContext)_localctx).attr_type =  -2;	
									}
									else
									{
										((Pre_arith_expressionContext)_localctx).attr_type =  7;
									}
								
					}
					break;
				case LT_OP:
					{
					setState(164);
					match(LT_OP);
					setState(165);
					((Pre_arith_expressionContext)_localctx).e = arith_expression();

									if (((Pre_arith_expressionContext)_localctx).a.attr_type != ((Pre_arith_expressionContext)_localctx).e.attr_type)
									{
										System.out.println("Type Error: " + (((Pre_arith_expressionContext)_localctx).a!=null?(((Pre_arith_expressionContext)_localctx).a.start):null).getLine() + ": Type mismatch for the operator <= in an expression.");
										((Pre_arith_expressionContext)_localctx).attr_type =  -2;	
									}
									else
									{
										((Pre_arith_expressionContext)_localctx).attr_type =  7;
									}
								
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(172);
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
		public int attr_type;
		public MultExprContext a;
		public MultExprContext b;
		public MultExprContext c;
		public List<MultExprContext> multExpr() {
			return getRuleContexts(MultExprContext.class);
		}
		public MultExprContext multExpr(int i) {
			return getRuleContext(MultExprContext.class,i);
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
			setState(173);
			((Arith_expressionContext)_localctx).a = multExpr();
			((Arith_expressionContext)_localctx).attr_type =  ((Arith_expressionContext)_localctx).a.attr_type;
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS_OP || _la==MINUS_OP) {
				{
				setState(183);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS_OP:
					{
					setState(175);
					match(PLUS_OP);
					setState(176);
					((Arith_expressionContext)_localctx).b = multExpr();

									if (((Arith_expressionContext)_localctx).a.attr_type != ((Arith_expressionContext)_localctx).b.attr_type)
									{
										System.out.println("Type Error: " + (((Arith_expressionContext)_localctx).a!=null?(((Arith_expressionContext)_localctx).a.start):null).getLine() + ": Type mismatch for the operator + in an expression.");
										((Arith_expressionContext)_localctx).attr_type =  -2;	
									}
								
					}
					break;
				case MINUS_OP:
					{
					setState(179);
					match(MINUS_OP);
					setState(180);
					((Arith_expressionContext)_localctx).c = multExpr();

									if (((Arith_expressionContext)_localctx).a.attr_type != ((Arith_expressionContext)_localctx).c.attr_type)
									{
										System.out.println("Type Error: " + (((Arith_expressionContext)_localctx).a!=null?(((Arith_expressionContext)_localctx).a.start):null).getLine() + ": Type mismatch for the operator - in an expression.");
										((Arith_expressionContext)_localctx).attr_type =  -2;	
									}
								
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(187);
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
		public int attr_type;
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
			setState(188);
			((MultExprContext)_localctx).a = signExpr();
			((MultExprContext)_localctx).attr_type =  ((MultExprContext)_localctx).a.attr_type;
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MOD_OP) | (1L << MULTIPLIED_OP) | (1L << DIVIDED_OP))) != 0)) {
				{
				setState(202);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULTIPLIED_OP:
					{
					setState(190);
					match(MULTIPLIED_OP);
					setState(191);
					((MultExprContext)_localctx).b = signExpr();

									if (((MultExprContext)_localctx).a.attr_type != ((MultExprContext)_localctx).b.attr_type)
									{
										System.out.println("Type Error: " + (((MultExprContext)_localctx).a!=null?(((MultExprContext)_localctx).a.start):null).getLine() + ": Type mismatch for the operator * in an expression.");
										((MultExprContext)_localctx).attr_type =  -2;	
									}
								
					}
					break;
				case DIVIDED_OP:
					{
					setState(194);
					match(DIVIDED_OP);
					setState(195);
					((MultExprContext)_localctx).c = signExpr();

									if (((MultExprContext)_localctx).a.attr_type != ((MultExprContext)_localctx).c.attr_type)
									{
										System.out.println("Type Error: " + (((MultExprContext)_localctx).a!=null?(((MultExprContext)_localctx).a.start):null).getLine() + ": Type mismatch for the operator / in an expression.");
										((MultExprContext)_localctx).attr_type =  -2;	
									}
								
					}
					break;
				case MOD_OP:
					{
					setState(198);
					match(MOD_OP);
					setState(199);
					((MultExprContext)_localctx).d = signExpr();

									if (((MultExprContext)_localctx).a.attr_type != ((MultExprContext)_localctx).d.attr_type)
									{
										System.out.println("Type Error: " + (((MultExprContext)_localctx).a!=null?(((MultExprContext)_localctx).a.start):null).getLine() + ": Type mismatch for the operator mod in an expression.");
										((MultExprContext)_localctx).attr_type =  -2;	
									}
								
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(206);
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
		public int attr_type;
		public PrimaryExprContext a;
		public PrimaryExprContext b;
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public SignExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signExpr; }
	}

	public final SignExprContext signExpr() throws RecognitionException {
		SignExprContext _localctx = new SignExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_signExpr);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIZEOF:
			case PP_OP:
			case MM_OP:
			case L_PAREN:
			case ID:
			case DEC_NUM:
			case FLOAT_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				((SignExprContext)_localctx).a = primaryExpr();
				((SignExprContext)_localctx).attr_type =  ((SignExprContext)_localctx).a.attr_type;
				}
				break;
			case MINUS_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(MINUS_OP);
				setState(211);
				((SignExprContext)_localctx).b = primaryExpr();
				((SignExprContext)_localctx).attr_type =  ((SignExprContext)_localctx).b.attr_type;
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
		public int attr_type;
		public TerminalNode DEC_NUM() { return getToken(myC_hw3Parser.DEC_NUM, 0); }
		public TerminalNode FLOAT_NUM() { return getToken(myC_hw3Parser.FLOAT_NUM, 0); }
		public TerminalNode ID() { return getToken(myC_hw3Parser.ID, 0); }
		public Pre_logic_exprsssionContext pre_logic_exprsssion() {
			return getRuleContext(Pre_logic_exprsssionContext.class,0);
		}
		public TerminalNode SIZEOF() { return getToken(myC_hw3Parser.SIZEOF, 0); }
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_primaryExpr);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(DEC_NUM);
				((PrimaryExprContext)_localctx).attr_type =  1;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(DEC_NUM);
				setState(219);
				match(PP_OP);
				((PrimaryExprContext)_localctx).attr_type =  1;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(DEC_NUM);
				setState(222);
				match(MM_OP);
				((PrimaryExprContext)_localctx).attr_type =  1;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				match(PP_OP);
				setState(225);
				match(DEC_NUM);
				((PrimaryExprContext)_localctx).attr_type =  1;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(227);
				match(MM_OP);
				setState(228);
				match(DEC_NUM);
				((PrimaryExprContext)_localctx).attr_type =  1;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(230);
				match(FLOAT_NUM);
				((PrimaryExprContext)_localctx).attr_type =  4;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(232);
				match(ID);

							if (symtab.containsKey((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null)))
							{
								((PrimaryExprContext)_localctx).attr_type =  symtab.get((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null));
							}
							else
							{
								System.out.println("Type Error: " + ((PrimaryExprContext)_localctx).ID.getLine() + ": Do not exist.");
								((PrimaryExprContext)_localctx).attr_type =  -1;
								return _localctx.attr_type;
							}
						
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(234);
				match(ID);
				setState(235);
				match(PP_OP);

							if (symtab.containsKey((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null)))
							{
								((PrimaryExprContext)_localctx).attr_type =  symtab.get((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null));
							}
							else
							{
								System.out.println("Type Error: " + ((PrimaryExprContext)_localctx).ID.getLine() + ": Do not exist.");
								((PrimaryExprContext)_localctx).attr_type =  -1;
								return _localctx.attr_type;
							}

							if (_localctx.attr_type != 1)
							{
								System.out.println("Type Error: " + ((PrimaryExprContext)_localctx).ID.getLine() + ": Type mismatch for the operator ++ in an expression.");
								((PrimaryExprContext)_localctx).attr_type =  -2;
							}
						
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(237);
				match(ID);
				setState(238);
				match(MM_OP);

							if (symtab.containsKey((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null)))
							{
								((PrimaryExprContext)_localctx).attr_type =  symtab.get((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null));
							}
							else
							{
								System.out.println("Type Error: " + ((PrimaryExprContext)_localctx).ID.getLine() + ": Do not exist.");
								((PrimaryExprContext)_localctx).attr_type =  -1;
								return _localctx.attr_type;
							}

							if (_localctx.attr_type != 1)
							{
								System.out.println("Type Error: " + ((PrimaryExprContext)_localctx).ID.getLine() + ": Type mismatch for the operator -- in an expression.");
								((PrimaryExprContext)_localctx).attr_type =  -2;
							}
						
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(240);
				match(PP_OP);
				setState(241);
				match(ID);

							if (symtab.containsKey((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null)))
							{
								((PrimaryExprContext)_localctx).attr_type =  symtab.get((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null));
							}
							else
							{
								System.out.println("Type Error: " + ((PrimaryExprContext)_localctx).ID.getLine() + ": Do not exist.");
								((PrimaryExprContext)_localctx).attr_type =  -1;
								return _localctx.attr_type;
							}

							if (_localctx.attr_type != 1)
							{
								System.out.println("Type Error: " + ((PrimaryExprContext)_localctx).ID.getLine() + ": Type mismatch for the operator ++ in an expression.");
								((PrimaryExprContext)_localctx).attr_type =  -2;
							}
						
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(243);
				match(MM_OP);
				setState(244);
				match(ID);

							if (symtab.containsKey((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null)))
							{
								((PrimaryExprContext)_localctx).attr_type =  symtab.get((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null));
							}
							else
							{
								System.out.println("Type Error: " + ((PrimaryExprContext)_localctx).ID.getLine() + ": Do not exist.");
								((PrimaryExprContext)_localctx).attr_type =  -1;
								return _localctx.attr_type;
							}

							if (_localctx.attr_type != 1)
							{
								System.out.println("Type Error: " + ((PrimaryExprContext)_localctx).ID.getLine() + ": Type mismatch for the operator -- in an expression.");
								((PrimaryExprContext)_localctx).attr_type =  -2;
							}
						
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(246);
				match(L_PAREN);
				setState(247);
				pre_logic_exprsssion();
				setState(248);
				match(R_PAREN);
				((PrimaryExprContext)_localctx).attr_type =  ((PrimaryExprContext)_localctx).pre_logic_exprsssion.attr_type;
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(251);
				match(SIZEOF);
				setState(252);
				match(L_PAREN);
				setState(253);
				match(ID);
				setState(254);
				match(R_PAREN);

							if (symtab.containsKey((((PrimaryExprContext)_localctx).ID!=null?((PrimaryExprContext)_localctx).ID.getText():null)))
							{
								((PrimaryExprContext)_localctx).attr_type =  1;
							}
							else
							{
								System.out.println("Type Error: " + ((PrimaryExprContext)_localctx).ID.getLine() + ": Do not exist.");
								((PrimaryExprContext)_localctx).attr_type =  -1;
								return _localctx.attr_type;
							}
						
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
		public int attr_type;
		public Pre_logic_exprsssionContext a;
		public Token x;
		public Pre_logic_exprsssionContext b;
		public Token y;
		public Pre_logic_exprsssionContext z;
		public Pre_logic_exprsssionContext c;
		public Pre_logic_exprsssionContext d;
		public List<TerminalNode> ID() { return getTokens(myC_hw3Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myC_hw3Parser.ID, i);
		}
		public List<Pre_logic_exprsssionContext> pre_logic_exprsssion() {
			return getRuleContexts(Pre_logic_exprsssionContext.class);
		}
		public Pre_logic_exprsssionContext pre_logic_exprsssion(int i) {
			return getRuleContext(Pre_logic_exprsssionContext.class,i);
		}
		public TerminalNode PRINTF() { return getToken(myC_hw3Parser.PRINTF, 0); }
		public TerminalNode LITERAL() { return getToken(myC_hw3Parser.LITERAL, 0); }
		public TerminalNode SCANF() { return getToken(myC_hw3Parser.SCANF, 0); }
		public TerminalNode STRLEN() { return getToken(myC_hw3Parser.STRLEN, 0); }
		public TerminalNode IF() { return getToken(myC_hw3Parser.IF, 0); }
		public List<If_statementsContext> if_statements() {
			return getRuleContexts(If_statementsContext.class);
		}
		public If_statementsContext if_statements(int i) {
			return getRuleContext(If_statementsContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(myC_hw3Parser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(myC_hw3Parser.FOR, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(myC_hw3Parser.WHILE, 0); }
		public TerminalNode SWITCH() { return getToken(myC_hw3Parser.SWITCH, 0); }
		public TerminalNode DEFAULT() { return getToken(myC_hw3Parser.DEFAULT, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<TerminalNode> CASE() { return getTokens(myC_hw3Parser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(myC_hw3Parser.CASE, i);
		}
		public List<TerminalNode> DEC_NUM() { return getTokens(myC_hw3Parser.DEC_NUM); }
		public TerminalNode DEC_NUM(int i) {
			return getToken(myC_hw3Parser.DEC_NUM, i);
		}
		public List<TerminalNode> BREAK() { return getTokens(myC_hw3Parser.BREAK); }
		public TerminalNode BREAK(int i) {
			return getToken(myC_hw3Parser.BREAK, i);
		}
		public TerminalNode RETURN() { return getToken(myC_hw3Parser.RETURN, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statement);
		int _la;
		try {
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(ID);
				setState(259);
				match(ASSIGN_OP);
				setState(260);
				((StatementContext)_localctx).a = pre_logic_exprsssion();
				setState(261);
				match(SEMICOLON);

							if (symtab.containsKey((((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null)))
							{
								((StatementContext)_localctx).attr_type =  symtab.get((((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null));
							}
							else
							{
								System.out.println("Type Error: " + ((StatementContext)_localctx).ID.getLine() + ": Do not exist.");
								((StatementContext)_localctx).attr_type =  -1;
								return _localctx.attr_type;
							}

							if (_localctx.attr_type != ((StatementContext)_localctx).a.attr_type)
							{
								System.out.println("Type Error: " + (((StatementContext)_localctx).a!=null?(((StatementContext)_localctx).a.start):null).getLine() + ": Type mismatch for the two silde operands in an assignment statement.");
								((StatementContext)_localctx).attr_type =  -2;
							}
						
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(PRINTF);
				setState(265);
				match(L_PAREN);
				setState(266);
				match(LITERAL);
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(267);
					match(COMMA);
					setState(268);
					pre_logic_exprsssion();
					}
					}
					setState(273);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(274);
				match(R_PAREN);
				setState(275);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				match(SCANF);
				setState(277);
				match(L_PAREN);
				setState(278);
				match(LITERAL);
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(279);
					match(COMMA);
					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(280);
						match(T__2);
						}
					}

					setState(283);
					pre_logic_exprsssion();
					}
					}
					setState(288);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(289);
				match(R_PAREN);
				setState(290);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(291);
				((StatementContext)_localctx).x = match(ID);
				setState(292);
				match(ASSIGN_OP);
				setState(293);
				match(STRLEN);
				setState(294);
				match(L_PAREN);
				setState(295);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==LITERAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(296);
				match(R_PAREN);
				setState(297);
				match(SEMICOLON);

							if (symtab.containsKey((((StatementContext)_localctx).x!=null?((StatementContext)_localctx).x.getText():null)))
							{
								((StatementContext)_localctx).attr_type =  symtab.get((((StatementContext)_localctx).x!=null?((StatementContext)_localctx).x.getText():null));
							}
							else
							{
								System.out.println("Type Error: " + ((StatementContext)_localctx).x.getLine() + ": Do not exist.");
								((StatementContext)_localctx).attr_type =  -1;
								return _localctx.attr_type;
							}

							if (_localctx.attr_type != 1)
							{
								System.out.println("Type Error: " + ((StatementContext)_localctx).x.getLine() + ": Type mismatch for the two silde operands in an assignment statement in STRLEN.");
								((StatementContext)_localctx).attr_type =  -2;
							}
						
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(299);
				match(IF);
				setState(300);
				match(L_PAREN);
				setState(301);
				((StatementContext)_localctx).b = pre_logic_exprsssion();
				setState(302);
				match(R_PAREN);
				setState(303);
				if_statements();
				setState(306);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					{
					setState(304);
					match(ELSE);
					setState(305);
					if_statements();
					}
					}
					break;
				}

							if (((StatementContext)_localctx).b.attr_type != 7)
							{
								System.out.println("Type Error: " + ((StatementContext)_localctx).IF.getLine() +  ": Type mismatch for the logical expression in IF.");
							}
						
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(310);
				match(FOR);
				setState(311);
				match(L_PAREN);
				setState(312);
				((StatementContext)_localctx).y = match(ID);
				setState(313);
				match(ASSIGN_OP);
				setState(314);
				((StatementContext)_localctx).z = pre_logic_exprsssion();
				setState(315);
				match(SEMICOLON);
				setState(316);
				((StatementContext)_localctx).c = pre_logic_exprsssion();
				setState(317);
				match(SEMICOLON);
				setState(318);
				arith_expression();
				setState(319);
				match(R_PAREN);
				setState(320);
				if_statements();

							if (((StatementContext)_localctx).c.attr_type != 7)
							{
								System.out.println("Type Error: " + ((StatementContext)_localctx).FOR.getLine() +  ": Type mismatch for the logical expression in FOR.");
							}

							if (symtab.containsKey((((StatementContext)_localctx).y!=null?((StatementContext)_localctx).y.getText():null)))
							{
								((StatementContext)_localctx).attr_type =  symtab.get((((StatementContext)_localctx).y!=null?((StatementContext)_localctx).y.getText():null));
							}
							else
							{
								System.out.println("Type Error: " + ((StatementContext)_localctx).y.getLine() + ": Do not exist.");
								((StatementContext)_localctx).attr_type =  -1;
								return _localctx.attr_type;
							}

							if (_localctx.attr_type != ((StatementContext)_localctx).z.attr_type)
							{
								System.out.println("Type Error: " + ((StatementContext)_localctx).y.getLine() + ": Type mismatch for the two silde operands in an assignment statement in FOR.");
								((StatementContext)_localctx).attr_type =  -2;
							}
						
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(323);
				match(WHILE);
				setState(324);
				match(L_PAREN);
				setState(325);
				((StatementContext)_localctx).d = pre_logic_exprsssion();
				setState(326);
				match(R_PAREN);
				setState(327);
				if_statements();

							if (((StatementContext)_localctx).d.attr_type != 7)
							{
								System.out.println("Type Error: " + ((StatementContext)_localctx).WHILE.getLine() +  ": Type mismatch for the logical expression in WHILE.");
							}
						
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(330);
				match(SWITCH);
				setState(331);
				match(L_PAREN);
				setState(332);
				pre_logic_exprsssion();
				setState(333);
				match(R_PAREN);
				setState(334);
				match(L_BRACE);
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE) {
					{
					{
					setState(335);
					match(CASE);
					setState(336);
					match(DEC_NUM);
					setState(337);
					match(COLON);
					setState(338);
					statements();
					setState(339);
					match(BREAK);
					setState(340);
					match(SEMICOLON);
					}
					}
					setState(346);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(347);
				match(DEFAULT);
				setState(348);
				match(COLON);
				setState(349);
				statements();
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK) {
					{
					setState(350);
					match(BREAK);
					setState(351);
					match(SEMICOLON);
					}
				}

				setState(354);
				match(R_BRACE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(356);
				match(ID);
				setState(357);
				match(PP_OP);
				setState(358);
				match(SEMICOLON);

							if (symtab.containsKey((((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null)))
							{
								((StatementContext)_localctx).attr_type =  symtab.get((((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null));
							}
							else
							{
								System.out.println("Type Error: " + ((StatementContext)_localctx).ID.getLine() + ": Do not exist.");
								((StatementContext)_localctx).attr_type =  -1;
								return _localctx.attr_type;
							}

							if (_localctx.attr_type != 1)
							{
								System.out.println("Type Error: " + ((StatementContext)_localctx).ID.getLine() + ": Type mismatch for the operator ++ in an expression.");
								((StatementContext)_localctx).attr_type =  -2;
							}
						
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(360);
				match(ID);
				setState(361);
				match(MM_OP);
				setState(362);
				match(SEMICOLON);

							if (symtab.containsKey((((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null)))
							{
								((StatementContext)_localctx).attr_type =  symtab.get((((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null));
							}
							else
							{
								System.out.println("Type Error: " + ((StatementContext)_localctx).ID.getLine() + ": Do not exist.");
								((StatementContext)_localctx).attr_type =  -1;
								return _localctx.attr_type;
							}

							if (_localctx.attr_type != 1)
							{
								System.out.println("Type Error: " + ((StatementContext)_localctx).ID.getLine() + ": Type mismatch for the operator -- in an expression.");
								((StatementContext)_localctx).attr_type =  -2;
							}
						
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(364);
				match(PP_OP);
				setState(365);
				match(ID);
				setState(366);
				match(SEMICOLON);

							if (symtab.containsKey((((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null)))
							{
								((StatementContext)_localctx).attr_type =  symtab.get((((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null));
							}
							else
							{
								System.out.println("Type Error: " + ((StatementContext)_localctx).ID.getLine() + ": Do not exist.");
								((StatementContext)_localctx).attr_type =  -1;
								return _localctx.attr_type;
							}

							if (_localctx.attr_type != 1)
							{
								System.out.println("Type Error: " + ((StatementContext)_localctx).ID.getLine() + ": Type mismatch for the operator ++ in an expression.");
								((StatementContext)_localctx).attr_type =  -2;
							}
						
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(368);
				match(MM_OP);
				setState(369);
				match(ID);
				setState(370);
				match(SEMICOLON);

							if (symtab.containsKey((((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null)))
							{
								((StatementContext)_localctx).attr_type =  symtab.get((((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null));
							}
							else
							{
								System.out.println("Type Error: " + ((StatementContext)_localctx).ID.getLine() + ": Do not exist.");
								((StatementContext)_localctx).attr_type =  -1;
								return _localctx.attr_type;
							}

							if (_localctx.attr_type != 1)
							{
								System.out.println("Type Error: " + ((StatementContext)_localctx).ID.getLine() + ": Type mismatch for the operator -- in an expression.");
								((StatementContext)_localctx).attr_type =  -2;
							}
						
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(372);
				match(RETURN);
				setState(373);
				pre_logic_exprsssion();
				setState(374);
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

	public static class If_statementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public If_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statements; }
	}

	public final If_statementsContext if_statements() throws RecognitionException {
		If_statementsContext _localctx = new If_statementsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_if_statements);
		try {
			setState(383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINTF:
			case SCANF:
			case IF:
			case FOR:
			case WHILE:
			case RETURN:
			case SWITCH:
			case PP_OP:
			case MM_OP:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				statement();
				}
				break;
			case L_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				match(L_BRACE);
				setState(380);
				statements();
				setState(381);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u0184\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4D\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5^\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6l\n\6\3\7\3\7\3\7\3\7\5\7r\n\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b"+
		"z\n\b\f\b\16\b}\13\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0085\n\t\f\t\16\t\u0088"+
		"\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0094\n\n\f\n\16\n\u0097"+
		"\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\7\13\u00ab\n\13\f\13\16\13\u00ae\13\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00ba\n\f\f\f\16\f\u00bd\13\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00cd\n\r\f"+
		"\r\16\r\u00d0\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00d9\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0103"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0110"+
		"\n\20\f\20\16\20\u0113\13\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u011c"+
		"\n\20\3\20\7\20\u011f\n\20\f\20\16\20\u0122\13\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u0135\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0159\n\20\f\20\16\20\u015c"+
		"\13\20\3\20\3\20\3\20\3\20\3\20\5\20\u0163\n\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\5\20\u017b\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u0182"+
		"\n\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\3\4\299<<"+
		"\2\u01ab\2\"\3\2\2\2\4-\3\2\2\2\6C\3\2\2\2\b]\3\2\2\2\nk\3\2\2\2\fq\3"+
		"\2\2\2\16s\3\2\2\2\20~\3\2\2\2\22\u0089\3\2\2\2\24\u0098\3\2\2\2\26\u00af"+
		"\3\2\2\2\30\u00be\3\2\2\2\32\u00d8\3\2\2\2\34\u0102\3\2\2\2\36\u017a\3"+
		"\2\2\2 \u0181\3\2\2\2\"#\5\4\3\2#$\5\6\4\2$\3\3\2\2\2%&\7\3\2\2&\'\7\33"+
		"\2\2\'(\7#\2\2()\79\2\2)*\7\4\2\2*+\7\"\2\2+.\5\4\3\2,.\3\2\2\2-%\3\2"+
		"\2\2-,\3\2\2\2.\5\3\2\2\2/\60\7\20\2\2\60\61\7\6\2\2\61\62\7\62\2\2\62"+
		"\63\7\61\2\2\63\64\7\64\2\2\64\65\5\b\5\2\65\66\5\f\7\2\66\67\7\63\2\2"+
		"\678\b\4\1\28D\3\2\2\29:\7\n\2\2:;\7\6\2\2;<\7\62\2\2<=\7\61\2\2=>\7\64"+
		"\2\2>?\5\b\5\2?@\5\f\7\2@A\7\63\2\2AB\b\4\1\2BD\3\2\2\2C/\3\2\2\2C9\3"+
		"\2\2\2D\7\3\2\2\2EF\5\n\6\2FG\79\2\2GH\7.\2\2HI\b\5\1\2IJ\5\b\5\2J^\3"+
		"\2\2\2KL\5\n\6\2LM\79\2\2MN\7\34\2\2NO\5\16\b\2OP\7.\2\2PQ\b\5\1\2QR\5"+
		"\b\5\2R^\3\2\2\2ST\5\n\6\2TU\79\2\2UV\7\66\2\2VW\7:\2\2WX\7\65\2\2XY\7"+
		".\2\2YZ\5\b\5\2Z[\b\5\1\2[^\3\2\2\2\\^\b\5\1\2]E\3\2\2\2]K\3\2\2\2]S\3"+
		"\2\2\2]\\\3\2\2\2^\t\3\2\2\2_`\7\n\2\2`l\b\6\1\2ab\7\13\2\2bl\b\6\1\2"+
		"cd\7\f\2\2dl\b\6\1\2ef\7\r\2\2fl\b\6\1\2gh\7\16\2\2hl\b\6\1\2ij\7\17\2"+
		"\2jl\b\6\1\2k_\3\2\2\2ka\3\2\2\2kc\3\2\2\2ke\3\2\2\2kg\3\2\2\2ki\3\2\2"+
		"\2l\13\3\2\2\2mn\5\36\20\2no\5\f\7\2or\3\2\2\2pr\3\2\2\2qm\3\2\2\2qp\3"+
		"\2\2\2r\r\3\2\2\2st\5\20\t\2t{\b\b\1\2uv\7%\2\2vw\5\20\t\2wx\b\b\1\2x"+
		"z\3\2\2\2yu\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\17\3\2\2\2}{\3\2\2"+
		"\2~\177\5\22\n\2\177\u0086\b\t\1\2\u0080\u0081\7$\2\2\u0081\u0082\5\22"+
		"\n\2\u0082\u0083\b\t\1\2\u0083\u0085\3\2\2\2\u0084\u0080\3\2\2\2\u0085"+
		"\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\21\3\2\2"+
		"\2\u0088\u0086\3\2\2\2\u0089\u008a\5\24\13\2\u008a\u0095\b\n\1\2\u008b"+
		"\u008c\7&\2\2\u008c\u008d\5\24\13\2\u008d\u008e\b\n\1\2\u008e\u0094\3"+
		"\2\2\2\u008f\u0090\7\'\2\2\u0090\u0091\5\24\13\2\u0091\u0092\b\n\1\2\u0092"+
		"\u0094\3\2\2\2\u0093\u008b\3\2\2\2\u0093\u008f\3\2\2\2\u0094\u0097\3\2"+
		"\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\23\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0098\u0099\5\26\f\2\u0099\u00ac\b\13\1\2\u009a\u009b\7\"\2\2"+
		"\u009b\u009c\5\26\f\2\u009c\u009d\b\13\1\2\u009d\u00ab\3\2\2\2\u009e\u009f"+
		"\7#\2\2\u009f\u00a0\5\26\f\2\u00a0\u00a1\b\13\1\2\u00a1\u00ab\3\2\2\2"+
		"\u00a2\u00a3\7)\2\2\u00a3\u00a4\5\26\f\2\u00a4\u00a5\b\13\1\2\u00a5\u00ab"+
		"\3\2\2\2\u00a6\u00a7\7(\2\2\u00a7\u00a8\5\26\f\2\u00a8\u00a9\b\13\1\2"+
		"\u00a9\u00ab\3\2\2\2\u00aa\u009a\3\2\2\2\u00aa\u009e\3\2\2\2\u00aa\u00a2"+
		"\3\2\2\2\u00aa\u00a6\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\25\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\5\30\r"+
		"\2\u00b0\u00bb\b\f\1\2\u00b1\u00b2\7\35\2\2\u00b2\u00b3\5\30\r\2\u00b3"+
		"\u00b4\b\f\1\2\u00b4\u00ba\3\2\2\2\u00b5\u00b6\7\36\2\2\u00b6\u00b7\5"+
		"\30\r\2\u00b7\u00b8\b\f\1\2\u00b8\u00ba\3\2\2\2\u00b9\u00b1\3\2\2\2\u00b9"+
		"\u00b5\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\27\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\5\32\16\2\u00bf"+
		"\u00ce\b\r\1\2\u00c0\u00c1\7 \2\2\u00c1\u00c2\5\32\16\2\u00c2\u00c3\b"+
		"\r\1\2\u00c3\u00cd\3\2\2\2\u00c4\u00c5\7!\2\2\u00c5\u00c6\5\32\16\2\u00c6"+
		"\u00c7\b\r\1\2\u00c7\u00cd\3\2\2\2\u00c8\u00c9\7\37\2\2\u00c9\u00ca\5"+
		"\32\16\2\u00ca\u00cb\b\r\1\2\u00cb\u00cd\3\2\2\2\u00cc\u00c0\3\2\2\2\u00cc"+
		"\u00c4\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00cf\31\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2"+
		"\5\34\17\2\u00d2\u00d3\b\16\1\2\u00d3\u00d9\3\2\2\2\u00d4\u00d5\7\36\2"+
		"\2\u00d5\u00d6\5\34\17\2\u00d6\u00d7\b\16\1\2\u00d7\u00d9\3\2\2\2\u00d8"+
		"\u00d1\3\2\2\2\u00d8\u00d4\3\2\2\2\u00d9\33\3\2\2\2\u00da\u00db\7:\2\2"+
		"\u00db\u0103\b\17\1\2\u00dc\u00dd\7:\2\2\u00dd\u00de\7*\2\2\u00de\u0103"+
		"\b\17\1\2\u00df\u00e0\7:\2\2\u00e0\u00e1\7+\2\2\u00e1\u0103\b\17\1\2\u00e2"+
		"\u00e3\7*\2\2\u00e3\u00e4\7:\2\2\u00e4\u0103\b\17\1\2\u00e5\u00e6\7+\2"+
		"\2\u00e6\u00e7\7:\2\2\u00e7\u0103\b\17\1\2\u00e8\u00e9\7;\2\2\u00e9\u0103"+
		"\b\17\1\2\u00ea\u00eb\79\2\2\u00eb\u0103\b\17\1\2\u00ec\u00ed\79\2\2\u00ed"+
		"\u00ee\7*\2\2\u00ee\u0103\b\17\1\2\u00ef\u00f0\79\2\2\u00f0\u00f1\7+\2"+
		"\2\u00f1\u0103\b\17\1\2\u00f2\u00f3\7*\2\2\u00f3\u00f4\79\2\2\u00f4\u0103"+
		"\b\17\1\2\u00f5\u00f6\7+\2\2\u00f6\u00f7\79\2\2\u00f7\u0103\b\17\1\2\u00f8"+
		"\u00f9\7\62\2\2\u00f9\u00fa\5\16\b\2\u00fa\u00fb\7\61\2\2\u00fb\u00fc"+
		"\b\17\1\2\u00fc\u0103\3\2\2\2\u00fd\u00fe\7\32\2\2\u00fe\u00ff\7\62\2"+
		"\2\u00ff\u0100\79\2\2\u0100\u0101\7\61\2\2\u0101\u0103\b\17\1\2\u0102"+
		"\u00da\3\2\2\2\u0102\u00dc\3\2\2\2\u0102\u00df\3\2\2\2\u0102\u00e2\3\2"+
		"\2\2\u0102\u00e5\3\2\2\2\u0102\u00e8\3\2\2\2\u0102\u00ea\3\2\2\2\u0102"+
		"\u00ec\3\2\2\2\u0102\u00ef\3\2\2\2\u0102\u00f2\3\2\2\2\u0102\u00f5\3\2"+
		"\2\2\u0102\u00f8\3\2\2\2\u0102\u00fd\3\2\2\2\u0103\35\3\2\2\2\u0104\u0105"+
		"\79\2\2\u0105\u0106\7\34\2\2\u0106\u0107\5\16\b\2\u0107\u0108\7.\2\2\u0108"+
		"\u0109\b\20\1\2\u0109\u017b\3\2\2\2\u010a\u010b\7\7\2\2\u010b\u010c\7"+
		"\62\2\2\u010c\u0111\7<\2\2\u010d\u010e\7\60\2\2\u010e\u0110\5\16\b\2\u010f"+
		"\u010d\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\7\61\2\2\u0115"+
		"\u017b\7.\2\2\u0116\u0117\7\b\2\2\u0117\u0118\7\62\2\2\u0118\u0120\7<"+
		"\2\2\u0119\u011b\7\60\2\2\u011a\u011c\7\5\2\2\u011b\u011a\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\5\16\b\2\u011e\u0119\3"+
		"\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\7\61\2\2\u0124\u017b\7"+
		".\2\2\u0125\u0126\79\2\2\u0126\u0127\7\34\2\2\u0127\u0128\7\t\2\2\u0128"+
		"\u0129\7\62\2\2\u0129\u012a\t\2\2\2\u012a\u012b\7\61\2\2\u012b\u012c\7"+
		".\2\2\u012c\u017b\b\20\1\2\u012d\u012e\7\21\2\2\u012e\u012f\7\62\2\2\u012f"+
		"\u0130\5\16\b\2\u0130\u0131\7\61\2\2\u0131\u0134\5 \21\2\u0132\u0133\7"+
		"\22\2\2\u0133\u0135\5 \21\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u0137\b\20\1\2\u0137\u017b\3\2\2\2\u0138\u0139\7"+
		"\23\2\2\u0139\u013a\7\62\2\2\u013a\u013b\79\2\2\u013b\u013c\7\34\2\2\u013c"+
		"\u013d\5\16\b\2\u013d\u013e\7.\2\2\u013e\u013f\5\16\b\2\u013f\u0140\7"+
		".\2\2\u0140\u0141\5\26\f\2\u0141\u0142\7\61\2\2\u0142\u0143\5 \21\2\u0143"+
		"\u0144\b\20\1\2\u0144\u017b\3\2\2\2\u0145\u0146\7\24\2\2\u0146\u0147\7"+
		"\62\2\2\u0147\u0148\5\16\b\2\u0148\u0149\7\61\2\2\u0149\u014a\5 \21\2"+
		"\u014a\u014b\b\20\1\2\u014b\u017b\3\2\2\2\u014c\u014d\7\27\2\2\u014d\u014e"+
		"\7\62\2\2\u014e\u014f\5\16\b\2\u014f\u0150\7\61\2\2\u0150\u015a\7\64\2"+
		"\2\u0151\u0152\7\30\2\2\u0152\u0153\7:\2\2\u0153\u0154\7/\2\2\u0154\u0155"+
		"\5\f\7\2\u0155\u0156\7\25\2\2\u0156\u0157\7.\2\2\u0157\u0159\3\2\2\2\u0158"+
		"\u0151\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2"+
		"\2\2\u015b\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015e\7\31\2\2\u015e"+
		"\u015f\7/\2\2\u015f\u0162\5\f\7\2\u0160\u0161\7\25\2\2\u0161\u0163\7."+
		"\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"\u0165\7\63\2\2\u0165\u017b\3\2\2\2\u0166\u0167\79\2\2\u0167\u0168\7*"+
		"\2\2\u0168\u0169\7.\2\2\u0169\u017b\b\20\1\2\u016a\u016b\79\2\2\u016b"+
		"\u016c\7+\2\2\u016c\u016d\7.\2\2\u016d\u017b\b\20\1\2\u016e\u016f\7*\2"+
		"\2\u016f\u0170\79\2\2\u0170\u0171\7.\2\2\u0171\u017b\b\20\1\2\u0172\u0173"+
		"\7+\2\2\u0173\u0174\79\2\2\u0174\u0175\7.\2\2\u0175\u017b\b\20\1\2\u0176"+
		"\u0177\7\26\2\2\u0177\u0178\5\16\b\2\u0178\u0179\7.\2\2\u0179\u017b\3"+
		"\2\2\2\u017a\u0104\3\2\2\2\u017a\u010a\3\2\2\2\u017a\u0116\3\2\2\2\u017a"+
		"\u0125\3\2\2\2\u017a\u012d\3\2\2\2\u017a\u0138\3\2\2\2\u017a\u0145\3\2"+
		"\2\2\u017a\u014c\3\2\2\2\u017a\u0166\3\2\2\2\u017a\u016a\3\2\2\2\u017a"+
		"\u016e\3\2\2\2\u017a\u0172\3\2\2\2\u017a\u0176\3\2\2\2\u017b\37\3\2\2"+
		"\2\u017c\u0182\5\36\20\2\u017d\u017e\7\64\2\2\u017e\u017f\5\f\7\2\u017f"+
		"\u0180\7\63\2\2\u0180\u0182\3\2\2\2\u0181\u017c\3\2\2\2\u0181\u017d\3"+
		"\2\2\2\u0182!\3\2\2\2\33-C]kq{\u0086\u0093\u0095\u00aa\u00ac\u00b9\u00bb"+
		"\u00cc\u00ce\u00d8\u0102\u0111\u011b\u0120\u0134\u015a\u0162\u017a\u0181";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}