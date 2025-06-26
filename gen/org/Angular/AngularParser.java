// Generated from C:/compiler/compiler/src/main/java/org/Angular/AngularParser.g4 by ANTLR 4.13.2
package org.Angular;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AngularParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, EXPORT=2, FROM=3, AS=4, DEFAULT_CASE=5, SELECTOR=6, TEMPLATE_URL=7, 
		TEMPLATE=8, DECLERATIONS=9, IMPORTS=10, CLASS=11, EXTENDS=12, IMPLEMENTS=13, 
		CONSTRUCTOR=14, FUNCTION=15, RETURN=16, BREAK=17, IF=18, ELSE=19, FOR=20, 
		WHILE=21, DO=22, SWITCH=23, CASE=24, THIS=25, VAR=26, LET=27, CONST=28, 
		PUBLIC=29, PRIVATE=30, PROTECTED=31, NULL=32, UNDEFINED=33, CONSOLE=34, 
		LOG=35, IN=36, ASYNC=37, ARROW=38, COMPONENT=39, DIRECTIVE=40, PIPE=41, 
		INJECTABLE=42, INPUT=43, OUTPUT=44, HOST_LISTENER=45, NG_MODULE=46, VIEW_CHILD=47, 
		ON_INIT=48, NG_IF=49, NG_FOR=50, NG_SWITCH=51, NG_SWITCH_CASE=52, NG_SWITCH_DEFAULT=53, 
		NG_TEMPLATE_OUTLET=54, NG_CLASS=55, NG_STYLE=56, STRING_TYPE=57, NUMBER_TYPE=58, 
		BOOLEAN_TYPE=59, ANY_TYPE=60, VOID_TYPE=61, AT=62, DOT=63, COMMA=64, COLON=65, 
		SEMI_COLON=66, QUESTION_MARK=67, HASH_TAG=68, BACTICK=69, ASSING=70, PLUS=71, 
		MINUS=72, MULTIPLY=73, DIV=74, MODULUS=75, PLUS_PLUS=76, MINUS_MINUS=77, 
		LESS_THAN=78, GREATER_THAN=79, LESS_THAN_EQUALS=80, GREATER_THAN_EQUALS=81, 
		EQUALS=82, NOT_EQUALS=83, IDENTITY_EQUALS=84, IDENTITY_NOT_EQUALS=85, 
		NOT=86, AND=87, OR=88, OR1=89, OPEN_BRACE=90, CLOSE_BRACE=91, OPEN_PAREN=92, 
		CLOSE_PAREN=93, OPEN_BRACKET=94, CLOSE_BRACKET=95, DOUBLE_OPEN_BRACE=96, 
		DOUBLE_CLOSE_BRACE=97, STRING=98, NUMBER=99, BOOLEAN=100, IDENTIFIER=101, 
		WS=102, COMMENT=103, BLOCK_COMMENT=104;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_block = 2, RULE_printStatement = 3, 
		RULE_arrayAccess = 4, RULE_importStatement = 5, RULE_importDeclaration = 6, 
		RULE_importDefaultSpecifier = 7, RULE_importNamespaceSpecifier = 8, RULE_importNamedSpecifier = 9, 
		RULE_importSpecifier = 10, RULE_exportStatement = 11, RULE_exportDefaultDeclaration = 12, 
		RULE_exportDeclaration = 13, RULE_exportListDeclaration = 14, RULE_exportSpecifier = 15, 
		RULE_classDeclaration = 16, RULE_classMember = 17, RULE_classMethodDeclaration = 18, 
		RULE_constructorDeclaration = 19, RULE_parameterList = 20, RULE_parameter = 21, 
		RULE_accessModifier = 22, RULE_variableStatement = 23, RULE_variableDeclarationConst = 24, 
		RULE_variableDeclaration = 25, RULE_variableType = 26, RULE_typeAnnotation = 27, 
		RULE_inlineObjectType = 28, RULE_typeMember = 29, RULE_arraySuffix = 30, 
		RULE_objectDeclaration = 31, RULE_objectProperty = 32, RULE_arrayDeclaration = 33, 
		RULE_expression = 34, RULE_ifStatement = 35, RULE_elseIfStatement = 36, 
		RULE_elseStatement = 37, RULE_iterationStatement = 38, RULE_switchStatement = 39, 
		RULE_caseClause = 40, RULE_defaultClause = 41, RULE_breakStatement = 42, 
		RULE_return = 43, RULE_functionCall = 44, RULE_functionDeclartion = 45, 
		RULE_normalFunction = 46, RULE_anoymousFunction = 47, RULE_arrowFunction = 48, 
		RULE_arrowParameters = 49, RULE_decorator = 50, RULE_decoratorArguments = 51, 
		RULE_decoratorArgument = 52, RULE_htmlBody = 53, RULE_htmlBodyWithDiv = 54, 
		RULE_htmlBodyNestedDiv = 55, RULE_htmlBodyDivAlone = 56, RULE_htmlBodyNoDiv = 57, 
		RULE_htmlContent = 58, RULE_htmlExpression = 59, RULE_htmlText = 60, RULE_interpolation = 61, 
		RULE_htmlAttributes = 62, RULE_angularDirective = 63, RULE_directive = 64, 
		RULE_htmlAttribute = 65, RULE_htmlEvent = 66, RULE_htmlBinding = 67, RULE_htmlClass = 68, 
		RULE_angularDecoratorName = 69, RULE_varHelpers = 70, RULE_value = 71, 
		RULE_type = 72;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "block", "printStatement", "arrayAccess", "importStatement", 
			"importDeclaration", "importDefaultSpecifier", "importNamespaceSpecifier", 
			"importNamedSpecifier", "importSpecifier", "exportStatement", "exportDefaultDeclaration", 
			"exportDeclaration", "exportListDeclaration", "exportSpecifier", "classDeclaration", 
			"classMember", "classMethodDeclaration", "constructorDeclaration", "parameterList", 
			"parameter", "accessModifier", "variableStatement", "variableDeclarationConst", 
			"variableDeclaration", "variableType", "typeAnnotation", "inlineObjectType", 
			"typeMember", "arraySuffix", "objectDeclaration", "objectProperty", "arrayDeclaration", 
			"expression", "ifStatement", "elseIfStatement", "elseStatement", "iterationStatement", 
			"switchStatement", "caseClause", "defaultClause", "breakStatement", "return", 
			"functionCall", "functionDeclartion", "normalFunction", "anoymousFunction", 
			"arrowFunction", "arrowParameters", "decorator", "decoratorArguments", 
			"decoratorArgument", "htmlBody", "htmlBodyWithDiv", "htmlBodyNestedDiv", 
			"htmlBodyDivAlone", "htmlBodyNoDiv", "htmlContent", "htmlExpression", 
			"htmlText", "interpolation", "htmlAttributes", "angularDirective", "directive", 
			"htmlAttribute", "htmlEvent", "htmlBinding", "htmlClass", "angularDecoratorName", 
			"varHelpers", "value", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'export'", "'from'", "'as'", "'default'", "'selector'", 
			"'templateUrl'", "'template'", "'declerations'", "'imports'", "'class'", 
			"'extends'", "'implements'", "'constructor'", "'function'", "'return'", 
			"'break'", "'if'", "'else'", "'for'", "'while'", "'do'", "'switch'", 
			"'case'", "'this'", "'var'", "'let'", "'const'", "'public'", "'private'", 
			"'protected'", "'null'", "'undefined'", "'console'", "'log'", "'in'", 
			"'async'", "'=>'", "'Component'", "'Directive'", "'Pipe'", "'Injectable'", 
			"'Input'", "'Output'", "'HostListener'", "'NgModule'", "'ViewChild'", 
			"'OnInit'", "'ngIf'", "'ngFor'", "'ngSwitch'", "'ngSwitchCase'", "'ngSwitchDefault'", 
			"'ngTemplateOutlet'", "'ngClass'", "'ngStyle'", "'string'", null, "'boolean'", 
			"'any'", "'void'", "'@'", "'.'", "','", "':'", "';'", "'?'", "'#'", "'`'", 
			"'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'<'", "'>'", 
			"'<='", "'>='", "'=='", "'!='", "'==='", "'!=='", "'!'", "'&&'", "'||'", 
			"'|'", "'{'", "'}'", "'('", "')'", "'['", "']'", "'{{'", "'}}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "EXPORT", "FROM", "AS", "DEFAULT_CASE", "SELECTOR", "TEMPLATE_URL", 
			"TEMPLATE", "DECLERATIONS", "IMPORTS", "CLASS", "EXTENDS", "IMPLEMENTS", 
			"CONSTRUCTOR", "FUNCTION", "RETURN", "BREAK", "IF", "ELSE", "FOR", "WHILE", 
			"DO", "SWITCH", "CASE", "THIS", "VAR", "LET", "CONST", "PUBLIC", "PRIVATE", 
			"PROTECTED", "NULL", "UNDEFINED", "CONSOLE", "LOG", "IN", "ASYNC", "ARROW", 
			"COMPONENT", "DIRECTIVE", "PIPE", "INJECTABLE", "INPUT", "OUTPUT", "HOST_LISTENER", 
			"NG_MODULE", "VIEW_CHILD", "ON_INIT", "NG_IF", "NG_FOR", "NG_SWITCH", 
			"NG_SWITCH_CASE", "NG_SWITCH_DEFAULT", "NG_TEMPLATE_OUTLET", "NG_CLASS", 
			"NG_STYLE", "STRING_TYPE", "NUMBER_TYPE", "BOOLEAN_TYPE", "ANY_TYPE", 
			"VOID_TYPE", "AT", "DOT", "COMMA", "COLON", "SEMI_COLON", "QUESTION_MARK", 
			"HASH_TAG", "BACTICK", "ASSING", "PLUS", "MINUS", "MULTIPLY", "DIV", 
			"MODULUS", "PLUS_PLUS", "MINUS_MINUS", "LESS_THAN", "GREATER_THAN", "LESS_THAN_EQUALS", 
			"GREATER_THAN_EQUALS", "EQUALS", "NOT_EQUALS", "IDENTITY_EQUALS", "IDENTITY_NOT_EQUALS", 
			"NOT", "AND", "OR", "OR1", "OPEN_BRACE", "CLOSE_BRACE", "OPEN_PAREN", 
			"CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", "DOUBLE_OPEN_BRACE", 
			"DOUBLE_CLOSE_BRACE", "STRING", "NUMBER", "BOOLEAN", "IDENTIFIER", "WS", 
			"COMMENT", "BLOCK_COMMENT"
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
		public TerminalNode EOF() { return getToken(AngularParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(146);
				statement();
				}
				}
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686190175191046L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 63259655L) != 0) );
			setState(151);
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
	public static class ImportStatementStContext extends StatementContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public ImportStatementStContext(StatementContext ctx) { copyFrom(ctx); }
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
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallStContext extends StatementContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallStContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionCallSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionCallSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionCallSt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IterationStatementStContext extends StatementContext {
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public IterationStatementStContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIterationStatementSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIterationStatementSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIterationStatementSt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorStContext extends StatementContext {
		public DecoratorContext decorator() {
			return getRuleContext(DecoratorContext.class,0);
		}
		public DecoratorStContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDecoratorSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDecoratorSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDecoratorSt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementStContext extends StatementContext {
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public PrintStatementStContext(StatementContext ctx) { copyFrom(ctx); }
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
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclartionStContext extends StatementContext {
		public FunctionDeclartionContext functionDeclartion() {
			return getRuleContext(FunctionDeclartionContext.class,0);
		}
		public FunctionDeclartionStContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionDeclartionSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionDeclartionSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionDeclartionSt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchStatementStContext extends StatementContext {
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public SwitchStatementStContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSwitchStatementSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSwitchStatementSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSwitchStatementSt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessStContext extends StatementContext {
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public ArrayAccessStContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayAccessSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayAccessSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayAccessSt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementStContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfStatementStContext(StatementContext ctx) { copyFrom(ctx); }
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
	@SuppressWarnings("CheckReturnValue")
	public static class VariableStatementStContext extends StatementContext {
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public VariableStatementStContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableStatementSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableStatementSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableStatementSt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(AngularParser.SEMI_COLON, 0); }
		public ExpressionStContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpressionSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpressionSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpressionSt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExportStatementStContext extends StatementContext {
		public ExportStatementContext exportStatement() {
			return getRuleContext(ExportStatementContext.class,0);
		}
		public ExportStatementStContext(StatementContext ctx) { copyFrom(ctx); }
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
	@SuppressWarnings("CheckReturnValue")
	public static class BlockStContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBlockSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBlockSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBlockSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new BlockStContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				block();
				}
				break;
			case 2:
				_localctx = new DecoratorStContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				decorator();
				}
				break;
			case 3:
				_localctx = new PrintStatementStContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				printStatement();
				}
				break;
			case 4:
				_localctx = new ArrayAccessStContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				arrayAccess();
				}
				break;
			case 5:
				_localctx = new VariableStatementStContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(157);
				variableStatement();
				}
				break;
			case 6:
				_localctx = new ImportStatementStContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(158);
				importStatement();
				}
				break;
			case 7:
				_localctx = new ExportStatementStContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(159);
				exportStatement();
				}
				break;
			case 8:
				_localctx = new IfStatementStContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(160);
				ifStatement();
				}
				break;
			case 9:
				_localctx = new IterationStatementStContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(161);
				iterationStatement();
				}
				break;
			case 10:
				_localctx = new SwitchStatementStContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(162);
				switchStatement();
				}
				break;
			case 11:
				_localctx = new FunctionDeclartionStContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(163);
				functionDeclartion();
				}
				break;
			case 12:
				_localctx = new FunctionCallStContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(164);
				functionCall();
				}
				break;
			case 13:
				_localctx = new ExpressionStContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(165);
				expression(0);
				setState(167);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(166);
					match(SEMI_COLON);
					}
					break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(AngularParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngularParser.CLOSE_BRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode SEMI_COLON() { return getToken(AngularParser.SEMI_COLON, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(OPEN_BRACE);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686190175191046L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 63259655L) != 0)) {
				{
				{
				setState(172);
				statement();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			match(CLOSE_BRACE);
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(179);
				match(SEMI_COLON);
				}
				break;
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
	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode CONSOLE() { return getToken(AngularParser.CONSOLE, 0); }
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode LOG() { return getToken(AngularParser.LOG, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(AngularParser.SEMI_COLON, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_printStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(CONSOLE);
			setState(183);
			match(DOT);
			setState(184);
			match(LOG);
			setState(185);
			match(OPEN_PAREN);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686172509569024L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 63259655L) != 0)) {
				{
				setState(186);
				expression(0);
				}
			}

			setState(189);
			match(CLOSE_PAREN);
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(190);
				match(SEMI_COLON);
				}
				break;
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
	public static class ArrayAccessContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(AngularParser.OPEN_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(AngularParser.CLOSE_BRACKET, 0); }
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(IDENTIFIER);
			setState(194);
			match(OPEN_BRACKET);
			setState(195);
			expression(0);
			setState(196);
			match(CLOSE_BRACKET);
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
		public TerminalNode IMPORT() { return getToken(AngularParser.IMPORT, 0); }
		public ImportDeclarationContext importDeclaration() {
			return getRuleContext(ImportDeclarationContext.class,0);
		}
		public TerminalNode FROM() { return getToken(AngularParser.FROM, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode SEMI_COLON() { return getToken(AngularParser.SEMI_COLON, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(IMPORT);
			setState(199);
			importDeclaration();
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(200);
				match(FROM);
				setState(201);
				match(STRING);
				}
			}

			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(204);
				match(SEMI_COLON);
				}
				break;
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
	public static class ImportDeclarationContext extends ParserRuleContext {
		public ImportDefaultSpecifierContext importDefaultSpecifier() {
			return getRuleContext(ImportDefaultSpecifierContext.class,0);
		}
		public ImportNamespaceSpecifierContext importNamespaceSpecifier() {
			return getRuleContext(ImportNamespaceSpecifierContext.class,0);
		}
		public ImportNamedSpecifierContext importNamedSpecifier() {
			return getRuleContext(ImportNamedSpecifierContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_importDeclaration);
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				importDefaultSpecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				importNamespaceSpecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				importNamedSpecifier();
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
	public static class ImportDefaultSpecifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public ImportDefaultSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDefaultSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportDefaultSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportDefaultSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportDefaultSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDefaultSpecifierContext importDefaultSpecifier() throws RecognitionException {
		ImportDefaultSpecifierContext _localctx = new ImportDefaultSpecifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_importDefaultSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==IDENTIFIER) ) {
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
	public static class ImportNamespaceSpecifierContext extends ParserRuleContext {
		public TerminalNode MULTIPLY() { return getToken(AngularParser.MULTIPLY, 0); }
		public TerminalNode AS() { return getToken(AngularParser.AS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public ImportNamespaceSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importNamespaceSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportNamespaceSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportNamespaceSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportNamespaceSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportNamespaceSpecifierContext importNamespaceSpecifier() throws RecognitionException {
		ImportNamespaceSpecifierContext _localctx = new ImportNamespaceSpecifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_importNamespaceSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(MULTIPLY);
			setState(215);
			match(AS);
			setState(216);
			match(IDENTIFIER);
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
	public static class ImportNamedSpecifierContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(AngularParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngularParser.CLOSE_BRACE, 0); }
		public List<ImportSpecifierContext> importSpecifier() {
			return getRuleContexts(ImportSpecifierContext.class);
		}
		public ImportSpecifierContext importSpecifier(int i) {
			return getRuleContext(ImportSpecifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ImportNamedSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importNamedSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportNamedSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportNamedSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportNamedSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportNamedSpecifierContext importNamedSpecifier() throws RecognitionException {
		ImportNamedSpecifierContext _localctx = new ImportNamedSpecifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_importNamedSpecifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 4611686018427388927L) != 0)) {
				{
				{
				setState(218);
				importSpecifier();
				setState(219);
				match(COMMA);
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(226);
			match(OPEN_BRACE);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 4611686018427388927L) != 0)) {
				{
				setState(227);
				importSpecifier();
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(228);
						match(COMMA);
						setState(229);
						importSpecifier();
						}
						} 
					}
					setState(234);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(235);
					match(COMMA);
					}
				}

				}
			}

			setState(240);
			match(CLOSE_BRACE);
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
	public static class ImportSpecifierContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public AngularDecoratorNameContext angularDecoratorName() {
			return getRuleContext(AngularDecoratorNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(AngularParser.AS, 0); }
		public ImportSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportSpecifierContext importSpecifier() throws RecognitionException {
		ImportSpecifierContext _localctx = new ImportSpecifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_importSpecifier);
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				angularDecoratorName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				match(IDENTIFIER);
				setState(245);
				match(AS);
				setState(246);
				match(IDENTIFIER);
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
	public static class ExportStatementContext extends ParserRuleContext {
		public ExportDefaultDeclarationContext exportDefaultDeclaration() {
			return getRuleContext(ExportDefaultDeclarationContext.class,0);
		}
		public ExportDeclarationContext exportDeclaration() {
			return getRuleContext(ExportDeclarationContext.class,0);
		}
		public ExportListDeclarationContext exportListDeclaration() {
			return getRuleContext(ExportListDeclarationContext.class,0);
		}
		public ExportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportStatementContext exportStatement() throws RecognitionException {
		ExportStatementContext _localctx = new ExportStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exportStatement);
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				exportDefaultDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				exportDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				exportListDeclaration();
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
	public static class ExportDefaultDeclarationContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public TerminalNode DEFAULT_CASE() { return getToken(AngularParser.DEFAULT_CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(AngularParser.SEMI_COLON, 0); }
		public ExportDefaultDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportDefaultDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExportDefaultDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExportDefaultDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExportDefaultDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportDefaultDeclarationContext exportDefaultDeclaration() throws RecognitionException {
		ExportDefaultDeclarationContext _localctx = new ExportDefaultDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exportDefaultDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(EXPORT);
			setState(255);
			match(DEFAULT_CASE);
			setState(256);
			expression(0);
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(257);
				match(SEMI_COLON);
				}
				break;
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
	public static class ExportDeclarationContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public FunctionDeclartionContext functionDeclartion() {
			return getRuleContext(FunctionDeclartionContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(AngularParser.SEMI_COLON, 0); }
		public ExportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportDeclarationContext exportDeclaration() throws RecognitionException {
		ExportDeclarationContext _localctx = new ExportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(EXPORT);
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(261);
				variableStatement();
				}
				break;
			case 2:
				{
				setState(262);
				classDeclaration();
				}
				break;
			case 3:
				{
				setState(263);
				functionDeclartion();
				}
				break;
			}
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(266);
				match(SEMI_COLON);
				}
				break;
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
	public static class ExportListDeclarationContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngularParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngularParser.CLOSE_BRACE, 0); }
		public TerminalNode CLASS() { return getToken(AngularParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public List<ExportSpecifierContext> exportSpecifier() {
			return getRuleContexts(ExportSpecifierContext.class);
		}
		public ExportSpecifierContext exportSpecifier(int i) {
			return getRuleContext(ExportSpecifierContext.class,i);
		}
		public TerminalNode FROM() { return getToken(AngularParser.FROM, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode SEMI_COLON() { return getToken(AngularParser.SEMI_COLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ExportListDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportListDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExportListDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExportListDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExportListDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportListDeclarationContext exportListDeclaration() throws RecognitionException {
		ExportListDeclarationContext _localctx = new ExportListDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exportListDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(EXPORT);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLASS) {
				{
				setState(270);
				match(CLASS);
				setState(271);
				match(IDENTIFIER);
				}
			}

			setState(274);
			match(OPEN_BRACE);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 4611686018435777535L) != 0)) {
				{
				setState(275);
				exportSpecifier();
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(276);
						match(COMMA);
						setState(277);
						exportSpecifier();
						}
						} 
					}
					setState(282);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(283);
					match(COMMA);
					}
				}

				}
			}

			setState(288);
			match(CLOSE_BRACE);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(289);
				match(FROM);
				setState(290);
				match(STRING);
				}
			}

			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(293);
				match(SEMI_COLON);
				}
				break;
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
	public static class ExportSpecifierContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode AS() { return getToken(AngularParser.AS, 0); }
		public AngularDecoratorNameContext angularDecoratorName() {
			return getRuleContext(AngularDecoratorNameContext.class,0);
		}
		public TerminalNode AT() { return getToken(AngularParser.AT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(AngularParser.SEMI_COLON, 0); }
		public ExportSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExportSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExportSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExportSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportSpecifierContext exportSpecifier() throws RecognitionException {
		ExportSpecifierContext _localctx = new ExportSpecifierContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exportSpecifier);
		int _la;
		try {
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(IDENTIFIER);
				setState(298);
				match(AS);
				setState(299);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(300);
					match(AT);
					}
				}

				setState(303);
				angularDecoratorName();
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAREN) {
					{
					setState(304);
					match(OPEN_PAREN);
					setState(305);
					match(CLOSE_PAREN);
					setState(306);
					match(IDENTIFIER);
					setState(307);
					match(COLON);
					setState(308);
					type();
					setState(309);
					match(SEMI_COLON);
					}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(AngularParser.CLASS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode OPEN_BRACE() { return getToken(AngularParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngularParser.CLOSE_BRACE, 0); }
		public DecoratorContext decorator() {
			return getRuleContext(DecoratorContext.class,0);
		}
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public TerminalNode DEFAULT_CASE() { return getToken(AngularParser.DEFAULT_CASE, 0); }
		public TerminalNode EXTENDS() { return getToken(AngularParser.EXTENDS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(AngularParser.IMPLEMENTS, 0); }
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(315);
				decorator();
				}
			}

			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(318);
				match(EXPORT);
				}
			}

			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT_CASE) {
				{
				setState(321);
				match(DEFAULT_CASE);
				}
			}

			setState(324);
			match(CLASS);
			setState(325);
			match(IDENTIFIER);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(326);
				match(EXTENDS);
				setState(327);
				expression(0);
				}
			}

			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(330);
				match(IMPLEMENTS);
				setState(331);
				match(IDENTIFIER);
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(332);
					match(COMMA);
					setState(333);
					match(IDENTIFIER);
					}
					}
					setState(338);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(341);
			match(OPEN_BRACE);
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686022185500672L) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 2065L) != 0)) {
				{
				{
				setState(342);
				classMember();
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(348);
			match(CLOSE_BRACE);
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
	public static class ClassMemberContext extends ParserRuleContext {
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
	 
		public ClassMemberContext() { }
		public void copyFrom(ClassMemberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecoratedMethodContext extends ClassMemberContext {
		public ClassMethodDeclarationContext classMethodDeclaration() {
			return getRuleContext(ClassMethodDeclarationContext.class,0);
		}
		public List<DecoratorContext> decorator() {
			return getRuleContexts(DecoratorContext.class);
		}
		public DecoratorContext decorator(int i) {
			return getRuleContext(DecoratorContext.class,i);
		}
		public DecoratedMethodContext(ClassMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDecoratedMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDecoratedMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDecoratedMethod(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorMemberContext extends ClassMemberContext {
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public ConstructorMemberContext(ClassMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConstructorMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConstructorMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConstructorMember(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecoratedPropertyContext extends ClassMemberContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public List<DecoratorContext> decorator() {
			return getRuleContexts(DecoratorContext.class);
		}
		public DecoratorContext decorator(int i) {
			return getRuleContext(DecoratorContext.class,i);
		}
		public TerminalNode SEMI_COLON() { return getToken(AngularParser.SEMI_COLON, 0); }
		public DecoratedPropertyContext(ClassMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDecoratedProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDecoratedProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDecoratedProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classMember);
		int _la;
		try {
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				_localctx = new DecoratedPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(350);
					decorator();
					}
					}
					setState(355);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(356);
				variableDeclaration();
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI_COLON) {
					{
					setState(357);
					match(SEMI_COLON);
					}
				}

				}
				break;
			case 2:
				_localctx = new DecoratedMethodContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(360);
					decorator();
					}
					}
					setState(365);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(366);
				classMethodDeclaration();
				}
				break;
			case 3:
				_localctx = new ConstructorMemberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
				constructorDeclaration();
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
	public static class ClassMethodDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ClassMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMethodDeclarationContext classMethodDeclaration() throws RecognitionException {
		ClassMethodDeclarationContext _localctx = new ClassMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_classMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3758096384L) != 0)) {
				{
				setState(370);
				accessModifier();
				}
			}

			setState(373);
			match(IDENTIFIER);
			setState(374);
			match(OPEN_PAREN);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3758096384L) != 0) || _la==IDENTIFIER) {
				{
				setState(375);
				parameterList();
				}
			}

			setState(378);
			match(CLOSE_PAREN);
			setState(379);
			block();
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
		public TerminalNode CONSTRUCTOR() { return getToken(AngularParser.CONSTRUCTOR, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(CONSTRUCTOR);
			setState(382);
			match(OPEN_PAREN);
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3758096384L) != 0) || _la==IDENTIFIER) {
				{
				setState(383);
				parameterList();
				}
			}

			setState(386);
			match(CLOSE_PAREN);
			setState(387);
			block();
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
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			parameter();
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(390);
				match(COMMA);
				setState(391);
				parameter();
				}
				}
				setState(396);
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
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public TerminalNode ASSING() { return getToken(AngularParser.ASSING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3758096384L) != 0)) {
				{
				setState(397);
				accessModifier();
				}
			}

			setState(400);
			match(IDENTIFIER);
			setState(401);
			match(COLON);
			setState(402);
			typeAnnotation();
			setState(405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(403);
				match(ASSING);
				setState(404);
				expression(0);
				}
				break;
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
	public static class AccessModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(AngularParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(AngularParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(AngularParser.PROTECTED, 0); }
		public AccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAccessModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAccessModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAccessModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3758096384L) != 0)) ) {
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
	public static class VariableStatementContext extends ParserRuleContext {
		public VariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStatement; }
	 
		public VariableStatementContext() { }
		public void copyFrom(VariableStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationVrContext extends VariableStatementContext {
		public VarHelpersContext varHelpers() {
			return getRuleContext(VarHelpersContext.class,0);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public TerminalNode SEMI_COLON() { return getToken(AngularParser.SEMI_COLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public VariableDeclarationVrContext(VariableStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableDeclarationVr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableDeclarationVr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableDeclarationVr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationConstVrContext extends VariableStatementContext {
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }
		public List<VariableDeclarationConstContext> variableDeclarationConst() {
			return getRuleContexts(VariableDeclarationConstContext.class);
		}
		public VariableDeclarationConstContext variableDeclarationConst(int i) {
			return getRuleContext(VariableDeclarationConstContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public TerminalNode SEMI_COLON() { return getToken(AngularParser.SEMI_COLON, 0); }
		public VariableDeclarationConstVrContext(VariableStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableDeclarationConstVr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableDeclarationConstVr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableDeclarationConstVr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variableStatement);
		int _la;
		try {
			setState(432);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case LET:
				_localctx = new VariableDeclarationVrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				varHelpers();
				setState(410);
				variableDeclaration();
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(411);
					match(COMMA);
					setState(412);
					variableDeclaration();
					}
					}
					setState(417);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(418);
				match(SEMI_COLON);
				}
				break;
			case CONST:
				_localctx = new VariableDeclarationConstVrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				match(CONST);
				setState(421);
				variableDeclarationConst();
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(422);
					match(COMMA);
					setState(423);
					variableDeclarationConst();
					}
					}
					setState(428);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(430);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(429);
					match(SEMI_COLON);
					}
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationConstContext extends ParserRuleContext {
		public VariableDeclarationConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationConst; }
	 
		public VariableDeclarationConstContext() { }
		public void copyFrom(VariableDeclarationConstContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableTypedAndAssignedConstContext extends VariableDeclarationConstContext {
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode ASSING() { return getToken(AngularParser.ASSING, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public VariableTypedAndAssignedConstContext(VariableDeclarationConstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableTypedAndAssignedConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableTypedAndAssignedConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableTypedAndAssignedConst(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableAssignedConstOnlyContext extends VariableDeclarationConstContext {
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TerminalNode ASSING() { return getToken(AngularParser.ASSING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableAssignedConstOnlyContext(VariableDeclarationConstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableAssignedConstOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableAssignedConstOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableAssignedConstOnly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationConstContext variableDeclarationConst() throws RecognitionException {
		VariableDeclarationConstContext _localctx = new VariableDeclarationConstContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_variableDeclarationConst);
		int _la;
		try {
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				_localctx = new VariableTypedAndAssignedConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				variableType();
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(435);
					match(COLON);
					}
				}

				setState(438);
				typeAnnotation();
				setState(439);
				match(ASSING);
				setState(440);
				value();
				}
				break;
			case 2:
				_localctx = new VariableAssignedConstOnlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				variableType();
				setState(443);
				match(ASSING);
				setState(444);
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
	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	 
		public VariableDeclarationContext() { }
		public void copyFrom(VariableDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableTypedAndMaybeAssignedContext extends VariableDeclarationContext {
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode ASSING() { return getToken(AngularParser.ASSING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableTypedAndMaybeAssignedContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableTypedAndMaybeAssigned(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableTypedAndMaybeAssigned(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableTypedAndMaybeAssigned(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableUntypedContext extends VariableDeclarationContext {
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TerminalNode ASSING() { return getToken(AngularParser.ASSING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableUntypedContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableUntyped(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableUntyped(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableUntyped(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_variableDeclaration);
		int _la;
		try {
			setState(462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				_localctx = new VariableTypedAndMaybeAssignedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				variableType();
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(449);
					match(COLON);
					}
				}

				setState(452);
				typeAnnotation();
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSING) {
					{
					setState(453);
					match(ASSING);
					setState(454);
					expression(0);
					}
				}

				}
				break;
			case 2:
				_localctx = new VariableUntypedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
				variableType();
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSING) {
					{
					setState(458);
					match(ASSING);
					setState(459);
					expression(0);
					}
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableTypeContext extends ParserRuleContext {
		public VariableTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableType; }
	 
		public VariableTypeContext() { }
		public void copyFrom(VariableTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayDeclarationVtContext extends VariableTypeContext {
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public ArrayDeclarationVtContext(VariableTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayDeclarationVt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayDeclarationVt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayDeclarationVt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierVtContext extends VariableTypeContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public IdentifierVtContext(VariableTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdentifierVt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdentifierVt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdentifierVt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectDeclarationVtContext extends VariableTypeContext {
		public ObjectDeclarationContext objectDeclaration() {
			return getRuleContext(ObjectDeclarationContext.class,0);
		}
		public ObjectDeclarationVtContext(VariableTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectDeclarationVt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectDeclarationVt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectDeclarationVt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableTypeContext variableType() throws RecognitionException {
		VariableTypeContext _localctx = new VariableTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_variableType);
		try {
			setState(467);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new IdentifierVtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				match(IDENTIFIER);
				}
				break;
			case OPEN_BRACKET:
				_localctx = new ArrayDeclarationVtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				arrayDeclaration();
				}
				break;
			case OPEN_BRACE:
				_localctx = new ObjectDeclarationVtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(466);
				objectDeclaration();
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
	public static class TypeAnnotationContext extends ParserRuleContext {
		public TypeAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAnnotation; }
	 
		public TypeAnnotationContext() { }
		public void copyFrom(TypeAnnotationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeWithArrayContext extends TypeAnnotationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArraySuffixContext arraySuffix() {
			return getRuleContext(ArraySuffixContext.class,0);
		}
		public TypeWithArrayContext(TypeAnnotationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTypeWithArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTypeWithArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTypeWithArray(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeWithObjectContext extends TypeAnnotationContext {
		public List<TerminalNode> OPEN_BRACE() { return getTokens(AngularParser.OPEN_BRACE); }
		public TerminalNode OPEN_BRACE(int i) {
			return getToken(AngularParser.OPEN_BRACE, i);
		}
		public List<TerminalNode> CLOSE_BRACE() { return getTokens(AngularParser.CLOSE_BRACE); }
		public TerminalNode CLOSE_BRACE(int i) {
			return getToken(AngularParser.CLOSE_BRACE, i);
		}
		public TerminalNode ASSING() { return getToken(AngularParser.ASSING, 0); }
		public TerminalNode SEMI_COLON() { return getToken(AngularParser.SEMI_COLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
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
		public TypeWithObjectContext(TypeAnnotationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTypeWithObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTypeWithObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTypeWithObject(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InlineObjectArrayContext extends TypeAnnotationContext {
		public InlineObjectTypeContext inlineObjectType() {
			return getRuleContext(InlineObjectTypeContext.class,0);
		}
		public ArraySuffixContext arraySuffix() {
			return getRuleContext(ArraySuffixContext.class,0);
		}
		public InlineObjectArrayContext(TypeAnnotationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInlineObjectArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInlineObjectArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInlineObjectArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAnnotationContext typeAnnotation() throws RecognitionException {
		TypeAnnotationContext _localctx = new TypeAnnotationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_typeAnnotation);
		int _la;
		try {
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				_localctx = new TypeWithArrayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				type();
				setState(471);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(470);
					arraySuffix();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new TypeWithObjectContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				match(OPEN_BRACE);
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(474);
					match(IDENTIFIER);
					setState(475);
					match(COLON);
					setState(476);
					type();
					setState(478);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(477);
						match(COMMA);
						}
					}

					}
					}
					setState(484);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(485);
				match(CLOSE_BRACE);
				setState(486);
				match(ASSING);
				setState(487);
				match(OPEN_BRACE);
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(488);
					match(IDENTIFIER);
					setState(489);
					match(COLON);
					setState(490);
					value();
					setState(492);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(491);
						match(COMMA);
						}
					}

					}
					}
					setState(498);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(499);
				match(CLOSE_BRACE);
				setState(500);
				match(SEMI_COLON);
				}
				break;
			case 3:
				_localctx = new InlineObjectArrayContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(501);
				inlineObjectType();
				setState(503);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(502);
					arraySuffix();
					}
					break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class InlineObjectTypeContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(AngularParser.OPEN_BRACE, 0); }
		public List<TypeMemberContext> typeMember() {
			return getRuleContexts(TypeMemberContext.class);
		}
		public TypeMemberContext typeMember(int i) {
			return getRuleContext(TypeMemberContext.class,i);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(AngularParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public TerminalNode OR1() { return getToken(AngularParser.OR1, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public InlineObjectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineObjectType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInlineObjectType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInlineObjectType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInlineObjectType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineObjectTypeContext inlineObjectType() throws RecognitionException {
		InlineObjectTypeContext _localctx = new InlineObjectTypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_inlineObjectType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(OPEN_BRACE);
			setState(508);
			typeMember();
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(509);
				match(COMMA);
				setState(510);
				typeMember();
				}
				}
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(516);
			match(CLOSE_BRACE);
			setState(519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(517);
				match(OR1);
				setState(518);
				value();
				}
				break;
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
	public static class TypeMemberContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTypeMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTypeMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTypeMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeMemberContext typeMember() throws RecognitionException {
		TypeMemberContext _localctx = new TypeMemberContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_typeMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(IDENTIFIER);
			setState(522);
			match(COLON);
			setState(523);
			type();
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
	public static class ArraySuffixContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(AngularParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(AngularParser.CLOSE_BRACKET, 0); }
		public ArraySuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraySuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArraySuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArraySuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArraySuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraySuffixContext arraySuffix() throws RecognitionException {
		ArraySuffixContext _localctx = new ArraySuffixContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_arraySuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(OPEN_BRACKET);
			setState(526);
			match(CLOSE_BRACKET);
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
	public static class ObjectDeclarationContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(AngularParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngularParser.CLOSE_BRACE, 0); }
		public List<ObjectPropertyContext> objectProperty() {
			return getRuleContexts(ObjectPropertyContext.class);
		}
		public ObjectPropertyContext objectProperty(int i) {
			return getRuleContext(ObjectPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ObjectDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectDeclarationContext objectDeclaration() throws RecognitionException {
		ObjectDeclarationContext _localctx = new ObjectDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_objectDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(OPEN_BRACE);
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686172509569024L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 63259655L) != 0)) {
				{
				setState(529);
				objectProperty();
				setState(534);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(530);
						match(COMMA);
						setState(531);
						objectProperty();
						}
						} 
					}
					setState(536);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(537);
					match(COMMA);
					}
				}

				}
			}

			setState(542);
			match(CLOSE_BRACE);
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
	public static class ObjectPropertyContext extends ParserRuleContext {
		public ObjectPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectProperty; }
	 
		public ObjectPropertyContext() { }
		public void copyFrom(ObjectPropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NamedObjectPropertyContext extends ObjectPropertyContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedObjectPropertyContext(ObjectPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNamedObjectProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNamedObjectProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNamedObjectProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShorthandOrDynamicPropertyContext extends ObjectPropertyContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ShorthandOrDynamicPropertyContext(ObjectPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterShorthandOrDynamicProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitShorthandOrDynamicProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitShorthandOrDynamicProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPropertyContext objectProperty() throws RecognitionException {
		ObjectPropertyContext _localctx = new ObjectPropertyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_objectProperty);
		try {
			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				_localctx = new NamedObjectPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				match(IDENTIFIER);
				setState(545);
				match(COLON);
				setState(546);
				expression(0);
				}
				break;
			case 2:
				_localctx = new ShorthandOrDynamicPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
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
	public static class ArrayDeclarationContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(AngularParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(AngularParser.CLOSE_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_arrayDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(OPEN_BRACKET);
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(551);
				match(COMMA);
				}
				}
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686172509569024L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 63259655L) != 0)) {
				{
				setState(557);
				expression(0);
				setState(562);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(558);
						match(COMMA);
						setState(559);
						expression(0);
						}
						} 
					}
					setState(564);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(565);
					match(COMMA);
					}
				}

				}
			}

			setState(570);
			match(CLOSE_BRACKET);
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
	public static class ParenthesizedExpressionContext extends ExpressionContext {
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public ParenthesizedExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(AngularParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(AngularParser.MINUS, 0); }
		public AdditiveExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(AngularParser.GREATER_THAN, 0); }
		public TerminalNode LESS_THAN_EQUALS() { return getToken(AngularParser.LESS_THAN_EQUALS, 0); }
		public TerminalNode GREATER_THAN_EQUALS() { return getToken(AngularParser.GREATER_THAN_EQUALS, 0); }
		public RelationalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TernaryExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode QUESTION_MARK() { return getToken(AngularParser.QUESTION_MARK, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TernaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTernaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTernaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostIncrementExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PLUS_PLUS() { return getToken(AngularParser.PLUS_PLUS, 0); }
		public PostIncrementExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPostIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPostIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(AngularParser.AND, 0); }
		public LogicalAndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PreIncrementExpressionContext extends ExpressionContext {
		public TerminalNode PLUS_PLUS() { return getToken(AngularParser.PLUS_PLUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPreIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPreIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPreIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOrExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(AngularParser.OR, 0); }
		public LogicalOrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberDotExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode QUESTION_MARK() { return getToken(AngularParser.QUESTION_MARK, 0); }
		public TerminalNode HASH_TAG() { return getToken(AngularParser.HASH_TAG, 0); }
		public MemberDotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMemberDotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMemberDotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMemberDotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExpressionContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(AngularParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PreDecreaseExpressionContext extends ExpressionContext {
		public TerminalNode MINUS_MINUS() { return getToken(AngularParser.MINUS_MINUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PreDecreaseExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPreDecreaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPreDecreaseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPreDecreaseExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakExpressionContext extends ExpressionContext {
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public BreakExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBreakExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBreakExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBreakExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallExpressionContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlBodyExpressionContext extends ExpressionContext {
		public HtmlBodyContext htmlBody() {
			return getRuleContext(HtmlBodyContext.class,0);
		}
		public HtmlBodyExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlBodyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlBodyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlBodyExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnExpressionContext extends ExpressionContext {
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public ReturnExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReturnExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReturnExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReturnExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionExpressionContext extends ExpressionContext {
		public FunctionDeclartionContext functionDeclartion() {
			return getRuleContext(FunctionDeclartionContext.class,0);
		}
		public FunctionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostDecreaseExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MINUS_MINUS() { return getToken(AngularParser.MINUS_MINUS, 0); }
		public PostDecreaseExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPostDecreaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPostDecreaseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPostDecreaseExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueExpressionContext extends ExpressionContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitValueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitValueExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayExpressionContext extends ExpressionContext {
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public ArrayExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParameterAsExpressionContext extends ExpressionContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public ParameterAsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameterAsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameterAsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameterAsExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(AngularParser.NOT_EQUALS, 0); }
		public TerminalNode IDENTITY_EQUALS() { return getToken(AngularParser.IDENTITY_EQUALS, 0); }
		public TerminalNode IDENTITY_NOT_EQUALS() { return getToken(AngularParser.IDENTITY_NOT_EQUALS, 0); }
		public TerminalNode ASSING() { return getToken(AngularParser.ASSING, 0); }
		public EqualityExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessExpressionContext extends ExpressionContext {
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public ArrayAccessExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectExpressionContext extends ExpressionContext {
		public ObjectDeclarationContext objectDeclaration() {
			return getRuleContext(ObjectDeclarationContext.class,0);
		}
		public ObjectExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(AngularParser.MULTIPLY, 0); }
		public TerminalNode DIV() { return getToken(AngularParser.DIV, 0); }
		public TerminalNode MODULUS() { return getToken(AngularParser.MODULUS, 0); }
		public MultiplicativeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
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
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				_localctx = new FunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(573);
				functionDeclartion();
				}
				break;
			case 2:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(574);
				functionCall();
				}
				break;
			case 3:
				{
				_localctx = new ArrayAccessExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(575);
				arrayAccess();
				}
				break;
			case 4:
				{
				_localctx = new PreIncrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(576);
				match(PLUS_PLUS);
				setState(577);
				expression(18);
				}
				break;
			case 5:
				{
				_localctx = new PreDecreaseExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(578);
				match(MINUS_MINUS);
				setState(579);
				expression(17);
				}
				break;
			case 6:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(580);
				match(NOT);
				setState(581);
				expression(16);
				}
				break;
			case 7:
				{
				_localctx = new ValueExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(582);
				value();
				}
				break;
			case 8:
				{
				_localctx = new ArrayExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(583);
				arrayDeclaration();
				}
				break;
			case 9:
				{
				_localctx = new ObjectExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(584);
				objectDeclaration();
				}
				break;
			case 10:
				{
				_localctx = new HtmlBodyExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(585);
				htmlBody();
				}
				break;
			case 11:
				{
				_localctx = new ReturnExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(586);
				return_();
				}
				break;
			case 12:
				{
				_localctx = new BreakExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(587);
				breakStatement();
				}
				break;
			case 13:
				{
				_localctx = new ParameterAsExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(588);
				parameter();
				}
				break;
			case 14:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(589);
				match(OPEN_PAREN);
				setState(590);
				expression(0);
				setState(591);
				match(CLOSE_PAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(634);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(632);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
					case 1:
						{
						_localctx = new MemberDotExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(595);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(597);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==QUESTION_MARK) {
							{
							setState(596);
							match(QUESTION_MARK);
							}
						}

						setState(599);
						match(DOT);
						setState(601);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==HASH_TAG) {
							{
							setState(600);
							match(HASH_TAG);
							}
						}

						setState(603);
						expression(22);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(604);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(605);
						_la = _input.LA(1);
						if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 7L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(606);
						expression(16);
						}
						break;
					case 3:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(607);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(608);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(609);
						expression(15);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(610);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(611);
						_la = _input.LA(1);
						if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 15L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(612);
						expression(14);
						}
						break;
					case 5:
						{
						_localctx = new EqualityExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(613);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(614);
						_la = _input.LA(1);
						if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 61441L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(615);
						expression(13);
						}
						break;
					case 6:
						{
						_localctx = new LogicalAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(616);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(617);
						match(AND);
						setState(618);
						expression(12);
						}
						break;
					case 7:
						{
						_localctx = new LogicalOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(619);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(620);
						match(OR);
						setState(621);
						expression(11);
						}
						break;
					case 8:
						{
						_localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(622);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(623);
						match(QUESTION_MARK);
						setState(624);
						expression(0);
						setState(625);
						match(COLON);
						setState(626);
						expression(10);
						}
						break;
					case 9:
						{
						_localctx = new PostIncrementExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(628);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(629);
						match(PLUS_PLUS);
						}
						break;
					case 10:
						{
						_localctx = new PostDecreaseExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(630);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(631);
						match(MINUS_MINUS);
						}
						break;
					}
					} 
				}
				setState(636);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
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
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(AngularParser.IF, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ElseIfStatementContext> elseIfStatement() {
			return getRuleContexts(ElseIfStatementContext.class);
		}
		public ElseIfStatementContext elseIfStatement(int i) {
			return getRuleContext(ElseIfStatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(AngularParser.SEMI_COLON, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(IF);
			setState(638);
			match(OPEN_PAREN);
			setState(639);
			expression(0);
			setState(640);
			match(CLOSE_PAREN);
			setState(641);
			statement();
			setState(645);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(642);
					elseIfStatement();
					}
					} 
				}
				setState(647);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			setState(649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(648);
				elseStatement();
				}
				break;
			}
			setState(652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(651);
				match(SEMI_COLON);
				}
				break;
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
	public static class ElseIfStatementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(AngularParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(AngularParser.IF, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterElseIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitElseIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitElseIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatementContext elseIfStatement() throws RecognitionException {
		ElseIfStatementContext _localctx = new ElseIfStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			match(ELSE);
			setState(655);
			match(IF);
			setState(656);
			match(OPEN_PAREN);
			setState(657);
			expression(0);
			setState(658);
			match(CLOSE_PAREN);
			setState(659);
			statement();
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
	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(AngularParser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(ELSE);
			setState(662);
			statement();
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
	public static class IterationStatementContext extends ParserRuleContext {
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
	 
		public IterationStatementContext() { }
		public void copyFrom(IterationStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoStatementContext extends IterationStatementContext {
		public TerminalNode DO() { return getToken(AngularParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(AngularParser.WHILE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode SEMI_COLON() { return getToken(AngularParser.SEMI_COLON, 0); }
		public DoStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDoStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends IterationStatementContext {
		public TerminalNode WHILE() { return getToken(AngularParser.WHILE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends IterationStatementContext {
		public TerminalNode FOR() { return getToken(AngularParser.FOR, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(AngularParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(AngularParser.SEMI_COLON, i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public ForStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForInStatementContext extends IterationStatementContext {
		public TerminalNode FOR() { return getToken(AngularParser.FOR, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode IN() { return getToken(AngularParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public ForInStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForInStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForInStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_iterationStatement);
		int _la;
		try {
			setState(706);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				_localctx = new DoStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				match(DO);
				setState(665);
				statement();
				setState(666);
				match(WHILE);
				setState(667);
				match(OPEN_PAREN);
				setState(668);
				expression(0);
				setState(669);
				match(CLOSE_PAREN);
				setState(671);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(670);
					match(SEMI_COLON);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(673);
				match(WHILE);
				setState(674);
				match(OPEN_PAREN);
				setState(675);
				expression(0);
				setState(676);
				match(CLOSE_PAREN);
				setState(677);
				statement();
				}
				break;
			case 3:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(679);
				match(FOR);
				setState(680);
				match(OPEN_PAREN);
				setState(683);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNCTION:
				case RETURN:
				case BREAK:
				case PUBLIC:
				case PRIVATE:
				case PROTECTED:
				case NULL:
				case UNDEFINED:
				case ASYNC:
				case AT:
				case PLUS_PLUS:
				case MINUS_MINUS:
				case LESS_THAN:
				case NOT:
				case OPEN_BRACE:
				case OPEN_PAREN:
				case OPEN_BRACKET:
				case STRING:
				case NUMBER:
				case BOOLEAN:
				case IDENTIFIER:
					{
					setState(681);
					expression(0);
					}
					break;
				case VAR:
				case LET:
				case CONST:
					{
					setState(682);
					variableStatement();
					}
					break;
				case SEMI_COLON:
					break;
				default:
					break;
				}
				setState(685);
				match(SEMI_COLON);
				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686172509569024L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 63259655L) != 0)) {
					{
					setState(686);
					expression(0);
					}
				}

				setState(689);
				match(SEMI_COLON);
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686172509569024L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 63259655L) != 0)) {
					{
					setState(690);
					expression(0);
					}
				}

				setState(693);
				match(CLOSE_PAREN);
				setState(694);
				statement();
				}
				break;
			case 4:
				_localctx = new ForInStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(695);
				match(FOR);
				setState(696);
				match(OPEN_PAREN);
				setState(699);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNCTION:
				case RETURN:
				case BREAK:
				case PUBLIC:
				case PRIVATE:
				case PROTECTED:
				case NULL:
				case UNDEFINED:
				case ASYNC:
				case AT:
				case PLUS_PLUS:
				case MINUS_MINUS:
				case LESS_THAN:
				case NOT:
				case OPEN_BRACE:
				case OPEN_PAREN:
				case OPEN_BRACKET:
				case STRING:
				case NUMBER:
				case BOOLEAN:
				case IDENTIFIER:
					{
					setState(697);
					expression(0);
					}
					break;
				case VAR:
				case LET:
				case CONST:
					{
					setState(698);
					variableStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(701);
				match(IN);
				setState(702);
				expression(0);
				setState(703);
				match(CLOSE_PAREN);
				setState(704);
				statement();
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
	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(AngularParser.SWITCH, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngularParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngularParser.CLOSE_BRACE, 0); }
		public List<CaseClauseContext> caseClause() {
			return getRuleContexts(CaseClauseContext.class);
		}
		public CaseClauseContext caseClause(int i) {
			return getRuleContext(CaseClauseContext.class,i);
		}
		public DefaultClauseContext defaultClause() {
			return getRuleContext(DefaultClauseContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(AngularParser.SEMI_COLON, 0); }
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			match(SWITCH);
			setState(709);
			match(OPEN_PAREN);
			setState(710);
			expression(0);
			setState(711);
			match(CLOSE_PAREN);
			setState(712);
			match(OPEN_BRACE);
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(713);
				caseClause();
				}
				}
				setState(718);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT_CASE) {
				{
				setState(719);
				defaultClause();
				}
			}

			setState(722);
			match(CLOSE_BRACE);
			setState(724);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(723);
				match(SEMI_COLON);
				}
				break;
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
	public static class CaseClauseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(AngularParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCaseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCaseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseClauseContext caseClause() throws RecognitionException {
		CaseClauseContext _localctx = new CaseClauseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_caseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			match(CASE);
			setState(727);
			expression(0);
			setState(728);
			match(COLON);
			setState(732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686190175191046L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 63259655L) != 0)) {
				{
				{
				setState(729);
				statement();
				}
				}
				setState(734);
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
	public static class DefaultClauseContext extends ParserRuleContext {
		public TerminalNode DEFAULT_CASE() { return getToken(AngularParser.DEFAULT_CASE, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DefaultClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDefaultClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDefaultClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDefaultClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultClauseContext defaultClause() throws RecognitionException {
		DefaultClauseContext _localctx = new DefaultClauseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_defaultClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(DEFAULT_CASE);
			setState(736);
			match(COLON);
			setState(740);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686190175191046L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 63259655L) != 0)) {
				{
				{
				setState(737);
				statement();
				}
				}
				setState(742);
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
	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(AngularParser.BREAK, 0); }
		public TerminalNode SEMI_COLON() { return getToken(AngularParser.SEMI_COLON, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			match(BREAK);
			setState(745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(744);
				match(SEMI_COLON);
				}
				break;
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
	public static class ReturnContext extends ParserRuleContext {
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
	 
		public ReturnContext() { }
		public void copyFrom(ReturnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnExpressionOnlyContext extends ReturnContext {
		public TerminalNode RETURN() { return getToken(AngularParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(AngularParser.SEMI_COLON, 0); }
		public ReturnExpressionOnlyContext(ReturnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReturnExpressionOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReturnExpressionOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReturnExpressionOnly(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnObjectLiteralContext extends ReturnContext {
		public TerminalNode RETURN() { return getToken(AngularParser.RETURN, 0); }
		public ObjectDeclarationContext objectDeclaration() {
			return getRuleContext(ObjectDeclarationContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(AngularParser.SEMI_COLON, 0); }
		public ReturnObjectLiteralContext(ReturnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReturnObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReturnObjectLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReturnObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnFunctionCallContext extends ReturnContext {
		public TerminalNode RETURN() { return getToken(AngularParser.RETURN, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(AngularParser.SEMI_COLON, 0); }
		public ReturnFunctionCallContext(ReturnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReturnFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReturnFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReturnFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnArrayLiteralContext extends ReturnContext {
		public TerminalNode RETURN() { return getToken(AngularParser.RETURN, 0); }
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(AngularParser.SEMI_COLON, 0); }
		public ReturnArrayLiteralContext(ReturnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReturnArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReturnArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReturnArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_return);
		try {
			setState(767);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				_localctx = new ReturnExpressionOnlyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(747);
				match(RETURN);
				setState(748);
				expression(0);
				setState(750);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(749);
					match(SEMI_COLON);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new ReturnObjectLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(752);
				match(RETURN);
				setState(753);
				objectDeclaration();
				setState(755);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(754);
					match(SEMI_COLON);
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new ReturnArrayLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(757);
				match(RETURN);
				setState(758);
				arrayDeclaration();
				setState(760);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(759);
					match(SEMI_COLON);
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new ReturnFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(762);
				match(RETURN);
				setState(763);
				functionCall();
				setState(765);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(764);
					match(SEMI_COLON);
					}
					break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI_COLON() { return getToken(AngularParser.SEMI_COLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			match(IDENTIFIER);
			setState(770);
			match(OPEN_PAREN);
			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686172509569024L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 63259655L) != 0)) {
				{
				setState(771);
				expression(0);
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(772);
					match(COMMA);
					setState(773);
					expression(0);
					}
					}
					setState(778);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(781);
			match(CLOSE_PAREN);
			setState(783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(782);
				match(SEMI_COLON);
				}
				break;
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
	public static class FunctionDeclartionContext extends ParserRuleContext {
		public FunctionDeclartionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclartion; }
	 
		public FunctionDeclartionContext() { }
		public void copyFrom(FunctionDeclartionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class New_type_functionContext extends FunctionDeclartionContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DecoratorContext decorator() {
			return getRuleContext(DecoratorContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(AngularParser.FUNCTION, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public New_type_functionContext(FunctionDeclartionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNew_type_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNew_type_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNew_type_function(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Normal_FunctionContext extends FunctionDeclartionContext {
		public NormalFunctionContext normalFunction() {
			return getRuleContext(NormalFunctionContext.class,0);
		}
		public Normal_FunctionContext(FunctionDeclartionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNormal_Function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNormal_Function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNormal_Function(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Anoymous_FunctionContext extends FunctionDeclartionContext {
		public AnoymousFunctionContext anoymousFunction() {
			return getRuleContext(AnoymousFunctionContext.class,0);
		}
		public Anoymous_FunctionContext(FunctionDeclartionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAnoymous_Function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAnoymous_Function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAnoymous_Function(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Arrow_FunctionContext extends FunctionDeclartionContext {
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public Arrow_FunctionContext(FunctionDeclartionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrow_Function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrow_Function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrow_Function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclartionContext functionDeclartion() throws RecognitionException {
		FunctionDeclartionContext _localctx = new FunctionDeclartionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_functionDeclartion);
		int _la;
		try {
			setState(807);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				_localctx = new Normal_FunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(785);
				normalFunction();
				}
				break;
			case 2:
				_localctx = new Anoymous_FunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(786);
				anoymousFunction();
				}
				break;
			case 3:
				_localctx = new Arrow_FunctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(787);
				arrowFunction();
				}
				break;
			case 4:
				_localctx = new New_type_functionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(789);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(788);
					decorator();
					}
				}

				setState(792);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3758096384L) != 0)) {
					{
					setState(791);
					accessModifier();
					}
				}

				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FUNCTION) {
					{
					setState(794);
					match(FUNCTION);
					}
				}

				setState(797);
				match(IDENTIFIER);
				setState(798);
				match(OPEN_PAREN);
				setState(802);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686172509569024L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 63259655L) != 0)) {
					{
					{
					setState(799);
					expression(0);
					}
					}
					setState(804);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(805);
				match(CLOSE_PAREN);
				setState(806);
				block();
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
	public static class NormalFunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(AngularParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASYNC() { return getToken(AngularParser.ASYNC, 0); }
		public TerminalNode MULTIPLY() { return getToken(AngularParser.MULTIPLY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public NormalFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNormalFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNormalFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNormalFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalFunctionContext normalFunction() throws RecognitionException {
		NormalFunctionContext _localctx = new NormalFunctionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_normalFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(809);
				match(ASYNC);
				}
			}

			setState(812);
			match(FUNCTION);
			setState(814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULTIPLY) {
				{
				setState(813);
				match(MULTIPLY);
				}
			}

			setState(816);
			match(IDENTIFIER);
			setState(817);
			match(OPEN_PAREN);
			setState(824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686172509569024L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 63259655L) != 0)) {
				{
				{
				setState(818);
				expression(0);
				setState(820);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(819);
					match(COMMA);
					}
				}

				}
				}
				setState(826);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(827);
			match(CLOSE_PAREN);
			setState(830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(828);
				match(COLON);
				setState(829);
				type();
				}
			}

			setState(832);
			block();
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
	public static class AnoymousFunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(AngularParser.FUNCTION, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASYNC() { return getToken(AngularParser.ASYNC, 0); }
		public TerminalNode MULTIPLY() { return getToken(AngularParser.MULTIPLY, 0); }
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
		public AnoymousFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anoymousFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAnoymousFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAnoymousFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAnoymousFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnoymousFunctionContext anoymousFunction() throws RecognitionException {
		AnoymousFunctionContext _localctx = new AnoymousFunctionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_anoymousFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(834);
				match(ASYNC);
				}
			}

			setState(837);
			match(FUNCTION);
			setState(839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULTIPLY) {
				{
				setState(838);
				match(MULTIPLY);
				}
			}

			setState(841);
			match(OPEN_PAREN);
			setState(848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686172509569024L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 63259655L) != 0)) {
				{
				{
				setState(842);
				expression(0);
				setState(844);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(843);
					match(COMMA);
					}
				}

				}
				}
				setState(850);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(851);
			match(CLOSE_PAREN);
			setState(852);
			block();
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
	public static class ArrowFunctionContext extends ParserRuleContext {
		public ArrowParametersContext arrowParameters() {
			return getRuleContext(ArrowParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(AngularParser.ARROW, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrowFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrowFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionContext arrowFunction() throws RecognitionException {
		ArrowFunctionContext _localctx = new ArrowFunctionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_arrowFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			arrowParameters();
			setState(855);
			match(ARROW);
			setState(858);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(856);
				block();
				}
				break;
			case 2:
				{
				setState(857);
				expression(0);
				}
				break;
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
	public static class ArrowParametersContext extends ParserRuleContext {
		public ArrowParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowParameters; }
	 
		public ArrowParametersContext() { }
		public void copyFrom(ArrowParametersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueArrowContext extends ArrowParametersContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueArrowContext(ArrowParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterValueArrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitValueArrow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitValueArrow(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionArrowContext extends ArrowParametersContext {
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
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
		public ExpressionArrowContext(ArrowParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpressionArrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpressionArrow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpressionArrow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowParametersContext arrowParameters() throws RecognitionException {
		ArrowParametersContext _localctx = new ArrowParametersContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_arrowParameters);
		int _la;
		try {
			setState(872);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
			case UNDEFINED:
			case STRING:
			case NUMBER:
			case BOOLEAN:
			case IDENTIFIER:
				_localctx = new ValueArrowContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(860);
				value();
				}
				break;
			case OPEN_PAREN:
				_localctx = new ExpressionArrowContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(861);
				match(OPEN_PAREN);
				setState(868);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686172509569024L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 63259655L) != 0)) {
					{
					{
					setState(862);
					expression(0);
					setState(864);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(863);
						match(COMMA);
						}
					}

					}
					}
					setState(870);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(871);
				match(CLOSE_PAREN);
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
	public static class DecoratorContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(AngularParser.AT, 0); }
		public AngularDecoratorNameContext angularDecoratorName() {
			return getRuleContext(AngularDecoratorNameContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public DecoratorArgumentsContext decoratorArguments() {
			return getRuleContext(DecoratorArgumentsContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public DecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorContext decorator() throws RecognitionException {
		DecoratorContext _localctx = new DecoratorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_decorator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			match(AT);
			setState(875);
			angularDecoratorName();
			setState(876);
			match(OPEN_PAREN);
			setState(877);
			decoratorArguments();
			setState(878);
			match(CLOSE_PAREN);
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
		public TerminalNode OPEN_BRACE() { return getToken(AngularParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngularParser.CLOSE_BRACE, 0); }
		public List<DecoratorArgumentContext> decoratorArgument() {
			return getRuleContexts(DecoratorArgumentContext.class);
		}
		public DecoratorArgumentContext decoratorArgument(int i) {
			return getRuleContext(DecoratorArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public DecoratorArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoratorArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDecoratorArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDecoratorArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDecoratorArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorArgumentsContext decoratorArguments() throws RecognitionException {
		DecoratorArgumentsContext _localctx = new DecoratorArgumentsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_decoratorArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			match(OPEN_BRACE);
			setState(885); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(881);
				decoratorArgument();
				setState(883);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(882);
					match(COMMA);
					}
				}

				}
				}
				setState(887); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 448L) != 0) );
			setState(889);
			match(CLOSE_BRACE);
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
	public static class DecoratorArgumentContext extends ParserRuleContext {
		public DecoratorArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoratorArgument; }
	 
		public DecoratorArgumentContext() { }
		public void copyFrom(DecoratorArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Template_UrlArgumentContext extends DecoratorArgumentContext {
		public TerminalNode TEMPLATE_URL() { return getToken(AngularParser.TEMPLATE_URL, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public Template_UrlArgumentContext(DecoratorArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplate_UrlArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplate_UrlArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplate_UrlArgument(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectorArgumentContext extends DecoratorArgumentContext {
		public TerminalNode SELECTOR() { return getToken(AngularParser.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public SelectorArgumentContext(DecoratorArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelectorArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelectorArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelectorArgument(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateArgumentContext extends DecoratorArgumentContext {
		public TerminalNode TEMPLATE() { return getToken(AngularParser.TEMPLATE, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public List<TerminalNode> BACTICK() { return getTokens(AngularParser.BACTICK); }
		public TerminalNode BACTICK(int i) {
			return getToken(AngularParser.BACTICK, i);
		}
		public HtmlBodyContext htmlBody() {
			return getRuleContext(HtmlBodyContext.class,0);
		}
		public TemplateArgumentContext(DecoratorArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplateArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplateArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplateArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorArgumentContext decoratorArgument() throws RecognitionException {
		DecoratorArgumentContext _localctx = new DecoratorArgumentContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_decoratorArgument);
		try {
			setState(903);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				_localctx = new SelectorArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(891);
				match(SELECTOR);
				setState(892);
				match(COLON);
				setState(893);
				match(STRING);
				}
				break;
			case TEMPLATE_URL:
				_localctx = new Template_UrlArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(894);
				match(TEMPLATE_URL);
				setState(895);
				match(COLON);
				setState(896);
				match(STRING);
				}
				break;
			case TEMPLATE:
				_localctx = new TemplateArgumentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(897);
				match(TEMPLATE);
				setState(898);
				match(COLON);
				setState(899);
				match(BACTICK);
				setState(900);
				htmlBody();
				setState(901);
				match(BACTICK);
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
	public static class HtmlBodyContext extends ParserRuleContext {
		public HtmlBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlBody; }
	 
		public HtmlBodyContext() { }
		public void copyFrom(HtmlBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlBodyDivAlone_LContext extends HtmlBodyContext {
		public HtmlBodyDivAloneContext htmlBodyDivAlone() {
			return getRuleContext(HtmlBodyDivAloneContext.class,0);
		}
		public HtmlBodyDivAlone_LContext(HtmlBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlBodyDivAlone_L(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlBodyDivAlone_L(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlBodyDivAlone_L(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlBodyWithDiv_LContext extends HtmlBodyContext {
		public HtmlBodyWithDivContext htmlBodyWithDiv() {
			return getRuleContext(HtmlBodyWithDivContext.class,0);
		}
		public HtmlBodyWithDiv_LContext(HtmlBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlBodyWithDiv_L(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlBodyWithDiv_L(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlBodyWithDiv_L(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlBodyNestedDiv_LContext extends HtmlBodyContext {
		public HtmlBodyNestedDivContext htmlBodyNestedDiv() {
			return getRuleContext(HtmlBodyNestedDivContext.class,0);
		}
		public HtmlBodyNestedDiv_LContext(HtmlBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlBodyNestedDiv_L(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlBodyNestedDiv_L(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlBodyNestedDiv_L(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlBodyNoDiv_LContext extends HtmlBodyContext {
		public HtmlBodyNoDivContext htmlBodyNoDiv() {
			return getRuleContext(HtmlBodyNoDivContext.class,0);
		}
		public HtmlBodyNoDiv_LContext(HtmlBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlBodyNoDiv_L(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlBodyNoDiv_L(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlBodyNoDiv_L(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlBodyContext htmlBody() throws RecognitionException {
		HtmlBodyContext _localctx = new HtmlBodyContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_htmlBody);
		try {
			setState(909);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				_localctx = new HtmlBodyWithDiv_LContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(905);
				htmlBodyWithDiv();
				}
				break;
			case 2:
				_localctx = new HtmlBodyNestedDiv_LContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(906);
				htmlBodyNestedDiv();
				}
				break;
			case 3:
				_localctx = new HtmlBodyDivAlone_LContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(907);
				htmlBodyDivAlone();
				}
				break;
			case 4:
				_localctx = new HtmlBodyNoDiv_LContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(908);
				htmlBodyNoDiv();
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
	public static class HtmlBodyWithDivContext extends ParserRuleContext {
		public List<TerminalNode> LESS_THAN() { return getTokens(AngularParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(AngularParser.LESS_THAN, i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(AngularParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(AngularParser.GREATER_THAN, i);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TerminalNode DIV() { return getToken(AngularParser.DIV, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<HtmlAttributesContext> htmlAttributes() {
			return getRuleContexts(HtmlAttributesContext.class);
		}
		public HtmlAttributesContext htmlAttributes(int i) {
			return getRuleContext(HtmlAttributesContext.class,i);
		}
		public HtmlBodyWithDivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlBodyWithDiv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlBodyWithDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlBodyWithDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlBodyWithDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlBodyWithDivContext htmlBodyWithDiv() throws RecognitionException {
		HtmlBodyWithDivContext _localctx = new HtmlBodyWithDivContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_htmlBodyWithDiv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			match(LESS_THAN);
			setState(919);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(912);
				match(IDENTIFIER);
				setState(916);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CLASS || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 271056897L) != 0)) {
					{
					{
					setState(913);
					htmlAttributes();
					}
					}
					setState(918);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(921);
			match(GREATER_THAN);
			setState(922);
			htmlContent();
			setState(923);
			match(LESS_THAN);
			setState(924);
			match(DIV);
			setState(926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(925);
				match(IDENTIFIER);
				}
			}

			setState(928);
			match(GREATER_THAN);
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
	public static class HtmlBodyNestedDivContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TerminalNode DIV() { return getToken(AngularParser.DIV, 0); }
		public TerminalNode GREATER_THAN() { return getToken(AngularParser.GREATER_THAN, 0); }
		public List<HtmlAttributesContext> htmlAttributes() {
			return getRuleContexts(HtmlAttributesContext.class);
		}
		public HtmlAttributesContext htmlAttributes(int i) {
			return getRuleContext(HtmlAttributesContext.class,i);
		}
		public HtmlBodyNestedDivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlBodyNestedDiv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlBodyNestedDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlBodyNestedDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlBodyNestedDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlBodyNestedDivContext htmlBodyNestedDiv() throws RecognitionException {
		HtmlBodyNestedDivContext _localctx = new HtmlBodyNestedDivContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_htmlBodyNestedDiv);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			match(LESS_THAN);
			setState(931);
			match(IDENTIFIER);
			setState(935);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(932);
					htmlAttributes();
					}
					} 
				}
				setState(937);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			}
			setState(938);
			htmlContent();
			setState(939);
			match(DIV);
			setState(940);
			match(GREATER_THAN);
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
	public static class HtmlBodyDivAloneContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode DIV() { return getToken(AngularParser.DIV, 0); }
		public TerminalNode GREATER_THAN() { return getToken(AngularParser.GREATER_THAN, 0); }
		public List<HtmlAttributesContext> htmlAttributes() {
			return getRuleContexts(HtmlAttributesContext.class);
		}
		public HtmlAttributesContext htmlAttributes(int i) {
			return getRuleContext(HtmlAttributesContext.class,i);
		}
		public HtmlBodyDivAloneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlBodyDivAlone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlBodyDivAlone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlBodyDivAlone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlBodyDivAlone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlBodyDivAloneContext htmlBodyDivAlone() throws RecognitionException {
		HtmlBodyDivAloneContext _localctx = new HtmlBodyDivAloneContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_htmlBodyDivAlone);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
			match(LESS_THAN);
			setState(943);
			match(IDENTIFIER);
			setState(947);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 271056897L) != 0)) {
				{
				{
				setState(944);
				htmlAttributes();
				}
				}
				setState(949);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(950);
			match(DIV);
			setState(951);
			match(GREATER_THAN);
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
	public static class HtmlBodyNoDivContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode GREATER_THAN() { return getToken(AngularParser.GREATER_THAN, 0); }
		public List<HtmlAttributesContext> htmlAttributes() {
			return getRuleContexts(HtmlAttributesContext.class);
		}
		public HtmlAttributesContext htmlAttributes(int i) {
			return getRuleContext(HtmlAttributesContext.class,i);
		}
		public HtmlBodyNoDivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlBodyNoDiv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlBodyNoDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlBodyNoDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlBodyNoDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlBodyNoDivContext htmlBodyNoDiv() throws RecognitionException {
		HtmlBodyNoDivContext _localctx = new HtmlBodyNoDivContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_htmlBodyNoDiv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953);
			match(LESS_THAN);
			setState(954);
			match(IDENTIFIER);
			setState(958);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 271056897L) != 0)) {
				{
				{
				setState(955);
				htmlAttributes();
				}
				}
				setState(960);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(961);
			match(GREATER_THAN);
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
	public static class HtmlContentContext extends ParserRuleContext {
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
	 
		public HtmlContentContext() { }
		public void copyFrom(HtmlContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentsContext extends HtmlContentContext {
		public List<HtmlTextContext> htmlText() {
			return getRuleContexts(HtmlTextContext.class);
		}
		public HtmlTextContext htmlText(int i) {
			return getRuleContext(HtmlTextContext.class,i);
		}
		public List<HtmlBodyContext> htmlBody() {
			return getRuleContexts(HtmlBodyContext.class);
		}
		public HtmlBodyContext htmlBody(int i) {
			return getRuleContext(HtmlBodyContext.class,i);
		}
		public List<HtmlExpressionContext> htmlExpression() {
			return getRuleContexts(HtmlExpressionContext.class);
		}
		public HtmlExpressionContext htmlExpression(int i) {
			return getRuleContext(HtmlExpressionContext.class,i);
		}
		public HtmlContentsContext(HtmlContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlContents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlContents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlContents(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContent_ElementContext extends HtmlContentContext {
		public HtmlBodyContext htmlBody() {
			return getRuleContext(HtmlBodyContext.class,0);
		}
		public HtmlContent_ElementContext(HtmlContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlContent_Element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlContent_Element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlContent_Element(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContent_IDContext extends HtmlContentContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public HtmlContent_IDContext(HtmlContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlContent_ID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlContent_ID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlContent_ID(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContent_InterpolationContext extends HtmlContentContext {
		public InterpolationContext interpolation() {
			return getRuleContext(InterpolationContext.class,0);
		}
		public HtmlContent_InterpolationContext(HtmlContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlContent_Interpolation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlContent_Interpolation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlContent_Interpolation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_htmlContent);
		try {
			int _alt;
			setState(981);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				_localctx = new HtmlContent_ElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(963);
				htmlBody();
				}
				break;
			case 2:
				_localctx = new HtmlContent_InterpolationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(964);
				interpolation();
				}
				break;
			case 3:
				_localctx = new HtmlContent_IDContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(965);
				match(IDENTIFIER);
				}
				break;
			case 4:
				_localctx = new HtmlContentsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(967);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(966);
					htmlText();
					}
					break;
				}
				setState(978);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(971);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LESS_THAN:
							{
							setState(969);
							htmlBody();
							}
							break;
						case OPEN_BRACE:
							{
							setState(970);
							htmlExpression();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(974);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
						case 1:
							{
							setState(973);
							htmlText();
							}
							break;
						}
						}
						} 
					}
					setState(980);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlExpressionContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(AngularParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngularParser.CLOSE_BRACE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public HtmlExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlExpressionContext htmlExpression() throws RecognitionException {
		HtmlExpressionContext _localctx = new HtmlExpressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_htmlExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
			match(OPEN_BRACE);
			setState(987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686172509569024L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 63259655L) != 0)) {
				{
				{
				setState(984);
				expression(0);
				}
				}
				setState(989);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(990);
			match(CLOSE_BRACE);
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
	public static class HtmlTextContext extends ParserRuleContext {
		public List<TerminalNode> LESS_THAN() { return getTokens(AngularParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(AngularParser.LESS_THAN, i);
		}
		public List<TerminalNode> OPEN_BRACE() { return getTokens(AngularParser.OPEN_BRACE); }
		public TerminalNode OPEN_BRACE(int i) {
			return getToken(AngularParser.OPEN_BRACE, i);
		}
		public HtmlTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTextContext htmlText() throws RecognitionException {
		HtmlTextContext _localctx = new HtmlTextContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_htmlText);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(993); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(992);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==LESS_THAN || _la==OPEN_BRACE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(995); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public TerminalNode DOUBLE_OPEN_BRACE() { return getToken(AngularParser.DOUBLE_OPEN_BRACE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOUBLE_CLOSE_BRACE() { return getToken(AngularParser.DOUBLE_CLOSE_BRACE, 0); }
		public InterpolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterpolation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterpolation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterpolation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolationContext interpolation() throws RecognitionException {
		InterpolationContext _localctx = new InterpolationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_interpolation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			match(DOUBLE_OPEN_BRACE);
			setState(998);
			expression(0);
			setState(999);
			match(DOUBLE_CLOSE_BRACE);
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
	public static class HtmlAttributesContext extends ParserRuleContext {
		public List<AngularDirectiveContext> angularDirective() {
			return getRuleContexts(AngularDirectiveContext.class);
		}
		public AngularDirectiveContext angularDirective(int i) {
			return getRuleContext(AngularDirectiveContext.class,i);
		}
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public List<HtmlEventContext> htmlEvent() {
			return getRuleContexts(HtmlEventContext.class);
		}
		public HtmlEventContext htmlEvent(int i) {
			return getRuleContext(HtmlEventContext.class,i);
		}
		public List<HtmlBindingContext> htmlBinding() {
			return getRuleContexts(HtmlBindingContext.class);
		}
		public HtmlBindingContext htmlBinding(int i) {
			return getRuleContext(HtmlBindingContext.class,i);
		}
		public List<HtmlClassContext> htmlClass() {
			return getRuleContexts(HtmlClassContext.class);
		}
		public HtmlClassContext htmlClass(int i) {
			return getRuleContext(HtmlClassContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(AngularParser.COMMA, 0); }
		public HtmlAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributesContext htmlAttributes() throws RecognitionException {
		HtmlAttributesContext _localctx = new HtmlAttributesContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_htmlAttributes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1006); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1006);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MULTIPLY:
						{
						setState(1001);
						angularDirective();
						}
						break;
					case IDENTIFIER:
						{
						setState(1002);
						htmlAttribute();
						}
						break;
					case OPEN_PAREN:
						{
						setState(1003);
						htmlEvent();
						}
						break;
					case OPEN_BRACKET:
						{
						setState(1004);
						htmlBinding();
						}
						break;
					case CLASS:
						{
						setState(1005);
						htmlClass();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1008); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1011);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1010);
				match(COMMA);
				}
				break;
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
	public static class AngularDirectiveContext extends ParserRuleContext {
		public TerminalNode MULTIPLY() { return getToken(AngularParser.MULTIPLY, 0); }
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public TerminalNode ASSING() { return getToken(AngularParser.ASSING, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public AngularDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angularDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAngularDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAngularDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAngularDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngularDirectiveContext angularDirective() throws RecognitionException {
		AngularDirectiveContext _localctx = new AngularDirectiveContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_angularDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013);
			match(MULTIPLY);
			setState(1014);
			directive();
			setState(1015);
			match(ASSING);
			setState(1016);
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
		public TerminalNode NG_FOR() { return getToken(AngularParser.NG_FOR, 0); }
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
		public TerminalNode NG_STYLE() { return getToken(AngularParser.NG_STYLE, 0); }
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
		public TerminalNode NG_SWITCH() { return getToken(AngularParser.NG_SWITCH, 0); }
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
		public TerminalNode NG_CLASS() { return getToken(AngularParser.NG_CLASS, 0); }
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
		public TerminalNode NG_IF() { return getToken(AngularParser.NG_IF, 0); }
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
		enterRule(_localctx, 128, RULE_directive);
		try {
			setState(1023);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NG_IF:
				_localctx = new Directive_NgIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1018);
				match(NG_IF);
				}
				break;
			case NG_SWITCH:
				_localctx = new Directive_NgSwitchContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1019);
				match(NG_SWITCH);
				}
				break;
			case NG_FOR:
				_localctx = new Directive_NgForContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1020);
				match(NG_FOR);
				}
				break;
			case NG_STYLE:
				_localctx = new Directive_NgStyleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1021);
				match(NG_STYLE);
				}
				break;
			case NG_CLASS:
				_localctx = new Directive_NgClassContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1022);
				match(NG_CLASS);
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
	public static class HtmlAttributeContext extends ParserRuleContext {
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
	 
		public HtmlAttributeContext() { }
		public void copyFrom(HtmlAttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAtteibute_IdentifierContext extends HtmlAttributeContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public HtmlAtteibute_IdentifierContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlAtteibute_Identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlAtteibute_Identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlAtteibute_Identifier(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAtteibute_StringContext extends HtmlAttributeContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode ASSING() { return getToken(AngularParser.ASSING, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public HtmlAtteibute_StringContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlAtteibute_String(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlAtteibute_String(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlAtteibute_String(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAtteibute_ObjectContext extends HtmlAttributeContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode ASSING() { return getToken(AngularParser.ASSING, 0); }
		public ObjectDeclarationContext objectDeclaration() {
			return getRuleContext(ObjectDeclarationContext.class,0);
		}
		public HtmlAtteibute_ObjectContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlAtteibute_Object(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlAtteibute_Object(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlAtteibute_Object(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_htmlAttribute);
		try {
			setState(1032);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				_localctx = new HtmlAtteibute_ObjectContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1025);
				match(IDENTIFIER);
				setState(1026);
				match(ASSING);
				setState(1027);
				objectDeclaration();
				}
				break;
			case 2:
				_localctx = new HtmlAtteibute_StringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1028);
				match(IDENTIFIER);
				setState(1029);
				match(ASSING);
				setState(1030);
				match(STRING);
				}
				break;
			case 3:
				_localctx = new HtmlAtteibute_IdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1031);
				match(IDENTIFIER);
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
	public static class HtmlEventContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode ASSING() { return getToken(AngularParser.ASSING, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public HtmlEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlEvent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlEventContext htmlEvent() throws RecognitionException {
		HtmlEventContext _localctx = new HtmlEventContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_htmlEvent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1034);
			match(OPEN_PAREN);
			setState(1035);
			match(IDENTIFIER);
			setState(1036);
			match(CLOSE_PAREN);
			setState(1037);
			match(ASSING);
			setState(1038);
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
	public static class HtmlBindingContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(AngularParser.OPEN_BRACKET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(AngularParser.CLOSE_BRACKET, 0); }
		public TerminalNode ASSING() { return getToken(AngularParser.ASSING, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public InterpolationContext interpolation() {
			return getRuleContext(InterpolationContext.class,0);
		}
		public HtmlBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlBindingContext htmlBinding() throws RecognitionException {
		HtmlBindingContext _localctx = new HtmlBindingContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_htmlBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
			match(OPEN_BRACKET);
			setState(1041);
			match(IDENTIFIER);
			setState(1042);
			match(CLOSE_BRACKET);
			setState(1043);
			match(ASSING);
			setState(1046);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(1044);
				match(STRING);
				}
				break;
			case DOUBLE_OPEN_BRACE:
				{
				setState(1045);
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
	public static class HtmlClassContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(AngularParser.CLASS, 0); }
		public TerminalNode ASSING() { return getToken(AngularParser.ASSING, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public HtmlClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlClassContext htmlClass() throws RecognitionException {
		HtmlClassContext _localctx = new HtmlClassContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_htmlClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			match(CLASS);
			setState(1049);
			match(ASSING);
			setState(1050);
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
	public static class AngularDecoratorNameContext extends ParserRuleContext {
		public TerminalNode COMPONENT() { return getToken(AngularParser.COMPONENT, 0); }
		public TerminalNode DIRECTIVE() { return getToken(AngularParser.DIRECTIVE, 0); }
		public TerminalNode PIPE() { return getToken(AngularParser.PIPE, 0); }
		public TerminalNode INJECTABLE() { return getToken(AngularParser.INJECTABLE, 0); }
		public TerminalNode INPUT() { return getToken(AngularParser.INPUT, 0); }
		public TerminalNode OUTPUT() { return getToken(AngularParser.OUTPUT, 0); }
		public TerminalNode HOST_LISTENER() { return getToken(AngularParser.HOST_LISTENER, 0); }
		public TerminalNode NG_MODULE() { return getToken(AngularParser.NG_MODULE, 0); }
		public TerminalNode VIEW_CHILD() { return getToken(AngularParser.VIEW_CHILD, 0); }
		public TerminalNode ON_INIT() { return getToken(AngularParser.ON_INIT, 0); }
		public AngularDecoratorNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angularDecoratorName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAngularDecoratorName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAngularDecoratorName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAngularDecoratorName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngularDecoratorNameContext angularDecoratorName() throws RecognitionException {
		AngularDecoratorNameContext _localctx = new AngularDecoratorNameContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_angularDecoratorName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 562400197607424L) != 0)) ) {
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
	public static class VarHelpersContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(AngularParser.VAR, 0); }
		public TerminalNode LET() { return getToken(AngularParser.LET, 0); }
		public VarHelpersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varHelpers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVarHelpers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVarHelpers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVarHelpers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarHelpersContext varHelpers() throws RecognitionException {
		VarHelpersContext _localctx = new VarHelpersContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_varHelpers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==LET) ) {
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
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(AngularParser.BOOLEAN, 0); }
		public TerminalNode NULL() { return getToken(AngularParser.NULL, 0); }
		public TerminalNode UNDEFINED() { return getToken(AngularParser.UNDEFINED, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			_la = _input.LA(1);
			if ( !(_la==NULL || _la==UNDEFINED || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 15L) != 0)) ) {
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode STRING_TYPE() { return getToken(AngularParser.STRING_TYPE, 0); }
		public TerminalNode NUMBER_TYPE() { return getToken(AngularParser.NUMBER_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(AngularParser.BOOLEAN_TYPE, 0); }
		public TerminalNode ANY_TYPE() { return getToken(AngularParser.ANY_TYPE, 0); }
		public TerminalNode VOID_TYPE() { return getToken(AngularParser.VOID_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4467570830351532032L) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 34:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 21);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 20);
		case 9:
			return precpred(_ctx, 19);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001h\u0425\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0001\u0000\u0004\u0000\u0094\b\u0000"+
		"\u000b\u0000\f\u0000\u0095\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u00a8\b\u0001\u0003\u0001\u00aa\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0005\u0002\u00ae\b\u0002\n\u0002\f\u0002\u00b1\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u00b5\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u00bc\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u00c0\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u00cb\b\u0005\u0001\u0005\u0003\u0005\u00ce\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u00d3\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t\u00de\b\t\n"+
		"\t\f\t\u00e1\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00e7\b\t\n\t"+
		"\f\t\u00ea\t\t\u0001\t\u0003\t\u00ed\b\t\u0003\t\u00ef\b\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00f8\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u00fd\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u0103\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0109"+
		"\b\r\u0001\r\u0003\r\u010c\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u0111\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u0117\b\u000e\n\u000e\f\u000e\u011a\t\u000e\u0001\u000e\u0003\u000e"+
		"\u011d\b\u000e\u0003\u000e\u011f\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u0124\b\u000e\u0001\u000e\u0003\u000e\u0127\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u012e\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0138\b\u000f\u0003\u000f"+
		"\u013a\b\u000f\u0001\u0010\u0003\u0010\u013d\b\u0010\u0001\u0010\u0003"+
		"\u0010\u0140\b\u0010\u0001\u0010\u0003\u0010\u0143\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0149\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u014f\b\u0010\n\u0010"+
		"\f\u0010\u0152\t\u0010\u0003\u0010\u0154\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u0158\b\u0010\n\u0010\f\u0010\u015b\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0005\u0011\u0160\b\u0011\n\u0011\f\u0011\u0163\t\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u0167\b\u0011\u0001\u0011\u0005\u0011"+
		"\u016a\b\u0011\n\u0011\f\u0011\u016d\t\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u0171\b\u0011\u0001\u0012\u0003\u0012\u0174\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u0179\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0181\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0005\u0014\u0189\b\u0014\n\u0014\f\u0014\u018c\t\u0014\u0001\u0015\u0003"+
		"\u0015\u018f\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u0196\b\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u019e\b\u0017\n\u0017\f\u0017"+
		"\u01a1\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u01a9\b\u0017\n\u0017\f\u0017\u01ac\t\u0017\u0001"+
		"\u0017\u0003\u0017\u01af\b\u0017\u0003\u0017\u01b1\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u01b5\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u01bf\b\u0018\u0001\u0019\u0001\u0019\u0003\u0019\u01c3\b\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01c8\b\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u01cd\b\u0019\u0003\u0019\u01cf\b\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01d4\b\u001a\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u01d8\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u01df\b\u001b\u0005\u001b\u01e1\b"+
		"\u001b\n\u001b\f\u001b\u01e4\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01ed\b\u001b"+
		"\u0005\u001b\u01ef\b\u001b\n\u001b\f\u001b\u01f2\t\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01f8\b\u001b\u0003\u001b\u01fa"+
		"\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0200"+
		"\b\u001c\n\u001c\f\u001c\u0203\t\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u0208\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0005\u001f\u0215\b\u001f\n\u001f\f\u001f\u0218\t\u001f\u0001"+
		"\u001f\u0003\u001f\u021b\b\u001f\u0003\u001f\u021d\b\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0003 \u0225\b \u0001!\u0001"+
		"!\u0005!\u0229\b!\n!\f!\u022c\t!\u0001!\u0001!\u0001!\u0005!\u0231\b!"+
		"\n!\f!\u0234\t!\u0001!\u0003!\u0237\b!\u0003!\u0239\b!\u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0003\"\u0252\b\"\u0001\"\u0001\"\u0003\"\u0256\b\""+
		"\u0001\"\u0001\"\u0003\"\u025a\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u0279\b\"\n"+
		"\"\f\"\u027c\t\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0005#\u0284"+
		"\b#\n#\f#\u0287\t#\u0001#\u0003#\u028a\b#\u0001#\u0003#\u028d\b#\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u02a0\b&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u02ac"+
		"\b&\u0001&\u0001&\u0003&\u02b0\b&\u0001&\u0001&\u0003&\u02b4\b&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u02bc\b&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0003&\u02c3\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0005\'\u02cb\b\'\n\'\f\'\u02ce\t\'\u0001\'\u0003\'\u02d1\b"+
		"\'\u0001\'\u0001\'\u0003\'\u02d5\b\'\u0001(\u0001(\u0001(\u0001(\u0005"+
		"(\u02db\b(\n(\f(\u02de\t(\u0001)\u0001)\u0001)\u0005)\u02e3\b)\n)\f)\u02e6"+
		"\t)\u0001*\u0001*\u0003*\u02ea\b*\u0001+\u0001+\u0001+\u0003+\u02ef\b"+
		"+\u0001+\u0001+\u0001+\u0003+\u02f4\b+\u0001+\u0001+\u0001+\u0003+\u02f9"+
		"\b+\u0001+\u0001+\u0001+\u0003+\u02fe\b+\u0003+\u0300\b+\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0005,\u0307\b,\n,\f,\u030a\t,\u0003,\u030c\b,"+
		"\u0001,\u0001,\u0003,\u0310\b,\u0001-\u0001-\u0001-\u0001-\u0003-\u0316"+
		"\b-\u0001-\u0003-\u0319\b-\u0001-\u0003-\u031c\b-\u0001-\u0001-\u0001"+
		"-\u0005-\u0321\b-\n-\f-\u0324\t-\u0001-\u0001-\u0003-\u0328\b-\u0001."+
		"\u0003.\u032b\b.\u0001.\u0001.\u0003.\u032f\b.\u0001.\u0001.\u0001.\u0001"+
		".\u0003.\u0335\b.\u0005.\u0337\b.\n.\f.\u033a\t.\u0001.\u0001.\u0001."+
		"\u0003.\u033f\b.\u0001.\u0001.\u0001/\u0003/\u0344\b/\u0001/\u0001/\u0003"+
		"/\u0348\b/\u0001/\u0001/\u0001/\u0003/\u034d\b/\u0005/\u034f\b/\n/\f/"+
		"\u0352\t/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00010\u00030\u035b"+
		"\b0\u00011\u00011\u00011\u00011\u00031\u0361\b1\u00051\u0363\b1\n1\f1"+
		"\u0366\t1\u00011\u00031\u0369\b1\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00013\u00013\u00013\u00033\u0374\b3\u00043\u0376\b3\u000b3\f3\u0377"+
		"\u00013\u00013\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00034\u0388\b4\u00015\u00015\u00015\u0001"+
		"5\u00035\u038e\b5\u00016\u00016\u00016\u00056\u0393\b6\n6\f6\u0396\t6"+
		"\u00036\u0398\b6\u00016\u00016\u00016\u00016\u00016\u00036\u039f\b6\u0001"+
		"6\u00016\u00017\u00017\u00017\u00057\u03a6\b7\n7\f7\u03a9\t7\u00017\u0001"+
		"7\u00017\u00017\u00018\u00018\u00018\u00058\u03b2\b8\n8\f8\u03b5\t8\u0001"+
		"8\u00018\u00018\u00019\u00019\u00019\u00059\u03bd\b9\n9\f9\u03c0\t9\u0001"+
		"9\u00019\u0001:\u0001:\u0001:\u0001:\u0003:\u03c8\b:\u0001:\u0001:\u0003"+
		":\u03cc\b:\u0001:\u0003:\u03cf\b:\u0005:\u03d1\b:\n:\f:\u03d4\t:\u0003"+
		":\u03d6\b:\u0001;\u0001;\u0005;\u03da\b;\n;\f;\u03dd\t;\u0001;\u0001;"+
		"\u0001<\u0004<\u03e2\b<\u000b<\f<\u03e3\u0001=\u0001=\u0001=\u0001=\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0004>\u03ef\b>\u000b>\f>\u03f0\u0001>\u0003"+
		">\u03f4\b>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001"+
		"@\u0001@\u0003@\u0400\b@\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0003A\u0409\bA\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001C\u0001"+
		"C\u0001C\u0001C\u0001C\u0001C\u0003C\u0417\bC\u0001D\u0001D\u0001D\u0001"+
		"D\u0001E\u0001E\u0001F\u0001F\u0001G\u0001G\u0001H\u0001H\u0001H\u0000"+
		"\u0001DI\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0000\u000b\u0002\u0000"+
		"bbee\u0001\u0000\u001d\u001f\u0001\u0000IK\u0001\u0000GH\u0001\u0000N"+
		"Q\u0002\u0000FFRU\u0002\u0000NNZZ\u0001\u0000\'0\u0001\u0000\u001a\u001b"+
		"\u0002\u0000 !be\u0001\u00009=\u04a3\u0000\u0093\u0001\u0000\u0000\u0000"+
		"\u0002\u00a9\u0001\u0000\u0000\u0000\u0004\u00ab\u0001\u0000\u0000\u0000"+
		"\u0006\u00b6\u0001\u0000\u0000\u0000\b\u00c1\u0001\u0000\u0000\u0000\n"+
		"\u00c6\u0001\u0000\u0000\u0000\f\u00d2\u0001\u0000\u0000\u0000\u000e\u00d4"+
		"\u0001\u0000\u0000\u0000\u0010\u00d6\u0001\u0000\u0000\u0000\u0012\u00df"+
		"\u0001\u0000\u0000\u0000\u0014\u00f7\u0001\u0000\u0000\u0000\u0016\u00fc"+
		"\u0001\u0000\u0000\u0000\u0018\u00fe\u0001\u0000\u0000\u0000\u001a\u0104"+
		"\u0001\u0000\u0000\u0000\u001c\u010d\u0001\u0000\u0000\u0000\u001e\u0139"+
		"\u0001\u0000\u0000\u0000 \u013c\u0001\u0000\u0000\u0000\"\u0170\u0001"+
		"\u0000\u0000\u0000$\u0173\u0001\u0000\u0000\u0000&\u017d\u0001\u0000\u0000"+
		"\u0000(\u0185\u0001\u0000\u0000\u0000*\u018e\u0001\u0000\u0000\u0000,"+
		"\u0197\u0001\u0000\u0000\u0000.\u01b0\u0001\u0000\u0000\u00000\u01be\u0001"+
		"\u0000\u0000\u00002\u01ce\u0001\u0000\u0000\u00004\u01d3\u0001\u0000\u0000"+
		"\u00006\u01f9\u0001\u0000\u0000\u00008\u01fb\u0001\u0000\u0000\u0000:"+
		"\u0209\u0001\u0000\u0000\u0000<\u020d\u0001\u0000\u0000\u0000>\u0210\u0001"+
		"\u0000\u0000\u0000@\u0224\u0001\u0000\u0000\u0000B\u0226\u0001\u0000\u0000"+
		"\u0000D\u0251\u0001\u0000\u0000\u0000F\u027d\u0001\u0000\u0000\u0000H"+
		"\u028e\u0001\u0000\u0000\u0000J\u0295\u0001\u0000\u0000\u0000L\u02c2\u0001"+
		"\u0000\u0000\u0000N\u02c4\u0001\u0000\u0000\u0000P\u02d6\u0001\u0000\u0000"+
		"\u0000R\u02df\u0001\u0000\u0000\u0000T\u02e7\u0001\u0000\u0000\u0000V"+
		"\u02ff\u0001\u0000\u0000\u0000X\u0301\u0001\u0000\u0000\u0000Z\u0327\u0001"+
		"\u0000\u0000\u0000\\\u032a\u0001\u0000\u0000\u0000^\u0343\u0001\u0000"+
		"\u0000\u0000`\u0356\u0001\u0000\u0000\u0000b\u0368\u0001\u0000\u0000\u0000"+
		"d\u036a\u0001\u0000\u0000\u0000f\u0370\u0001\u0000\u0000\u0000h\u0387"+
		"\u0001\u0000\u0000\u0000j\u038d\u0001\u0000\u0000\u0000l\u038f\u0001\u0000"+
		"\u0000\u0000n\u03a2\u0001\u0000\u0000\u0000p\u03ae\u0001\u0000\u0000\u0000"+
		"r\u03b9\u0001\u0000\u0000\u0000t\u03d5\u0001\u0000\u0000\u0000v\u03d7"+
		"\u0001\u0000\u0000\u0000x\u03e1\u0001\u0000\u0000\u0000z\u03e5\u0001\u0000"+
		"\u0000\u0000|\u03ee\u0001\u0000\u0000\u0000~\u03f5\u0001\u0000\u0000\u0000"+
		"\u0080\u03ff\u0001\u0000\u0000\u0000\u0082\u0408\u0001\u0000\u0000\u0000"+
		"\u0084\u040a\u0001\u0000\u0000\u0000\u0086\u0410\u0001\u0000\u0000\u0000"+
		"\u0088\u0418\u0001\u0000\u0000\u0000\u008a\u041c\u0001\u0000\u0000\u0000"+
		"\u008c\u041e\u0001\u0000\u0000\u0000\u008e\u0420\u0001\u0000\u0000\u0000"+
		"\u0090\u0422\u0001\u0000\u0000\u0000\u0092\u0094\u0003\u0002\u0001\u0000"+
		"\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000"+
		"\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u0000\u0000\u0001"+
		"\u0098\u0001\u0001\u0000\u0000\u0000\u0099\u00aa\u0003\u0004\u0002\u0000"+
		"\u009a\u00aa\u0003d2\u0000\u009b\u00aa\u0003\u0006\u0003\u0000\u009c\u00aa"+
		"\u0003\b\u0004\u0000\u009d\u00aa\u0003.\u0017\u0000\u009e\u00aa\u0003"+
		"\n\u0005\u0000\u009f\u00aa\u0003\u0016\u000b\u0000\u00a0\u00aa\u0003F"+
		"#\u0000\u00a1\u00aa\u0003L&\u0000\u00a2\u00aa\u0003N\'\u0000\u00a3\u00aa"+
		"\u0003Z-\u0000\u00a4\u00aa\u0003X,\u0000\u00a5\u00a7\u0003D\"\u0000\u00a6"+
		"\u00a8\u0005B\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a8\u00aa\u0001\u0000\u0000\u0000\u00a9\u0099"+
		"\u0001\u0000\u0000\u0000\u00a9\u009a\u0001\u0000\u0000\u0000\u00a9\u009b"+
		"\u0001\u0000\u0000\u0000\u00a9\u009c\u0001\u0000\u0000\u0000\u00a9\u009d"+
		"\u0001\u0000\u0000\u0000\u00a9\u009e\u0001\u0000\u0000\u0000\u00a9\u009f"+
		"\u0001\u0000\u0000\u0000\u00a9\u00a0\u0001\u0000\u0000\u0000\u00a9\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a9\u00a2\u0001\u0000\u0000\u0000\u00a9\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a9\u00a4\u0001\u0000\u0000\u0000\u00a9\u00a5"+
		"\u0001\u0000\u0000\u0000\u00aa\u0003\u0001\u0000\u0000\u0000\u00ab\u00af"+
		"\u0005Z\u0000\u0000\u00ac\u00ae\u0003\u0002\u0001\u0000\u00ad\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00b4\u0005"+
		"[\u0000\u0000\u00b3\u00b5\u0005B\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u0005\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b7\u0005\"\u0000\u0000\u00b7\u00b8\u0005?\u0000\u0000"+
		"\u00b8\u00b9\u0005#\u0000\u0000\u00b9\u00bb\u0005\\\u0000\u0000\u00ba"+
		"\u00bc\u0003D\"\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bb\u00bc"+
		"\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00bf"+
		"\u0005]\u0000\u0000\u00be\u00c0\u0005B\u0000\u0000\u00bf\u00be\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u0007\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0005e\u0000\u0000\u00c2\u00c3\u0005^\u0000\u0000"+
		"\u00c3\u00c4\u0003D\"\u0000\u00c4\u00c5\u0005_\u0000\u0000\u00c5\t\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0005\u0001\u0000\u0000\u00c7\u00ca\u0003"+
		"\f\u0006\u0000\u00c8\u00c9\u0005\u0003\u0000\u0000\u00c9\u00cb\u0005b"+
		"\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc\u00ce\u0005B\u0000"+
		"\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000"+
		"\u0000\u00ce\u000b\u0001\u0000\u0000\u0000\u00cf\u00d3\u0003\u000e\u0007"+
		"\u0000\u00d0\u00d3\u0003\u0010\b\u0000\u00d1\u00d3\u0003\u0012\t\u0000"+
		"\u00d2\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d3\r\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d5\u0007\u0000\u0000\u0000\u00d5\u000f\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d7\u0005I\u0000\u0000\u00d7\u00d8\u0005\u0004\u0000\u0000\u00d8\u00d9"+
		"\u0005e\u0000\u0000\u00d9\u0011\u0001\u0000\u0000\u0000\u00da\u00db\u0003"+
		"\u0014\n\u0000\u00db\u00dc\u0005@\u0000\u0000\u00dc\u00de\u0001\u0000"+
		"\u0000\u0000\u00dd\u00da\u0001\u0000\u0000\u0000\u00de\u00e1\u0001\u0000"+
		"\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e2\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000"+
		"\u0000\u0000\u00e2\u00ee\u0005Z\u0000\u0000\u00e3\u00e8\u0003\u0014\n"+
		"\u0000\u00e4\u00e5\u0005@\u0000\u0000\u00e5\u00e7\u0003\u0014\n\u0000"+
		"\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ed\u0005@\u0000\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ef\u0001\u0000\u0000\u0000\u00ee"+
		"\u00e3\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005[\u0000\u0000\u00f1\u0013"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f8\u0005e\u0000\u0000\u00f3\u00f8\u0003"+
		"\u008aE\u0000\u00f4\u00f5\u0005e\u0000\u0000\u00f5\u00f6\u0005\u0004\u0000"+
		"\u0000\u00f6\u00f8\u0005e\u0000\u0000\u00f7\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f3\u0001\u0000\u0000\u0000\u00f7\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f8\u0015\u0001\u0000\u0000\u0000\u00f9\u00fd\u0003\u0018\f\u0000\u00fa"+
		"\u00fd\u0003\u001a\r\u0000\u00fb\u00fd\u0003\u001c\u000e\u0000\u00fc\u00f9"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fd\u0017\u0001\u0000\u0000\u0000\u00fe\u00ff"+
		"\u0005\u0002\u0000\u0000\u00ff\u0100\u0005\u0005\u0000\u0000\u0100\u0102"+
		"\u0003D\"\u0000\u0101\u0103\u0005B\u0000\u0000\u0102\u0101\u0001\u0000"+
		"\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0019\u0001\u0000"+
		"\u0000\u0000\u0104\u0108\u0005\u0002\u0000\u0000\u0105\u0109\u0003.\u0017"+
		"\u0000\u0106\u0109\u0003 \u0010\u0000\u0107\u0109\u0003Z-\u0000\u0108"+
		"\u0105\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0108"+
		"\u0107\u0001\u0000\u0000\u0000\u0109\u010b\u0001\u0000\u0000\u0000\u010a"+
		"\u010c\u0005B\u0000\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010b\u010c"+
		"\u0001\u0000\u0000\u0000\u010c\u001b\u0001\u0000\u0000\u0000\u010d\u0110"+
		"\u0005\u0002\u0000\u0000\u010e\u010f\u0005\u000b\u0000\u0000\u010f\u0111"+
		"\u0005e\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110\u0111\u0001"+
		"\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u011e\u0005"+
		"Z\u0000\u0000\u0113\u0118\u0003\u001e\u000f\u0000\u0114\u0115\u0005@\u0000"+
		"\u0000\u0115\u0117\u0003\u001e\u000f\u0000\u0116\u0114\u0001\u0000\u0000"+
		"\u0000\u0117\u011a\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000"+
		"\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011c\u0001\u0000\u0000"+
		"\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011b\u011d\u0005@\u0000\u0000"+
		"\u011c\u011b\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000"+
		"\u011d\u011f\u0001\u0000\u0000\u0000\u011e\u0113\u0001\u0000\u0000\u0000"+
		"\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000"+
		"\u0120\u0123\u0005[\u0000\u0000\u0121\u0122\u0005\u0003\u0000\u0000\u0122"+
		"\u0124\u0005b\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0124"+
		"\u0001\u0000\u0000\u0000\u0124\u0126\u0001\u0000\u0000\u0000\u0125\u0127"+
		"\u0005B\u0000\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0126\u0127\u0001"+
		"\u0000\u0000\u0000\u0127\u001d\u0001\u0000\u0000\u0000\u0128\u013a\u0005"+
		"e\u0000\u0000\u0129\u012a\u0005e\u0000\u0000\u012a\u012b\u0005\u0004\u0000"+
		"\u0000\u012b\u013a\u0005e\u0000\u0000\u012c\u012e\u0005>\u0000\u0000\u012d"+
		"\u012c\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e"+
		"\u012f\u0001\u0000\u0000\u0000\u012f\u0137\u0003\u008aE\u0000\u0130\u0131"+
		"\u0005\\\u0000\u0000\u0131\u0132\u0005]\u0000\u0000\u0132\u0133\u0005"+
		"e\u0000\u0000\u0133\u0134\u0005A\u0000\u0000\u0134\u0135\u0003\u0090H"+
		"\u0000\u0135\u0136\u0005B\u0000\u0000\u0136\u0138\u0001\u0000\u0000\u0000"+
		"\u0137\u0130\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000"+
		"\u0138\u013a\u0001\u0000\u0000\u0000\u0139\u0128\u0001\u0000\u0000\u0000"+
		"\u0139\u0129\u0001\u0000\u0000\u0000\u0139\u012d\u0001\u0000\u0000\u0000"+
		"\u013a\u001f\u0001\u0000\u0000\u0000\u013b\u013d\u0003d2\u0000\u013c\u013b"+
		"\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013f"+
		"\u0001\u0000\u0000\u0000\u013e\u0140\u0005\u0002\u0000\u0000\u013f\u013e"+
		"\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0142"+
		"\u0001\u0000\u0000\u0000\u0141\u0143\u0005\u0005\u0000\u0000\u0142\u0141"+
		"\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0144"+
		"\u0001\u0000\u0000\u0000\u0144\u0145\u0005\u000b\u0000\u0000\u0145\u0148"+
		"\u0005e\u0000\u0000\u0146\u0147\u0005\f\u0000\u0000\u0147\u0149\u0003"+
		"D\"\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000"+
		"\u0000\u0000\u0149\u0153\u0001\u0000\u0000\u0000\u014a\u014b\u0005\r\u0000"+
		"\u0000\u014b\u0150\u0005e\u0000\u0000\u014c\u014d\u0005@\u0000\u0000\u014d"+
		"\u014f\u0005e\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014f\u0152"+
		"\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0150\u0151"+
		"\u0001\u0000\u0000\u0000\u0151\u0154\u0001\u0000\u0000\u0000\u0152\u0150"+
		"\u0001\u0000\u0000\u0000\u0153\u014a\u0001\u0000\u0000\u0000\u0153\u0154"+
		"\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u0159"+
		"\u0005Z\u0000\u0000\u0156\u0158\u0003\"\u0011\u0000\u0157\u0156\u0001"+
		"\u0000\u0000\u0000\u0158\u015b\u0001\u0000\u0000\u0000\u0159\u0157\u0001"+
		"\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u015c\u0001"+
		"\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015c\u015d\u0005"+
		"[\u0000\u0000\u015d!\u0001\u0000\u0000\u0000\u015e\u0160\u0003d2\u0000"+
		"\u015f\u015e\u0001\u0000\u0000\u0000\u0160\u0163\u0001\u0000\u0000\u0000"+
		"\u0161\u015f\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000"+
		"\u0162\u0164\u0001\u0000\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000"+
		"\u0164\u0166\u00032\u0019\u0000\u0165\u0167\u0005B\u0000\u0000\u0166\u0165"+
		"\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u0171"+
		"\u0001\u0000\u0000\u0000\u0168\u016a\u0003d2\u0000\u0169\u0168\u0001\u0000"+
		"\u0000\u0000\u016a\u016d\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000"+
		"\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016e\u0001\u0000"+
		"\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016e\u0171\u0003$\u0012"+
		"\u0000\u016f\u0171\u0003&\u0013\u0000\u0170\u0161\u0001\u0000\u0000\u0000"+
		"\u0170\u016b\u0001\u0000\u0000\u0000\u0170\u016f\u0001\u0000\u0000\u0000"+
		"\u0171#\u0001\u0000\u0000\u0000\u0172\u0174\u0003,\u0016\u0000\u0173\u0172"+
		"\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0175"+
		"\u0001\u0000\u0000\u0000\u0175\u0176\u0005e\u0000\u0000\u0176\u0178\u0005"+
		"\\\u0000\u0000\u0177\u0179\u0003(\u0014\u0000\u0178\u0177\u0001\u0000"+
		"\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000"+
		"\u0000\u0000\u017a\u017b\u0005]\u0000\u0000\u017b\u017c\u0003\u0004\u0002"+
		"\u0000\u017c%\u0001\u0000\u0000\u0000\u017d\u017e\u0005\u000e\u0000\u0000"+
		"\u017e\u0180\u0005\\\u0000\u0000\u017f\u0181\u0003(\u0014\u0000\u0180"+
		"\u017f\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181"+
		"\u0182\u0001\u0000\u0000\u0000\u0182\u0183\u0005]\u0000\u0000\u0183\u0184"+
		"\u0003\u0004\u0002\u0000\u0184\'\u0001\u0000\u0000\u0000\u0185\u018a\u0003"+
		"*\u0015\u0000\u0186\u0187\u0005@\u0000\u0000\u0187\u0189\u0003*\u0015"+
		"\u0000\u0188\u0186\u0001\u0000\u0000\u0000\u0189\u018c\u0001\u0000\u0000"+
		"\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000"+
		"\u0000\u018b)\u0001\u0000\u0000\u0000\u018c\u018a\u0001\u0000\u0000\u0000"+
		"\u018d\u018f\u0003,\u0016\u0000\u018e\u018d\u0001\u0000\u0000\u0000\u018e"+
		"\u018f\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190"+
		"\u0191\u0005e\u0000\u0000\u0191\u0192\u0005A\u0000\u0000\u0192\u0195\u0003"+
		"6\u001b\u0000\u0193\u0194\u0005F\u0000\u0000\u0194\u0196\u0003D\"\u0000"+
		"\u0195\u0193\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000"+
		"\u0196+\u0001\u0000\u0000\u0000\u0197\u0198\u0007\u0001\u0000\u0000\u0198"+
		"-\u0001\u0000\u0000\u0000\u0199\u019a\u0003\u008cF\u0000\u019a\u019f\u0003"+
		"2\u0019\u0000\u019b\u019c\u0005@\u0000\u0000\u019c\u019e\u00032\u0019"+
		"\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019e\u01a1\u0001\u0000\u0000"+
		"\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000"+
		"\u0000\u01a0\u01a2\u0001\u0000\u0000\u0000\u01a1\u019f\u0001\u0000\u0000"+
		"\u0000\u01a2\u01a3\u0005B\u0000\u0000\u01a3\u01b1\u0001\u0000\u0000\u0000"+
		"\u01a4\u01a5\u0005\u001c\u0000\u0000\u01a5\u01aa\u00030\u0018\u0000\u01a6"+
		"\u01a7\u0005@\u0000\u0000\u01a7\u01a9\u00030\u0018\u0000\u01a8\u01a6\u0001"+
		"\u0000\u0000\u0000\u01a9\u01ac\u0001\u0000\u0000\u0000\u01aa\u01a8\u0001"+
		"\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01ae\u0001"+
		"\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ad\u01af\u0005"+
		"B\u0000\u0000\u01ae\u01ad\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000"+
		"\u0000\u0000\u01af\u01b1\u0001\u0000\u0000\u0000\u01b0\u0199\u0001\u0000"+
		"\u0000\u0000\u01b0\u01a4\u0001\u0000\u0000\u0000\u01b1/\u0001\u0000\u0000"+
		"\u0000\u01b2\u01b4\u00034\u001a\u0000\u01b3\u01b5\u0005A\u0000\u0000\u01b4"+
		"\u01b3\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5"+
		"\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b7\u00036\u001b\u0000\u01b7\u01b8"+
		"\u0005F\u0000\u0000\u01b8\u01b9\u0003\u008eG\u0000\u01b9\u01bf\u0001\u0000"+
		"\u0000\u0000\u01ba\u01bb\u00034\u001a\u0000\u01bb\u01bc\u0005F\u0000\u0000"+
		"\u01bc\u01bd\u0003D\"\u0000\u01bd\u01bf\u0001\u0000\u0000\u0000\u01be"+
		"\u01b2\u0001\u0000\u0000\u0000\u01be\u01ba\u0001\u0000\u0000\u0000\u01bf"+
		"1\u0001\u0000\u0000\u0000\u01c0\u01c2\u00034\u001a\u0000\u01c1\u01c3\u0005"+
		"A\u0000\u0000\u01c2\u01c1\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4\u01c7\u00036\u001b"+
		"\u0000\u01c5\u01c6\u0005F\u0000\u0000\u01c6\u01c8\u0003D\"\u0000\u01c7"+
		"\u01c5\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8"+
		"\u01cf\u0001\u0000\u0000\u0000\u01c9\u01cc\u00034\u001a\u0000\u01ca\u01cb"+
		"\u0005F\u0000\u0000\u01cb\u01cd\u0003D\"\u0000\u01cc\u01ca\u0001\u0000"+
		"\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd\u01cf\u0001\u0000"+
		"\u0000\u0000\u01ce\u01c0\u0001\u0000\u0000\u0000\u01ce\u01c9\u0001\u0000"+
		"\u0000\u0000\u01cf3\u0001\u0000\u0000\u0000\u01d0\u01d4\u0005e\u0000\u0000"+
		"\u01d1\u01d4\u0003B!\u0000\u01d2\u01d4\u0003>\u001f\u0000\u01d3\u01d0"+
		"\u0001\u0000\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000\u01d3\u01d2"+
		"\u0001\u0000\u0000\u0000\u01d45\u0001\u0000\u0000\u0000\u01d5\u01d7\u0003"+
		"\u0090H\u0000\u01d6\u01d8\u0003<\u001e\u0000\u01d7\u01d6\u0001\u0000\u0000"+
		"\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01fa\u0001\u0000\u0000"+
		"\u0000\u01d9\u01e2\u0005Z\u0000\u0000\u01da\u01db\u0005e\u0000\u0000\u01db"+
		"\u01dc\u0005A\u0000\u0000\u01dc\u01de\u0003\u0090H\u0000\u01dd\u01df\u0005"+
		"@\u0000\u0000\u01de\u01dd\u0001\u0000\u0000\u0000\u01de\u01df\u0001\u0000"+
		"\u0000\u0000\u01df\u01e1\u0001\u0000\u0000\u0000\u01e0\u01da\u0001\u0000"+
		"\u0000\u0000\u01e1\u01e4\u0001\u0000\u0000\u0000\u01e2\u01e0\u0001\u0000"+
		"\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3\u01e5\u0001\u0000"+
		"\u0000\u0000\u01e4\u01e2\u0001\u0000\u0000\u0000\u01e5\u01e6\u0005[\u0000"+
		"\u0000\u01e6\u01e7\u0005F\u0000\u0000\u01e7\u01f0\u0005Z\u0000\u0000\u01e8"+
		"\u01e9\u0005e\u0000\u0000\u01e9\u01ea\u0005A\u0000\u0000\u01ea\u01ec\u0003"+
		"\u008eG\u0000\u01eb\u01ed\u0005@\u0000\u0000\u01ec\u01eb\u0001\u0000\u0000"+
		"\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000\u01ed\u01ef\u0001\u0000\u0000"+
		"\u0000\u01ee\u01e8\u0001\u0000\u0000\u0000\u01ef\u01f2\u0001\u0000\u0000"+
		"\u0000\u01f0\u01ee\u0001\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000"+
		"\u0000\u01f1\u01f3\u0001\u0000\u0000\u0000\u01f2\u01f0\u0001\u0000\u0000"+
		"\u0000\u01f3\u01f4\u0005[\u0000\u0000\u01f4\u01fa\u0005B\u0000\u0000\u01f5"+
		"\u01f7\u00038\u001c\u0000\u01f6\u01f8\u0003<\u001e\u0000\u01f7\u01f6\u0001"+
		"\u0000\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8\u01fa\u0001"+
		"\u0000\u0000\u0000\u01f9\u01d5\u0001\u0000\u0000\u0000\u01f9\u01d9\u0001"+
		"\u0000\u0000\u0000\u01f9\u01f5\u0001\u0000\u0000\u0000\u01fa7\u0001\u0000"+
		"\u0000\u0000\u01fb\u01fc\u0005Z\u0000\u0000\u01fc\u0201\u0003:\u001d\u0000"+
		"\u01fd\u01fe\u0005@\u0000\u0000\u01fe\u0200\u0003:\u001d\u0000\u01ff\u01fd"+
		"\u0001\u0000\u0000\u0000\u0200\u0203\u0001\u0000\u0000\u0000\u0201\u01ff"+
		"\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000\u0202\u0204"+
		"\u0001\u0000\u0000\u0000\u0203\u0201\u0001\u0000\u0000\u0000\u0204\u0207"+
		"\u0005[\u0000\u0000\u0205\u0206\u0005Y\u0000\u0000\u0206\u0208\u0003\u008e"+
		"G\u0000\u0207\u0205\u0001\u0000\u0000\u0000\u0207\u0208\u0001\u0000\u0000"+
		"\u0000\u02089\u0001\u0000\u0000\u0000\u0209\u020a\u0005e\u0000\u0000\u020a"+
		"\u020b\u0005A\u0000\u0000\u020b\u020c\u0003\u0090H\u0000\u020c;\u0001"+
		"\u0000\u0000\u0000\u020d\u020e\u0005^\u0000\u0000\u020e\u020f\u0005_\u0000"+
		"\u0000\u020f=\u0001\u0000\u0000\u0000\u0210\u021c\u0005Z\u0000\u0000\u0211"+
		"\u0216\u0003@ \u0000\u0212\u0213\u0005@\u0000\u0000\u0213\u0215\u0003"+
		"@ \u0000\u0214\u0212\u0001\u0000\u0000\u0000\u0215\u0218\u0001\u0000\u0000"+
		"\u0000\u0216\u0214\u0001\u0000\u0000\u0000\u0216\u0217\u0001\u0000\u0000"+
		"\u0000\u0217\u021a\u0001\u0000\u0000\u0000\u0218\u0216\u0001\u0000\u0000"+
		"\u0000\u0219\u021b\u0005@\u0000\u0000\u021a\u0219\u0001\u0000\u0000\u0000"+
		"\u021a\u021b\u0001\u0000\u0000\u0000\u021b\u021d\u0001\u0000\u0000\u0000"+
		"\u021c\u0211\u0001\u0000\u0000\u0000\u021c\u021d\u0001\u0000\u0000\u0000"+
		"\u021d\u021e\u0001\u0000\u0000\u0000\u021e\u021f\u0005[\u0000\u0000\u021f"+
		"?\u0001\u0000\u0000\u0000\u0220\u0221\u0005e\u0000\u0000\u0221\u0222\u0005"+
		"A\u0000\u0000\u0222\u0225\u0003D\"\u0000\u0223\u0225\u0003D\"\u0000\u0224"+
		"\u0220\u0001\u0000\u0000\u0000\u0224\u0223\u0001\u0000\u0000\u0000\u0225"+
		"A\u0001\u0000\u0000\u0000\u0226\u022a\u0005^\u0000\u0000\u0227\u0229\u0005"+
		"@\u0000\u0000\u0228\u0227\u0001\u0000\u0000\u0000\u0229\u022c\u0001\u0000"+
		"\u0000\u0000\u022a\u0228\u0001\u0000\u0000\u0000\u022a\u022b\u0001\u0000"+
		"\u0000\u0000\u022b\u0238\u0001\u0000\u0000\u0000\u022c\u022a\u0001\u0000"+
		"\u0000\u0000\u022d\u0232\u0003D\"\u0000\u022e\u022f\u0005@\u0000\u0000"+
		"\u022f\u0231\u0003D\"\u0000\u0230\u022e\u0001\u0000\u0000\u0000\u0231"+
		"\u0234\u0001\u0000\u0000\u0000\u0232\u0230\u0001\u0000\u0000\u0000\u0232"+
		"\u0233\u0001\u0000\u0000\u0000\u0233\u0236\u0001\u0000\u0000\u0000\u0234"+
		"\u0232\u0001\u0000\u0000\u0000\u0235\u0237\u0005@\u0000\u0000\u0236\u0235"+
		"\u0001\u0000\u0000\u0000\u0236\u0237\u0001\u0000\u0000\u0000\u0237\u0239"+
		"\u0001\u0000\u0000\u0000\u0238\u022d\u0001\u0000\u0000\u0000\u0238\u0239"+
		"\u0001\u0000\u0000\u0000\u0239\u023a\u0001\u0000\u0000\u0000\u023a\u023b"+
		"\u0005_\u0000\u0000\u023bC\u0001\u0000\u0000\u0000\u023c\u023d\u0006\""+
		"\uffff\uffff\u0000\u023d\u0252\u0003Z-\u0000\u023e\u0252\u0003X,\u0000"+
		"\u023f\u0252\u0003\b\u0004\u0000\u0240\u0241\u0005L\u0000\u0000\u0241"+
		"\u0252\u0003D\"\u0012\u0242\u0243\u0005M\u0000\u0000\u0243\u0252\u0003"+
		"D\"\u0011\u0244\u0245\u0005V\u0000\u0000\u0245\u0252\u0003D\"\u0010\u0246"+
		"\u0252\u0003\u008eG\u0000\u0247\u0252\u0003B!\u0000\u0248\u0252\u0003"+
		">\u001f\u0000\u0249\u0252\u0003j5\u0000\u024a\u0252\u0003V+\u0000\u024b"+
		"\u0252\u0003T*\u0000\u024c\u0252\u0003*\u0015\u0000\u024d\u024e\u0005"+
		"\\\u0000\u0000\u024e\u024f\u0003D\"\u0000\u024f\u0250\u0005]\u0000\u0000"+
		"\u0250\u0252\u0001\u0000\u0000\u0000\u0251\u023c\u0001\u0000\u0000\u0000"+
		"\u0251\u023e\u0001\u0000\u0000\u0000\u0251\u023f\u0001\u0000\u0000\u0000"+
		"\u0251\u0240\u0001\u0000\u0000\u0000\u0251\u0242\u0001\u0000\u0000\u0000"+
		"\u0251\u0244\u0001\u0000\u0000\u0000\u0251\u0246\u0001\u0000\u0000\u0000"+
		"\u0251\u0247\u0001\u0000\u0000\u0000\u0251\u0248\u0001\u0000\u0000\u0000"+
		"\u0251\u0249\u0001\u0000\u0000\u0000\u0251\u024a\u0001\u0000\u0000\u0000"+
		"\u0251\u024b\u0001\u0000\u0000\u0000\u0251\u024c\u0001\u0000\u0000\u0000"+
		"\u0251\u024d\u0001\u0000\u0000\u0000\u0252\u027a\u0001\u0000\u0000\u0000"+
		"\u0253\u0255\n\u0015\u0000\u0000\u0254\u0256\u0005C\u0000\u0000\u0255"+
		"\u0254\u0001\u0000\u0000\u0000\u0255\u0256\u0001\u0000\u0000\u0000\u0256"+
		"\u0257\u0001\u0000\u0000\u0000\u0257\u0259\u0005?\u0000\u0000\u0258\u025a"+
		"\u0005D\u0000\u0000\u0259\u0258\u0001\u0000\u0000\u0000\u0259\u025a\u0001"+
		"\u0000\u0000\u0000\u025a\u025b\u0001\u0000\u0000\u0000\u025b\u0279\u0003"+
		"D\"\u0016\u025c\u025d\n\u000f\u0000\u0000\u025d\u025e\u0007\u0002\u0000"+
		"\u0000\u025e\u0279\u0003D\"\u0010\u025f\u0260\n\u000e\u0000\u0000\u0260"+
		"\u0261\u0007\u0003\u0000\u0000\u0261\u0279\u0003D\"\u000f\u0262\u0263"+
		"\n\r\u0000\u0000\u0263\u0264\u0007\u0004\u0000\u0000\u0264\u0279\u0003"+
		"D\"\u000e\u0265\u0266\n\f\u0000\u0000\u0266\u0267\u0007\u0005\u0000\u0000"+
		"\u0267\u0279\u0003D\"\r\u0268\u0269\n\u000b\u0000\u0000\u0269\u026a\u0005"+
		"W\u0000\u0000\u026a\u0279\u0003D\"\f\u026b\u026c\n\n\u0000\u0000\u026c"+
		"\u026d\u0005X\u0000\u0000\u026d\u0279\u0003D\"\u000b\u026e\u026f\n\t\u0000"+
		"\u0000\u026f\u0270\u0005C\u0000\u0000\u0270\u0271\u0003D\"\u0000\u0271"+
		"\u0272\u0005A\u0000\u0000\u0272\u0273\u0003D\"\n\u0273\u0279\u0001\u0000"+
		"\u0000\u0000\u0274\u0275\n\u0014\u0000\u0000\u0275\u0279\u0005L\u0000"+
		"\u0000\u0276\u0277\n\u0013\u0000\u0000\u0277\u0279\u0005M\u0000\u0000"+
		"\u0278\u0253\u0001\u0000\u0000\u0000\u0278\u025c\u0001\u0000\u0000\u0000"+
		"\u0278\u025f\u0001\u0000\u0000\u0000\u0278\u0262\u0001\u0000\u0000\u0000"+
		"\u0278\u0265\u0001\u0000\u0000\u0000\u0278\u0268\u0001\u0000\u0000\u0000"+
		"\u0278\u026b\u0001\u0000\u0000\u0000\u0278\u026e\u0001\u0000\u0000\u0000"+
		"\u0278\u0274\u0001\u0000\u0000\u0000\u0278\u0276\u0001\u0000\u0000\u0000"+
		"\u0279\u027c\u0001\u0000\u0000\u0000\u027a\u0278\u0001\u0000\u0000\u0000"+
		"\u027a\u027b\u0001\u0000\u0000\u0000\u027bE\u0001\u0000\u0000\u0000\u027c"+
		"\u027a\u0001\u0000\u0000\u0000\u027d\u027e\u0005\u0012\u0000\u0000\u027e"+
		"\u027f\u0005\\\u0000\u0000\u027f\u0280\u0003D\"\u0000\u0280\u0281\u0005"+
		"]\u0000\u0000\u0281\u0285\u0003\u0002\u0001\u0000\u0282\u0284\u0003H$"+
		"\u0000\u0283\u0282\u0001\u0000\u0000\u0000\u0284\u0287\u0001\u0000\u0000"+
		"\u0000\u0285\u0283\u0001\u0000\u0000\u0000\u0285\u0286\u0001\u0000\u0000"+
		"\u0000\u0286\u0289\u0001\u0000\u0000\u0000\u0287\u0285\u0001\u0000\u0000"+
		"\u0000\u0288\u028a\u0003J%\u0000\u0289\u0288\u0001\u0000\u0000\u0000\u0289"+
		"\u028a\u0001\u0000\u0000\u0000\u028a\u028c\u0001\u0000\u0000\u0000\u028b"+
		"\u028d\u0005B\u0000\u0000\u028c\u028b\u0001\u0000\u0000\u0000\u028c\u028d"+
		"\u0001\u0000\u0000\u0000\u028dG\u0001\u0000\u0000\u0000\u028e\u028f\u0005"+
		"\u0013\u0000\u0000\u028f\u0290\u0005\u0012\u0000\u0000\u0290\u0291\u0005"+
		"\\\u0000\u0000\u0291\u0292\u0003D\"\u0000\u0292\u0293\u0005]\u0000\u0000"+
		"\u0293\u0294\u0003\u0002\u0001\u0000\u0294I\u0001\u0000\u0000\u0000\u0295"+
		"\u0296\u0005\u0013\u0000\u0000\u0296\u0297\u0003\u0002\u0001\u0000\u0297"+
		"K\u0001\u0000\u0000\u0000\u0298\u0299\u0005\u0016\u0000\u0000\u0299\u029a"+
		"\u0003\u0002\u0001\u0000\u029a\u029b\u0005\u0015\u0000\u0000\u029b\u029c"+
		"\u0005\\\u0000\u0000\u029c\u029d\u0003D\"\u0000\u029d\u029f\u0005]\u0000"+
		"\u0000\u029e\u02a0\u0005B\u0000\u0000\u029f\u029e\u0001\u0000\u0000\u0000"+
		"\u029f\u02a0\u0001\u0000\u0000\u0000\u02a0\u02c3\u0001\u0000\u0000\u0000"+
		"\u02a1\u02a2\u0005\u0015\u0000\u0000\u02a2\u02a3\u0005\\\u0000\u0000\u02a3"+
		"\u02a4\u0003D\"\u0000\u02a4\u02a5\u0005]\u0000\u0000\u02a5\u02a6\u0003"+
		"\u0002\u0001\u0000\u02a6\u02c3\u0001\u0000\u0000\u0000\u02a7\u02a8\u0005"+
		"\u0014\u0000\u0000\u02a8\u02ab\u0005\\\u0000\u0000\u02a9\u02ac\u0003D"+
		"\"\u0000\u02aa\u02ac\u0003.\u0017\u0000\u02ab\u02a9\u0001\u0000\u0000"+
		"\u0000\u02ab\u02aa\u0001\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000\u0000"+
		"\u0000\u02ac\u02ad\u0001\u0000\u0000\u0000\u02ad\u02af\u0005B\u0000\u0000"+
		"\u02ae\u02b0\u0003D\"\u0000\u02af\u02ae\u0001\u0000\u0000\u0000\u02af"+
		"\u02b0\u0001\u0000\u0000\u0000\u02b0\u02b1\u0001\u0000\u0000\u0000\u02b1"+
		"\u02b3\u0005B\u0000\u0000\u02b2\u02b4\u0003D\"\u0000\u02b3\u02b2\u0001"+
		"\u0000\u0000\u0000\u02b3\u02b4\u0001\u0000\u0000\u0000\u02b4\u02b5\u0001"+
		"\u0000\u0000\u0000\u02b5\u02b6\u0005]\u0000\u0000\u02b6\u02c3\u0003\u0002"+
		"\u0001\u0000\u02b7\u02b8\u0005\u0014\u0000\u0000\u02b8\u02bb\u0005\\\u0000"+
		"\u0000\u02b9\u02bc\u0003D\"\u0000\u02ba\u02bc\u0003.\u0017\u0000\u02bb"+
		"\u02b9\u0001\u0000\u0000\u0000\u02bb\u02ba\u0001\u0000\u0000\u0000\u02bc"+
		"\u02bd\u0001\u0000\u0000\u0000\u02bd\u02be\u0005$\u0000\u0000\u02be\u02bf"+
		"\u0003D\"\u0000\u02bf\u02c0\u0005]\u0000\u0000\u02c0\u02c1\u0003\u0002"+
		"\u0001\u0000\u02c1\u02c3\u0001\u0000\u0000\u0000\u02c2\u0298\u0001\u0000"+
		"\u0000\u0000\u02c2\u02a1\u0001\u0000\u0000\u0000\u02c2\u02a7\u0001\u0000"+
		"\u0000\u0000\u02c2\u02b7\u0001\u0000\u0000\u0000\u02c3M\u0001\u0000\u0000"+
		"\u0000\u02c4\u02c5\u0005\u0017\u0000\u0000\u02c5\u02c6\u0005\\\u0000\u0000"+
		"\u02c6\u02c7\u0003D\"\u0000\u02c7\u02c8\u0005]\u0000\u0000\u02c8\u02cc"+
		"\u0005Z\u0000\u0000\u02c9\u02cb\u0003P(\u0000\u02ca\u02c9\u0001\u0000"+
		"\u0000\u0000\u02cb\u02ce\u0001\u0000\u0000\u0000\u02cc\u02ca\u0001\u0000"+
		"\u0000\u0000\u02cc\u02cd\u0001\u0000\u0000\u0000\u02cd\u02d0\u0001\u0000"+
		"\u0000\u0000\u02ce\u02cc\u0001\u0000\u0000\u0000\u02cf\u02d1\u0003R)\u0000"+
		"\u02d0\u02cf\u0001\u0000\u0000\u0000\u02d0\u02d1\u0001\u0000\u0000\u0000"+
		"\u02d1\u02d2\u0001\u0000\u0000\u0000\u02d2\u02d4\u0005[\u0000\u0000\u02d3"+
		"\u02d5\u0005B\u0000\u0000\u02d4\u02d3\u0001\u0000\u0000\u0000\u02d4\u02d5"+
		"\u0001\u0000\u0000\u0000\u02d5O\u0001\u0000\u0000\u0000\u02d6\u02d7\u0005"+
		"\u0018\u0000\u0000\u02d7\u02d8\u0003D\"\u0000\u02d8\u02dc\u0005A\u0000"+
		"\u0000\u02d9\u02db\u0003\u0002\u0001\u0000\u02da\u02d9\u0001\u0000\u0000"+
		"\u0000\u02db\u02de\u0001\u0000\u0000\u0000\u02dc\u02da\u0001\u0000\u0000"+
		"\u0000\u02dc\u02dd\u0001\u0000\u0000\u0000\u02ddQ\u0001\u0000\u0000\u0000"+
		"\u02de\u02dc\u0001\u0000\u0000\u0000\u02df\u02e0\u0005\u0005\u0000\u0000"+
		"\u02e0\u02e4\u0005A\u0000\u0000\u02e1\u02e3\u0003\u0002\u0001\u0000\u02e2"+
		"\u02e1\u0001\u0000\u0000\u0000\u02e3\u02e6\u0001\u0000\u0000\u0000\u02e4"+
		"\u02e2\u0001\u0000\u0000\u0000\u02e4\u02e5\u0001\u0000\u0000\u0000\u02e5"+
		"S\u0001\u0000\u0000\u0000\u02e6\u02e4\u0001\u0000\u0000\u0000\u02e7\u02e9"+
		"\u0005\u0011\u0000\u0000\u02e8\u02ea\u0005B\u0000\u0000\u02e9\u02e8\u0001"+
		"\u0000\u0000\u0000\u02e9\u02ea\u0001\u0000\u0000\u0000\u02eaU\u0001\u0000"+
		"\u0000\u0000\u02eb\u02ec\u0005\u0010\u0000\u0000\u02ec\u02ee\u0003D\""+
		"\u0000\u02ed\u02ef\u0005B\u0000\u0000\u02ee\u02ed\u0001\u0000\u0000\u0000"+
		"\u02ee\u02ef\u0001\u0000\u0000\u0000\u02ef\u0300\u0001\u0000\u0000\u0000"+
		"\u02f0\u02f1\u0005\u0010\u0000\u0000\u02f1\u02f3\u0003>\u001f\u0000\u02f2"+
		"\u02f4\u0005B\u0000\u0000\u02f3\u02f2\u0001\u0000\u0000\u0000\u02f3\u02f4"+
		"\u0001\u0000\u0000\u0000\u02f4\u0300\u0001\u0000\u0000\u0000\u02f5\u02f6"+
		"\u0005\u0010\u0000\u0000\u02f6\u02f8\u0003B!\u0000\u02f7\u02f9\u0005B"+
		"\u0000\u0000\u02f8\u02f7\u0001\u0000\u0000\u0000\u02f8\u02f9\u0001\u0000"+
		"\u0000\u0000\u02f9\u0300\u0001\u0000\u0000\u0000\u02fa\u02fb\u0005\u0010"+
		"\u0000\u0000\u02fb\u02fd\u0003X,\u0000\u02fc\u02fe\u0005B\u0000\u0000"+
		"\u02fd\u02fc\u0001\u0000\u0000\u0000\u02fd\u02fe\u0001\u0000\u0000\u0000"+
		"\u02fe\u0300\u0001\u0000\u0000\u0000\u02ff\u02eb\u0001\u0000\u0000\u0000"+
		"\u02ff\u02f0\u0001\u0000\u0000\u0000\u02ff\u02f5\u0001\u0000\u0000\u0000"+
		"\u02ff\u02fa\u0001\u0000\u0000\u0000\u0300W\u0001\u0000\u0000\u0000\u0301"+
		"\u0302\u0005e\u0000\u0000\u0302\u030b\u0005\\\u0000\u0000\u0303\u0308"+
		"\u0003D\"\u0000\u0304\u0305\u0005@\u0000\u0000\u0305\u0307\u0003D\"\u0000"+
		"\u0306\u0304\u0001\u0000\u0000\u0000\u0307\u030a\u0001\u0000\u0000\u0000"+
		"\u0308\u0306\u0001\u0000\u0000\u0000\u0308\u0309\u0001\u0000\u0000\u0000"+
		"\u0309\u030c\u0001\u0000\u0000\u0000\u030a\u0308\u0001\u0000\u0000\u0000"+
		"\u030b\u0303\u0001\u0000\u0000\u0000\u030b\u030c\u0001\u0000\u0000\u0000"+
		"\u030c\u030d\u0001\u0000\u0000\u0000\u030d\u030f\u0005]\u0000\u0000\u030e"+
		"\u0310\u0005B\u0000\u0000\u030f\u030e\u0001\u0000\u0000\u0000\u030f\u0310"+
		"\u0001\u0000\u0000\u0000\u0310Y\u0001\u0000\u0000\u0000\u0311\u0328\u0003"+
		"\\.\u0000\u0312\u0328\u0003^/\u0000\u0313\u0328\u0003`0\u0000\u0314\u0316"+
		"\u0003d2\u0000\u0315\u0314\u0001\u0000\u0000\u0000\u0315\u0316\u0001\u0000"+
		"\u0000\u0000\u0316\u0318\u0001\u0000\u0000\u0000\u0317\u0319\u0003,\u0016"+
		"\u0000\u0318\u0317\u0001\u0000\u0000\u0000\u0318\u0319\u0001\u0000\u0000"+
		"\u0000\u0319\u031b\u0001\u0000\u0000\u0000\u031a\u031c\u0005\u000f\u0000"+
		"\u0000\u031b\u031a\u0001\u0000\u0000\u0000\u031b\u031c\u0001\u0000\u0000"+
		"\u0000\u031c\u031d\u0001\u0000\u0000\u0000\u031d\u031e\u0005e\u0000\u0000"+
		"\u031e\u0322\u0005\\\u0000\u0000\u031f\u0321\u0003D\"\u0000\u0320\u031f"+
		"\u0001\u0000\u0000\u0000\u0321\u0324\u0001\u0000\u0000\u0000\u0322\u0320"+
		"\u0001\u0000\u0000\u0000\u0322\u0323\u0001\u0000\u0000\u0000\u0323\u0325"+
		"\u0001\u0000\u0000\u0000\u0324\u0322\u0001\u0000\u0000\u0000\u0325\u0326"+
		"\u0005]\u0000\u0000\u0326\u0328\u0003\u0004\u0002\u0000\u0327\u0311\u0001"+
		"\u0000\u0000\u0000\u0327\u0312\u0001\u0000\u0000\u0000\u0327\u0313\u0001"+
		"\u0000\u0000\u0000\u0327\u0315\u0001\u0000\u0000\u0000\u0328[\u0001\u0000"+
		"\u0000\u0000\u0329\u032b\u0005%\u0000\u0000\u032a\u0329\u0001\u0000\u0000"+
		"\u0000\u032a\u032b\u0001\u0000\u0000\u0000\u032b\u032c\u0001\u0000\u0000"+
		"\u0000\u032c\u032e\u0005\u000f\u0000\u0000\u032d\u032f\u0005I\u0000\u0000"+
		"\u032e\u032d\u0001\u0000\u0000\u0000\u032e\u032f\u0001\u0000\u0000\u0000"+
		"\u032f\u0330\u0001\u0000\u0000\u0000\u0330\u0331\u0005e\u0000\u0000\u0331"+
		"\u0338\u0005\\\u0000\u0000\u0332\u0334\u0003D\"\u0000\u0333\u0335\u0005"+
		"@\u0000\u0000\u0334\u0333\u0001\u0000\u0000\u0000\u0334\u0335\u0001\u0000"+
		"\u0000\u0000\u0335\u0337\u0001\u0000\u0000\u0000\u0336\u0332\u0001\u0000"+
		"\u0000\u0000\u0337\u033a\u0001\u0000\u0000\u0000\u0338\u0336\u0001\u0000"+
		"\u0000\u0000\u0338\u0339\u0001\u0000\u0000\u0000\u0339\u033b\u0001\u0000"+
		"\u0000\u0000\u033a\u0338\u0001\u0000\u0000\u0000\u033b\u033e\u0005]\u0000"+
		"\u0000\u033c\u033d\u0005A\u0000\u0000\u033d\u033f\u0003\u0090H\u0000\u033e"+
		"\u033c\u0001\u0000\u0000\u0000\u033e\u033f\u0001\u0000\u0000\u0000\u033f"+
		"\u0340\u0001\u0000\u0000\u0000\u0340\u0341\u0003\u0004\u0002\u0000\u0341"+
		"]\u0001\u0000\u0000\u0000\u0342\u0344\u0005%\u0000\u0000\u0343\u0342\u0001"+
		"\u0000\u0000\u0000\u0343\u0344\u0001\u0000\u0000\u0000\u0344\u0345\u0001"+
		"\u0000\u0000\u0000\u0345\u0347\u0005\u000f\u0000\u0000\u0346\u0348\u0005"+
		"I\u0000\u0000\u0347\u0346\u0001\u0000\u0000\u0000\u0347\u0348\u0001\u0000"+
		"\u0000\u0000\u0348\u0349\u0001\u0000\u0000\u0000\u0349\u0350\u0005\\\u0000"+
		"\u0000\u034a\u034c\u0003D\"\u0000\u034b\u034d\u0005@\u0000\u0000\u034c"+
		"\u034b\u0001\u0000\u0000\u0000\u034c\u034d\u0001\u0000\u0000\u0000\u034d"+
		"\u034f\u0001\u0000\u0000\u0000\u034e\u034a\u0001\u0000\u0000\u0000\u034f"+
		"\u0352\u0001\u0000\u0000\u0000\u0350\u034e\u0001\u0000\u0000\u0000\u0350"+
		"\u0351\u0001\u0000\u0000\u0000\u0351\u0353\u0001\u0000\u0000\u0000\u0352"+
		"\u0350\u0001\u0000\u0000\u0000\u0353\u0354\u0005]\u0000\u0000\u0354\u0355"+
		"\u0003\u0004\u0002\u0000\u0355_\u0001\u0000\u0000\u0000\u0356\u0357\u0003"+
		"b1\u0000\u0357\u035a\u0005&\u0000\u0000\u0358\u035b\u0003\u0004\u0002"+
		"\u0000\u0359\u035b\u0003D\"\u0000\u035a\u0358\u0001\u0000\u0000\u0000"+
		"\u035a\u0359\u0001\u0000\u0000\u0000\u035ba\u0001\u0000\u0000\u0000\u035c"+
		"\u0369\u0003\u008eG\u0000\u035d\u0364\u0005\\\u0000\u0000\u035e\u0360"+
		"\u0003D\"\u0000\u035f\u0361\u0005@\u0000\u0000\u0360\u035f\u0001\u0000"+
		"\u0000\u0000\u0360\u0361\u0001\u0000\u0000\u0000\u0361\u0363\u0001\u0000"+
		"\u0000\u0000\u0362\u035e\u0001\u0000\u0000\u0000\u0363\u0366\u0001\u0000"+
		"\u0000\u0000\u0364\u0362\u0001\u0000\u0000\u0000\u0364\u0365\u0001\u0000"+
		"\u0000\u0000\u0365\u0367\u0001\u0000\u0000\u0000\u0366\u0364\u0001\u0000"+
		"\u0000\u0000\u0367\u0369\u0005]\u0000\u0000\u0368\u035c\u0001\u0000\u0000"+
		"\u0000\u0368\u035d\u0001\u0000\u0000\u0000\u0369c\u0001\u0000\u0000\u0000"+
		"\u036a\u036b\u0005>\u0000\u0000\u036b\u036c\u0003\u008aE\u0000\u036c\u036d"+
		"\u0005\\\u0000\u0000\u036d\u036e\u0003f3\u0000\u036e\u036f\u0005]\u0000"+
		"\u0000\u036fe\u0001\u0000\u0000\u0000\u0370\u0375\u0005Z\u0000\u0000\u0371"+
		"\u0373\u0003h4\u0000\u0372\u0374\u0005@\u0000\u0000\u0373\u0372\u0001"+
		"\u0000\u0000\u0000\u0373\u0374\u0001\u0000\u0000\u0000\u0374\u0376\u0001"+
		"\u0000\u0000\u0000\u0375\u0371\u0001\u0000\u0000\u0000\u0376\u0377\u0001"+
		"\u0000\u0000\u0000\u0377\u0375\u0001\u0000\u0000\u0000\u0377\u0378\u0001"+
		"\u0000\u0000\u0000\u0378\u0379\u0001\u0000\u0000\u0000\u0379\u037a\u0005"+
		"[\u0000\u0000\u037ag\u0001\u0000\u0000\u0000\u037b\u037c\u0005\u0006\u0000"+
		"\u0000\u037c\u037d\u0005A\u0000\u0000\u037d\u0388\u0005b\u0000\u0000\u037e"+
		"\u037f\u0005\u0007\u0000\u0000\u037f\u0380\u0005A\u0000\u0000\u0380\u0388"+
		"\u0005b\u0000\u0000\u0381\u0382\u0005\b\u0000\u0000\u0382\u0383\u0005"+
		"A\u0000\u0000\u0383\u0384\u0005E\u0000\u0000\u0384\u0385\u0003j5\u0000"+
		"\u0385\u0386\u0005E\u0000\u0000\u0386\u0388\u0001\u0000\u0000\u0000\u0387"+
		"\u037b\u0001\u0000\u0000\u0000\u0387\u037e\u0001\u0000\u0000\u0000\u0387"+
		"\u0381\u0001\u0000\u0000\u0000\u0388i\u0001\u0000\u0000\u0000\u0389\u038e"+
		"\u0003l6\u0000\u038a\u038e\u0003n7\u0000\u038b\u038e\u0003p8\u0000\u038c"+
		"\u038e\u0003r9\u0000\u038d\u0389\u0001\u0000\u0000\u0000\u038d\u038a\u0001"+
		"\u0000\u0000\u0000\u038d\u038b\u0001\u0000\u0000\u0000\u038d\u038c\u0001"+
		"\u0000\u0000\u0000\u038ek\u0001\u0000\u0000\u0000\u038f\u0397\u0005N\u0000"+
		"\u0000\u0390\u0394\u0005e\u0000\u0000\u0391\u0393\u0003|>\u0000\u0392"+
		"\u0391\u0001\u0000\u0000\u0000\u0393\u0396\u0001\u0000\u0000\u0000\u0394"+
		"\u0392\u0001\u0000\u0000\u0000\u0394\u0395\u0001\u0000\u0000\u0000\u0395"+
		"\u0398\u0001\u0000\u0000\u0000\u0396\u0394\u0001\u0000\u0000\u0000\u0397"+
		"\u0390\u0001\u0000\u0000\u0000\u0397\u0398\u0001\u0000\u0000\u0000\u0398"+
		"\u0399\u0001\u0000\u0000\u0000\u0399\u039a\u0005O\u0000\u0000\u039a\u039b"+
		"\u0003t:\u0000\u039b\u039c\u0005N\u0000\u0000\u039c\u039e\u0005J\u0000"+
		"\u0000\u039d\u039f\u0005e\u0000\u0000\u039e\u039d\u0001\u0000\u0000\u0000"+
		"\u039e\u039f\u0001\u0000\u0000\u0000\u039f\u03a0\u0001\u0000\u0000\u0000"+
		"\u03a0\u03a1\u0005O\u0000\u0000\u03a1m\u0001\u0000\u0000\u0000\u03a2\u03a3"+
		"\u0005N\u0000\u0000\u03a3\u03a7\u0005e\u0000\u0000\u03a4\u03a6\u0003|"+
		">\u0000\u03a5\u03a4\u0001\u0000\u0000\u0000\u03a6\u03a9\u0001\u0000\u0000"+
		"\u0000\u03a7\u03a5\u0001\u0000\u0000\u0000\u03a7\u03a8\u0001\u0000\u0000"+
		"\u0000\u03a8\u03aa\u0001\u0000\u0000\u0000\u03a9\u03a7\u0001\u0000\u0000"+
		"\u0000\u03aa\u03ab\u0003t:\u0000\u03ab\u03ac\u0005J\u0000\u0000\u03ac"+
		"\u03ad\u0005O\u0000\u0000\u03ado\u0001\u0000\u0000\u0000\u03ae\u03af\u0005"+
		"N\u0000\u0000\u03af\u03b3\u0005e\u0000\u0000\u03b0\u03b2\u0003|>\u0000"+
		"\u03b1\u03b0\u0001\u0000\u0000\u0000\u03b2\u03b5\u0001\u0000\u0000\u0000"+
		"\u03b3\u03b1\u0001\u0000\u0000\u0000\u03b3\u03b4\u0001\u0000\u0000\u0000"+
		"\u03b4\u03b6\u0001\u0000\u0000\u0000\u03b5\u03b3\u0001\u0000\u0000\u0000"+
		"\u03b6\u03b7\u0005J\u0000\u0000\u03b7\u03b8\u0005O\u0000\u0000\u03b8q"+
		"\u0001\u0000\u0000\u0000\u03b9\u03ba\u0005N\u0000\u0000\u03ba\u03be\u0005"+
		"e\u0000\u0000\u03bb\u03bd\u0003|>\u0000\u03bc\u03bb\u0001\u0000\u0000"+
		"\u0000\u03bd\u03c0\u0001\u0000\u0000\u0000\u03be\u03bc\u0001\u0000\u0000"+
		"\u0000\u03be\u03bf\u0001\u0000\u0000\u0000\u03bf\u03c1\u0001\u0000\u0000"+
		"\u0000\u03c0\u03be\u0001\u0000\u0000\u0000\u03c1\u03c2\u0005O\u0000\u0000"+
		"\u03c2s\u0001\u0000\u0000\u0000\u03c3\u03d6\u0003j5\u0000\u03c4\u03d6"+
		"\u0003z=\u0000\u03c5\u03d6\u0005e\u0000\u0000\u03c6\u03c8\u0003x<\u0000"+
		"\u03c7\u03c6\u0001\u0000\u0000\u0000\u03c7\u03c8\u0001\u0000\u0000\u0000"+
		"\u03c8\u03d2\u0001\u0000\u0000\u0000\u03c9\u03cc\u0003j5\u0000\u03ca\u03cc"+
		"\u0003v;\u0000\u03cb\u03c9\u0001\u0000\u0000\u0000\u03cb\u03ca\u0001\u0000"+
		"\u0000\u0000\u03cc\u03ce\u0001\u0000\u0000\u0000\u03cd\u03cf\u0003x<\u0000"+
		"\u03ce\u03cd\u0001\u0000\u0000\u0000\u03ce\u03cf\u0001\u0000\u0000\u0000"+
		"\u03cf\u03d1\u0001\u0000\u0000\u0000\u03d0\u03cb\u0001\u0000\u0000\u0000"+
		"\u03d1\u03d4\u0001\u0000\u0000\u0000\u03d2\u03d0\u0001\u0000\u0000\u0000"+
		"\u03d2\u03d3\u0001\u0000\u0000\u0000\u03d3\u03d6\u0001\u0000\u0000\u0000"+
		"\u03d4\u03d2\u0001\u0000\u0000\u0000\u03d5\u03c3\u0001\u0000\u0000\u0000"+
		"\u03d5\u03c4\u0001\u0000\u0000\u0000\u03d5\u03c5\u0001\u0000\u0000\u0000"+
		"\u03d5\u03c7\u0001\u0000\u0000\u0000\u03d6u\u0001\u0000\u0000\u0000\u03d7"+
		"\u03db\u0005Z\u0000\u0000\u03d8\u03da\u0003D\"\u0000\u03d9\u03d8\u0001"+
		"\u0000\u0000\u0000\u03da\u03dd\u0001\u0000\u0000\u0000\u03db\u03d9\u0001"+
		"\u0000\u0000\u0000\u03db\u03dc\u0001\u0000\u0000\u0000\u03dc\u03de\u0001"+
		"\u0000\u0000\u0000\u03dd\u03db\u0001\u0000\u0000\u0000\u03de\u03df\u0005"+
		"[\u0000\u0000\u03dfw\u0001\u0000\u0000\u0000\u03e0\u03e2\b\u0006\u0000"+
		"\u0000\u03e1\u03e0\u0001\u0000\u0000\u0000\u03e2\u03e3\u0001\u0000\u0000"+
		"\u0000\u03e3\u03e1\u0001\u0000\u0000\u0000\u03e3\u03e4\u0001\u0000\u0000"+
		"\u0000\u03e4y\u0001\u0000\u0000\u0000\u03e5\u03e6\u0005`\u0000\u0000\u03e6"+
		"\u03e7\u0003D\"\u0000\u03e7\u03e8\u0005a\u0000\u0000\u03e8{\u0001\u0000"+
		"\u0000\u0000\u03e9\u03ef\u0003~?\u0000\u03ea\u03ef\u0003\u0082A\u0000"+
		"\u03eb\u03ef\u0003\u0084B\u0000\u03ec\u03ef\u0003\u0086C\u0000\u03ed\u03ef"+
		"\u0003\u0088D\u0000\u03ee\u03e9\u0001\u0000\u0000\u0000\u03ee\u03ea\u0001"+
		"\u0000\u0000\u0000\u03ee\u03eb\u0001\u0000\u0000\u0000\u03ee\u03ec\u0001"+
		"\u0000\u0000\u0000\u03ee\u03ed\u0001\u0000\u0000\u0000\u03ef\u03f0\u0001"+
		"\u0000\u0000\u0000\u03f0\u03ee\u0001\u0000\u0000\u0000\u03f0\u03f1\u0001"+
		"\u0000\u0000\u0000\u03f1\u03f3\u0001\u0000\u0000\u0000\u03f2\u03f4\u0005"+
		"@\u0000\u0000\u03f3\u03f2\u0001\u0000\u0000\u0000\u03f3\u03f4\u0001\u0000"+
		"\u0000\u0000\u03f4}\u0001\u0000\u0000\u0000\u03f5\u03f6\u0005I\u0000\u0000"+
		"\u03f6\u03f7\u0003\u0080@\u0000\u03f7\u03f8\u0005F\u0000\u0000\u03f8\u03f9"+
		"\u0005b\u0000\u0000\u03f9\u007f\u0001\u0000\u0000\u0000\u03fa\u0400\u0005"+
		"1\u0000\u0000\u03fb\u0400\u00053\u0000\u0000\u03fc\u0400\u00052\u0000"+
		"\u0000\u03fd\u0400\u00058\u0000\u0000\u03fe\u0400\u00057\u0000\u0000\u03ff"+
		"\u03fa\u0001\u0000\u0000\u0000\u03ff\u03fb\u0001\u0000\u0000\u0000\u03ff"+
		"\u03fc\u0001\u0000\u0000\u0000\u03ff\u03fd\u0001\u0000\u0000\u0000\u03ff"+
		"\u03fe\u0001\u0000\u0000\u0000\u0400\u0081\u0001\u0000\u0000\u0000\u0401"+
		"\u0402\u0005e\u0000\u0000\u0402\u0403\u0005F\u0000\u0000\u0403\u0409\u0003"+
		">\u001f\u0000\u0404\u0405\u0005e\u0000\u0000\u0405\u0406\u0005F\u0000"+
		"\u0000\u0406\u0409\u0005b\u0000\u0000\u0407\u0409\u0005e\u0000\u0000\u0408"+
		"\u0401\u0001\u0000\u0000\u0000\u0408\u0404\u0001\u0000\u0000\u0000\u0408"+
		"\u0407\u0001\u0000\u0000\u0000\u0409\u0083\u0001\u0000\u0000\u0000\u040a"+
		"\u040b\u0005\\\u0000\u0000\u040b\u040c\u0005e\u0000\u0000\u040c\u040d"+
		"\u0005]\u0000\u0000\u040d\u040e\u0005F\u0000\u0000\u040e\u040f\u0005b"+
		"\u0000\u0000\u040f\u0085\u0001\u0000\u0000\u0000\u0410\u0411\u0005^\u0000"+
		"\u0000\u0411\u0412\u0005e\u0000\u0000\u0412\u0413\u0005_\u0000\u0000\u0413"+
		"\u0416\u0005F\u0000\u0000\u0414\u0417\u0005b\u0000\u0000\u0415\u0417\u0003"+
		"z=\u0000\u0416\u0414\u0001\u0000\u0000\u0000\u0416\u0415\u0001\u0000\u0000"+
		"\u0000\u0417\u0087\u0001\u0000\u0000\u0000\u0418\u0419\u0005\u000b\u0000"+
		"\u0000\u0419\u041a\u0005F\u0000\u0000\u041a\u041b\u0005b\u0000\u0000\u041b"+
		"\u0089\u0001\u0000\u0000\u0000\u041c\u041d\u0007\u0007\u0000\u0000\u041d"+
		"\u008b\u0001\u0000\u0000\u0000\u041e\u041f\u0007\b\u0000\u0000\u041f\u008d"+
		"\u0001\u0000\u0000\u0000\u0420\u0421\u0007\t\u0000\u0000\u0421\u008f\u0001"+
		"\u0000\u0000\u0000\u0422\u0423\u0007\n\u0000\u0000\u0423\u0091\u0001\u0000"+
		"\u0000\u0000\u008e\u0095\u00a7\u00a9\u00af\u00b4\u00bb\u00bf\u00ca\u00cd"+
		"\u00d2\u00df\u00e8\u00ec\u00ee\u00f7\u00fc\u0102\u0108\u010b\u0110\u0118"+
		"\u011c\u011e\u0123\u0126\u012d\u0137\u0139\u013c\u013f\u0142\u0148\u0150"+
		"\u0153\u0159\u0161\u0166\u016b\u0170\u0173\u0178\u0180\u018a\u018e\u0195"+
		"\u019f\u01aa\u01ae\u01b0\u01b4\u01be\u01c2\u01c7\u01cc\u01ce\u01d3\u01d7"+
		"\u01de\u01e2\u01ec\u01f0\u01f7\u01f9\u0201\u0207\u0216\u021a\u021c\u0224"+
		"\u022a\u0232\u0236\u0238\u0251\u0255\u0259\u0278\u027a\u0285\u0289\u028c"+
		"\u029f\u02ab\u02af\u02b3\u02bb\u02c2\u02cc\u02d0\u02d4\u02dc\u02e4\u02e9"+
		"\u02ee\u02f3\u02f8\u02fd\u02ff\u0308\u030b\u030f\u0315\u0318\u031b\u0322"+
		"\u0327\u032a\u032e\u0334\u0338\u033e\u0343\u0347\u034c\u0350\u035a\u0360"+
		"\u0364\u0368\u0373\u0377\u0387\u038d\u0394\u0397\u039e\u03a7\u03b3\u03be"+
		"\u03c7\u03cb\u03ce\u03d2\u03d5\u03db\u03e3\u03ee\u03f0\u03f3\u03ff\u0408"+
		"\u0416";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}