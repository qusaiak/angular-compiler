// Generated from C:/compiler/compiler/src/main/java/org/Angular/AngularParser.g4 by ANTLR 4.13.2
package org.Angular;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AngularParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQUAL=1, PLUS=2, MINUS=3, STAR=4, DIVISION=5, PERCENT=6, COMMA=7, SEMI=8, 
		COLON=9, LEFTPAREN=10, RIGHTPAREN=11, LEFTBRACKET=12, RIGHTBRACKET=13, 
		LEFTCURLY=14, RIGHTCURLY=15, LESSTHAN=16, GREATERTHAN=17, LESSEQUAL=18, 
		GREATEREQUAL=19, ARROW=20, EQ=21, NEQ=22, AND=23, OR=24, PLUSPLUS=25, 
		MINUSMINUS=26, SQ=27, DQ=28, HTMLSTRING=29, DOT=30, AT=31, SLASHGREATERTHAN=32, 
		DOUBLELEFTCURLY=33, DOUBLERIGHTCURLY=34, COMPONENT=35, SELECTOR=36, TEMPLATE=37, 
		TEMPLATEURL=38, STYLES=39, STYLEURL=40, CLASS=41, INPUT=42, OUTPUT=43, 
		PROPERTY=44, IMPORT=45, EXPORT=46, DEFAULT=47, FROM=48, CONSTRUCTOR=49, 
		EXTENDS=50, IMPLEMENTS=51, FUNCTION=52, CONSOLE=53, LOG=54, VAR=55, LET=56, 
		CONST=57, IF=58, ELSE=59, FOR=60, WHILE=61, RETURN=62, NULL=63, ANY=64, 
		SWITCH=65, CASE=66, DO=67, BREAK=68, CONTINUE=69, TRY=70, CATCH=71, FINALLY=72, 
		THROWS=73, ASYNC=74, AWAIT=75, TYPE=76, ENUM=77, INTERFACE=78, PUBLIC=79, 
		PRIVATE=80, PROTECTED=81, AS=82, THIS=83, VOID=84, NUMBER=85, ONINIT=86, 
		ONCHANGES=87, ONDESTROY=88, NGIF=89, NGSWITCH=90, NGFOR=91, NGSTYLE=92, 
		NGCLASS=93, ID=94, INT=95, DOUBLE=96, BOOLEAN=97, STRING=98, WS=99, COMMENT=100, 
		BLOCK_COMMENT=101;
	public static final int
		RULE_program = 0, RULE_importStatement = 1, RULE_importType = 2, RULE_exportStatement = 3, 
		RULE_exportType = 4, RULE_variableDeclaration = 5, RULE_variableValue = 6, 
		RULE_classDeclaration = 7, RULE_functionDeclaration = 8, RULE_componentDeclaration = 9, 
		RULE_value = 10, RULE_array = 11, RULE_object = 12, RULE_classBody = 13, 
		RULE_assignment = 14, RULE_decorator = 15, RULE_decoratorArguments = 16, 
		RULE_argumentContent = 17, RULE_constructorDeclaration = 18, RULE_parameters = 19, 
		RULE_functionBody = 20, RULE_returnStatement = 21, RULE_operation = 22, 
		RULE_statement = 23, RULE_componentBody = 24, RULE_ifStatement = 25, RULE_condition = 26, 
		RULE_forStatement = 27, RULE_whileStatement = 28, RULE_callFunction = 29, 
		RULE_jsxElement = 30, RULE_openingTag = 31, RULE_closingTag = 32, RULE_selfClosingTag = 33, 
		RULE_jsxContent = 34, RULE_interpolation = 35, RULE_jsxAttributes = 36, 
		RULE_angularDirective = 37, RULE_directive = 38, RULE_jsxAttribute = 39, 
		RULE_jsxEvent = 40, RULE_jsxBinding = 41, RULE_jsxClass = 42, RULE_expression = 43, 
		RULE_type = 44, RULE_printStatement = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "importStatement", "importType", "exportStatement", "exportType", 
			"variableDeclaration", "variableValue", "classDeclaration", "functionDeclaration", 
			"componentDeclaration", "value", "array", "object", "classBody", "assignment", 
			"decorator", "decoratorArguments", "argumentContent", "constructorDeclaration", 
			"parameters", "functionBody", "returnStatement", "operation", "statement", 
			"componentBody", "ifStatement", "condition", "forStatement", "whileStatement", 
			"callFunction", "jsxElement", "openingTag", "closingTag", "selfClosingTag", 
			"jsxContent", "interpolation", "jsxAttributes", "angularDirective", "directive", 
			"jsxAttribute", "jsxEvent", "jsxBinding", "jsxClass", "expression", "type", 
			"printStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "','", "';'", "':'", 
			"'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'>'", "'<='", "'>='", 
			"'=>'", "'=='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'''", "'\"'", 
			"'`'", "'.'", "'@'", "'/>'", "'{{'", "'}}'", "'component'", "'selector'", 
			"'template'", "'templateUrl'", "'styles'", "'styleUrl'", "'class'", "'input'", 
			"'output'", "'property'", "'import'", "'export'", "'default'", "'from'", 
			"'constructor'", "'extends'", "'implements'", "'function'", "'console'", 
			"'log'", "'var'", "'let'", "'const'", "'if'", "'else'", "'for'", "'while'", 
			"'return'", "'null'", "'any'", "'switch'", "'case'", "'do'", "'break'", 
			"'continue'", "'try'", "'catch'", "'finally'", "'throws'", "'async'", 
			"'await'", "'type'", "'enum'", "'interface'", "'public'", "'private'", 
			"'protected'", "'as'", "'this'", "'void'", "'number'", "'ngOnInit'", 
			"'ngOnChanges'", "'ngOnDestroy'", "'ngIf'", "'ngSwitch'", "'ngFor'", 
			"'ngStyle'", "'ngClass'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EQUAL", "PLUS", "MINUS", "STAR", "DIVISION", "PERCENT", "COMMA", 
			"SEMI", "COLON", "LEFTPAREN", "RIGHTPAREN", "LEFTBRACKET", "RIGHTBRACKET", 
			"LEFTCURLY", "RIGHTCURLY", "LESSTHAN", "GREATERTHAN", "LESSEQUAL", "GREATEREQUAL", 
			"ARROW", "EQ", "NEQ", "AND", "OR", "PLUSPLUS", "MINUSMINUS", "SQ", "DQ", 
			"HTMLSTRING", "DOT", "AT", "SLASHGREATERTHAN", "DOUBLELEFTCURLY", "DOUBLERIGHTCURLY", 
			"COMPONENT", "SELECTOR", "TEMPLATE", "TEMPLATEURL", "STYLES", "STYLEURL", 
			"CLASS", "INPUT", "OUTPUT", "PROPERTY", "IMPORT", "EXPORT", "DEFAULT", 
			"FROM", "CONSTRUCTOR", "EXTENDS", "IMPLEMENTS", "FUNCTION", "CONSOLE", 
			"LOG", "VAR", "LET", "CONST", "IF", "ELSE", "FOR", "WHILE", "RETURN", 
			"NULL", "ANY", "SWITCH", "CASE", "DO", "BREAK", "CONTINUE", "TRY", "CATCH", 
			"FINALLY", "THROWS", "ASYNC", "AWAIT", "TYPE", "ENUM", "INTERFACE", "PUBLIC", 
			"PRIVATE", "PROTECTED", "AS", "THIS", "VOID", "NUMBER", "ONINIT", "ONCHANGES", 
			"ONDESTROY", "NGIF", "NGSWITCH", "NGFOR", "NGSTYLE", "NGCLASS", "ID", 
			"INT", "DOUBLE", "BOOLEAN", "STRING", "WS", "COMMENT", "BLOCK_COMMENT"
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
	public String getGrammarFileName() { return "AngularParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngularParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProgramStContext extends ProgramContext {
		public TerminalNode EOF() { return getToken(AngularParser.EOF, 0); }
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public List<ComponentDeclarationContext> componentDeclaration() {
			return getRuleContexts(ComponentDeclarationContext.class);
		}
		public ComponentDeclarationContext componentDeclaration(int i) {
			return getRuleContext(ComponentDeclarationContext.class,i);
		}
		public ExportStatementContext exportStatement() {
			return getRuleContext(ExportStatementContext.class,0);
		}
		public ProgramStContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProgramSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProgramSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProgramSt(this);
			else return visitor.visitChildren(this);
		}


		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public TerminalNode COMMA() { return getToken(AngularParser.COMMA, 0); }
		public TerminalNode VAR() { return getToken(AngularParser.VAR, 0); }
		public TerminalNode LET() { return getToken(AngularParser.LET, 0); }
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }


		public TerminalNode EQUAL(int i) {
			return getToken(AngularParser.EQUAL, i);
		}

		public List<TerminalNode> ID() { return getTokens(AngularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}

		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}

	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new ProgramStContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(92);
				importStatement();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 256707379930873856L) != 0) || _la==ID) {
				{
				setState(102);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(98);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(99);
					classDeclaration();
					}
					break;
				case 3:
					{
					setState(100);
					functionDeclaration();
					}
					break;
				case 4:
					{
					setState(101);
					componentDeclaration();
					}
					break;
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(107);
				exportStatement();
				}
			}

			setState(110);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
	 
		public ImportStatementContext() { }
		public void copyFrom(ImportStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementStContext extends ImportStatementContext {
		public TerminalNode IMPORT() { return getToken(AngularParser.IMPORT, 0); }
		public ImportTypeContext importType() {
			return getRuleContext(ImportTypeContext.class,0);
		}
		public TerminalNode FROM() { return getToken(AngularParser.FROM, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public ImportStatementStContext(ImportStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportStatementSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportStatementSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportStatementSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importStatement);
		try {
			_localctx = new ImportStatementStContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(IMPORT);
			setState(113);
			importType();
			setState(114);
			match(FROM);
			setState(115);
			match(STRING);
			setState(116);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportTypeContext extends ParserRuleContext {
		public ImportTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importType; }
	 
		public ImportTypeContext() { }
		public void copyFrom(ImportTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportType_IDContext extends ImportTypeContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public ImportType_IDContext(ImportTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportType_ID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportType_ID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportType_ID(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportType_MultipleContext extends ImportTypeContext {
		public TerminalNode LEFTCURLY() { return getToken(AngularParser.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(AngularParser.RIGHTCURLY, 0); }
		public List<TerminalNode> ID() { return getTokens(AngularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ImportType_MultipleContext(ImportTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportType_Multiple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportType_Multiple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportType_Multiple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportTypeContext importType() throws RecognitionException {
		ImportTypeContext _localctx = new ImportTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importType);
		int _la;
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new ImportType_IDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(ID);
				}
				break;
			case LEFTCURLY:
				_localctx = new ImportType_MultipleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(LEFTCURLY);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(120);
					match(ID);
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(121);
						match(COMMA);
						setState(122);
						match(ID);
						}
						}
						setState(127);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(130);
				match(RIGHTCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExportStatementContext extends ParserRuleContext {
		public ExportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportStatement; }
	 
		public ExportStatementContext() { }
		public void copyFrom(ExportStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExportStatementStContext extends ExportStatementContext {
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public ExportTypeContext exportType() {
			return getRuleContext(ExportTypeContext.class,0);
		}
		public ExportStatementStContext(ExportStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExportStatementSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExportStatementSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExportStatementSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportStatementContext exportStatement() throws RecognitionException {
		ExportStatementContext _localctx = new ExportStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_exportStatement);
		try {
			_localctx = new ExportStatementStContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(EXPORT);
			setState(134);
			exportType();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExportTypeContext extends ParserRuleContext {
		public ExportTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportType; }
	 
		public ExportTypeContext() { }
		public void copyFrom(ExportTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExportType_ObjectContext extends ExportTypeContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ComponentDeclarationContext componentDeclaration() {
			return getRuleContext(ComponentDeclarationContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(AngularParser.DEFAULT, 0); }
		public ExportType_ObjectContext(ExportTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExportType_Object(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExportType_Object(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExportType_Object(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExportType_MultipleContext extends ExportTypeContext {
		public TerminalNode LEFTCURLY() { return getToken(AngularParser.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(AngularParser.RIGHTCURLY, 0); }
		public List<TerminalNode> ID() { return getTokens(AngularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ExportType_MultipleContext(ExportTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExportType_Multiple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExportType_Multiple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExportType_Multiple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportTypeContext exportType() throws RecognitionException {
		ExportTypeContext _localctx = new ExportTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_exportType);
		int _la;
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new ExportType_ObjectContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(136);
					match(DEFAULT);
					}
				}

				setState(144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(139);
					classDeclaration();
					}
					break;
				case 2:
					{
					setState(140);
					variableDeclaration();
					}
					break;
				case 3:
					{
					setState(141);
					functionDeclaration();
					}
					break;
				case 4:
					{
					setState(142);
					componentDeclaration();
					}
					break;
				case 5:
					{
					setState(143);
					object();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new ExportType_MultipleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(LEFTCURLY);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(147);
					match(ID);
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(148);
						match(COMMA);
						setState(149);
						match(ID);
						}
						}
						setState(154);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(157);
				match(RIGHTCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	 
		public VariableDeclarationContext() { }
		public void copyFrom(VariableDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public TerminalNode COMMA() { return getToken(AngularParser.COMMA, 0); }
		public TerminalNode VAR() { return getToken(AngularParser.VAR, 0); }
		public TerminalNode LET() { return getToken(AngularParser.LET, 0); }
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }

		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}


		public List<TerminalNode> ID() { return getTokens(AngularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}
		public TerminalNode COLON(int i) {
			return getToken(AngularParser.COLON, i);
		}

		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public List<TerminalNode> PUBLIC() { return getTokens(AngularParser.PUBLIC); }
		public TerminalNode PUBLIC(int i) {
			return getToken(AngularParser.PUBLIC, i);
		}
		public List<TerminalNode> PRIVATE() { return getTokens(AngularParser.PRIVATE); }
		public TerminalNode PRIVATE(int i) {
			return getToken(AngularParser.PRIVATE, i);
		}
		public TerminalNode EQUAL(int i) {
			return getToken(AngularParser.EQUAL, i);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}


	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationStContext extends VariableDeclarationContext {
		public VariableValueContext variableValue() {
			return getRuleContext(VariableValueContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public TerminalNode COMMA() { return getToken(AngularParser.COMMA, 0); }
		public TerminalNode VAR() { return getToken(AngularParser.VAR, 0); }
		public TerminalNode LET() { return getToken(AngularParser.LET, 0); }
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }
		public VariableDeclarationStContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableDeclarationSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableDeclarationSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableDeclarationSt(this);
			else return visitor.visitChildren(this);
		}

		public TerminalNode LEFTPAREN() { return getToken(AngularParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(AngularParser.RIGHTPAREN, 0); }
		public TerminalNode LEFTCURLY() { return getToken(AngularParser.LEFTCURLY, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode RIGHTCURLY() { return getToken(AngularParser.RIGHTCURLY, 0); }
		public TerminalNode FUNCTION() { return getToken(AngularParser.FUNCTION, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}


		public List<TerminalNode> THIS() { return getTokens(AngularParser.THIS); }
		public TerminalNode THIS(int i) {
			return getToken(AngularParser.THIS, i);
		}
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}

		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableDeclaration);
		int _la;
		try {
			_localctx = new VariableDeclarationStContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 252201579132747776L) != 0)) {
				{
				setState(160);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 252201579132747776L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(163);
			match(ID);
			setState(164);
			_la = _input.LA(1);
			if ( !(_la==EQUAL || _la==COLON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(165);
			variableValue();
			setState(166);
			_la = _input.LA(1);
			if ( !(_la==COMMA || _la==SEMI) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableValueContext extends ParserRuleContext {
		public VariableValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableValue; }
	 
		public VariableValueContext() { }
		public void copyFrom(VariableValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableValue_ArrayContext extends VariableValueContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public VariableValue_ArrayContext(VariableValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableValue_Array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableValue_Array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableValue_Array(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableValue_ObjectContext extends VariableValueContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public VariableValue_ObjectContext(VariableValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableValue_Object(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableValue_Object(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableValue_Object(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableValue_FunctionContext extends VariableValueContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public VariableValue_FunctionContext(VariableValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableValue_Function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableValue_Function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableValue_Function(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableValue_ValueContext extends VariableValueContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public VariableValue_ValueContext(VariableValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableValue_Value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableValue_Value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableValue_Value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableValueContext variableValue() throws RecognitionException {
		VariableValueContext _localctx = new VariableValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableValue);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new VariableValue_ValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				value();
				}
				break;
			case 2:
				_localctx = new VariableValue_ArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				array();
				}
				break;
			case 3:
				_localctx = new VariableValue_ObjectContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				object();
				}
				break;
			case 4:
				_localctx = new VariableValue_FunctionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				functionDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
	 
		public ClassDeclarationContext() { }
		public void copyFrom(ClassDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationStContext extends ClassDeclarationContext {
		public TerminalNode CLASS() { return getToken(AngularParser.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(AngularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}
		public TerminalNode LEFTCURLY() { return getToken(AngularParser.LEFTCURLY, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode RIGHTCURLY() { return getToken(AngularParser.RIGHTCURLY, 0); }
		public TerminalNode EXTENDS() { return getToken(AngularParser.EXTENDS, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(AngularParser.IMPLEMENTS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ClassDeclarationStContext(ClassDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassDeclarationSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassDeclarationSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassDeclarationSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classDeclaration);
		int _la;
		try {
			_localctx = new ClassDeclarationStContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(CLASS);
			setState(175);
			match(ID);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(176);
				match(EXTENDS);
				setState(177);
				match(ID);
				}
			}

			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(180);
				match(IMPLEMENTS);
				setState(181);
				match(ID);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(182);
					match(COMMA);
					setState(183);
					match(ID);
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(191);
			match(LEFTCURLY);
			setState(192);
			classBody();
			setState(193);
			match(RIGHTCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	 
		public FunctionDeclarationContext() { }
		public void copyFrom(FunctionDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationStContext extends FunctionDeclarationContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode LEFTPAREN() { return getToken(AngularParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(AngularParser.RIGHTPAREN, 0); }
		public TerminalNode LEFTCURLY() { return getToken(AngularParser.LEFTCURLY, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode RIGHTCURLY() { return getToken(AngularParser.RIGHTCURLY, 0); }
		public TerminalNode FUNCTION() { return getToken(AngularParser.FUNCTION, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionDeclarationStContext(FunctionDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionDeclarationSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionDeclarationSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionDeclarationSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionDeclaration);
		int _la;
		try {
			_localctx = new FunctionDeclarationStContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION) {
				{
				setState(195);
				match(FUNCTION);
				}
			}

			setState(198);
			match(ID);
			setState(199);
			match(LEFTPAREN);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTCURLY || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 32771L) != 0)) {
				{
				setState(200);
				parameters();
				}
			}

			setState(203);
			match(RIGHTPAREN);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(204);
				match(COLON);
				setState(205);
				type();
				}
			}

			setState(208);
			match(LEFTCURLY);
			setState(209);
			functionBody();
			setState(210);
			match(RIGHTCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDeclarationContext extends ParserRuleContext {
		public ComponentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDeclaration; }
	 
		public ComponentDeclarationContext() { }
		public void copyFrom(ComponentDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDeclaration_BodyContext extends ComponentDeclarationContext {
		public TerminalNode LEFTCURLY() { return getToken(AngularParser.LEFTCURLY, 0); }
		public ComponentBodyContext componentBody() {
			return getRuleContext(ComponentBodyContext.class,0);
		}
		public TerminalNode RIGHTCURLY() { return getToken(AngularParser.RIGHTCURLY, 0); }
		public ComponentDeclaration_BodyContext(ComponentDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentDeclaration_Body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentDeclaration_Body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentDeclaration_Body(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDeclaration_DecoratorContext extends ComponentDeclarationContext {
		public DecoratorContext decorator() {
			return getRuleContext(DecoratorContext.class,0);
		}
		public ComponentDeclaration_DecoratorContext(ComponentDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentDeclaration_Decorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentDeclaration_Decorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentDeclaration_Decorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDeclarationContext componentDeclaration() throws RecognitionException {
		ComponentDeclarationContext _localctx = new ComponentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_componentDeclaration);
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				_localctx = new ComponentDeclaration_DecoratorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				decorator();
				}
				break;
			case LEFTCURLY:
				_localctx = new ComponentDeclaration_BodyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(LEFTCURLY);
				setState(214);
				componentBody();
				setState(215);
				match(RIGHTCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Value_ArrayContext extends ValueContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Value_ArrayContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterValue_Array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitValue_Array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitValue_Array(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Value_TypeContext extends ValueContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Value_TypeContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterValue_Type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitValue_Type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitValue_Type(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Value_AngularDirectiveContext extends ValueContext {
		public AngularDirectiveContext angularDirective() {
			return getRuleContext(AngularDirectiveContext.class,0);
		}
		public Value_AngularDirectiveContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterValue_AngularDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitValue_AngularDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitValue_AngularDirective(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Value_JsxElementContext extends ValueContext {
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public Value_JsxElementContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterValue_JsxElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitValue_JsxElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitValue_JsxElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Value_InterpolationContext extends ValueContext {
		public InterpolationContext interpolation() {
			return getRuleContext(InterpolationContext.class,0);
		}
		public Value_InterpolationContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterValue_Interpolation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitValue_Interpolation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitValue_Interpolation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Value_ObjectContext extends ValueContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public Value_ObjectContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterValue_Object(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitValue_Object(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitValue_Object(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_value);
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
			case ANY:
			case PUBLIC:
			case PRIVATE:
			case VOID:
			case NUMBER:
			case ID:
			case INT:
			case DOUBLE:
			case BOOLEAN:
			case STRING:
				_localctx = new Value_TypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				type();
				}
				break;
			case LEFTBRACKET:
				_localctx = new Value_ArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				array();
				}
				break;
			case LEFTCURLY:
				_localctx = new Value_ObjectContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				object();
				}
				break;
			case LESSTHAN:
				_localctx = new Value_JsxElementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				jsxElement();
				}
				break;
			case STAR:
				_localctx = new Value_AngularDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(223);
				angularDirective();
				}
				break;
			case DOUBLELEFTCURLY:
				_localctx = new Value_InterpolationContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(224);
				interpolation();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	 
		public ArrayContext() { }
		public void copyFrom(ArrayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayStContext extends ArrayContext {
		public TerminalNode LEFTBRACKET() { return getToken(AngularParser.LEFTBRACKET, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(AngularParser.RIGHTBRACKET, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ArrayStContext(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArraySt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArraySt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArraySt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_array);
		int _la;
		try {
			_localctx = new ArrayStContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(LEFTBRACKET);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223372028264755184L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 33289240577L) != 0)) {
				{
				setState(228);
				value();
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(229);
					match(COMMA);
					setState(230);
					value();
					}
					}
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(238);
			match(RIGHTBRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectContext extends ParserRuleContext {
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
	 
		public ObjectContext() { }
		public void copyFrom(ObjectContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectStContext extends ObjectContext {
		public TerminalNode LEFTCURLY() { return getToken(AngularParser.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(AngularParser.RIGHTCURLY, 0); }
		public List<TerminalNode> ID() { return getTokens(AngularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(AngularParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(AngularParser.COLON, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ObjectStContext(ObjectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_object);
		int _la;
		try {
			_localctx = new ObjectStContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(LEFTCURLY);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(241);
				match(ID);
				setState(242);
				match(COLON);
				setState(243);
				value();
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(244);
					match(COMMA);
					setState(245);
					match(ID);
					setState(246);
					match(COLON);
					setState(247);
					value();
					}
					}
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(255);
			match(RIGHTCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
	 
		public ClassBodyContext() { }
		public void copyFrom(ClassBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyStContext extends ClassBodyContext {
		public List<DecoratorContext> decorator() {
			return getRuleContexts(DecoratorContext.class);
		}
		public DecoratorContext decorator(int i) {
			return getRuleContext(DecoratorContext.class,i);
		}
		public List<ConstructorDeclarationContext> constructorDeclaration() {
			return getRuleContexts(ConstructorDeclarationContext.class);
		}
		public ConstructorDeclarationContext constructorDeclaration(int i) {
			return getRuleContext(ConstructorDeclarationContext.class,i);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public ClassBodyStContext(ClassBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassBodySt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassBodySt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassBodySt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_classBody);
		int _la;
		try {
			_localctx = new ClassBodyStContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & -9223372036734975999L) != 0)) {
				{
				setState(261);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(257);
					decorator();
					}
					break;
				case 2:
					{
					setState(258);
					constructorDeclaration();
					}
					break;
				case 3:
					{
					setState(259);
					variableDeclaration();
					}
					break;
				case 4:
					{
					setState(260);
					functionDeclaration();
					}
					break;
				}
				}
				setState(265);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Assignment_Value2Context extends AssignmentContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public Assignment_Value2Context(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAssignment_Value2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAssignment_Value2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAssignment_Value2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Assignment_TypeContext extends AssignmentContext {
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public List<TerminalNode> ID() { return getTokens(AngularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(AngularParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(AngularParser.COLON, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Assignment_TypeContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAssignment_Type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAssignment_Type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAssignment_Type(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Assignment_ValueContext extends AssignmentContext {
		public List<TerminalNode> THIS() { return getTokens(AngularParser.THIS); }
		public TerminalNode THIS(int i) {
			return getToken(AngularParser.THIS, i);
		}
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public List<TerminalNode> ID() { return getTokens(AngularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public Assignment_ValueContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAssignment_Value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAssignment_Value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAssignment_Value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment);
		int _la;
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new Assignment_TypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(269); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(266);
					match(ID);
					setState(267);
					match(COLON);
					setState(268);
					type();
					}
					}
					setState(271); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(273);
					match(EQUAL);
					setState(274);
					value();
					}
				}

				setState(277);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new Assignment_ValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(THIS);
				setState(280);
				match(DOT);
				setState(281);
				match(ID);
				setState(282);
				match(EQUAL);
				setState(291);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(283);
					value();
					}
					break;
				case 2:
					{
					setState(284);
					match(THIS);
					setState(285);
					match(DOT);
					setState(286);
					match(ID);
					setState(289);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DOT) {
						{
						setState(287);
						match(DOT);
						setState(288);
						callFunction();
						}
					}

					}
					break;
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(293);
					match(SEMI);
					}
				}

				}
				break;
			case 3:
				_localctx = new Assignment_Value2Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				match(ID);
				setState(297);
				match(EQUAL);
				setState(298);
				value();
				setState(299);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorContext extends ParserRuleContext {
		public DecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorator; }
	 
		public DecoratorContext() { }
		public void copyFrom(DecoratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Decorator_WithArgumentsContext extends DecoratorContext {
		public TerminalNode AT() { return getToken(AngularParser.AT, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode LEFTPAREN() { return getToken(AngularParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(AngularParser.RIGHTPAREN, 0); }
		public List<DecoratorArgumentsContext> decoratorArguments() {
			return getRuleContexts(DecoratorArgumentsContext.class);
		}
		public DecoratorArgumentsContext decoratorArguments(int i) {
			return getRuleContext(DecoratorArgumentsContext.class,i);
		}
		public Decorator_WithArgumentsContext(DecoratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDecorator_WithArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDecorator_WithArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDecorator_WithArguments(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Decorator_SimpleContext extends DecoratorContext {
		public TerminalNode AT() { return getToken(AngularParser.AT, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public Decorator_SimpleContext(DecoratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDecorator_Simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDecorator_Simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDecorator_Simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorContext decorator() throws RecognitionException {
		DecoratorContext _localctx = new DecoratorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_decorator);
		int _la;
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new Decorator_WithArgumentsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(AT);
				setState(304);
				match(ID);
				setState(305);
				match(LEFTPAREN);
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LEFTCURLY) {
					{
					{
					setState(306);
					decoratorArguments();
					}
					}
					setState(311);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(312);
				match(RIGHTPAREN);
				}
				break;
			case 2:
				_localctx = new Decorator_SimpleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				match(AT);
				setState(314);
				match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorArgumentsContext extends ParserRuleContext {
		public DecoratorArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoratorArguments; }
	 
		public DecoratorArgumentsContext() { }
		public void copyFrom(DecoratorArgumentsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorArgumentsStContext extends DecoratorArgumentsContext {
		public TerminalNode LEFTCURLY() { return getToken(AngularParser.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(AngularParser.RIGHTCURLY, 0); }
		public List<ArgumentContentContext> argumentContent() {
			return getRuleContexts(ArgumentContentContext.class);
		}
		public ArgumentContentContext argumentContent(int i) {
			return getRuleContext(ArgumentContentContext.class,i);
		}
		public DecoratorArgumentsStContext(DecoratorArgumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDecoratorArgumentsSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDecoratorArgumentsSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDecoratorArgumentsSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorArgumentsContext decoratorArguments() throws RecognitionException {
		DecoratorArgumentsContext _localctx = new DecoratorArgumentsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_decoratorArguments);
		int _la;
		try {
			_localctx = new DecoratorArgumentsStContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(LEFTCURLY);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 256777952685998080L) != 0) || _la==ID) {
				{
				{
				setState(318);
				argumentContent();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(324);
			match(RIGHTCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContentContext extends ParserRuleContext {
		public ArgumentContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentContent; }
	 
		public ArgumentContentContext() { }
		public void copyFrom(ArgumentContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContent_BlockContext extends ArgumentContentContext {
		public TerminalNode LEFTCURLY() { return getToken(AngularParser.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(AngularParser.RIGHTCURLY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ArgumentContent_BlockContext(ArgumentContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArgumentContent_Block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArgumentContent_Block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArgumentContent_Block(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContent_VariableContext extends ArgumentContentContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ArgumentContent_VariableContext(ArgumentContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArgumentContent_Variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArgumentContent_Variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArgumentContent_Variable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContent_ExportContext extends ArgumentContentContext {
		public ExportStatementContext exportStatement() {
			return getRuleContext(ExportStatementContext.class,0);
		}
		public ArgumentContent_ExportContext(ArgumentContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArgumentContent_Export(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArgumentContent_Export(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArgumentContent_Export(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContent_FunctionContext extends ArgumentContentContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ArgumentContent_FunctionContext(ArgumentContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArgumentContent_Function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArgumentContent_Function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArgumentContent_Function(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContent_ClassContext extends ArgumentContentContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ArgumentContent_ClassContext(ArgumentContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArgumentContent_Class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArgumentContent_Class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArgumentContent_Class(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContent_SelectorContext extends ArgumentContentContext {
		public TerminalNode SELECTOR() { return getToken(AngularParser.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode COMMA() { return getToken(AngularParser.COMMA, 0); }
		public ArgumentContent_SelectorContext(ArgumentContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArgumentContent_Selector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArgumentContent_Selector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArgumentContent_Selector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContent_TemplateContext extends ArgumentContentContext {
		public TerminalNode TEMPLATE() { return getToken(AngularParser.TEMPLATE, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public List<TerminalNode> HTMLSTRING() { return getTokens(AngularParser.HTMLSTRING); }
		public TerminalNode HTMLSTRING(int i) {
			return getToken(AngularParser.HTMLSTRING, i);
		}
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(AngularParser.COMMA, 0); }
		public ArgumentContent_TemplateContext(ArgumentContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArgumentContent_Template(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArgumentContent_Template(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArgumentContent_Template(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContentContext argumentContent() throws RecognitionException {
		ArgumentContentContext _localctx = new ArgumentContentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_argumentContent);
		int _la;
		try {
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				_localctx = new ArgumentContent_ExportContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				exportStatement();
				}
				break;
			case 2:
				_localctx = new ArgumentContent_FunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				functionDeclaration();
				}
				break;
			case 3:
				_localctx = new ArgumentContent_VariableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(328);
				variableDeclaration();
				}
				break;
			case 4:
				_localctx = new ArgumentContent_ClassContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(329);
				classDeclaration();
				}
				break;
			case 5:
				_localctx = new ArgumentContent_BlockContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(330);
				match(LEFTCURLY);
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8619889686787194896L) != 0) || _la==THIS || _la==ID) {
					{
					{
					setState(331);
					statement();
					}
					}
					setState(336);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(337);
				match(RIGHTCURLY);
				}
				break;
			case 6:
				_localctx = new ArgumentContent_SelectorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(338);
				match(SELECTOR);
				setState(339);
				match(COLON);
				setState(340);
				match(STRING);
				setState(341);
				match(COMMA);
				}
				break;
			case 7:
				_localctx = new ArgumentContent_TemplateContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(342);
				match(TEMPLATE);
				setState(343);
				match(COLON);
				setState(344);
				match(HTMLSTRING);
				setState(345);
				jsxElement();
				setState(346);
				match(HTMLSTRING);
				setState(347);
				match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
	 
		public ConstructorDeclarationContext() { }
		public void copyFrom(ConstructorDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclarationStContext extends ConstructorDeclarationContext {
		public TerminalNode CONSTRUCTOR() { return getToken(AngularParser.CONSTRUCTOR, 0); }
		public TerminalNode LEFTPAREN() { return getToken(AngularParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(AngularParser.RIGHTPAREN, 0); }
		public TerminalNode LEFTCURLY() { return getToken(AngularParser.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(AngularParser.RIGHTCURLY, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ConstructorDeclarationStContext(ConstructorDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConstructorDeclarationSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConstructorDeclarationSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConstructorDeclarationSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_constructorDeclaration);
		int _la;
		try {
			_localctx = new ConstructorDeclarationStContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(CONSTRUCTOR);
			setState(352);
			match(LEFTPAREN);
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTCURLY || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 32771L) != 0)) {
				{
				setState(353);
				parameters();
				}
			}

			setState(356);
			match(RIGHTPAREN);
			setState(357);
			match(LEFTCURLY);
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(358);
				functionBody();
				}
				break;
			case 2:
				{
				setState(359);
				assignment();
				}
				break;
			}
			setState(362);
			match(RIGHTCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	 
		public ParametersContext() { }
		public void copyFrom(ParametersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Parameters_ObjectDestructuringContext extends ParametersContext {
		public TerminalNode LEFTCURLY() { return getToken(AngularParser.LEFTCURLY, 0); }
		public List<TerminalNode> ID() { return getTokens(AngularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}
		public TerminalNode RIGHTCURLY() { return getToken(AngularParser.RIGHTCURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public Parameters_ObjectDestructuringContext(ParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameters_ObjectDestructuring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameters_ObjectDestructuring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameters_ObjectDestructuring(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Parameters_StandardContext extends ParametersContext {
		public List<TerminalNode> ID() { return getTokens(AngularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(AngularParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(AngularParser.COLON, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public List<TerminalNode> PUBLIC() { return getTokens(AngularParser.PUBLIC); }
		public TerminalNode PUBLIC(int i) {
			return getToken(AngularParser.PUBLIC, i);
		}
		public List<TerminalNode> PRIVATE() { return getTokens(AngularParser.PRIVATE); }
		public TerminalNode PRIVATE(int i) {
			return getToken(AngularParser.PRIVATE, i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(AngularParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(AngularParser.EQUAL, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Parameters_StandardContext(ParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameters_Standard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameters_Standard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameters_Standard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parameters);
		int _la;
		try {
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
			case PRIVATE:
			case ID:
				_localctx = new Parameters_StandardContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUBLIC || _la==PRIVATE) {
					{
					setState(364);
					_la = _input.LA(1);
					if ( !(_la==PUBLIC || _la==PRIVATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(367);
				match(ID);
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(368);
					match(COLON);
					setState(369);
					type();
					setState(372);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==EQUAL) {
						{
						setState(370);
						match(EQUAL);
						setState(371);
						value();
						}
					}

					}
				}

				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(376);
					match(COMMA);
					setState(378);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PUBLIC || _la==PRIVATE) {
						{
						setState(377);
						_la = _input.LA(1);
						if ( !(_la==PUBLIC || _la==PRIVATE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(380);
					match(ID);
					setState(387);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COLON) {
						{
						setState(381);
						match(COLON);
						setState(382);
						type();
						setState(385);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==EQUAL) {
							{
							setState(383);
							match(EQUAL);
							setState(384);
							value();
							}
						}

						}
					}

					}
					}
					setState(393);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case LEFTCURLY:
				_localctx = new Parameters_ObjectDestructuringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				match(LEFTCURLY);
				setState(395);
				match(ID);
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(396);
					match(COMMA);
					setState(397);
					match(ID);
					}
					}
					setState(402);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(403);
				match(RIGHTCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionBodyContext extends ParserRuleContext {
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
	 
		public FunctionBodyContext() { }
		public void copyFrom(FunctionBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionBodyStContext extends FunctionBodyContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public FunctionBodyStContext(FunctionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionBodySt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionBodySt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionBodySt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionBody);
		int _la;
		try {
			int _alt;
			_localctx = new FunctionBodyStContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(406);
					statement();
					}
					} 
				}
				setState(411);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(412);
				returnStatement();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	 
		public ReturnStatementContext() { }
		public void copyFrom(ReturnStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementStContext extends ReturnStatementContext {
		public TerminalNode RETURN() { return getToken(AngularParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public ReturnStatementStContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReturnStatementSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReturnStatementSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReturnStatementSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_returnStatement);
		int _la;
		try {
			_localctx = new ReturnStatementStContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(RETURN);
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(416);
				value();
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7274556L) != 0)) {
					{
					setState(417);
					operation();
					setState(418);
					value();
					}
				}

				}
				break;
			case 2:
				{
				setState(422);
				jsxElement();
				}
				break;
			}
			setState(425);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperationContext extends ParserRuleContext {
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	 
		public OperationContext() { }
		public void copyFrom(OperationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Operation_DivideContext extends OperationContext {
		public TerminalNode DIVISION() { return getToken(AngularParser.DIVISION, 0); }
		public Operation_DivideContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOperation_Divide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOperation_Divide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOperation_Divide(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Operation_LessThanContext extends OperationContext {
		public TerminalNode LESSTHAN() { return getToken(AngularParser.LESSTHAN, 0); }
		public Operation_LessThanContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOperation_LessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOperation_LessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOperation_LessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Operation_MultiplyContext extends OperationContext {
		public TerminalNode STAR() { return getToken(AngularParser.STAR, 0); }
		public Operation_MultiplyContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOperation_Multiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOperation_Multiply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOperation_Multiply(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Operation_EqualsContext extends OperationContext {
		public TerminalNode EQ() { return getToken(AngularParser.EQ, 0); }
		public Operation_EqualsContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOperation_Equals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOperation_Equals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOperation_Equals(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Operation_NotEqualsContext extends OperationContext {
		public TerminalNode NEQ() { return getToken(AngularParser.NEQ, 0); }
		public Operation_NotEqualsContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOperation_NotEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOperation_NotEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOperation_NotEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Operation_LessEqualContext extends OperationContext {
		public TerminalNode LESSEQUAL() { return getToken(AngularParser.LESSEQUAL, 0); }
		public Operation_LessEqualContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOperation_LessEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOperation_LessEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOperation_LessEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Operation_GreaterThanContext extends OperationContext {
		public TerminalNode GREATERTHAN() { return getToken(AngularParser.GREATERTHAN, 0); }
		public Operation_GreaterThanContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOperation_GreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOperation_GreaterThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOperation_GreaterThan(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Operation_GreaterEqualContext extends OperationContext {
		public TerminalNode GREATEREQUAL() { return getToken(AngularParser.GREATEREQUAL, 0); }
		public Operation_GreaterEqualContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOperation_GreaterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOperation_GreaterEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOperation_GreaterEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Operation_PlusContext extends OperationContext {
		public TerminalNode PLUS() { return getToken(AngularParser.PLUS, 0); }
		public Operation_PlusContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOperation_Plus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOperation_Plus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOperation_Plus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Operation_MinusContext extends OperationContext {
		public TerminalNode MINUS() { return getToken(AngularParser.MINUS, 0); }
		public Operation_MinusContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOperation_Minus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOperation_Minus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOperation_Minus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_operation);
		try {
			setState(437);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new Operation_PlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				match(PLUS);
				}
				break;
			case MINUS:
				_localctx = new Operation_MinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				match(MINUS);
				}
				break;
			case STAR:
				_localctx = new Operation_MultiplyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(429);
				match(STAR);
				}
				break;
			case DIVISION:
				_localctx = new Operation_DivideContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(430);
				match(DIVISION);
				}
				break;
			case EQ:
				_localctx = new Operation_EqualsContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(431);
				match(EQ);
				}
				break;
			case NEQ:
				_localctx = new Operation_NotEqualsContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(432);
				match(NEQ);
				}
				break;
			case GREATERTHAN:
				_localctx = new Operation_GreaterThanContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(433);
				match(GREATERTHAN);
				}
				break;
			case GREATEREQUAL:
				_localctx = new Operation_GreaterEqualContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(434);
				match(GREATEREQUAL);
				}
				break;
			case LESSTHAN:
				_localctx = new Operation_LessThanContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(435);
				match(LESSTHAN);
				}
				break;
			case LESSEQUAL:
				_localctx = new Operation_LessEqualContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(436);
				match(LESSEQUAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Statement_IfStatementContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public Statement_IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStatement_IfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStatement_IfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStatement_IfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Statement_AssignmentContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Statement_AssignmentContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStatement_Assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStatement_Assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStatement_Assignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Statement_AngularDirectiveContext extends StatementContext {
		public AngularDirectiveContext angularDirective() {
			return getRuleContext(AngularDirectiveContext.class,0);
		}
		public Statement_AngularDirectiveContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStatement_AngularDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStatement_AngularDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStatement_AngularDirective(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Statement_ReturnContext extends StatementContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public Statement_ReturnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStatement_Return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStatement_Return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStatement_Return(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Statement_FunctionCallContext extends StatementContext {
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public Statement_FunctionCallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStatement_FunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStatement_FunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStatement_FunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Statement_ForStatementContext extends StatementContext {
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public Statement_ForStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStatement_ForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStatement_ForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStatement_ForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Statement_VariableDeclarationContext extends StatementContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public Statement_VariableDeclarationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStatement_VariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStatement_VariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStatement_VariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Statement_JsxElementContext extends StatementContext {
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public Statement_JsxElementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStatement_JsxElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStatement_JsxElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStatement_JsxElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Statement_WhileStatementContext extends StatementContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public Statement_WhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStatement_WhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStatement_WhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStatement_WhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Statement_PrintContext extends StatementContext {
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public Statement_PrintContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStatement_Print(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStatement_Print(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStatement_Print(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_statement);
		try {
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				_localctx = new Statement_VariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				variableDeclaration();
				}
				break;
			case 2:
				_localctx = new Statement_IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				ifStatement();
				}
				break;
			case 3:
				_localctx = new Statement_ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
				forStatement();
				}
				break;
			case 4:
				_localctx = new Statement_WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(442);
				whileStatement();
				}
				break;
			case 5:
				_localctx = new Statement_FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(443);
				callFunction();
				}
				break;
			case 6:
				_localctx = new Statement_PrintContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(444);
				printStatement();
				}
				break;
			case 7:
				_localctx = new Statement_JsxElementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(445);
				jsxElement();
				}
				break;
			case 8:
				_localctx = new Statement_AngularDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(446);
				angularDirective();
				}
				break;
			case 9:
				_localctx = new Statement_ReturnContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(447);
				returnStatement();
				}
				break;
			case 10:
				_localctx = new Statement_AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(448);
				assignment();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentBodyContext extends ParserRuleContext {
		public ComponentBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentBody; }
	 
		public ComponentBodyContext() { }
		public void copyFrom(ComponentBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentBodyStContext extends ComponentBodyContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public ComponentBodyStContext(ComponentBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentBodySt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentBodySt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentBodySt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentBodyContext componentBody() throws RecognitionException {
		ComponentBodyContext _localctx = new ComponentBodyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_componentBody);
		int _la;
		try {
			int _alt;
			_localctx = new ComponentBodyStContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(451);
					variableDeclaration();
					}
					} 
				}
				setState(456);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION || _la==ID) {
				{
				{
				setState(457);
				functionDeclaration();
				}
				}
				setState(462);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	 
		public IfStatementContext() { }
		public void copyFrom(IfStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementStContext extends IfStatementContext {
		public TerminalNode IF() { return getToken(AngularParser.IF, 0); }
		public TerminalNode LEFTPAREN() { return getToken(AngularParser.LEFTPAREN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(AngularParser.RIGHTPAREN, 0); }
		public List<TerminalNode> LEFTCURLY() { return getTokens(AngularParser.LEFTCURLY); }
		public TerminalNode LEFTCURLY(int i) {
			return getToken(AngularParser.LEFTCURLY, i);
		}
		public List<TerminalNode> RIGHTCURLY() { return getTokens(AngularParser.RIGHTCURLY); }
		public TerminalNode RIGHTCURLY(int i) {
			return getToken(AngularParser.RIGHTCURLY, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(AngularParser.ELSE, 0); }
		public IfStatementStContext(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIfStatementSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIfStatementSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIfStatementSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ifStatement);
		int _la;
		try {
			_localctx = new IfStatementStContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(IF);
			setState(464);
			match(LEFTPAREN);
			setState(465);
			condition();
			setState(466);
			match(RIGHTPAREN);
			setState(467);
			match(LEFTCURLY);
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8619889686787194896L) != 0) || _la==THIS || _la==ID) {
				{
				{
				setState(468);
				statement();
				}
				}
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(474);
			match(RIGHTCURLY);
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(475);
				match(ELSE);
				setState(476);
				match(LEFTCURLY);
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8619889686787194896L) != 0) || _la==THIS || _la==ID) {
					{
					{
					setState(477);
					statement();
					}
					}
					setState(482);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(483);
				match(RIGHTCURLY);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Condition_SimpleContext extends ConditionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Condition_SimpleContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCondition_Simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCondition_Simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCondition_Simple(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Condition_BooleanContext extends ConditionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(AngularParser.AND, 0); }
		public TerminalNode OR() { return getToken(AngularParser.OR, 0); }
		public Condition_BooleanContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCondition_Boolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCondition_Boolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCondition_Boolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_condition);
		int _la;
		try {
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				_localctx = new Condition_BooleanContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				expression(0);
				setState(487);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(488);
				expression(0);
				}
				break;
			case 2:
				_localctx = new Condition_SimpleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	 
		public ForStatementContext() { }
		public void copyFrom(ForStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementStContext extends ForStatementContext {
		public TerminalNode FOR() { return getToken(AngularParser.FOR, 0); }
		public TerminalNode LEFTPAREN() { return getToken(AngularParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(AngularParser.RIGHTPAREN, 0); }
		public TerminalNode LEFTCURLY() { return getToken(AngularParser.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(AngularParser.RIGHTCURLY, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForStatementStContext(ForStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForStatementSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForStatementSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForStatementSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_forStatement);
		int _la;
		try {
			_localctx = new ForStatementStContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(FOR);
			setState(494);
			match(LEFTPAREN);
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(495);
				variableDeclaration();
				}
				break;
			}
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(498);
				condition();
				}
				break;
			}
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(501);
				match(SEMI);
				}
			}

			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8619889686787194896L) != 0) || _la==THIS || _la==ID) {
				{
				setState(504);
				statement();
				}
			}

			setState(507);
			match(RIGHTPAREN);
			setState(508);
			match(LEFTCURLY);
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8619889686787194896L) != 0) || _la==THIS || _la==ID) {
				{
				{
				setState(509);
				statement();
				}
				}
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(515);
			match(RIGHTCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	 
		public WhileStatementContext() { }
		public void copyFrom(WhileStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementStContext extends WhileStatementContext {
		public TerminalNode WHILE() { return getToken(AngularParser.WHILE, 0); }
		public TerminalNode LEFTPAREN() { return getToken(AngularParser.LEFTPAREN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(AngularParser.RIGHTPAREN, 0); }
		public TerminalNode LEFTCURLY() { return getToken(AngularParser.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(AngularParser.RIGHTCURLY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStatementStContext(WhileStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterWhileStatementSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitWhileStatementSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitWhileStatementSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_whileStatement);
		int _la;
		try {
			_localctx = new WhileStatementStContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(WHILE);
			setState(518);
			match(LEFTPAREN);
			setState(519);
			condition();
			setState(520);
			match(RIGHTPAREN);
			setState(521);
			match(LEFTCURLY);
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8619889686787194896L) != 0) || _la==THIS || _la==ID) {
				{
				{
				setState(522);
				statement();
				}
				}
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(528);
			match(RIGHTCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CallFunctionContext extends ParserRuleContext {
		public CallFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunction; }
	 
		public CallFunctionContext() { }
		public void copyFrom(CallFunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallFunctionStContext extends CallFunctionContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode LEFTPAREN() { return getToken(AngularParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(AngularParser.RIGHTPAREN, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public CallFunctionStContext(CallFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCallFunctionSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCallFunctionSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCallFunctionSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallFunctionContext callFunction() throws RecognitionException {
		CallFunctionContext _localctx = new CallFunctionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_callFunction);
		int _la;
		try {
			_localctx = new CallFunctionStContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(ID);
			setState(531);
			match(LEFTPAREN);
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223372028264755184L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 33289240577L) != 0)) {
				{
				setState(532);
				expression(0);
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(533);
					match(COMMA);
					setState(534);
					expression(0);
					}
					}
					setState(539);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(542);
			match(RIGHTPAREN);
			setState(543);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsxElementContext extends ParserRuleContext {
		public JsxElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxElement; }
	 
		public JsxElementContext() { }
		public void copyFrom(JsxElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JsxElement_SelfClosingContext extends JsxElementContext {
		public SelfClosingTagContext selfClosingTag() {
			return getRuleContext(SelfClosingTagContext.class,0);
		}
		public JsxElement_SelfClosingContext(JsxElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterJsxElement_SelfClosing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitJsxElement_SelfClosing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitJsxElement_SelfClosing(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JsxElement_TaggedContext extends JsxElementContext {
		public OpeningTagContext openingTag() {
			return getRuleContext(OpeningTagContext.class,0);
		}
		public ClosingTagContext closingTag() {
			return getRuleContext(ClosingTagContext.class,0);
		}
		public List<JsxContentContext> jsxContent() {
			return getRuleContexts(JsxContentContext.class);
		}
		public JsxContentContext jsxContent(int i) {
			return getRuleContext(JsxContentContext.class,i);
		}
		public JsxElement_TaggedContext(JsxElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterJsxElement_Tagged(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitJsxElement_Tagged(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitJsxElement_Tagged(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxElementContext jsxElement() throws RecognitionException {
		JsxElementContext _localctx = new JsxElementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_jsxElement);
		try {
			int _alt;
			setState(555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				_localctx = new JsxElement_TaggedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				openingTag();
				setState(549);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(546);
						jsxContent();
						}
						} 
					}
					setState(551);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				setState(552);
				closingTag();
				}
				break;
			case 2:
				_localctx = new JsxElement_SelfClosingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(554);
				selfClosingTag();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpeningTagContext extends ParserRuleContext {
		public OpeningTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openingTag; }
	 
		public OpeningTagContext() { }
		public void copyFrom(OpeningTagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpeningTagStContext extends OpeningTagContext {
		public TerminalNode LESSTHAN() { return getToken(AngularParser.LESSTHAN, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode GREATERTHAN() { return getToken(AngularParser.GREATERTHAN, 0); }
		public JsxAttributesContext jsxAttributes() {
			return getRuleContext(JsxAttributesContext.class,0);
		}
		public OpeningTagStContext(OpeningTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOpeningTagSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOpeningTagSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOpeningTagSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpeningTagContext openingTag() throws RecognitionException {
		OpeningTagContext _localctx = new OpeningTagContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_openingTag);
		int _la;
		try {
			_localctx = new OpeningTagStContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(LESSTHAN);
			setState(558);
			match(ID);
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2199023260688L) != 0) || _la==ID) {
				{
				setState(559);
				jsxAttributes();
				}
			}

			setState(562);
			match(GREATERTHAN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClosingTagContext extends ParserRuleContext {
		public ClosingTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closingTag; }
	 
		public ClosingTagContext() { }
		public void copyFrom(ClosingTagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClosingTagStContext extends ClosingTagContext {
		public TerminalNode LESSTHAN() { return getToken(AngularParser.LESSTHAN, 0); }
		public TerminalNode DIVISION() { return getToken(AngularParser.DIVISION, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode GREATERTHAN() { return getToken(AngularParser.GREATERTHAN, 0); }
		public ClosingTagStContext(ClosingTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClosingTagSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClosingTagSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClosingTagSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosingTagContext closingTag() throws RecognitionException {
		ClosingTagContext _localctx = new ClosingTagContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_closingTag);
		try {
			_localctx = new ClosingTagStContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			match(LESSTHAN);
			setState(565);
			match(DIVISION);
			setState(566);
			match(ID);
			setState(567);
			match(GREATERTHAN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingTagContext extends ParserRuleContext {
		public SelfClosingTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfClosingTag; }
	 
		public SelfClosingTagContext() { }
		public void copyFrom(SelfClosingTagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingTagStContext extends SelfClosingTagContext {
		public TerminalNode LESSTHAN() { return getToken(AngularParser.LESSTHAN, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode SLASHGREATERTHAN() { return getToken(AngularParser.SLASHGREATERTHAN, 0); }
		public JsxAttributesContext jsxAttributes() {
			return getRuleContext(JsxAttributesContext.class,0);
		}
		public SelfClosingTagStContext(SelfClosingTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelfClosingTagSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelfClosingTagSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelfClosingTagSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfClosingTagContext selfClosingTag() throws RecognitionException {
		SelfClosingTagContext _localctx = new SelfClosingTagContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_selfClosingTag);
		int _la;
		try {
			_localctx = new SelfClosingTagStContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(LESSTHAN);
			setState(570);
			match(ID);
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2199023260688L) != 0) || _la==ID) {
				{
				setState(571);
				jsxAttributes();
				}
			}

			setState(574);
			match(SLASHGREATERTHAN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsxContentContext extends ParserRuleContext {
		public JsxContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxContent; }
	 
		public JsxContentContext() { }
		public void copyFrom(JsxContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JsxContent_ElementContext extends JsxContentContext {
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public JsxContent_ElementContext(JsxContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterJsxContent_Element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitJsxContent_Element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitJsxContent_Element(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JsxContent_IDContext extends JsxContentContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public JsxContent_IDContext(JsxContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterJsxContent_ID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitJsxContent_ID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitJsxContent_ID(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JsxContent_InterpolationContext extends JsxContentContext {
		public InterpolationContext interpolation() {
			return getRuleContext(InterpolationContext.class,0);
		}
		public JsxContent_InterpolationContext(JsxContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterJsxContent_Interpolation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitJsxContent_Interpolation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitJsxContent_Interpolation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxContentContext jsxContent() throws RecognitionException {
		JsxContentContext _localctx = new JsxContentContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_jsxContent);
		try {
			setState(579);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LESSTHAN:
				_localctx = new JsxContent_ElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(576);
				jsxElement();
				}
				break;
			case DOUBLELEFTCURLY:
				_localctx = new JsxContent_InterpolationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(577);
				interpolation();
				}
				break;
			case ID:
				_localctx = new JsxContent_IDContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(578);
				match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterpolationContext extends ParserRuleContext {
		public InterpolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolation; }
	 
		public InterpolationContext() { }
		public void copyFrom(InterpolationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterpolationStContext extends InterpolationContext {
		public TerminalNode DOUBLELEFTCURLY() { return getToken(AngularParser.DOUBLELEFTCURLY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOUBLERIGHTCURLY() { return getToken(AngularParser.DOUBLERIGHTCURLY, 0); }
		public InterpolationStContext(InterpolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterpolationSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterpolationSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterpolationSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolationContext interpolation() throws RecognitionException {
		InterpolationContext _localctx = new InterpolationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_interpolation);
		try {
			_localctx = new InterpolationStContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(DOUBLELEFTCURLY);
			setState(582);
			expression(0);
			setState(583);
			match(DOUBLERIGHTCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsxAttributesContext extends ParserRuleContext {
		public JsxAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxAttributes; }
	 
		public JsxAttributesContext() { }
		public void copyFrom(JsxAttributesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JsxAttributesStContext extends JsxAttributesContext {
		public List<AngularDirectiveContext> angularDirective() {
			return getRuleContexts(AngularDirectiveContext.class);
		}
		public AngularDirectiveContext angularDirective(int i) {
			return getRuleContext(AngularDirectiveContext.class,i);
		}
		public List<JsxAttributeContext> jsxAttribute() {
			return getRuleContexts(JsxAttributeContext.class);
		}
		public JsxAttributeContext jsxAttribute(int i) {
			return getRuleContext(JsxAttributeContext.class,i);
		}
		public List<JsxEventContext> jsxEvent() {
			return getRuleContexts(JsxEventContext.class);
		}
		public JsxEventContext jsxEvent(int i) {
			return getRuleContext(JsxEventContext.class,i);
		}
		public List<JsxBindingContext> jsxBinding() {
			return getRuleContexts(JsxBindingContext.class);
		}
		public JsxBindingContext jsxBinding(int i) {
			return getRuleContext(JsxBindingContext.class,i);
		}
		public List<JsxClassContext> jsxClass() {
			return getRuleContexts(JsxClassContext.class);
		}
		public JsxClassContext jsxClass(int i) {
			return getRuleContext(JsxClassContext.class,i);
		}
		public JsxAttributesStContext(JsxAttributesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterJsxAttributesSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitJsxAttributesSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitJsxAttributesSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxAttributesContext jsxAttributes() throws RecognitionException {
		JsxAttributesContext _localctx = new JsxAttributesContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_jsxAttributes);
		int _la;
		try {
			_localctx = new JsxAttributesStContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(590); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(590);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(585);
					angularDirective();
					}
					break;
				case ID:
					{
					setState(586);
					jsxAttribute();
					}
					break;
				case LEFTPAREN:
					{
					setState(587);
					jsxEvent();
					}
					break;
				case LEFTBRACKET:
					{
					setState(588);
					jsxBinding();
					}
					break;
				case CLASS:
					{
					setState(589);
					jsxClass();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(592); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2199023260688L) != 0) || _la==ID );
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

	@SuppressWarnings("CheckReturnValue")
	public static class AngularDirectiveContext extends ParserRuleContext {
		public AngularDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angularDirective; }
	 
		public AngularDirectiveContext() { }
		public void copyFrom(AngularDirectiveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AngularDirectiveStContext extends AngularDirectiveContext {
		public TerminalNode STAR() { return getToken(AngularParser.STAR, 0); }
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public AngularDirectiveStContext(AngularDirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAngularDirectiveSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAngularDirectiveSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAngularDirectiveSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngularDirectiveContext angularDirective() throws RecognitionException {
		AngularDirectiveContext _localctx = new AngularDirectiveContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_angularDirective);
		try {
			_localctx = new AngularDirectiveStContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(STAR);
			setState(595);
			directive();
			setState(596);
			match(EQUAL);
			setState(597);
			match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DirectiveContext extends ParserRuleContext {
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
	 
		public DirectiveContext() { }
		public void copyFrom(DirectiveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Directive_NgForContext extends DirectiveContext {
		public TerminalNode NGFOR() { return getToken(AngularParser.NGFOR, 0); }
		public Directive_NgForContext(DirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDirective_NgFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDirective_NgFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDirective_NgFor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Directive_NgStyleContext extends DirectiveContext {
		public TerminalNode NGSTYLE() { return getToken(AngularParser.NGSTYLE, 0); }
		public Directive_NgStyleContext(DirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDirective_NgStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDirective_NgStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDirective_NgStyle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Directive_NgSwitchContext extends DirectiveContext {
		public TerminalNode NGSWITCH() { return getToken(AngularParser.NGSWITCH, 0); }
		public Directive_NgSwitchContext(DirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDirective_NgSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDirective_NgSwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDirective_NgSwitch(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Directive_NgClassContext extends DirectiveContext {
		public TerminalNode NGCLASS() { return getToken(AngularParser.NGCLASS, 0); }
		public Directive_NgClassContext(DirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDirective_NgClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDirective_NgClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDirective_NgClass(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Directive_NgIfContext extends DirectiveContext {
		public TerminalNode NGIF() { return getToken(AngularParser.NGIF, 0); }
		public Directive_NgIfContext(DirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDirective_NgIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDirective_NgIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDirective_NgIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_directive);
		try {
			setState(604);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NGIF:
				_localctx = new Directive_NgIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
				match(NGIF);
				}
				break;
			case NGSWITCH:
				_localctx = new Directive_NgSwitchContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				match(NGSWITCH);
				}
				break;
			case NGFOR:
				_localctx = new Directive_NgForContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(601);
				match(NGFOR);
				}
				break;
			case NGSTYLE:
				_localctx = new Directive_NgStyleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(602);
				match(NGSTYLE);
				}
				break;
			case NGCLASS:
				_localctx = new Directive_NgClassContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(603);
				match(NGCLASS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsxAttributeContext extends ParserRuleContext {
		public JsxAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxAttribute; }
	 
		public JsxAttributeContext() { }
		public void copyFrom(JsxAttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JsxAttributeStContext extends JsxAttributeContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public JsxAttributeStContext(JsxAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterJsxAttributeSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitJsxAttributeSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitJsxAttributeSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxAttributeContext jsxAttribute() throws RecognitionException {
		JsxAttributeContext _localctx = new JsxAttributeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_jsxAttribute);
		try {
			_localctx = new JsxAttributeStContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			match(ID);
			setState(607);
			match(EQUAL);
			setState(608);
			match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsxEventContext extends ParserRuleContext {
		public JsxEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxEvent; }
	 
		public JsxEventContext() { }
		public void copyFrom(JsxEventContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JsxEventStContext extends JsxEventContext {
		public TerminalNode LEFTPAREN() { return getToken(AngularParser.LEFTPAREN, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(AngularParser.RIGHTPAREN, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public JsxEventStContext(JsxEventContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterJsxEventSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitJsxEventSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitJsxEventSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxEventContext jsxEvent() throws RecognitionException {
		JsxEventContext _localctx = new JsxEventContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_jsxEvent);
		try {
			_localctx = new JsxEventStContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			match(LEFTPAREN);
			setState(611);
			match(ID);
			setState(612);
			match(RIGHTPAREN);
			setState(613);
			match(EQUAL);
			setState(614);
			match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsxBindingContext extends ParserRuleContext {
		public JsxBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxBinding; }
	 
		public JsxBindingContext() { }
		public void copyFrom(JsxBindingContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JsxBindingStContext extends JsxBindingContext {
		public TerminalNode LEFTBRACKET() { return getToken(AngularParser.LEFTBRACKET, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(AngularParser.RIGHTBRACKET, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public InterpolationContext interpolation() {
			return getRuleContext(InterpolationContext.class,0);
		}
		public JsxBindingStContext(JsxBindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterJsxBindingSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitJsxBindingSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitJsxBindingSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxBindingContext jsxBinding() throws RecognitionException {
		JsxBindingContext _localctx = new JsxBindingContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_jsxBinding);
		try {
			_localctx = new JsxBindingStContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(LEFTBRACKET);
			setState(617);
			match(ID);
			setState(618);
			match(RIGHTBRACKET);
			setState(619);
			match(EQUAL);
			setState(622);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(620);
				match(STRING);
				}
				break;
			case DOUBLELEFTCURLY:
				{
				setState(621);
				interpolation();
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsxClassContext extends ParserRuleContext {
		public JsxClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxClass; }
	 
		public JsxClassContext() { }
		public void copyFrom(JsxClassContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JsxClassStContext extends JsxClassContext {
		public TerminalNode CLASS() { return getToken(AngularParser.CLASS, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public JsxClassStContext(JsxClassContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterJsxClassSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitJsxClassSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitJsxClassSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxClassContext jsxClass() throws RecognitionException {
		JsxClassContext _localctx = new JsxClassContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_jsxClass);
		try {
			_localctx = new JsxClassStContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(CLASS);
			setState(625);
			match(EQUAL);
			setState(626);
			match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Expression_ArrayContext extends ExpressionContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Expression_ArrayContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpression_Array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpression_Array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpression_Array(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Expression_BooleanContext extends ExpressionContext {
		public TerminalNode BOOLEAN() { return getToken(AngularParser.BOOLEAN, 0); }
		public Expression_BooleanContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpression_Boolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpression_Boolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpression_Boolean(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Expression_StringContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public Expression_StringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpression_String(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpression_String(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpression_String(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Expression_DoubleContext extends ExpressionContext {
		public TerminalNode DOUBLE() { return getToken(AngularParser.DOUBLE, 0); }
		public Expression_DoubleContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpression_Double(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpression_Double(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpression_Double(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Expression_FunctionCallContext extends ExpressionContext {
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public Expression_FunctionCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpression_FunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpression_FunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpression_FunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Expression_ValueContext extends ExpressionContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Expression_ValueContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpression_Value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpression_Value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpression_Value(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Expression_IDContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public Expression_IDContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpression_ID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpression_ID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpression_ID(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Expression_OperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public Expression_OperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpression_Operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpression_Operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpression_Operation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Expression_IntContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(AngularParser.INT, 0); }
		public Expression_IntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpression_Int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpression_Int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpression_Int(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Expression_MemberAccessContext extends ExpressionContext {
		public List<TerminalNode> ID() { return getTokens(AngularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public Expression_MemberAccessContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpression_MemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpression_MemberAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpression_MemberAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Expression_ObjectContext extends ExpressionContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public Expression_ObjectContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpression_Object(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpression_Object(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpression_Object(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				_localctx = new Expression_IDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(629);
				match(ID);
				}
				break;
			case 2:
				{
				_localctx = new Expression_MemberAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(630);
				match(ID);
				setState(631);
				match(DOT);
				setState(632);
				match(ID);
				}
				break;
			case 3:
				{
				_localctx = new Expression_StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(633);
				match(STRING);
				}
				break;
			case 4:
				{
				_localctx = new Expression_IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(634);
				match(INT);
				}
				break;
			case 5:
				{
				_localctx = new Expression_DoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(635);
				match(DOUBLE);
				}
				break;
			case 6:
				{
				_localctx = new Expression_BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(636);
				match(BOOLEAN);
				}
				break;
			case 7:
				{
				_localctx = new Expression_ValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(637);
				value();
				}
				break;
			case 8:
				{
				_localctx = new Expression_FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(638);
				callFunction();
				}
				break;
			case 9:
				{
				_localctx = new Expression_ArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(639);
				array();
				}
				break;
			case 10:
				{
				_localctx = new Expression_ObjectContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(640);
				object();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(649);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression_OperationContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(643);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(644);
					operation();
					setState(645);
					expression(2);
					}
					} 
				}
				setState(651);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Type_VoidContext extends TypeContext {
		public TerminalNode VOID() { return getToken(AngularParser.VOID, 0); }
		public Type_VoidContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterType_Void(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitType_Void(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitType_Void(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Type_DoubleContext extends TypeContext {
		public TerminalNode DOUBLE() { return getToken(AngularParser.DOUBLE, 0); }
		public Type_DoubleContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterType_Double(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitType_Double(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitType_Double(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Type_PrivateContext extends TypeContext {
		public TerminalNode PRIVATE() { return getToken(AngularParser.PRIVATE, 0); }
		public Type_PrivateContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterType_Private(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitType_Private(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitType_Private(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Type_StringContext extends TypeContext {
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public Type_StringContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterType_String(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitType_String(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitType_String(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Type_BooleanContext extends TypeContext {
		public TerminalNode BOOLEAN() { return getToken(AngularParser.BOOLEAN, 0); }
		public Type_BooleanContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterType_Boolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitType_Boolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitType_Boolean(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Type_PublicContext extends TypeContext {
		public TerminalNode PUBLIC() { return getToken(AngularParser.PUBLIC, 0); }
		public Type_PublicContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterType_Public(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitType_Public(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitType_Public(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Type_IntContext extends TypeContext {
		public TerminalNode INT() { return getToken(AngularParser.INT, 0); }
		public Type_IntContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterType_Int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitType_Int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitType_Int(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Type_NumberContext extends TypeContext {
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public Type_NumberContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterType_Number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitType_Number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitType_Number(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Type_AnyContext extends TypeContext {
		public TerminalNode ANY() { return getToken(AngularParser.ANY, 0); }
		public Type_AnyContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterType_Any(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitType_Any(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitType_Any(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Type_NullContext extends TypeContext {
		public TerminalNode NULL() { return getToken(AngularParser.NULL, 0); }
		public Type_NullContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterType_Null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitType_Null(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitType_Null(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Type_IDContext extends TypeContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public Type_IDContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterType_ID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitType_ID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitType_ID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_type);
		try {
			setState(663);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new Type_IDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(652);
				match(ID);
				}
				break;
			case STRING:
				_localctx = new Type_StringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(653);
				match(STRING);
				}
				break;
			case INT:
				_localctx = new Type_IntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(654);
				match(INT);
				}
				break;
			case DOUBLE:
				_localctx = new Type_DoubleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(655);
				match(DOUBLE);
				}
				break;
			case BOOLEAN:
				_localctx = new Type_BooleanContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(656);
				match(BOOLEAN);
				}
				break;
			case ANY:
				_localctx = new Type_AnyContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(657);
				match(ANY);
				}
				break;
			case PUBLIC:
				_localctx = new Type_PublicContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(658);
				match(PUBLIC);
				}
				break;
			case PRIVATE:
				_localctx = new Type_PrivateContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(659);
				match(PRIVATE);
				}
				break;
			case VOID:
				_localctx = new Type_VoidContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(660);
				match(VOID);
				}
				break;
			case NUMBER:
				_localctx = new Type_NumberContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(661);
				match(NUMBER);
				}
				break;
			case NULL:
				_localctx = new Type_NullContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(662);
				match(NULL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends ParserRuleContext {
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
	 
		public PrintStatementContext() { }
		public void copyFrom(PrintStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementStContext extends PrintStatementContext {
		public TerminalNode CONSOLE() { return getToken(AngularParser.CONSOLE, 0); }
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode LOG() { return getToken(AngularParser.LOG, 0); }
		public TerminalNode LEFTPAREN() { return getToken(AngularParser.LEFTPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(AngularParser.RIGHTPAREN, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public PrintStatementStContext(PrintStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPrintStatementSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPrintStatementSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPrintStatementSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_printStatement);
		try {
			_localctx = new PrintStatementStContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(CONSOLE);
			setState(666);
			match(DOT);
			setState(667);
			match(LOG);
			setState(668);
			match(LEFTPAREN);
			setState(669);
			expression(0);
			setState(670);
			match(RIGHTPAREN);
			setState(671);
			match(SEMI);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 43:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001e\u02a2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0001\u0000\u0005\u0000^\b\u0000\n\u0000\f\u0000a\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000g\b\u0000\n\u0000"+
		"\f\u0000j\t\u0000\u0001\u0000\u0003\u0000m\b\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"|\b\u0002\n\u0002\f\u0002\u007f\t\u0002\u0003\u0002\u0081\b\u0002\u0001"+
		"\u0002\u0003\u0002\u0084\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0003\u0004\u008a\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u0091\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004\u0097\b\u0004\n\u0004\f\u0004\u009a\t\u0004"+
		"\u0003\u0004\u009c\b\u0004\u0001\u0004\u0003\u0004\u009f\b\u0004\u0001"+
		"\u0005\u0003\u0005\u00a2\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00ad\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00b3\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u00b9\b\u0007\n\u0007\f\u0007\u00bc\t\u0007\u0003\u0007\u00be\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0003\b"+
		"\u00c5\b\b\u0001\b\u0001\b\u0001\b\u0003\b\u00ca\b\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u00cf\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00da\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00e2\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u00e8\b\u000b\n\u000b\f\u000b\u00eb\t\u000b\u0003\u000b"+
		"\u00ed\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00f9\b\f\n\f\f\f\u00fc\t\f\u0003"+
		"\f\u00fe\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0106"+
		"\b\r\n\r\f\r\u0109\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e"+
		"\u010e\b\u000e\u000b\u000e\f\u000e\u010f\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u0114\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u0122\b\u000e\u0003\u000e\u0124\b\u000e"+
		"\u0001\u000e\u0003\u000e\u0127\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u012e\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u0134\b\u000f\n\u000f\f\u000f\u0137"+
		"\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u013c\b\u000f"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u0140\b\u0010\n\u0010\f\u0010\u0143"+
		"\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u014d\b\u0011\n\u0011\f\u0011"+
		"\u0150\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u015e\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u0163\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u0169\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0003\u0013"+
		"\u016e\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u0175\b\u0013\u0003\u0013\u0177\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u017b\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u0182\b\u0013\u0003\u0013\u0184\b\u0013"+
		"\u0005\u0013\u0186\b\u0013\n\u0013\f\u0013\u0189\t\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u018f\b\u0013\n\u0013\f\u0013"+
		"\u0192\t\u0013\u0001\u0013\u0003\u0013\u0195\b\u0013\u0001\u0014\u0005"+
		"\u0014\u0198\b\u0014\n\u0014\f\u0014\u019b\t\u0014\u0001\u0014\u0003\u0014"+
		"\u019e\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u01a5\b\u0015\u0001\u0015\u0003\u0015\u01a8\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u01b6\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u01c2\b\u0017\u0001\u0018\u0005\u0018\u01c5\b\u0018\n\u0018\f\u0018"+
		"\u01c8\t\u0018\u0001\u0018\u0005\u0018\u01cb\b\u0018\n\u0018\f\u0018\u01ce"+
		"\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u01d6\b\u0019\n\u0019\f\u0019\u01d9\t\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u01df\b\u0019\n\u0019"+
		"\f\u0019\u01e2\t\u0019\u0001\u0019\u0003\u0019\u01e5\b\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01ec\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01f1\b\u001b\u0001\u001b"+
		"\u0003\u001b\u01f4\b\u001b\u0001\u001b\u0003\u001b\u01f7\b\u001b\u0001"+
		"\u001b\u0003\u001b\u01fa\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005"+
		"\u001b\u01ff\b\u001b\n\u001b\f\u001b\u0202\t\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0005\u001c\u020c\b\u001c\n\u001c\f\u001c\u020f\t\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005"+
		"\u001d\u0218\b\u001d\n\u001d\f\u001d\u021b\t\u001d\u0003\u001d\u021d\b"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u0224\b\u001e\n\u001e\f\u001e\u0227\t\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u022c\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u0231\b\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001!\u0001!\u0001!\u0003!\u023d\b!\u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001\"\u0003\"\u0244\b\"\u0001#\u0001#\u0001#\u0001#\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0004$\u024f\b$\u000b$\f$\u0250\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u025d"+
		"\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u026f\b)\u0001"+
		"*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u0282\b+\u0001+\u0001"+
		"+\u0001+\u0001+\u0005+\u0288\b+\n+\f+\u028b\t+\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u0298\b,\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0000\u0001"+
		"V.\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\u0000\u0005\u0001\u000079"+
		"\u0002\u0000\u0001\u0001\t\t\u0001\u0000\u0007\b\u0001\u0000OP\u0001\u0000"+
		"\u0017\u0018\u0302\u0000_\u0001\u0000\u0000\u0000\u0002p\u0001\u0000\u0000"+
		"\u0000\u0004\u0083\u0001\u0000\u0000\u0000\u0006\u0085\u0001\u0000\u0000"+
		"\u0000\b\u009e\u0001\u0000\u0000\u0000\n\u00a1\u0001\u0000\u0000\u0000"+
		"\f\u00ac\u0001\u0000\u0000\u0000\u000e\u00ae\u0001\u0000\u0000\u0000\u0010"+
		"\u00c4\u0001\u0000\u0000\u0000\u0012\u00d9\u0001\u0000\u0000\u0000\u0014"+
		"\u00e1\u0001\u0000\u0000\u0000\u0016\u00e3\u0001\u0000\u0000\u0000\u0018"+
		"\u00f0\u0001\u0000\u0000\u0000\u001a\u0107\u0001\u0000\u0000\u0000\u001c"+
		"\u012d\u0001\u0000\u0000\u0000\u001e\u013b\u0001\u0000\u0000\u0000 \u013d"+
		"\u0001\u0000\u0000\u0000\"\u015d\u0001\u0000\u0000\u0000$\u015f\u0001"+
		"\u0000\u0000\u0000&\u0194\u0001\u0000\u0000\u0000(\u0199\u0001\u0000\u0000"+
		"\u0000*\u019f\u0001\u0000\u0000\u0000,\u01b5\u0001\u0000\u0000\u0000."+
		"\u01c1\u0001\u0000\u0000\u00000\u01c6\u0001\u0000\u0000\u00002\u01cf\u0001"+
		"\u0000\u0000\u00004\u01eb\u0001\u0000\u0000\u00006\u01ed\u0001\u0000\u0000"+
		"\u00008\u0205\u0001\u0000\u0000\u0000:\u0212\u0001\u0000\u0000\u0000<"+
		"\u022b\u0001\u0000\u0000\u0000>\u022d\u0001\u0000\u0000\u0000@\u0234\u0001"+
		"\u0000\u0000\u0000B\u0239\u0001\u0000\u0000\u0000D\u0243\u0001\u0000\u0000"+
		"\u0000F\u0245\u0001\u0000\u0000\u0000H\u024e\u0001\u0000\u0000\u0000J"+
		"\u0252\u0001\u0000\u0000\u0000L\u025c\u0001\u0000\u0000\u0000N\u025e\u0001"+
		"\u0000\u0000\u0000P\u0262\u0001\u0000\u0000\u0000R\u0268\u0001\u0000\u0000"+
		"\u0000T\u0270\u0001\u0000\u0000\u0000V\u0281\u0001\u0000\u0000\u0000X"+
		"\u0297\u0001\u0000\u0000\u0000Z\u0299\u0001\u0000\u0000\u0000\\^\u0003"+
		"\u0002\u0001\u0000]\\\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000"+
		"_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`h\u0001\u0000\u0000"+
		"\u0000a_\u0001\u0000\u0000\u0000bg\u0003\n\u0005\u0000cg\u0003\u000e\u0007"+
		"\u0000dg\u0003\u0010\b\u0000eg\u0003\u0012\t\u0000fb\u0001\u0000\u0000"+
		"\u0000fc\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fe\u0001\u0000"+
		"\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001"+
		"\u0000\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000"+
		"km\u0003\u0006\u0003\u0000lk\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000"+
		"\u0000mn\u0001\u0000\u0000\u0000no\u0005\u0000\u0000\u0001o\u0001\u0001"+
		"\u0000\u0000\u0000pq\u0005-\u0000\u0000qr\u0003\u0004\u0002\u0000rs\u0005"+
		"0\u0000\u0000st\u0005b\u0000\u0000tu\u0005\b\u0000\u0000u\u0003\u0001"+
		"\u0000\u0000\u0000v\u0084\u0005^\u0000\u0000w\u0080\u0005\u000e\u0000"+
		"\u0000x}\u0005^\u0000\u0000yz\u0005\u0007\u0000\u0000z|\u0005^\u0000\u0000"+
		"{y\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000"+
		"\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000"+
		"\u007f}\u0001\u0000\u0000\u0000\u0080x\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0084"+
		"\u0005\u000f\u0000\u0000\u0083v\u0001\u0000\u0000\u0000\u0083w\u0001\u0000"+
		"\u0000\u0000\u0084\u0005\u0001\u0000\u0000\u0000\u0085\u0086\u0005.\u0000"+
		"\u0000\u0086\u0087\u0003\b\u0004\u0000\u0087\u0007\u0001\u0000\u0000\u0000"+
		"\u0088\u008a\u0005/\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0001\u0000\u0000\u0000\u008a\u0090\u0001\u0000\u0000\u0000\u008b"+
		"\u0091\u0003\u000e\u0007\u0000\u008c\u0091\u0003\n\u0005\u0000\u008d\u0091"+
		"\u0003\u0010\b\u0000\u008e\u0091\u0003\u0012\t\u0000\u008f\u0091\u0003"+
		"\u0018\f\u0000\u0090\u008b\u0001\u0000\u0000\u0000\u0090\u008c\u0001\u0000"+
		"\u0000\u0000\u0090\u008d\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000"+
		"\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u009f\u0001\u0000"+
		"\u0000\u0000\u0092\u009b\u0005\u000e\u0000\u0000\u0093\u0098\u0005^\u0000"+
		"\u0000\u0094\u0095\u0005\u0007\u0000\u0000\u0095\u0097\u0005^\u0000\u0000"+
		"\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000"+
		"\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000"+
		"\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000"+
		"\u009b\u0093\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009f\u0005\u000f\u0000\u0000"+
		"\u009e\u0089\u0001\u0000\u0000\u0000\u009e\u0092\u0001\u0000\u0000\u0000"+
		"\u009f\t\u0001\u0000\u0000\u0000\u00a0\u00a2\u0007\u0000\u0000\u0000\u00a1"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005^\u0000\u0000\u00a4\u00a5"+
		"\u0007\u0001\u0000\u0000\u00a5\u00a6\u0003\f\u0006\u0000\u00a6\u00a7\u0007"+
		"\u0002\u0000\u0000\u00a7\u000b\u0001\u0000\u0000\u0000\u00a8\u00ad\u0003"+
		"\u0014\n\u0000\u00a9\u00ad\u0003\u0016\u000b\u0000\u00aa\u00ad\u0003\u0018"+
		"\f\u0000\u00ab\u00ad\u0003\u0010\b\u0000\u00ac\u00a8\u0001\u0000\u0000"+
		"\u0000\u00ac\u00a9\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\r\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0005)\u0000\u0000\u00af\u00b2\u0005^\u0000\u0000\u00b0\u00b1"+
		"\u00052\u0000\u0000\u00b1\u00b3\u0005^\u0000\u0000\u00b2\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00bd\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u00053\u0000\u0000\u00b5\u00ba\u0005^\u0000\u0000"+
		"\u00b6\u00b7\u0005\u0007\u0000\u0000\u00b7\u00b9\u0005^\u0000\u0000\u00b8"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba"+
		"\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb"+
		"\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd"+
		"\u00b4\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u000e\u0000\u0000\u00c0"+
		"\u00c1\u0003\u001a\r\u0000\u00c1\u00c2\u0005\u000f\u0000\u0000\u00c2\u000f"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c5\u00054\u0000\u0000\u00c4\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0005^\u0000\u0000\u00c7\u00c9\u0005\n"+
		"\u0000\u0000\u00c8\u00ca\u0003&\u0013\u0000\u00c9\u00c8\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000"+
		"\u0000\u00cb\u00ce\u0005\u000b\u0000\u0000\u00cc\u00cd\u0005\t\u0000\u0000"+
		"\u00cd\u00cf\u0003X,\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1"+
		"\u0005\u000e\u0000\u0000\u00d1\u00d2\u0003(\u0014\u0000\u00d2\u00d3\u0005"+
		"\u000f\u0000\u0000\u00d3\u0011\u0001\u0000\u0000\u0000\u00d4\u00da\u0003"+
		"\u001e\u000f\u0000\u00d5\u00d6\u0005\u000e\u0000\u0000\u00d6\u00d7\u0003"+
		"0\u0018\u0000\u00d7\u00d8\u0005\u000f\u0000\u0000\u00d8\u00da\u0001\u0000"+
		"\u0000\u0000\u00d9\u00d4\u0001\u0000\u0000\u0000\u00d9\u00d5\u0001\u0000"+
		"\u0000\u0000\u00da\u0013\u0001\u0000\u0000\u0000\u00db\u00e2\u0003X,\u0000"+
		"\u00dc\u00e2\u0003\u0016\u000b\u0000\u00dd\u00e2\u0003\u0018\f\u0000\u00de"+
		"\u00e2\u0003<\u001e\u0000\u00df\u00e2\u0003J%\u0000\u00e0\u00e2\u0003"+
		"F#\u0000\u00e1\u00db\u0001\u0000\u0000\u0000\u00e1\u00dc\u0001\u0000\u0000"+
		"\u0000\u00e1\u00dd\u0001\u0000\u0000\u0000\u00e1\u00de\u0001\u0000\u0000"+
		"\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e2\u0015\u0001\u0000\u0000\u0000\u00e3\u00ec\u0005\f\u0000\u0000"+
		"\u00e4\u00e9\u0003\u0014\n\u0000\u00e5\u00e6\u0005\u0007\u0000\u0000\u00e6"+
		"\u00e8\u0003\u0014\n\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00eb"+
		"\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9"+
		"\u0001\u0000\u0000\u0000\u00ec\u00e4\u0001\u0000\u0000\u0000\u00ec\u00ed"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef"+
		"\u0005\r\u0000\u0000\u00ef\u0017\u0001\u0000\u0000\u0000\u00f0\u00fd\u0005"+
		"\u000e\u0000\u0000\u00f1\u00f2\u0005^\u0000\u0000\u00f2\u00f3\u0005\t"+
		"\u0000\u0000\u00f3\u00fa\u0003\u0014\n\u0000\u00f4\u00f5\u0005\u0007\u0000"+
		"\u0000\u00f5\u00f6\u0005^\u0000\u0000\u00f6\u00f7\u0005\t\u0000\u0000"+
		"\u00f7\u00f9\u0003\u0014\n\u0000\u00f8\u00f4\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fd\u00f1\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff"+
		"\u0100\u0005\u000f\u0000\u0000\u0100\u0019\u0001\u0000\u0000\u0000\u0101"+
		"\u0106\u0003\u001e\u000f\u0000\u0102\u0106\u0003$\u0012\u0000\u0103\u0106"+
		"\u0003\n\u0005\u0000\u0104\u0106\u0003\u0010\b\u0000\u0105\u0101\u0001"+
		"\u0000\u0000\u0000\u0105\u0102\u0001\u0000\u0000\u0000\u0105\u0103\u0001"+
		"\u0000\u0000\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0106\u0109\u0001"+
		"\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107\u0108\u0001"+
		"\u0000\u0000\u0000\u0108\u001b\u0001\u0000\u0000\u0000\u0109\u0107\u0001"+
		"\u0000\u0000\u0000\u010a\u010b\u0005^\u0000\u0000\u010b\u010c\u0005\t"+
		"\u0000\u0000\u010c\u010e\u0003X,\u0000\u010d\u010a\u0001\u0000\u0000\u0000"+
		"\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000"+
		"\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0113\u0001\u0000\u0000\u0000"+
		"\u0111\u0112\u0005\u0001\u0000\u0000\u0112\u0114\u0003\u0014\n\u0000\u0113"+
		"\u0111\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114"+
		"\u0115\u0001\u0000\u0000\u0000\u0115\u0116\u0005\b\u0000\u0000\u0116\u012e"+
		"\u0001\u0000\u0000\u0000\u0117\u0118\u0005S\u0000\u0000\u0118\u0119\u0005"+
		"\u001e\u0000\u0000\u0119\u011a\u0005^\u0000\u0000\u011a\u0123\u0005\u0001"+
		"\u0000\u0000\u011b\u0124\u0003\u0014\n\u0000\u011c\u011d\u0005S\u0000"+
		"\u0000\u011d\u011e\u0005\u001e\u0000\u0000\u011e\u0121\u0005^\u0000\u0000"+
		"\u011f\u0120\u0005\u001e\u0000\u0000\u0120\u0122\u0003:\u001d\u0000\u0121"+
		"\u011f\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122"+
		"\u0124\u0001\u0000\u0000\u0000\u0123\u011b\u0001\u0000\u0000\u0000\u0123"+
		"\u011c\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124"+
		"\u0126\u0001\u0000\u0000\u0000\u0125\u0127\u0005\b\u0000\u0000\u0126\u0125"+
		"\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u012e"+
		"\u0001\u0000\u0000\u0000\u0128\u0129\u0005^\u0000\u0000\u0129\u012a\u0005"+
		"\u0001\u0000\u0000\u012a\u012b\u0003\u0014\n\u0000\u012b\u012c\u0005\b"+
		"\u0000\u0000\u012c\u012e\u0001\u0000\u0000\u0000\u012d\u010d\u0001\u0000"+
		"\u0000\u0000\u012d\u0117\u0001\u0000\u0000\u0000\u012d\u0128\u0001\u0000"+
		"\u0000\u0000\u012e\u001d\u0001\u0000\u0000\u0000\u012f\u0130\u0005\u001f"+
		"\u0000\u0000\u0130\u0131\u0005^\u0000\u0000\u0131\u0135\u0005\n\u0000"+
		"\u0000\u0132\u0134\u0003 \u0010\u0000\u0133\u0132\u0001\u0000\u0000\u0000"+
		"\u0134\u0137\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000"+
		"\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0138\u0001\u0000\u0000\u0000"+
		"\u0137\u0135\u0001\u0000\u0000\u0000\u0138\u013c\u0005\u000b\u0000\u0000"+
		"\u0139\u013a\u0005\u001f\u0000\u0000\u013a\u013c\u0005^\u0000\u0000\u013b"+
		"\u012f\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013c"+
		"\u001f\u0001\u0000\u0000\u0000\u013d\u0141\u0005\u000e\u0000\u0000\u013e"+
		"\u0140\u0003\"\u0011\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u0140\u0143"+
		"\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0142"+
		"\u0001\u0000\u0000\u0000\u0142\u0144\u0001\u0000\u0000\u0000\u0143\u0141"+
		"\u0001\u0000\u0000\u0000\u0144\u0145\u0005\u000f\u0000\u0000\u0145!\u0001"+
		"\u0000\u0000\u0000\u0146\u015e\u0003\u0006\u0003\u0000\u0147\u015e\u0003"+
		"\u0010\b\u0000\u0148\u015e\u0003\n\u0005\u0000\u0149\u015e\u0003\u000e"+
		"\u0007\u0000\u014a\u014e\u0005\u000e\u0000\u0000\u014b\u014d\u0003.\u0017"+
		"\u0000\u014c\u014b\u0001\u0000\u0000\u0000\u014d\u0150\u0001\u0000\u0000"+
		"\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000"+
		"\u0000\u014f\u0151\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000"+
		"\u0000\u0151\u015e\u0005\u000f\u0000\u0000\u0152\u0153\u0005$\u0000\u0000"+
		"\u0153\u0154\u0005\t\u0000\u0000\u0154\u0155\u0005b\u0000\u0000\u0155"+
		"\u015e\u0005\u0007\u0000\u0000\u0156\u0157\u0005%\u0000\u0000\u0157\u0158"+
		"\u0005\t\u0000\u0000\u0158\u0159\u0005\u001d\u0000\u0000\u0159\u015a\u0003"+
		"<\u001e\u0000\u015a\u015b\u0005\u001d\u0000\u0000\u015b\u015c\u0005\u0007"+
		"\u0000\u0000\u015c\u015e\u0001\u0000\u0000\u0000\u015d\u0146\u0001\u0000"+
		"\u0000\u0000\u015d\u0147\u0001\u0000\u0000\u0000\u015d\u0148\u0001\u0000"+
		"\u0000\u0000\u015d\u0149\u0001\u0000\u0000\u0000\u015d\u014a\u0001\u0000"+
		"\u0000\u0000\u015d\u0152\u0001\u0000\u0000\u0000\u015d\u0156\u0001\u0000"+
		"\u0000\u0000\u015e#\u0001\u0000\u0000\u0000\u015f\u0160\u00051\u0000\u0000"+
		"\u0160\u0162\u0005\n\u0000\u0000\u0161\u0163\u0003&\u0013\u0000\u0162"+
		"\u0161\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163"+
		"\u0164\u0001\u0000\u0000\u0000\u0164\u0165\u0005\u000b\u0000\u0000\u0165"+
		"\u0168\u0005\u000e\u0000\u0000\u0166\u0169\u0003(\u0014\u0000\u0167\u0169"+
		"\u0003\u001c\u000e\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0168\u0167"+
		"\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u016b"+
		"\u0005\u000f\u0000\u0000\u016b%\u0001\u0000\u0000\u0000\u016c\u016e\u0007"+
		"\u0003\u0000\u0000\u016d\u016c\u0001\u0000\u0000\u0000\u016d\u016e\u0001"+
		"\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0176\u0005"+
		"^\u0000\u0000\u0170\u0171\u0005\t\u0000\u0000\u0171\u0174\u0003X,\u0000"+
		"\u0172\u0173\u0005\u0001\u0000\u0000\u0173\u0175\u0003\u0014\n\u0000\u0174"+
		"\u0172\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175"+
		"\u0177\u0001\u0000\u0000\u0000\u0176\u0170\u0001\u0000\u0000\u0000\u0176"+
		"\u0177\u0001\u0000\u0000\u0000\u0177\u0187\u0001\u0000\u0000\u0000\u0178"+
		"\u017a\u0005\u0007\u0000\u0000\u0179\u017b\u0007\u0003\u0000\u0000\u017a"+
		"\u0179\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b"+
		"\u017c\u0001\u0000\u0000\u0000\u017c\u0183\u0005^\u0000\u0000\u017d\u017e"+
		"\u0005\t\u0000\u0000\u017e\u0181\u0003X,\u0000\u017f\u0180\u0005\u0001"+
		"\u0000\u0000\u0180\u0182\u0003\u0014\n\u0000\u0181\u017f\u0001\u0000\u0000"+
		"\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0184\u0001\u0000\u0000"+
		"\u0000\u0183\u017d\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000"+
		"\u0000\u0184\u0186\u0001\u0000\u0000\u0000\u0185\u0178\u0001\u0000\u0000"+
		"\u0000\u0186\u0189\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000"+
		"\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u0195\u0001\u0000\u0000"+
		"\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u018a\u018b\u0005\u000e\u0000"+
		"\u0000\u018b\u0190\u0005^\u0000\u0000\u018c\u018d\u0005\u0007\u0000\u0000"+
		"\u018d\u018f\u0005^\u0000\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018f"+
		"\u0192\u0001\u0000\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0190"+
		"\u0191\u0001\u0000\u0000\u0000\u0191\u0193\u0001\u0000\u0000\u0000\u0192"+
		"\u0190\u0001\u0000\u0000\u0000\u0193\u0195\u0005\u000f\u0000\u0000\u0194"+
		"\u016d\u0001\u0000\u0000\u0000\u0194\u018a\u0001\u0000\u0000\u0000\u0195"+
		"\'\u0001\u0000\u0000\u0000\u0196\u0198\u0003.\u0017\u0000\u0197\u0196"+
		"\u0001\u0000\u0000\u0000\u0198\u019b\u0001\u0000\u0000\u0000\u0199\u0197"+
		"\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019d"+
		"\u0001\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019c\u019e"+
		"\u0003*\u0015\u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019d\u019e\u0001"+
		"\u0000\u0000\u0000\u019e)\u0001\u0000\u0000\u0000\u019f\u01a7\u0005>\u0000"+
		"\u0000\u01a0\u01a4\u0003\u0014\n\u0000\u01a1\u01a2\u0003,\u0016\u0000"+
		"\u01a2\u01a3\u0003\u0014\n\u0000\u01a3\u01a5\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a1\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a8\u0001\u0000\u0000\u0000\u01a6\u01a8\u0003<\u001e\u0000\u01a7\u01a0"+
		"\u0001\u0000\u0000\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a7\u01a8"+
		"\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01aa"+
		"\u0005\b\u0000\u0000\u01aa+\u0001\u0000\u0000\u0000\u01ab\u01b6\u0005"+
		"\u0002\u0000\u0000\u01ac\u01b6\u0005\u0003\u0000\u0000\u01ad\u01b6\u0005"+
		"\u0004\u0000\u0000\u01ae\u01b6\u0005\u0005\u0000\u0000\u01af\u01b6\u0005"+
		"\u0015\u0000\u0000\u01b0\u01b6\u0005\u0016\u0000\u0000\u01b1\u01b6\u0005"+
		"\u0011\u0000\u0000\u01b2\u01b6\u0005\u0013\u0000\u0000\u01b3\u01b6\u0005"+
		"\u0010\u0000\u0000\u01b4\u01b6\u0005\u0012\u0000\u0000\u01b5\u01ab\u0001"+
		"\u0000\u0000\u0000\u01b5\u01ac\u0001\u0000\u0000\u0000\u01b5\u01ad\u0001"+
		"\u0000\u0000\u0000\u01b5\u01ae\u0001\u0000\u0000\u0000\u01b5\u01af\u0001"+
		"\u0000\u0000\u0000\u01b5\u01b0\u0001\u0000\u0000\u0000\u01b5\u01b1\u0001"+
		"\u0000\u0000\u0000\u01b5\u01b2\u0001\u0000\u0000\u0000\u01b5\u01b3\u0001"+
		"\u0000\u0000\u0000\u01b5\u01b4\u0001\u0000\u0000\u0000\u01b6-\u0001\u0000"+
		"\u0000\u0000\u01b7\u01c2\u0003\n\u0005\u0000\u01b8\u01c2\u00032\u0019"+
		"\u0000\u01b9\u01c2\u00036\u001b\u0000\u01ba\u01c2\u00038\u001c\u0000\u01bb"+
		"\u01c2\u0003:\u001d\u0000\u01bc\u01c2\u0003Z-\u0000\u01bd\u01c2\u0003"+
		"<\u001e\u0000\u01be\u01c2\u0003J%\u0000\u01bf\u01c2\u0003*\u0015\u0000"+
		"\u01c0\u01c2\u0003\u001c\u000e\u0000\u01c1\u01b7\u0001\u0000\u0000\u0000"+
		"\u01c1\u01b8\u0001\u0000\u0000\u0000\u01c1\u01b9\u0001\u0000\u0000\u0000"+
		"\u01c1\u01ba\u0001\u0000\u0000\u0000\u01c1\u01bb\u0001\u0000\u0000\u0000"+
		"\u01c1\u01bc\u0001\u0000\u0000\u0000\u01c1\u01bd\u0001\u0000\u0000\u0000"+
		"\u01c1\u01be\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000"+
		"\u01c1\u01c0\u0001\u0000\u0000\u0000\u01c2/\u0001\u0000\u0000\u0000\u01c3"+
		"\u01c5\u0003\n\u0005\u0000\u01c4\u01c3\u0001\u0000\u0000\u0000\u01c5\u01c8"+
		"\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c7"+
		"\u0001\u0000\u0000\u0000\u01c7\u01cc\u0001\u0000\u0000\u0000\u01c8\u01c6"+
		"\u0001\u0000\u0000\u0000\u01c9\u01cb\u0003\u0010\b\u0000\u01ca\u01c9\u0001"+
		"\u0000\u0000\u0000\u01cb\u01ce\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001"+
		"\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd1\u0001\u0000"+
		"\u0000\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01cf\u01d0\u0005:\u0000"+
		"\u0000\u01d0\u01d1\u0005\n\u0000\u0000\u01d1\u01d2\u00034\u001a\u0000"+
		"\u01d2\u01d3\u0005\u000b\u0000\u0000\u01d3\u01d7\u0005\u000e\u0000\u0000"+
		"\u01d4\u01d6\u0003.\u0017\u0000\u01d5\u01d4\u0001\u0000\u0000\u0000\u01d6"+
		"\u01d9\u0001\u0000\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d7"+
		"\u01d8\u0001\u0000\u0000\u0000\u01d8\u01da\u0001\u0000\u0000\u0000\u01d9"+
		"\u01d7\u0001\u0000\u0000\u0000\u01da\u01e4\u0005\u000f\u0000\u0000\u01db"+
		"\u01dc\u0005;\u0000\u0000\u01dc\u01e0\u0005\u000e\u0000\u0000\u01dd\u01df"+
		"\u0003.\u0017\u0000\u01de\u01dd\u0001\u0000\u0000\u0000\u01df\u01e2\u0001"+
		"\u0000\u0000\u0000\u01e0\u01de\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001"+
		"\u0000\u0000\u0000\u01e1\u01e3\u0001\u0000\u0000\u0000\u01e2\u01e0\u0001"+
		"\u0000\u0000\u0000\u01e3\u01e5\u0005\u000f\u0000\u0000\u01e4\u01db\u0001"+
		"\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e53\u0001\u0000"+
		"\u0000\u0000\u01e6\u01e7\u0003V+\u0000\u01e7\u01e8\u0007\u0004\u0000\u0000"+
		"\u01e8\u01e9\u0003V+\u0000\u01e9\u01ec\u0001\u0000\u0000\u0000\u01ea\u01ec"+
		"\u0003V+\u0000\u01eb\u01e6\u0001\u0000\u0000\u0000\u01eb\u01ea\u0001\u0000"+
		"\u0000\u0000\u01ec5\u0001\u0000\u0000\u0000\u01ed\u01ee\u0005<\u0000\u0000"+
		"\u01ee\u01f0\u0005\n\u0000\u0000\u01ef\u01f1\u0003\n\u0005\u0000\u01f0"+
		"\u01ef\u0001\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1"+
		"\u01f3\u0001\u0000\u0000\u0000\u01f2\u01f4\u00034\u001a\u0000\u01f3\u01f2"+
		"\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f6"+
		"\u0001\u0000\u0000\u0000\u01f5\u01f7\u0005\b\u0000\u0000\u01f6\u01f5\u0001"+
		"\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000\u0000\u0000\u01f7\u01f9\u0001"+
		"\u0000\u0000\u0000\u01f8\u01fa\u0003.\u0017\u0000\u01f9\u01f8\u0001\u0000"+
		"\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa\u01fb\u0001\u0000"+
		"\u0000\u0000\u01fb\u01fc\u0005\u000b\u0000\u0000\u01fc\u0200\u0005\u000e"+
		"\u0000\u0000\u01fd\u01ff\u0003.\u0017\u0000\u01fe\u01fd\u0001\u0000\u0000"+
		"\u0000\u01ff\u0202\u0001\u0000\u0000\u0000\u0200\u01fe\u0001\u0000\u0000"+
		"\u0000\u0200\u0201\u0001\u0000\u0000\u0000\u0201\u0203\u0001\u0000\u0000"+
		"\u0000\u0202\u0200\u0001\u0000\u0000\u0000\u0203\u0204\u0005\u000f\u0000"+
		"\u0000\u02047\u0001\u0000\u0000\u0000\u0205\u0206\u0005=\u0000\u0000\u0206"+
		"\u0207\u0005\n\u0000\u0000\u0207\u0208\u00034\u001a\u0000\u0208\u0209"+
		"\u0005\u000b\u0000\u0000\u0209\u020d\u0005\u000e\u0000\u0000\u020a\u020c"+
		"\u0003.\u0017\u0000\u020b\u020a\u0001\u0000\u0000\u0000\u020c\u020f\u0001"+
		"\u0000\u0000\u0000\u020d\u020b\u0001\u0000\u0000\u0000\u020d\u020e\u0001"+
		"\u0000\u0000\u0000\u020e\u0210\u0001\u0000\u0000\u0000\u020f\u020d\u0001"+
		"\u0000\u0000\u0000\u0210\u0211\u0005\u000f\u0000\u0000\u02119\u0001\u0000"+
		"\u0000\u0000\u0212\u0213\u0005^\u0000\u0000\u0213\u021c\u0005\n\u0000"+
		"\u0000\u0214\u0219\u0003V+\u0000\u0215\u0216\u0005\u0007\u0000\u0000\u0216"+
		"\u0218\u0003V+\u0000\u0217\u0215\u0001\u0000\u0000\u0000\u0218\u021b\u0001"+
		"\u0000\u0000\u0000\u0219\u0217\u0001\u0000\u0000\u0000\u0219\u021a\u0001"+
		"\u0000\u0000\u0000\u021a\u021d\u0001\u0000\u0000\u0000\u021b\u0219\u0001"+
		"\u0000\u0000\u0000\u021c\u0214\u0001\u0000\u0000\u0000\u021c\u021d\u0001"+
		"\u0000\u0000\u0000\u021d\u021e\u0001\u0000\u0000\u0000\u021e\u021f\u0005"+
		"\u000b\u0000\u0000\u021f\u0220\u0005\b\u0000\u0000\u0220;\u0001\u0000"+
		"\u0000\u0000\u0221\u0225\u0003>\u001f\u0000\u0222\u0224\u0003D\"\u0000"+
		"\u0223\u0222\u0001\u0000\u0000\u0000\u0224\u0227\u0001\u0000\u0000\u0000"+
		"\u0225\u0223\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000\u0000\u0000"+
		"\u0226\u0228\u0001\u0000\u0000\u0000\u0227\u0225\u0001\u0000\u0000\u0000"+
		"\u0228\u0229\u0003@ \u0000\u0229\u022c\u0001\u0000\u0000\u0000\u022a\u022c"+
		"\u0003B!\u0000\u022b\u0221\u0001\u0000\u0000\u0000\u022b\u022a\u0001\u0000"+
		"\u0000\u0000\u022c=\u0001\u0000\u0000\u0000\u022d\u022e\u0005\u0010\u0000"+
		"\u0000\u022e\u0230\u0005^\u0000\u0000\u022f\u0231\u0003H$\u0000\u0230"+
		"\u022f\u0001\u0000\u0000\u0000\u0230\u0231\u0001\u0000\u0000\u0000\u0231"+
		"\u0232\u0001\u0000\u0000\u0000\u0232\u0233\u0005\u0011\u0000\u0000\u0233"+
		"?\u0001\u0000\u0000\u0000\u0234\u0235\u0005\u0010\u0000\u0000\u0235\u0236"+
		"\u0005\u0005\u0000\u0000\u0236\u0237\u0005^\u0000\u0000\u0237\u0238\u0005"+
		"\u0011\u0000\u0000\u0238A\u0001\u0000\u0000\u0000\u0239\u023a\u0005\u0010"+
		"\u0000\u0000\u023a\u023c\u0005^\u0000\u0000\u023b\u023d\u0003H$\u0000"+
		"\u023c\u023b\u0001\u0000\u0000\u0000\u023c\u023d\u0001\u0000\u0000\u0000"+
		"\u023d\u023e\u0001\u0000\u0000\u0000\u023e\u023f\u0005 \u0000\u0000\u023f"+
		"C\u0001\u0000\u0000\u0000\u0240\u0244\u0003<\u001e\u0000\u0241\u0244\u0003"+
		"F#\u0000\u0242\u0244\u0005^\u0000\u0000\u0243\u0240\u0001\u0000\u0000"+
		"\u0000\u0243\u0241\u0001\u0000\u0000\u0000\u0243\u0242\u0001\u0000\u0000"+
		"\u0000\u0244E\u0001\u0000\u0000\u0000\u0245\u0246\u0005!\u0000\u0000\u0246"+
		"\u0247\u0003V+\u0000\u0247\u0248\u0005\"\u0000\u0000\u0248G\u0001\u0000"+
		"\u0000\u0000\u0249\u024f\u0003J%\u0000\u024a\u024f\u0003N\'\u0000\u024b"+
		"\u024f\u0003P(\u0000\u024c\u024f\u0003R)\u0000\u024d\u024f\u0003T*\u0000"+
		"\u024e\u0249\u0001\u0000\u0000\u0000\u024e\u024a\u0001\u0000\u0000\u0000"+
		"\u024e\u024b\u0001\u0000\u0000\u0000\u024e\u024c\u0001\u0000\u0000\u0000"+
		"\u024e\u024d\u0001\u0000\u0000\u0000\u024f\u0250\u0001\u0000\u0000\u0000"+
		"\u0250\u024e\u0001\u0000\u0000\u0000\u0250\u0251\u0001\u0000\u0000\u0000"+
		"\u0251I\u0001\u0000\u0000\u0000\u0252\u0253\u0005\u0004\u0000\u0000\u0253"+
		"\u0254\u0003L&\u0000\u0254\u0255\u0005\u0001\u0000\u0000\u0255\u0256\u0005"+
		"b\u0000\u0000\u0256K\u0001\u0000\u0000\u0000\u0257\u025d\u0005Y\u0000"+
		"\u0000\u0258\u025d\u0005Z\u0000\u0000\u0259\u025d\u0005[\u0000\u0000\u025a"+
		"\u025d\u0005\\\u0000\u0000\u025b\u025d\u0005]\u0000\u0000\u025c\u0257"+
		"\u0001\u0000\u0000\u0000\u025c\u0258\u0001\u0000\u0000\u0000\u025c\u0259"+
		"\u0001\u0000\u0000\u0000\u025c\u025a\u0001\u0000\u0000\u0000\u025c\u025b"+
		"\u0001\u0000\u0000\u0000\u025dM\u0001\u0000\u0000\u0000\u025e\u025f\u0005"+
		"^\u0000\u0000\u025f\u0260\u0005\u0001\u0000\u0000\u0260\u0261\u0005b\u0000"+
		"\u0000\u0261O\u0001\u0000\u0000\u0000\u0262\u0263\u0005\n\u0000\u0000"+
		"\u0263\u0264\u0005^\u0000\u0000\u0264\u0265\u0005\u000b\u0000\u0000\u0265"+
		"\u0266\u0005\u0001\u0000\u0000\u0266\u0267\u0005b\u0000\u0000\u0267Q\u0001"+
		"\u0000\u0000\u0000\u0268\u0269\u0005\f\u0000\u0000\u0269\u026a\u0005^"+
		"\u0000\u0000\u026a\u026b\u0005\r\u0000\u0000\u026b\u026e\u0005\u0001\u0000"+
		"\u0000\u026c\u026f\u0005b\u0000\u0000\u026d\u026f\u0003F#\u0000\u026e"+
		"\u026c\u0001\u0000\u0000\u0000\u026e\u026d\u0001\u0000\u0000\u0000\u026f"+
		"S\u0001\u0000\u0000\u0000\u0270\u0271\u0005)\u0000\u0000\u0271\u0272\u0005"+
		"\u0001\u0000\u0000\u0272\u0273\u0005b\u0000\u0000\u0273U\u0001\u0000\u0000"+
		"\u0000\u0274\u0275\u0006+\uffff\uffff\u0000\u0275\u0282\u0005^\u0000\u0000"+
		"\u0276\u0277\u0005^\u0000\u0000\u0277\u0278\u0005\u001e\u0000\u0000\u0278"+
		"\u0282\u0005^\u0000\u0000\u0279\u0282\u0005b\u0000\u0000\u027a\u0282\u0005"+
		"_\u0000\u0000\u027b\u0282\u0005`\u0000\u0000\u027c\u0282\u0005a\u0000"+
		"\u0000\u027d\u0282\u0003\u0014\n\u0000\u027e\u0282\u0003:\u001d\u0000"+
		"\u027f\u0282\u0003\u0016\u000b\u0000\u0280\u0282\u0003\u0018\f\u0000\u0281"+
		"\u0274\u0001\u0000\u0000\u0000\u0281\u0276\u0001\u0000\u0000\u0000\u0281"+
		"\u0279\u0001\u0000\u0000\u0000\u0281\u027a\u0001\u0000\u0000\u0000\u0281"+
		"\u027b\u0001\u0000\u0000\u0000\u0281\u027c\u0001\u0000\u0000\u0000\u0281"+
		"\u027d\u0001\u0000\u0000\u0000\u0281\u027e\u0001\u0000\u0000\u0000\u0281"+
		"\u027f\u0001\u0000\u0000\u0000\u0281\u0280\u0001\u0000\u0000\u0000\u0282"+
		"\u0289\u0001\u0000\u0000\u0000\u0283\u0284\n\u0001\u0000\u0000\u0284\u0285"+
		"\u0003,\u0016\u0000\u0285\u0286\u0003V+\u0002\u0286\u0288\u0001\u0000"+
		"\u0000\u0000\u0287\u0283\u0001\u0000\u0000\u0000\u0288\u028b\u0001\u0000"+
		"\u0000\u0000\u0289\u0287\u0001\u0000\u0000\u0000\u0289\u028a\u0001\u0000"+
		"\u0000\u0000\u028aW\u0001\u0000\u0000\u0000\u028b\u0289\u0001\u0000\u0000"+
		"\u0000\u028c\u0298\u0005^\u0000\u0000\u028d\u0298\u0005b\u0000\u0000\u028e"+
		"\u0298\u0005_\u0000\u0000\u028f\u0298\u0005`\u0000\u0000\u0290\u0298\u0005"+
		"a\u0000\u0000\u0291\u0298\u0005@\u0000\u0000\u0292\u0298\u0005O\u0000"+
		"\u0000\u0293\u0298\u0005P\u0000\u0000\u0294\u0298\u0005T\u0000\u0000\u0295"+
		"\u0298\u0005U\u0000\u0000\u0296\u0298\u0005?\u0000\u0000\u0297\u028c\u0001"+
		"\u0000\u0000\u0000\u0297\u028d\u0001\u0000\u0000\u0000\u0297\u028e\u0001"+
		"\u0000\u0000\u0000\u0297\u028f\u0001\u0000\u0000\u0000\u0297\u0290\u0001"+
		"\u0000\u0000\u0000\u0297\u0291\u0001\u0000\u0000\u0000\u0297\u0292\u0001"+
		"\u0000\u0000\u0000\u0297\u0293\u0001\u0000\u0000\u0000\u0297\u0294\u0001"+
		"\u0000\u0000\u0000\u0297\u0295\u0001\u0000\u0000\u0000\u0297\u0296\u0001"+
		"\u0000\u0000\u0000\u0298Y\u0001\u0000\u0000\u0000\u0299\u029a\u00055\u0000"+
		"\u0000\u029a\u029b\u0005\u001e\u0000\u0000\u029b\u029c\u00056\u0000\u0000"+
		"\u029c\u029d\u0005\n\u0000\u0000\u029d\u029e\u0003V+\u0000\u029e\u029f"+
		"\u0005\u000b\u0000\u0000\u029f\u02a0\u0005\b\u0000\u0000\u02a0[\u0001"+
		"\u0000\u0000\u0000R_fhl}\u0080\u0083\u0089\u0090\u0098\u009b\u009e\u00a1"+
		"\u00ac\u00b2\u00ba\u00bd\u00c4\u00c9\u00ce\u00d9\u00e1\u00e9\u00ec\u00fa"+
		"\u00fd\u0105\u0107\u010f\u0113\u0121\u0123\u0126\u012d\u0135\u013b\u0141"+
		"\u014e\u015d\u0162\u0168\u016d\u0174\u0176\u017a\u0181\u0183\u0187\u0190"+
		"\u0194\u0199\u019d\u01a4\u01a7\u01b5\u01c1\u01c6\u01cc\u01d7\u01e0\u01e4"+
		"\u01eb\u01f0\u01f3\u01f6\u01f9\u0200\u020d\u0219\u021c\u0225\u022b\u0230"+
		"\u023c\u0243\u024e\u0250\u025c\u026e\u0281\u0289\u0297";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}