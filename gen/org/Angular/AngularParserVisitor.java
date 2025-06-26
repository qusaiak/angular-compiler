// Generated from C:/compiler/compiler/src/main/java/org/Angular/AngularParser.g4 by ANTLR 4.13.2
package org.Angular;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AngularParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AngularParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockSt(AngularParser.BlockStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecoratorSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorSt(AngularParser.DecoratorStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStatementSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatementSt(AngularParser.PrintStatementStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAccessSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccessSt(AngularParser.ArrayAccessStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableStatementSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableStatementSt(AngularParser.VariableStatementStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportStatementSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatementSt(AngularParser.ImportStatementStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExportStatementSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportStatementSt(AngularParser.ExportStatementStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatementSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatementSt(AngularParser.IfStatementStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IterationStatementSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatementSt(AngularParser.IterationStatementStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SwitchStatementSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatementSt(AngularParser.SwitchStatementStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDeclartionSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclartionSt(AngularParser.FunctionDeclartionStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallSt(AngularParser.FunctionCallStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionSt(AngularParser.ExpressionStContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(AngularParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(AngularParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(AngularParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(AngularParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importDefaultSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDefaultSpecifier(AngularParser.ImportDefaultSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importNamespaceSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportNamespaceSpecifier(AngularParser.ImportNamespaceSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importNamedSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportNamedSpecifier(AngularParser.ImportNamedSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSpecifier(AngularParser.ImportSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportStatement(AngularParser.ExportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#exportDefaultDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportDefaultDeclaration(AngularParser.ExportDefaultDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#exportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportDeclaration(AngularParser.ExportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#exportListDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportListDeclaration(AngularParser.ExportListDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#exportSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportSpecifier(AngularParser.ExportSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecoratedProperty}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratedProperty(AngularParser.DecoratedPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecoratedMethod}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratedMethod(AngularParser.DecoratedMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstructorMember}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorMember(AngularParser.ConstructorMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMethodDeclaration(AngularParser.ClassMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(AngularParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(AngularParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#accessModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessModifier(AngularParser.AccessModifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclarationVr}
	 * labeled alternative in {@link AngularParser#variableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationVr(AngularParser.VariableDeclarationVrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclarationConstVr}
	 * labeled alternative in {@link AngularParser#variableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationConstVr(AngularParser.VariableDeclarationConstVrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableTypedAndAssignedConst}
	 * labeled alternative in {@link AngularParser#variableDeclarationConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableTypedAndAssignedConst(AngularParser.VariableTypedAndAssignedConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableAssignedConstOnly}
	 * labeled alternative in {@link AngularParser#variableDeclarationConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignedConstOnly(AngularParser.VariableAssignedConstOnlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableTypedAndMaybeAssigned}
	 * labeled alternative in {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableTypedAndMaybeAssigned(AngularParser.VariableTypedAndMaybeAssignedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableUntyped}
	 * labeled alternative in {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableUntyped(AngularParser.VariableUntypedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierVt}
	 * labeled alternative in {@link AngularParser#variableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierVt(AngularParser.IdentifierVtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayDeclarationVt}
	 * labeled alternative in {@link AngularParser#variableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclarationVt(AngularParser.ArrayDeclarationVtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectDeclarationVt}
	 * labeled alternative in {@link AngularParser#variableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectDeclarationVt(AngularParser.ObjectDeclarationVtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeWithArray}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeWithArray(AngularParser.TypeWithArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeWithObject}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeWithObject(AngularParser.TypeWithObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InlineObjectArray}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineObjectArray(AngularParser.InlineObjectArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#inlineObjectType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineObjectType(AngularParser.InlineObjectTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#typeMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeMember(AngularParser.TypeMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arraySuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraySuffix(AngularParser.ArraySuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#objectDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectDeclaration(AngularParser.ObjectDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamedObjectProperty}
	 * labeled alternative in {@link AngularParser#objectProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedObjectProperty(AngularParser.NamedObjectPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShorthandOrDynamicProperty}
	 * labeled alternative in {@link AngularParser#objectProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShorthandOrDynamicProperty(AngularParser.ShorthandOrDynamicPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclaration(AngularParser.ArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(AngularParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(AngularParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(AngularParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpression(AngularParser.TernaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(AngularParser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(AngularParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(AngularParser.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(AngularParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDotExpression(AngularParser.MemberDotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(AngularParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecreaseExpression(AngularParser.PreDecreaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakExpression(AngularParser.BreakExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(AngularParser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlBodyExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlBodyExpression(AngularParser.HtmlBodyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnExpression(AngularParser.ReturnExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpression(AngularParser.FunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecreaseExpression(AngularParser.PostDecreaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpression(AngularParser.ValueExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpression(AngularParser.ArrayExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParameterAsExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterAsExpression(AngularParser.ParameterAsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(AngularParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAccessExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccessExpression(AngularParser.ArrayAccessExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectExpression(AngularParser.ObjectExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(AngularParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#elseIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStatement(AngularParser.ElseIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(AngularParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoStatement}
	 * labeled alternative in {@link AngularParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(AngularParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link AngularParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link AngularParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(AngularParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForInStatement}
	 * labeled alternative in {@link AngularParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInStatement(AngularParser.ForInStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(AngularParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#caseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseClause(AngularParser.CaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#defaultClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultClause(AngularParser.DefaultClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(AngularParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnExpressionOnly}
	 * labeled alternative in {@link AngularParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnExpressionOnly(AngularParser.ReturnExpressionOnlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnObjectLiteral}
	 * labeled alternative in {@link AngularParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnObjectLiteral(AngularParser.ReturnObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnArrayLiteral}
	 * labeled alternative in {@link AngularParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnArrayLiteral(AngularParser.ReturnArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnFunctionCall}
	 * labeled alternative in {@link AngularParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnFunctionCall(AngularParser.ReturnFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Normal_Function}
	 * labeled alternative in {@link AngularParser#functionDeclartion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormal_Function(AngularParser.Normal_FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Anoymous_Function}
	 * labeled alternative in {@link AngularParser#functionDeclartion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnoymous_Function(AngularParser.Anoymous_FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Arrow_Function}
	 * labeled alternative in {@link AngularParser#functionDeclartion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrow_Function(AngularParser.Arrow_FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code New_type_function}
	 * labeled alternative in {@link AngularParser#functionDeclartion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_type_function(AngularParser.New_type_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#normalFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalFunction(AngularParser.NormalFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#anoymousFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnoymousFunction(AngularParser.AnoymousFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunction(AngularParser.ArrowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueArrow}
	 * labeled alternative in {@link AngularParser#arrowParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueArrow(AngularParser.ValueArrowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionArrow}
	 * labeled alternative in {@link AngularParser#arrowParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionArrow(AngularParser.ExpressionArrowContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(AngularParser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#decoratorArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorArguments(AngularParser.DecoratorArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelectorArgument}
	 * labeled alternative in {@link AngularParser#decoratorArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorArgument(AngularParser.SelectorArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Template_UrlArgument}
	 * labeled alternative in {@link AngularParser#decoratorArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_UrlArgument(AngularParser.Template_UrlArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateArgument}
	 * labeled alternative in {@link AngularParser#decoratorArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateArgument(AngularParser.TemplateArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlBodyWithDiv_L}
	 * labeled alternative in {@link AngularParser#htmlBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlBodyWithDiv_L(AngularParser.HtmlBodyWithDiv_LContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlBodyNestedDiv_L}
	 * labeled alternative in {@link AngularParser#htmlBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlBodyNestedDiv_L(AngularParser.HtmlBodyNestedDiv_LContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlBodyDivAlone_L}
	 * labeled alternative in {@link AngularParser#htmlBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlBodyDivAlone_L(AngularParser.HtmlBodyDivAlone_LContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlBodyNoDiv_L}
	 * labeled alternative in {@link AngularParser#htmlBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlBodyNoDiv_L(AngularParser.HtmlBodyNoDiv_LContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlBodyWithDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlBodyWithDiv(AngularParser.HtmlBodyWithDivContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlBodyNestedDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlBodyNestedDiv(AngularParser.HtmlBodyNestedDivContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlBodyDivAlone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlBodyDivAlone(AngularParser.HtmlBodyDivAloneContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlBodyNoDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlBodyNoDiv(AngularParser.HtmlBodyNoDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlContent_Element}
	 * labeled alternative in {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent_Element(AngularParser.HtmlContent_ElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlContent_Interpolation}
	 * labeled alternative in {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent_Interpolation(AngularParser.HtmlContent_InterpolationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlContent_ID}
	 * labeled alternative in {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent_ID(AngularParser.HtmlContent_IDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlContents}
	 * labeled alternative in {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContents(AngularParser.HtmlContentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlExpression(AngularParser.HtmlExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlText(AngularParser.HtmlTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interpolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolation(AngularParser.InterpolationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttributes(AngularParser.HtmlAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#angularDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularDirective(AngularParser.AngularDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Directive_NgIf}
	 * labeled alternative in {@link AngularParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective_NgIf(AngularParser.Directive_NgIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Directive_NgSwitch}
	 * labeled alternative in {@link AngularParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective_NgSwitch(AngularParser.Directive_NgSwitchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Directive_NgFor}
	 * labeled alternative in {@link AngularParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective_NgFor(AngularParser.Directive_NgForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Directive_NgStyle}
	 * labeled alternative in {@link AngularParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective_NgStyle(AngularParser.Directive_NgStyleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Directive_NgClass}
	 * labeled alternative in {@link AngularParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective_NgClass(AngularParser.Directive_NgClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlAtteibute_Object}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAtteibute_Object(AngularParser.HtmlAtteibute_ObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlAtteibute_String}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAtteibute_String(AngularParser.HtmlAtteibute_StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlAtteibute_Identifier}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAtteibute_Identifier(AngularParser.HtmlAtteibute_IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlEvent(AngularParser.HtmlEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlBinding(AngularParser.HtmlBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlClass(AngularParser.HtmlClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#angularDecoratorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularDecoratorName(AngularParser.AngularDecoratorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#varHelpers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarHelpers(AngularParser.VarHelpersContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(AngularParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(AngularParser.TypeContext ctx);
}