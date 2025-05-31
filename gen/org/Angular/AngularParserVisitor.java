// Generated from C:/Users/DELL/IdeaProjects/Angular/src/main/java/org/Angular/AngularParser.g4 by ANTLR 4.13.2
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
	 * Visit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportStatement(AngularParser.ExportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(AngularParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(AngularParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(AngularParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(AngularParser.AssignmentContext ctx);
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
	 * Visit a parse tree produced by {@link AngularParser#argumentContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentContent(AngularParser.ArgumentContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(AngularParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(AngularParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(AngularParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(AngularParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AngularParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentBody(AngularParser.ComponentBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(AngularParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(AngularParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#callFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunction(AngularParser.CallFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#jsxElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxElement(AngularParser.JsxElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#openingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpeningTag(AngularParser.OpeningTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#closingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosingTag(AngularParser.ClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#selfClosingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingTag(AngularParser.SelfClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#jsxContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxContent(AngularParser.JsxContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interpolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolation(AngularParser.InterpolationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#jsxAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxAttributes(AngularParser.JsxAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#angularDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularDirective(AngularParser.AngularDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective(AngularParser.DirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#jsxAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxAttribute(AngularParser.JsxAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#jsxEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxEvent(AngularParser.JsxEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#jsxBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxBinding(AngularParser.JsxBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#jsxClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxClass(AngularParser.JsxClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AngularParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(AngularParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(AngularParser.PrintStatementContext ctx);
}