// Generated from /Users/ccu_demo/Downloads/compiler/406410002_hw2/out/backup/myC_hw2.g by ANTLR 4.7.1

    // import packages here.

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class myC_hw2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, MAIN=2, PRINTF=3, SCANF=4, STRCPY=5, STRLEN=6, INT_TYPE=7, SHORT_TYPE=8, 
		LONG_TYPE=9, FLOAT_TYPE=10, DOUBLE_TYPE=11, CHAR_TYPE=12, VOID_TYPE=13, 
		IF=14, ELSE=15, FOR=16, WHILE=17, BREAK=18, CONTINUE=19, RETURN=20, SWITCH=21, 
		CASE=22, DEFAULT=23, SIZEOF=24, ASSIGN_OP=25, PLUS_OP=26, MINUS_OP=27, 
		MOD_OP=28, XOR_OP=29, MULTIPLIED_OP=30, DIVIDED_OP=31, GREATER_THAN=32, 
		LESS_THAN=33, AND_LOGICAL=34, OR_LOGICAL=35, NOT_LOGICAL=36, EQ_OP=37, 
		LT_OP=38, GT_OP=39, NE_OP=40, PP_OP=41, MM_OP=42, RSHIFT_OP=43, LSHIFT_OP=44, 
		WHITE_SPACE=45, NEW_LINE=46, SEMICOLON=47, COLON=48, COMMA=49, R_PAREN=50, 
		L_PAREN=51, R_BRACE=52, L_BRACE=53, R_BRACKET=54, L_BRACKET=55, COMMENT_1=56, 
		COMMENT_2=57, ID=58, DEC_NUM=59, FLOAT_NUM=60, LITERAL=61;
	public static final int
		RULE_program = 0, RULE_declarations = 1, RULE_type = 2, RULE_statements = 3, 
		RULE_pre_logic_exprsssion = 4, RULE_pre_arith_expression = 5, RULE_arith_expression = 6, 
		RULE_multExpr = 7, RULE_signExpr = 8, RULE_primaryExpr = 9, RULE_statement = 10, 
		RULE_if_statements = 11;
	public static final String[] ruleNames = {
		"program", "declarations", "type", "statements", "pre_logic_exprsssion", 
		"pre_arith_expression", "arith_expression", "multExpr", "signExpr", "primaryExpr", 
		"statement", "if_statements"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'&'", "'main'", "'printf'", "'scanf'", "'strcpy'", "'strlen'", 
		"'int'", "'short'", "'long'", "'float'", "'double'", "'char'", "'void'", 
		"'if'", "'else'", "'for'", "'while'", "'break'", "'continue'", "'return'", 
		"'switch'", "'case'", "'default'", "'sizeof'", "'='", "'+'", "'-'", "'%'", 
		"'^'", "'*'", "'/'", "'>'", "'<'", "'&&'", "'||'", "'!'", "'=='", "'<='", 
		"'>='", "'!='", "'++'", "'--'", "'<<'", "'>>'", null, "'\n'", "';'", "':'", 
		"','", "')'", "'('", "'}'", "'{'", "']'", "'['"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "MAIN", "PRINTF", "SCANF", "STRCPY", "STRLEN", "INT_TYPE", 
		"SHORT_TYPE", "LONG_TYPE", "FLOAT_TYPE", "DOUBLE_TYPE", "CHAR_TYPE", "VOID_TYPE", 
		"IF", "ELSE", "FOR", "WHILE", "BREAK", "CONTINUE", "RETURN", "SWITCH", 
		"CASE", "DEFAULT", "SIZEOF", "ASSIGN_OP", "PLUS_OP", "MINUS_OP", "MOD_OP", 
		"XOR_OP", "MULTIPLIED_OP", "DIVIDED_OP", "GREATER_THAN", "LESS_THAN", 
		"AND_LOGICAL", "OR_LOGICAL", "NOT_LOGICAL", "EQ_OP", "LT_OP", "GT_OP", 
		"NE_OP", "PP_OP", "MM_OP", "RSHIFT_OP", "LSHIFT_OP", "WHITE_SPACE", "NEW_LINE", 
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
	public String getGrammarFileName() { return "myC_hw2.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    boolean TRACEON = true;

	public myC_hw2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode VOID_TYPE() { return getToken(myC_hw2Parser.VOID_TYPE, 0); }
		public TerminalNode MAIN() { return getToken(myC_hw2Parser.MAIN, 0); }
		public TerminalNode L_PAREN() { return getToken(myC_hw2Parser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(myC_hw2Parser.R_PAREN, 0); }
		public TerminalNode L_BRACE() { return getToken(myC_hw2Parser.L_BRACE, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(myC_hw2Parser.R_BRACE, 0); }
		public TerminalNode INT_TYPE() { return getToken(myC_hw2Parser.INT_TYPE, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				match(VOID_TYPE);
				setState(25);
				match(MAIN);
				setState(26);
				match(L_PAREN);
				setState(27);
				match(R_PAREN);
				setState(28);
				match(L_BRACE);
				setState(29);
				declarations();
				setState(30);
				statements();
				setState(31);
				match(R_BRACE);
				if (TRACEON) System.out.println("VOID MAIN () {declarations statements}");
				}
				break;
			case INT_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(INT_TYPE);
				setState(35);
				match(MAIN);
				setState(36);
				match(L_PAREN);
				setState(37);
				match(R_PAREN);
				setState(38);
				match(L_BRACE);
				setState(39);
				declarations();
				setState(40);
				statements();
				setState(41);
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
		public TerminalNode ID() { return getToken(myC_hw2Parser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(myC_hw2Parser.SEMICOLON, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode ASSIGN_OP() { return getToken(myC_hw2Parser.ASSIGN_OP, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode L_BRACKET() { return getToken(myC_hw2Parser.L_BRACKET, 0); }
		public TerminalNode DEC_NUM() { return getToken(myC_hw2Parser.DEC_NUM, 0); }
		public TerminalNode R_BRACKET() { return getToken(myC_hw2Parser.R_BRACKET, 0); }
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				type();
				setState(47);
				match(ID);
				setState(48);
				match(SEMICOLON);
				setState(49);
				declarations();
				if (TRACEON) System.out.println("declarations: type ID : declarations");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				type();
				setState(53);
				match(ID);
				setState(54);
				match(ASSIGN_OP);
				setState(55);
				arith_expression();
				setState(56);
				match(SEMICOLON);
				setState(57);
				declarations();
				if (TRACEON) System.out.println("declarations: type ID = digit : declarations");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				type();
				setState(61);
				match(ID);
				setState(62);
				match(L_BRACKET);
				setState(63);
				match(DEC_NUM);
				setState(64);
				match(R_BRACKET);
				setState(65);
				match(SEMICOLON);
				setState(66);
				declarations();
				if (TRACEON) System.out.println("declarations: type ID[array_size] : declarations");
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
		public TerminalNode INT_TYPE() { return getToken(myC_hw2Parser.INT_TYPE, 0); }
		public TerminalNode SHORT_TYPE() { return getToken(myC_hw2Parser.SHORT_TYPE, 0); }
		public TerminalNode LONG_TYPE() { return getToken(myC_hw2Parser.LONG_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(myC_hw2Parser.FLOAT_TYPE, 0); }
		public TerminalNode DOUBLE_TYPE() { return getToken(myC_hw2Parser.DOUBLE_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(myC_hw2Parser.CHAR_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(INT_TYPE);
				if (TRACEON) System.out.println("type: INT");
				}
				break;
			case SHORT_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(SHORT_TYPE);
				if (TRACEON) System.out.println("type: SHORT");
				}
				break;
			case LONG_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				match(LONG_TYPE);
				if (TRACEON) System.out.println("type: LONG");
				}
				break;
			case FLOAT_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				match(FLOAT_TYPE);
				if (TRACEON) System.out.println("type: FLOAT");
				}
				break;
			case DOUBLE_TYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				match(DOUBLE_TYPE);
				if (TRACEON) System.out.println("type: DOUBLE");
				}
				break;
			case CHAR_TYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(82);
				match(CHAR_TYPE);
				if (TRACEON) System.out.println("type: CHAR");
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
		enterRule(_localctx, 6, RULE_statements);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINTF:
			case SCANF:
			case STRCPY:
			case IF:
			case FOR:
			case WHILE:
			case RETURN:
			case SWITCH:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				statement();
				setState(87);
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
		public List<Pre_arith_expressionContext> pre_arith_expression() {
			return getRuleContexts(Pre_arith_expressionContext.class);
		}
		public Pre_arith_expressionContext pre_arith_expression(int i) {
			return getRuleContext(Pre_arith_expressionContext.class,i);
		}
		public List<TerminalNode> NOT_LOGICAL() { return getTokens(myC_hw2Parser.NOT_LOGICAL); }
		public TerminalNode NOT_LOGICAL(int i) {
			return getToken(myC_hw2Parser.NOT_LOGICAL, i);
		}
		public List<TerminalNode> AND_LOGICAL() { return getTokens(myC_hw2Parser.AND_LOGICAL); }
		public TerminalNode AND_LOGICAL(int i) {
			return getToken(myC_hw2Parser.AND_LOGICAL, i);
		}
		public List<TerminalNode> OR_LOGICAL() { return getTokens(myC_hw2Parser.OR_LOGICAL); }
		public TerminalNode OR_LOGICAL(int i) {
			return getToken(myC_hw2Parser.OR_LOGICAL, i);
		}
		public Pre_logic_exprsssionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_logic_exprsssion; }
	}

	public final Pre_logic_exprsssionContext pre_logic_exprsssion() throws RecognitionException {
		Pre_logic_exprsssionContext _localctx = new Pre_logic_exprsssionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pre_logic_exprsssion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			pre_arith_expression();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND_LOGICAL) | (1L << OR_LOGICAL) | (1L << NOT_LOGICAL))) != 0)) {
				{
				setState(99);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT_LOGICAL:
					{
					setState(93);
					match(NOT_LOGICAL);
					setState(94);
					pre_arith_expression();
					}
					break;
				case AND_LOGICAL:
					{
					setState(95);
					match(AND_LOGICAL);
					setState(96);
					pre_arith_expression();
					}
					break;
				case OR_LOGICAL:
					{
					setState(97);
					match(OR_LOGICAL);
					setState(98);
					pre_arith_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(103);
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
		public List<Arith_expressionContext> arith_expression() {
			return getRuleContexts(Arith_expressionContext.class);
		}
		public Arith_expressionContext arith_expression(int i) {
			return getRuleContext(Arith_expressionContext.class,i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(myC_hw2Parser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(myC_hw2Parser.GREATER_THAN, i);
		}
		public List<TerminalNode> LESS_THAN() { return getTokens(myC_hw2Parser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(myC_hw2Parser.LESS_THAN, i);
		}
		public List<TerminalNode> EQ_OP() { return getTokens(myC_hw2Parser.EQ_OP); }
		public TerminalNode EQ_OP(int i) {
			return getToken(myC_hw2Parser.EQ_OP, i);
		}
		public List<TerminalNode> LT_OP() { return getTokens(myC_hw2Parser.LT_OP); }
		public TerminalNode LT_OP(int i) {
			return getToken(myC_hw2Parser.LT_OP, i);
		}
		public List<TerminalNode> GT_OP() { return getTokens(myC_hw2Parser.GT_OP); }
		public TerminalNode GT_OP(int i) {
			return getToken(myC_hw2Parser.GT_OP, i);
		}
		public List<TerminalNode> NE_OP() { return getTokens(myC_hw2Parser.NE_OP); }
		public TerminalNode NE_OP(int i) {
			return getToken(myC_hw2Parser.NE_OP, i);
		}
		public Pre_arith_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_arith_expression; }
	}

	public final Pre_arith_expressionContext pre_arith_expression() throws RecognitionException {
		Pre_arith_expressionContext _localctx = new Pre_arith_expressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pre_arith_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			arith_expression();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER_THAN) | (1L << LESS_THAN) | (1L << EQ_OP) | (1L << LT_OP) | (1L << GT_OP) | (1L << NE_OP))) != 0)) {
				{
				setState(117);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GREATER_THAN:
					{
					setState(105);
					match(GREATER_THAN);
					setState(106);
					arith_expression();
					}
					break;
				case LESS_THAN:
					{
					setState(107);
					match(LESS_THAN);
					setState(108);
					arith_expression();
					}
					break;
				case EQ_OP:
					{
					setState(109);
					match(EQ_OP);
					setState(110);
					arith_expression();
					}
					break;
				case LT_OP:
					{
					setState(111);
					match(LT_OP);
					setState(112);
					arith_expression();
					}
					break;
				case GT_OP:
					{
					setState(113);
					match(GT_OP);
					setState(114);
					arith_expression();
					}
					break;
				case NE_OP:
					{
					setState(115);
					match(NE_OP);
					setState(116);
					arith_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(121);
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
		public List<MultExprContext> multExpr() {
			return getRuleContexts(MultExprContext.class);
		}
		public MultExprContext multExpr(int i) {
			return getRuleContext(MultExprContext.class,i);
		}
		public List<TerminalNode> PLUS_OP() { return getTokens(myC_hw2Parser.PLUS_OP); }
		public TerminalNode PLUS_OP(int i) {
			return getToken(myC_hw2Parser.PLUS_OP, i);
		}
		public List<TerminalNode> MINUS_OP() { return getTokens(myC_hw2Parser.MINUS_OP); }
		public TerminalNode MINUS_OP(int i) {
			return getToken(myC_hw2Parser.MINUS_OP, i);
		}
		public List<TerminalNode> MOD_OP() { return getTokens(myC_hw2Parser.MOD_OP); }
		public TerminalNode MOD_OP(int i) {
			return getToken(myC_hw2Parser.MOD_OP, i);
		}
		public List<TerminalNode> XOR_OP() { return getTokens(myC_hw2Parser.XOR_OP); }
		public TerminalNode XOR_OP(int i) {
			return getToken(myC_hw2Parser.XOR_OP, i);
		}
		public Arith_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_expression; }
	}

	public final Arith_expressionContext arith_expression() throws RecognitionException {
		Arith_expressionContext _localctx = new Arith_expressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arith_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			multExpr();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_OP) | (1L << MINUS_OP) | (1L << MOD_OP) | (1L << XOR_OP))) != 0)) {
				{
				setState(131);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS_OP:
					{
					setState(123);
					match(PLUS_OP);
					setState(124);
					multExpr();
					}
					break;
				case MINUS_OP:
					{
					setState(125);
					match(MINUS_OP);
					setState(126);
					multExpr();
					}
					break;
				case MOD_OP:
					{
					setState(127);
					match(MOD_OP);
					setState(128);
					multExpr();
					}
					break;
				case XOR_OP:
					{
					setState(129);
					match(XOR_OP);
					setState(130);
					multExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class MultExprContext extends ParserRuleContext {
		public List<SignExprContext> signExpr() {
			return getRuleContexts(SignExprContext.class);
		}
		public SignExprContext signExpr(int i) {
			return getRuleContext(SignExprContext.class,i);
		}
		public List<TerminalNode> MULTIPLIED_OP() { return getTokens(myC_hw2Parser.MULTIPLIED_OP); }
		public TerminalNode MULTIPLIED_OP(int i) {
			return getToken(myC_hw2Parser.MULTIPLIED_OP, i);
		}
		public List<TerminalNode> DIVIDED_OP() { return getTokens(myC_hw2Parser.DIVIDED_OP); }
		public TerminalNode DIVIDED_OP(int i) {
			return getToken(myC_hw2Parser.DIVIDED_OP, i);
		}
		public MultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpr; }
	}

	public final MultExprContext multExpr() throws RecognitionException {
		MultExprContext _localctx = new MultExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_multExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			signExpr();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLIED_OP || _la==DIVIDED_OP) {
				{
				setState(141);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULTIPLIED_OP:
					{
					setState(137);
					match(MULTIPLIED_OP);
					setState(138);
					signExpr();
					}
					break;
				case DIVIDED_OP:
					{
					setState(139);
					match(DIVIDED_OP);
					setState(140);
					signExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(145);
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
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public TerminalNode MINUS_OP() { return getToken(myC_hw2Parser.MINUS_OP, 0); }
		public SignExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signExpr; }
	}

	public final SignExprContext signExpr() throws RecognitionException {
		SignExprContext _localctx = new SignExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_signExpr);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIZEOF:
			case L_PAREN:
			case ID:
			case DEC_NUM:
			case FLOAT_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				primaryExpr();
				}
				break;
			case MINUS_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(MINUS_OP);
				setState(148);
				primaryExpr();
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
		public TerminalNode DEC_NUM() { return getToken(myC_hw2Parser.DEC_NUM, 0); }
		public TerminalNode PP_OP() { return getToken(myC_hw2Parser.PP_OP, 0); }
		public TerminalNode MM_OP() { return getToken(myC_hw2Parser.MM_OP, 0); }
		public TerminalNode FLOAT_NUM() { return getToken(myC_hw2Parser.FLOAT_NUM, 0); }
		public TerminalNode ID() { return getToken(myC_hw2Parser.ID, 0); }
		public TerminalNode L_PAREN() { return getToken(myC_hw2Parser.L_PAREN, 0); }
		public Pre_arith_expressionContext pre_arith_expression() {
			return getRuleContext(Pre_arith_expressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(myC_hw2Parser.R_PAREN, 0); }
		public TerminalNode SIZEOF() { return getToken(myC_hw2Parser.SIZEOF, 0); }
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_primaryExpr);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(DEC_NUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(DEC_NUM);
				setState(153);
				match(PP_OP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				match(DEC_NUM);
				setState(155);
				match(MM_OP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				match(FLOAT_NUM);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(157);
				match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(158);
				match(ID);
				setState(159);
				match(PP_OP);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(160);
				match(ID);
				setState(161);
				match(MM_OP);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(162);
				match(L_PAREN);
				setState(163);
				pre_arith_expression();
				setState(164);
				match(R_PAREN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(166);
				match(SIZEOF);
				setState(167);
				match(L_PAREN);
				setState(168);
				match(ID);
				setState(169);
				match(R_PAREN);
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
		public List<TerminalNode> ID() { return getTokens(myC_hw2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myC_hw2Parser.ID, i);
		}
		public TerminalNode ASSIGN_OP() { return getToken(myC_hw2Parser.ASSIGN_OP, 0); }
		public List<Pre_arith_expressionContext> pre_arith_expression() {
			return getRuleContexts(Pre_arith_expressionContext.class);
		}
		public Pre_arith_expressionContext pre_arith_expression(int i) {
			return getRuleContext(Pre_arith_expressionContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(myC_hw2Parser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(myC_hw2Parser.SEMICOLON, i);
		}
		public TerminalNode PRINTF() { return getToken(myC_hw2Parser.PRINTF, 0); }
		public TerminalNode L_PAREN() { return getToken(myC_hw2Parser.L_PAREN, 0); }
		public TerminalNode LITERAL() { return getToken(myC_hw2Parser.LITERAL, 0); }
		public TerminalNode R_PAREN() { return getToken(myC_hw2Parser.R_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(myC_hw2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(myC_hw2Parser.COMMA, i);
		}
		public TerminalNode SCANF() { return getToken(myC_hw2Parser.SCANF, 0); }
		public TerminalNode STRCPY() { return getToken(myC_hw2Parser.STRCPY, 0); }
		public TerminalNode STRLEN() { return getToken(myC_hw2Parser.STRLEN, 0); }
		public TerminalNode IF() { return getToken(myC_hw2Parser.IF, 0); }
		public Pre_logic_exprsssionContext pre_logic_exprsssion() {
			return getRuleContext(Pre_logic_exprsssionContext.class,0);
		}
		public List<If_statementsContext> if_statements() {
			return getRuleContexts(If_statementsContext.class);
		}
		public If_statementsContext if_statements(int i) {
			return getRuleContext(If_statementsContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(myC_hw2Parser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(myC_hw2Parser.FOR, 0); }
		public List<Arith_expressionContext> arith_expression() {
			return getRuleContexts(Arith_expressionContext.class);
		}
		public Arith_expressionContext arith_expression(int i) {
			return getRuleContext(Arith_expressionContext.class,i);
		}
		public TerminalNode WHILE() { return getToken(myC_hw2Parser.WHILE, 0); }
		public TerminalNode SWITCH() { return getToken(myC_hw2Parser.SWITCH, 0); }
		public TerminalNode L_BRACE() { return getToken(myC_hw2Parser.L_BRACE, 0); }
		public TerminalNode DEFAULT() { return getToken(myC_hw2Parser.DEFAULT, 0); }
		public List<TerminalNode> COLON() { return getTokens(myC_hw2Parser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(myC_hw2Parser.COLON, i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode R_BRACE() { return getToken(myC_hw2Parser.R_BRACE, 0); }
		public List<TerminalNode> CASE() { return getTokens(myC_hw2Parser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(myC_hw2Parser.CASE, i);
		}
		public List<TerminalNode> DEC_NUM() { return getTokens(myC_hw2Parser.DEC_NUM); }
		public TerminalNode DEC_NUM(int i) {
			return getToken(myC_hw2Parser.DEC_NUM, i);
		}
		public List<TerminalNode> BREAK() { return getTokens(myC_hw2Parser.BREAK); }
		public TerminalNode BREAK(int i) {
			return getToken(myC_hw2Parser.BREAK, i);
		}
		public TerminalNode RETURN() { return getToken(myC_hw2Parser.RETURN, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		int _la;
		try {
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(ID);
				setState(173);
				match(ASSIGN_OP);
				setState(174);
				pre_arith_expression();
				setState(175);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(PRINTF);
				setState(178);
				match(L_PAREN);
				setState(179);
				match(LITERAL);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(180);
					match(COMMA);
					setState(181);
					pre_arith_expression();
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(187);
				match(R_PAREN);
				setState(188);
				match(SEMICOLON);
				if (TRACEON) System.out.println("function: printf");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				match(SCANF);
				setState(191);
				match(L_PAREN);
				setState(192);
				match(LITERAL);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(193);
					match(COMMA);
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(194);
						match(T__0);
						}
					}

					setState(197);
					pre_arith_expression();
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(203);
				match(R_PAREN);
				setState(204);
				match(SEMICOLON);
				if (TRACEON) System.out.println("function: scanf");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(206);
				match(STRCPY);
				setState(207);
				match(L_PAREN);
				setState(208);
				match(ID);
				setState(209);
				match(COMMA);
				setState(210);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==LITERAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(211);
				match(R_PAREN);
				setState(212);
				match(SEMICOLON);
				if (TRACEON) System.out.println("function: strcpy");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(214);
				match(ID);
				setState(215);
				match(ASSIGN_OP);
				setState(216);
				match(STRLEN);
				setState(217);
				match(L_PAREN);
				setState(218);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==LITERAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(219);
				match(R_PAREN);
				setState(220);
				match(SEMICOLON);
				if (TRACEON) System.out.println("function: strlen");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(222);
				match(IF);
				setState(223);
				match(L_PAREN);
				setState(224);
				pre_logic_exprsssion();
				setState(225);
				match(R_PAREN);
				setState(226);
				if_statements();
				setState(229);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					{
					setState(227);
					match(ELSE);
					setState(228);
					if_statements();
					}
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(231);
				match(FOR);
				setState(232);
				match(L_PAREN);
				setState(233);
				match(ID);
				setState(234);
				match(ASSIGN_OP);
				setState(235);
				arith_expression();
				setState(236);
				match(SEMICOLON);
				setState(237);
				pre_arith_expression();
				setState(238);
				match(SEMICOLON);
				setState(239);
				arith_expression();
				setState(240);
				match(R_PAREN);
				setState(241);
				if_statements();
				if (TRACEON) System.out.println("for loop");
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(244);
				match(WHILE);
				setState(245);
				match(L_PAREN);
				setState(246);
				pre_logic_exprsssion();
				setState(247);
				match(R_PAREN);
				setState(248);
				if_statements();
				if (TRACEON) System.out.println("while loop");
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(251);
				match(SWITCH);
				setState(252);
				match(L_PAREN);
				setState(253);
				pre_logic_exprsssion();
				setState(254);
				match(R_PAREN);
				setState(255);
				match(L_BRACE);
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE) {
					{
					{
					setState(256);
					match(CASE);
					setState(257);
					match(DEC_NUM);
					setState(258);
					match(COLON);
					setState(259);
					statements();
					setState(260);
					match(BREAK);
					setState(261);
					match(SEMICOLON);
					}
					}
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(268);
				match(DEFAULT);
				setState(269);
				match(COLON);
				setState(270);
				statements();
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK) {
					{
					setState(271);
					match(BREAK);
					setState(272);
					match(SEMICOLON);
					}
				}

				setState(275);
				match(R_BRACE);
				if (TRACEON) System.out.println("switch case");
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(278);
				match(RETURN);
				setState(279);
				pre_logic_exprsssion();
				setState(280);
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
		public TerminalNode L_BRACE() { return getToken(myC_hw2Parser.L_BRACE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(myC_hw2Parser.R_BRACE, 0); }
		public If_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statements; }
	}

	public final If_statementsContext if_statements() throws RecognitionException {
		If_statementsContext _localctx = new If_statementsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_if_statements);
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINTF:
			case SCANF:
			case STRCPY:
			case IF:
			case FOR:
			case WHILE:
			case RETURN:
			case SWITCH:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				statement();
				}
				break;
			case L_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				match(L_BRACE);
				setState(286);
				statements();
				setState(287);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u0126\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2/\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"I\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4W\n\4\3\5\3\5"+
		"\3\5\3\5\5\5]\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6f\n\6\f\6\16\6i\13\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7x\n\7\f\7\16\7"+
		"{\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0086\n\b\f\b\16\b\u0089"+
		"\13\b\3\t\3\t\3\t\3\t\3\t\7\t\u0090\n\t\f\t\16\t\u0093\13\t\3\n\3\n\3"+
		"\n\5\n\u0098\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ad\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00b9\n\f\f\f\16\f\u00bc\13\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c6\n\f\3\f\7\f\u00c9\n\f\f\f\16\f\u00cc"+
		"\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00e8\n\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u010a\n\f\f\f\16\f\u010d"+
		"\13\f\3\f\3\f\3\f\3\f\3\f\5\f\u0114\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u011d\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u0124\n\r\3\r\2\2\16\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\2\3\4\2<<??\2\u014b\2.\3\2\2\2\4H\3\2\2\2\6V\3\2\2"+
		"\2\b\\\3\2\2\2\n^\3\2\2\2\fj\3\2\2\2\16|\3\2\2\2\20\u008a\3\2\2\2\22\u0097"+
		"\3\2\2\2\24\u00ac\3\2\2\2\26\u011c\3\2\2\2\30\u0123\3\2\2\2\32\33\7\17"+
		"\2\2\33\34\7\4\2\2\34\35\7\65\2\2\35\36\7\64\2\2\36\37\7\67\2\2\37 \5"+
		"\4\3\2 !\5\b\5\2!\"\7\66\2\2\"#\b\2\1\2#/\3\2\2\2$%\7\t\2\2%&\7\4\2\2"+
		"&\'\7\65\2\2\'(\7\64\2\2()\7\67\2\2)*\5\4\3\2*+\5\b\5\2+,\7\66\2\2,-\b"+
		"\2\1\2-/\3\2\2\2.\32\3\2\2\2.$\3\2\2\2/\3\3\2\2\2\60\61\5\6\4\2\61\62"+
		"\7<\2\2\62\63\7\61\2\2\63\64\5\4\3\2\64\65\b\3\1\2\65I\3\2\2\2\66\67\5"+
		"\6\4\2\678\7<\2\289\7\33\2\29:\5\16\b\2:;\7\61\2\2;<\5\4\3\2<=\b\3\1\2"+
		"=I\3\2\2\2>?\5\6\4\2?@\7<\2\2@A\79\2\2AB\7=\2\2BC\78\2\2CD\7\61\2\2DE"+
		"\5\4\3\2EF\b\3\1\2FI\3\2\2\2GI\b\3\1\2H\60\3\2\2\2H\66\3\2\2\2H>\3\2\2"+
		"\2HG\3\2\2\2I\5\3\2\2\2JK\7\t\2\2KW\b\4\1\2LM\7\n\2\2MW\b\4\1\2NO\7\13"+
		"\2\2OW\b\4\1\2PQ\7\f\2\2QW\b\4\1\2RS\7\r\2\2SW\b\4\1\2TU\7\16\2\2UW\b"+
		"\4\1\2VJ\3\2\2\2VL\3\2\2\2VN\3\2\2\2VP\3\2\2\2VR\3\2\2\2VT\3\2\2\2W\7"+
		"\3\2\2\2XY\5\26\f\2YZ\5\b\5\2Z]\3\2\2\2[]\3\2\2\2\\X\3\2\2\2\\[\3\2\2"+
		"\2]\t\3\2\2\2^g\5\f\7\2_`\7&\2\2`f\5\f\7\2ab\7$\2\2bf\5\f\7\2cd\7%\2\2"+
		"df\5\f\7\2e_\3\2\2\2ea\3\2\2\2ec\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2"+
		"h\13\3\2\2\2ig\3\2\2\2jy\5\16\b\2kl\7\"\2\2lx\5\16\b\2mn\7#\2\2nx\5\16"+
		"\b\2op\7\'\2\2px\5\16\b\2qr\7(\2\2rx\5\16\b\2st\7)\2\2tx\5\16\b\2uv\7"+
		"*\2\2vx\5\16\b\2wk\3\2\2\2wm\3\2\2\2wo\3\2\2\2wq\3\2\2\2ws\3\2\2\2wu\3"+
		"\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\r\3\2\2\2{y\3\2\2\2|\u0087\5\20"+
		"\t\2}~\7\34\2\2~\u0086\5\20\t\2\177\u0080\7\35\2\2\u0080\u0086\5\20\t"+
		"\2\u0081\u0082\7\36\2\2\u0082\u0086\5\20\t\2\u0083\u0084\7\37\2\2\u0084"+
		"\u0086\5\20\t\2\u0085}\3\2\2\2\u0085\177\3\2\2\2\u0085\u0081\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\17\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u0091\5\22\n\2\u008b\u008c"+
		"\7 \2\2\u008c\u0090\5\22\n\2\u008d\u008e\7!\2\2\u008e\u0090\5\22\n\2\u008f"+
		"\u008b\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\21\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0098"+
		"\5\24\13\2\u0095\u0096\7\35\2\2\u0096\u0098\5\24\13\2\u0097\u0094\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0098\23\3\2\2\2\u0099\u00ad\7=\2\2\u009a\u009b"+
		"\7=\2\2\u009b\u00ad\7+\2\2\u009c\u009d\7=\2\2\u009d\u00ad\7,\2\2\u009e"+
		"\u00ad\7>\2\2\u009f\u00ad\7<\2\2\u00a0\u00a1\7<\2\2\u00a1\u00ad\7+\2\2"+
		"\u00a2\u00a3\7<\2\2\u00a3\u00ad\7,\2\2\u00a4\u00a5\7\65\2\2\u00a5\u00a6"+
		"\5\f\7\2\u00a6\u00a7\7\64\2\2\u00a7\u00ad\3\2\2\2\u00a8\u00a9\7\32\2\2"+
		"\u00a9\u00aa\7\65\2\2\u00aa\u00ab\7<\2\2\u00ab\u00ad\7\64\2\2\u00ac\u0099"+
		"\3\2\2\2\u00ac\u009a\3\2\2\2\u00ac\u009c\3\2\2\2\u00ac\u009e\3\2\2\2\u00ac"+
		"\u009f\3\2\2\2\u00ac\u00a0\3\2\2\2\u00ac\u00a2\3\2\2\2\u00ac\u00a4\3\2"+
		"\2\2\u00ac\u00a8\3\2\2\2\u00ad\25\3\2\2\2\u00ae\u00af\7<\2\2\u00af\u00b0"+
		"\7\33\2\2\u00b0\u00b1\5\f\7\2\u00b1\u00b2\7\61\2\2\u00b2\u011d\3\2\2\2"+
		"\u00b3\u00b4\7\5\2\2\u00b4\u00b5\7\65\2\2\u00b5\u00ba\7?\2\2\u00b6\u00b7"+
		"\7\63\2\2\u00b7\u00b9\5\f\7\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3\2\2\2"+
		"\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba"+
		"\3\2\2\2\u00bd\u00be\7\64\2\2\u00be\u00bf\7\61\2\2\u00bf\u011d\b\f\1\2"+
		"\u00c0\u00c1\7\6\2\2\u00c1\u00c2\7\65\2\2\u00c2\u00ca\7?\2\2\u00c3\u00c5"+
		"\7\63\2\2\u00c4\u00c6\7\3\2\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2"+
		"\u00c6\u00c7\3\2\2\2\u00c7\u00c9\5\f\7\2\u00c8\u00c3\3\2\2\2\u00c9\u00cc"+
		"\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cd\u00ce\7\64\2\2\u00ce\u00cf\7\61\2\2\u00cf\u011d\b"+
		"\f\1\2\u00d0\u00d1\7\7\2\2\u00d1\u00d2\7\65\2\2\u00d2\u00d3\7<\2\2\u00d3"+
		"\u00d4\7\63\2\2\u00d4\u00d5\t\2\2\2\u00d5\u00d6\7\64\2\2\u00d6\u00d7\7"+
		"\61\2\2\u00d7\u011d\b\f\1\2\u00d8\u00d9\7<\2\2\u00d9\u00da\7\33\2\2\u00da"+
		"\u00db\7\b\2\2\u00db\u00dc\7\65\2\2\u00dc\u00dd\t\2\2\2\u00dd\u00de\7"+
		"\64\2\2\u00de\u00df\7\61\2\2\u00df\u011d\b\f\1\2\u00e0\u00e1\7\20\2\2"+
		"\u00e1\u00e2\7\65\2\2\u00e2\u00e3\5\n\6\2\u00e3\u00e4\7\64\2\2\u00e4\u00e7"+
		"\5\30\r\2\u00e5\u00e6\7\21\2\2\u00e6\u00e8\5\30\r\2\u00e7\u00e5\3\2\2"+
		"\2\u00e7\u00e8\3\2\2\2\u00e8\u011d\3\2\2\2\u00e9\u00ea\7\22\2\2\u00ea"+
		"\u00eb\7\65\2\2\u00eb\u00ec\7<\2\2\u00ec\u00ed\7\33\2\2\u00ed\u00ee\5"+
		"\16\b\2\u00ee\u00ef\7\61\2\2\u00ef\u00f0\5\f\7\2\u00f0\u00f1\7\61\2\2"+
		"\u00f1\u00f2\5\16\b\2\u00f2\u00f3\7\64\2\2\u00f3\u00f4\5\30\r\2\u00f4"+
		"\u00f5\b\f\1\2\u00f5\u011d\3\2\2\2\u00f6\u00f7\7\23\2\2\u00f7\u00f8\7"+
		"\65\2\2\u00f8\u00f9\5\n\6\2\u00f9\u00fa\7\64\2\2\u00fa\u00fb\5\30\r\2"+
		"\u00fb\u00fc\b\f\1\2\u00fc\u011d\3\2\2\2\u00fd\u00fe\7\27\2\2\u00fe\u00ff"+
		"\7\65\2\2\u00ff\u0100\5\n\6\2\u0100\u0101\7\64\2\2\u0101\u010b\7\67\2"+
		"\2\u0102\u0103\7\30\2\2\u0103\u0104\7=\2\2\u0104\u0105\7\62\2\2\u0105"+
		"\u0106\5\b\5\2\u0106\u0107\7\24\2\2\u0107\u0108\7\61\2\2\u0108\u010a\3"+
		"\2\2\2\u0109\u0102\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f\7\31"+
		"\2\2\u010f\u0110\7\62\2\2\u0110\u0113\5\b\5\2\u0111\u0112\7\24\2\2\u0112"+
		"\u0114\7\61\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3"+
		"\2\2\2\u0115\u0116\7\66\2\2\u0116\u0117\b\f\1\2\u0117\u011d\3\2\2\2\u0118"+
		"\u0119\7\26\2\2\u0119\u011a\5\n\6\2\u011a\u011b\7\61\2\2\u011b\u011d\3"+
		"\2\2\2\u011c\u00ae\3\2\2\2\u011c\u00b3\3\2\2\2\u011c\u00c0\3\2\2\2\u011c"+
		"\u00d0\3\2\2\2\u011c\u00d8\3\2\2\2\u011c\u00e0\3\2\2\2\u011c\u00e9\3\2"+
		"\2\2\u011c\u00f6\3\2\2\2\u011c\u00fd\3\2\2\2\u011c\u0118\3\2\2\2\u011d"+
		"\27\3\2\2\2\u011e\u0124\5\26\f\2\u011f\u0120\7\67\2\2\u0120\u0121\5\b"+
		"\5\2\u0121\u0122\7\66\2\2\u0122\u0124\3\2\2\2\u0123\u011e\3\2\2\2\u0123"+
		"\u011f\3\2\2\2\u0124\31\3\2\2\2\30.HV\\egwy\u0085\u0087\u008f\u0091\u0097"+
		"\u00ac\u00ba\u00c5\u00ca\u00e7\u010b\u0113\u011c\u0123";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}