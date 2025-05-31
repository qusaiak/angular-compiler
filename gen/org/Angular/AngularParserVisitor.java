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
	 * Visit a parse tree produced by the {@code ProgramSt}
	 * labeled alternative in {@link AngularParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramSt(AngularParser.ProgramStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportStatementSt}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatementSt(AngularParser.ImportStatementStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportType_ID}
	 * labeled alternative in {@link AngularParser#importType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportType_ID(AngularParser.ImportType_IDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportType_Multiple}
	 * labeled alternative in {@link AngularParser#importType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportType_Multiple(AngularParser.ImportType_MultipleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExportStatementSt}
	 * labeled alternative in {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportStatementSt(AngularParser.ExportStatementStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExportType_Object}
	 * labeled alternative in {@link AngularParser#exportType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportType_Object(AngularParser.ExportType_ObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExportType_Multiple}
	 * labeled alternative in {@link AngularParser#exportType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportType_Multiple(AngularParser.ExportType_MultipleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclarationSt}
	 * labeled alternative in {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationSt(AngularParser.VariableDeclarationStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableValue_Value}
	 * labeled alternative in {@link AngularParser#variableValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableValue_Value(AngularParser.VariableValue_ValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableValue_Array}
	 * labeled alternative in {@link AngularParser#variableValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableValue_Array(AngularParser.VariableValue_ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableValue_Object}
	 * labeled alternative in {@link AngularParser#variableValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableValue_Object(AngularParser.VariableValue_ObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableValue_Function}
	 * labeled alternative in {@link AngularParser#variableValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableValue_Function(AngularParser.VariableValue_FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDeclarationSt}
	 * labeled alternative in {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclarationSt(AngularParser.ClassDeclarationStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDeclarationSt}
	 * labeled alternative in {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclarationSt(AngularParser.FunctionDeclarationStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComponentDeclaration_Decorator}
	 * labeled alternative in {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDeclaration_Decorator(AngularParser.ComponentDeclaration_DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComponentDeclaration_Body}
	 * labeled alternative in {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDeclaration_Body(AngularParser.ComponentDeclaration_BodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Value_Type}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_Type(AngularParser.Value_TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Value_Array}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_Array(AngularParser.Value_ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Value_Object}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_Object(AngularParser.Value_ObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Value_JsxElement}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_JsxElement(AngularParser.Value_JsxElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Value_AngularDirective}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_AngularDirective(AngularParser.Value_AngularDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Value_Interpolation}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_Interpolation(AngularParser.Value_InterpolationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArraySt}
	 * labeled alternative in {@link AngularParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraySt(AngularParser.ArrayStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectSt}
	 * labeled alternative in {@link AngularParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectSt(AngularParser.ObjectStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassBodySt}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodySt(AngularParser.ClassBodyStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assignment_Type}
	 * labeled alternative in {@link AngularParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_Type(AngularParser.Assignment_TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assignment_Value}
	 * labeled alternative in {@link AngularParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_Value(AngularParser.Assignment_ValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assignment_Value2}
	 * labeled alternative in {@link AngularParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_Value2(AngularParser.Assignment_Value2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Decorator_WithArguments}
	 * labeled alternative in {@link AngularParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator_WithArguments(AngularParser.Decorator_WithArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Decorator_Simple}
	 * labeled alternative in {@link AngularParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator_Simple(AngularParser.Decorator_SimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecoratorArgumentsSt}
	 * labeled alternative in {@link AngularParser#decoratorArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorArgumentsSt(AngularParser.DecoratorArgumentsStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentContent_Export}
	 * labeled alternative in {@link AngularParser#argumentContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentContent_Export(AngularParser.ArgumentContent_ExportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentContent_Function}
	 * labeled alternative in {@link AngularParser#argumentContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentContent_Function(AngularParser.ArgumentContent_FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentContent_Variable}
	 * labeled alternative in {@link AngularParser#argumentContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentContent_Variable(AngularParser.ArgumentContent_VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentContent_Class}
	 * labeled alternative in {@link AngularParser#argumentContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentContent_Class(AngularParser.ArgumentContent_ClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentContent_Block}
	 * labeled alternative in {@link AngularParser#argumentContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentContent_Block(AngularParser.ArgumentContent_BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentContent_Selector}
	 * labeled alternative in {@link AngularParser#argumentContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentContent_Selector(AngularParser.ArgumentContent_SelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentContent_Template}
	 * labeled alternative in {@link AngularParser#argumentContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentContent_Template(AngularParser.ArgumentContent_TemplateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstructorDeclarationSt}
	 * labeled alternative in {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclarationSt(AngularParser.ConstructorDeclarationStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parameters_Standard}
	 * labeled alternative in {@link AngularParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters_Standard(AngularParser.Parameters_StandardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parameters_ObjectDestructuring}
	 * labeled alternative in {@link AngularParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters_ObjectDestructuring(AngularParser.Parameters_ObjectDestructuringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionBodySt}
	 * labeled alternative in {@link AngularParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBodySt(AngularParser.FunctionBodyStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStatementSt}
	 * labeled alternative in {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatementSt(AngularParser.ReturnStatementStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Operation_Plus}
	 * labeled alternative in {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation_Plus(AngularParser.Operation_PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Operation_Minus}
	 * labeled alternative in {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation_Minus(AngularParser.Operation_MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Operation_Multiply}
	 * labeled alternative in {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation_Multiply(AngularParser.Operation_MultiplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Operation_Divide}
	 * labeled alternative in {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation_Divide(AngularParser.Operation_DivideContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Operation_Equals}
	 * labeled alternative in {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation_Equals(AngularParser.Operation_EqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Operation_NotEquals}
	 * labeled alternative in {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation_NotEquals(AngularParser.Operation_NotEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Operation_GreaterThan}
	 * labeled alternative in {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation_GreaterThan(AngularParser.Operation_GreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Operation_GreaterEqual}
	 * labeled alternative in {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation_GreaterEqual(AngularParser.Operation_GreaterEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Operation_LessThan}
	 * labeled alternative in {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation_LessThan(AngularParser.Operation_LessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Operation_LessEqual}
	 * labeled alternative in {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation_LessEqual(AngularParser.Operation_LessEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Statement_VariableDeclaration}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_VariableDeclaration(AngularParser.Statement_VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Statement_IfStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_IfStatement(AngularParser.Statement_IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Statement_ForStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_ForStatement(AngularParser.Statement_ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Statement_WhileStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_WhileStatement(AngularParser.Statement_WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Statement_FunctionCall}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_FunctionCall(AngularParser.Statement_FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Statement_Print}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_Print(AngularParser.Statement_PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Statement_JsxElement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_JsxElement(AngularParser.Statement_JsxElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Statement_AngularDirective}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_AngularDirective(AngularParser.Statement_AngularDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Statement_Return}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_Return(AngularParser.Statement_ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Statement_Assignment}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_Assignment(AngularParser.Statement_AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComponentBodySt}
	 * labeled alternative in {@link AngularParser#componentBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentBodySt(AngularParser.ComponentBodyStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatementSt}
	 * labeled alternative in {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatementSt(AngularParser.IfStatementStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Condition_Boolean}
	 * labeled alternative in {@link AngularParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_Boolean(AngularParser.Condition_BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Condition_Simple}
	 * labeled alternative in {@link AngularParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_Simple(AngularParser.Condition_SimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStatementSt}
	 * labeled alternative in {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementSt(AngularParser.ForStatementStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStatementSt}
	 * labeled alternative in {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementSt(AngularParser.WhileStatementStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallFunctionSt}
	 * labeled alternative in {@link AngularParser#callFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunctionSt(AngularParser.CallFunctionStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JsxElement_Tagged}
	 * labeled alternative in {@link AngularParser#jsxElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxElement_Tagged(AngularParser.JsxElement_TaggedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JsxElement_SelfClosing}
	 * labeled alternative in {@link AngularParser#jsxElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxElement_SelfClosing(AngularParser.JsxElement_SelfClosingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpeningTagSt}
	 * labeled alternative in {@link AngularParser#openingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpeningTagSt(AngularParser.OpeningTagStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClosingTagSt}
	 * labeled alternative in {@link AngularParser#closingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosingTagSt(AngularParser.ClosingTagStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelfClosingTagSt}
	 * labeled alternative in {@link AngularParser#selfClosingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingTagSt(AngularParser.SelfClosingTagStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JsxContent_Element}
	 * labeled alternative in {@link AngularParser#jsxContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxContent_Element(AngularParser.JsxContent_ElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JsxContent_Interpolation}
	 * labeled alternative in {@link AngularParser#jsxContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxContent_Interpolation(AngularParser.JsxContent_InterpolationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JsxContent_ID}
	 * labeled alternative in {@link AngularParser#jsxContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxContent_ID(AngularParser.JsxContent_IDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InterpolationSt}
	 * labeled alternative in {@link AngularParser#interpolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolationSt(AngularParser.InterpolationStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JsxAttributesSt}
	 * labeled alternative in {@link AngularParser#jsxAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxAttributesSt(AngularParser.JsxAttributesStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AngularDirectiveSt}
	 * labeled alternative in {@link AngularParser#angularDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularDirectiveSt(AngularParser.AngularDirectiveStContext ctx);
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
	 * Visit a parse tree produced by the {@code JsxAttributeSt}
	 * labeled alternative in {@link AngularParser#jsxAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxAttributeSt(AngularParser.JsxAttributeStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JsxEventSt}
	 * labeled alternative in {@link AngularParser#jsxEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxEventSt(AngularParser.JsxEventStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JsxBindingSt}
	 * labeled alternative in {@link AngularParser#jsxBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxBindingSt(AngularParser.JsxBindingStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JsxClassSt}
	 * labeled alternative in {@link AngularParser#jsxClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxClassSt(AngularParser.JsxClassStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_Array}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_Array(AngularParser.Expression_ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_Boolean}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_Boolean(AngularParser.Expression_BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_String}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_String(AngularParser.Expression_StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_Double}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_Double(AngularParser.Expression_DoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_FunctionCall}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_FunctionCall(AngularParser.Expression_FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_Value}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_Value(AngularParser.Expression_ValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_ID}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_ID(AngularParser.Expression_IDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_Operation}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_Operation(AngularParser.Expression_OperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_Int}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_Int(AngularParser.Expression_IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_MemberAccess}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_MemberAccess(AngularParser.Expression_MemberAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_Object}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_Object(AngularParser.Expression_ObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Type_ID}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_ID(AngularParser.Type_IDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Type_String}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_String(AngularParser.Type_StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Type_Int}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_Int(AngularParser.Type_IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Type_Double}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_Double(AngularParser.Type_DoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Type_Boolean}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_Boolean(AngularParser.Type_BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Type_Any}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_Any(AngularParser.Type_AnyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Type_Public}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_Public(AngularParser.Type_PublicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Type_Private}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_Private(AngularParser.Type_PrivateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Type_Void}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_Void(AngularParser.Type_VoidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Type_Number}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_Number(AngularParser.Type_NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Type_Null}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_Null(AngularParser.Type_NullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStatementSt}
	 * labeled alternative in {@link AngularParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatementSt(AngularParser.PrintStatementStContext ctx);
}