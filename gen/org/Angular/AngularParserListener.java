// Generated from C:/Users/DELL/IdeaProjects/Angular/src/main/java/org/Angular/AngularParser.g4 by ANTLR 4.13.2
package org.Angular;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularParser}.
 */
public interface AngularParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AngularParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportStatement(AngularParser.ExportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportStatement(AngularParser.ExportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(AngularParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(AngularParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(AngularParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(AngularParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(AngularParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(AngularParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(AngularParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(AngularParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(AngularParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(AngularParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#decoratorArguments}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorArguments(AngularParser.DecoratorArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#decoratorArguments}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorArguments(AngularParser.DecoratorArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#argumentContent}.
	 * @param ctx the parse tree
	 */
	void enterArgumentContent(AngularParser.ArgumentContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#argumentContent}.
	 * @param ctx the parse tree
	 */
	void exitArgumentContent(AngularParser.ArgumentContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(AngularParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(AngularParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(AngularParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(AngularParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(AngularParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(AngularParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(AngularParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(AngularParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AngularParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AngularParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void enterComponentBody(AngularParser.ComponentBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void exitComponentBody(AngularParser.ComponentBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(AngularParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(AngularParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(AngularParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(AngularParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void enterCallFunction(AngularParser.CallFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void exitCallFunction(AngularParser.CallFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#jsxElement}.
	 * @param ctx the parse tree
	 */
	void enterJsxElement(AngularParser.JsxElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#jsxElement}.
	 * @param ctx the parse tree
	 */
	void exitJsxElement(AngularParser.JsxElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#openingTag}.
	 * @param ctx the parse tree
	 */
	void enterOpeningTag(AngularParser.OpeningTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#openingTag}.
	 * @param ctx the parse tree
	 */
	void exitOpeningTag(AngularParser.OpeningTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#closingTag}.
	 * @param ctx the parse tree
	 */
	void enterClosingTag(AngularParser.ClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#closingTag}.
	 * @param ctx the parse tree
	 */
	void exitClosingTag(AngularParser.ClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingTag(AngularParser.SelfClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingTag(AngularParser.SelfClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#jsxContent}.
	 * @param ctx the parse tree
	 */
	void enterJsxContent(AngularParser.JsxContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#jsxContent}.
	 * @param ctx the parse tree
	 */
	void exitJsxContent(AngularParser.JsxContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void enterInterpolation(AngularParser.InterpolationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void exitInterpolation(AngularParser.InterpolationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#jsxAttributes}.
	 * @param ctx the parse tree
	 */
	void enterJsxAttributes(AngularParser.JsxAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#jsxAttributes}.
	 * @param ctx the parse tree
	 */
	void exitJsxAttributes(AngularParser.JsxAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#angularDirective}.
	 * @param ctx the parse tree
	 */
	void enterAngularDirective(AngularParser.AngularDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#angularDirective}.
	 * @param ctx the parse tree
	 */
	void exitAngularDirective(AngularParser.AngularDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(AngularParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(AngularParser.DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#jsxAttribute}.
	 * @param ctx the parse tree
	 */
	void enterJsxAttribute(AngularParser.JsxAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#jsxAttribute}.
	 * @param ctx the parse tree
	 */
	void exitJsxAttribute(AngularParser.JsxAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#jsxEvent}.
	 * @param ctx the parse tree
	 */
	void enterJsxEvent(AngularParser.JsxEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#jsxEvent}.
	 * @param ctx the parse tree
	 */
	void exitJsxEvent(AngularParser.JsxEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#jsxBinding}.
	 * @param ctx the parse tree
	 */
	void enterJsxBinding(AngularParser.JsxBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#jsxBinding}.
	 * @param ctx the parse tree
	 */
	void exitJsxBinding(AngularParser.JsxBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#jsxClass}.
	 * @param ctx the parse tree
	 */
	void enterJsxClass(AngularParser.JsxClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#jsxClass}.
	 * @param ctx the parse tree
	 */
	void exitJsxClass(AngularParser.JsxClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AngularParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AngularParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(AngularParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(AngularParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(AngularParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(AngularParser.PrintStatementContext ctx);
}