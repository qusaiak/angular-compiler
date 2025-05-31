// Generated from C:/compiler/compiler/src/main/java/org/Angular/AngularParser.g4 by ANTLR 4.13.2
package org.Angular;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularParser}.
 */
public interface AngularParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code ProgramSt}
	 * labeled alternative in {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgramSt(AngularParser.ProgramStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProgramSt}
	 * labeled alternative in {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgramSt(AngularParser.ProgramStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportStatementSt}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatementSt(AngularParser.ImportStatementStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportStatementSt}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatementSt(AngularParser.ImportStatementStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportType_ID}
	 * labeled alternative in {@link AngularParser#importType}.
	 * @param ctx the parse tree
	 */
	void enterImportType_ID(AngularParser.ImportType_IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportType_ID}
	 * labeled alternative in {@link AngularParser#importType}.
	 * @param ctx the parse tree
	 */
	void exitImportType_ID(AngularParser.ImportType_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportType_Multiple}
	 * labeled alternative in {@link AngularParser#importType}.
	 * @param ctx the parse tree
	 */
	void enterImportType_Multiple(AngularParser.ImportType_MultipleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportType_Multiple}
	 * labeled alternative in {@link AngularParser#importType}.
	 * @param ctx the parse tree
	 */
	void exitImportType_Multiple(AngularParser.ImportType_MultipleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExportStatementSt}
	 * labeled alternative in {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportStatementSt(AngularParser.ExportStatementStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExportStatementSt}
	 * labeled alternative in {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportStatementSt(AngularParser.ExportStatementStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExportType_Object}
	 * labeled alternative in {@link AngularParser#exportType}.
	 * @param ctx the parse tree
	 */
	void enterExportType_Object(AngularParser.ExportType_ObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExportType_Object}
	 * labeled alternative in {@link AngularParser#exportType}.
	 * @param ctx the parse tree
	 */
	void exitExportType_Object(AngularParser.ExportType_ObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExportType_Multiple}
	 * labeled alternative in {@link AngularParser#exportType}.
	 * @param ctx the parse tree
	 */
	void enterExportType_Multiple(AngularParser.ExportType_MultipleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExportType_Multiple}
	 * labeled alternative in {@link AngularParser#exportType}.
	 * @param ctx the parse tree
	 */
	void exitExportType_Multiple(AngularParser.ExportType_MultipleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclarationSt}
	 * labeled alternative in {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationSt(AngularParser.VariableDeclarationStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclarationSt}
	 * labeled alternative in {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationSt(AngularParser.VariableDeclarationStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableValue_Value}
	 * labeled alternative in {@link AngularParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void enterVariableValue_Value(AngularParser.VariableValue_ValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableValue_Value}
	 * labeled alternative in {@link AngularParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void exitVariableValue_Value(AngularParser.VariableValue_ValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableValue_Array}
	 * labeled alternative in {@link AngularParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void enterVariableValue_Array(AngularParser.VariableValue_ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableValue_Array}
	 * labeled alternative in {@link AngularParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void exitVariableValue_Array(AngularParser.VariableValue_ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableValue_Object}
	 * labeled alternative in {@link AngularParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void enterVariableValue_Object(AngularParser.VariableValue_ObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableValue_Object}
	 * labeled alternative in {@link AngularParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void exitVariableValue_Object(AngularParser.VariableValue_ObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableValue_Function}
	 * labeled alternative in {@link AngularParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void enterVariableValue_Function(AngularParser.VariableValue_FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableValue_Function}
	 * labeled alternative in {@link AngularParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void exitVariableValue_Function(AngularParser.VariableValue_FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDeclarationSt}
	 * labeled alternative in {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclarationSt(AngularParser.ClassDeclarationStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDeclarationSt}
	 * labeled alternative in {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclarationSt(AngularParser.ClassDeclarationStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDeclarationSt}
	 * labeled alternative in {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclarationSt(AngularParser.FunctionDeclarationStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDeclarationSt}
	 * labeled alternative in {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclarationSt(AngularParser.FunctionDeclarationStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComponentDeclaration_Decorator}
	 * labeled alternative in {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterComponentDeclaration_Decorator(AngularParser.ComponentDeclaration_DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComponentDeclaration_Decorator}
	 * labeled alternative in {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitComponentDeclaration_Decorator(AngularParser.ComponentDeclaration_DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComponentDeclaration_Body}
	 * labeled alternative in {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterComponentDeclaration_Body(AngularParser.ComponentDeclaration_BodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComponentDeclaration_Body}
	 * labeled alternative in {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitComponentDeclaration_Body(AngularParser.ComponentDeclaration_BodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Value_Type}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue_Type(AngularParser.Value_TypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Value_Type}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue_Type(AngularParser.Value_TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Value_Array}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue_Array(AngularParser.Value_ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Value_Array}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue_Array(AngularParser.Value_ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Value_Object}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue_Object(AngularParser.Value_ObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Value_Object}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue_Object(AngularParser.Value_ObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Value_JsxElement}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue_JsxElement(AngularParser.Value_JsxElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Value_JsxElement}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue_JsxElement(AngularParser.Value_JsxElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Value_AngularDirective}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue_AngularDirective(AngularParser.Value_AngularDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Value_AngularDirective}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue_AngularDirective(AngularParser.Value_AngularDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Value_Interpolation}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue_Interpolation(AngularParser.Value_InterpolationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Value_Interpolation}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue_Interpolation(AngularParser.Value_InterpolationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArraySt}
	 * labeled alternative in {@link AngularParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArraySt(AngularParser.ArrayStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArraySt}
	 * labeled alternative in {@link AngularParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArraySt(AngularParser.ArrayStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectSt}
	 * labeled alternative in {@link AngularParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObjectSt(AngularParser.ObjectStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectSt}
	 * labeled alternative in {@link AngularParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObjectSt(AngularParser.ObjectStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassBodySt}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBodySt(AngularParser.ClassBodyStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassBodySt}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBodySt(AngularParser.ClassBodyStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assignment_Type}
	 * labeled alternative in {@link AngularParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_Type(AngularParser.Assignment_TypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignment_Type}
	 * labeled alternative in {@link AngularParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_Type(AngularParser.Assignment_TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assignment_Value}
	 * labeled alternative in {@link AngularParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_Value(AngularParser.Assignment_ValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignment_Value}
	 * labeled alternative in {@link AngularParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_Value(AngularParser.Assignment_ValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assignment_Value2}
	 * labeled alternative in {@link AngularParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_Value2(AngularParser.Assignment_Value2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignment_Value2}
	 * labeled alternative in {@link AngularParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_Value2(AngularParser.Assignment_Value2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Decorator_WithArguments}
	 * labeled alternative in {@link AngularParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator_WithArguments(AngularParser.Decorator_WithArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Decorator_WithArguments}
	 * labeled alternative in {@link AngularParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator_WithArguments(AngularParser.Decorator_WithArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Decorator_Simple}
	 * labeled alternative in {@link AngularParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator_Simple(AngularParser.Decorator_SimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Decorator_Simple}
	 * labeled alternative in {@link AngularParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator_Simple(AngularParser.Decorator_SimpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecoratorArgumentsSt}
	 * labeled alternative in {@link AngularParser#decoratorArguments}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorArgumentsSt(AngularParser.DecoratorArgumentsStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecoratorArgumentsSt}
	 * labeled alternative in {@link AngularParser#decoratorArguments}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorArgumentsSt(AngularParser.DecoratorArgumentsStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentContent_Export}
	 * labeled alternative in {@link AngularParser#argumentContent}.
	 * @param ctx the parse tree
	 */
	void enterArgumentContent_Export(AngularParser.ArgumentContent_ExportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentContent_Export}
	 * labeled alternative in {@link AngularParser#argumentContent}.
	 * @param ctx the parse tree
	 */
	void exitArgumentContent_Export(AngularParser.ArgumentContent_ExportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentContent_Function}
	 * labeled alternative in {@link AngularParser#argumentContent}.
	 * @param ctx the parse tree
	 */
	void enterArgumentContent_Function(AngularParser.ArgumentContent_FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentContent_Function}
	 * labeled alternative in {@link AngularParser#argumentContent}.
	 * @param ctx the parse tree
	 */
	void exitArgumentContent_Function(AngularParser.ArgumentContent_FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentContent_Variable}
	 * labeled alternative in {@link AngularParser#argumentContent}.
	 * @param ctx the parse tree
	 */
	void enterArgumentContent_Variable(AngularParser.ArgumentContent_VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentContent_Variable}
	 * labeled alternative in {@link AngularParser#argumentContent}.
	 * @param ctx the parse tree
	 */
	void exitArgumentContent_Variable(AngularParser.ArgumentContent_VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentContent_Class}
	 * labeled alternative in {@link AngularParser#argumentContent}.
	 * @param ctx the parse tree
	 */
	void enterArgumentContent_Class(AngularParser.ArgumentContent_ClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentContent_Class}
	 * labeled alternative in {@link AngularParser#argumentContent}.
	 * @param ctx the parse tree
	 */
	void exitArgumentContent_Class(AngularParser.ArgumentContent_ClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentContent_Block}
	 * labeled alternative in {@link AngularParser#argumentContent}.
	 * @param ctx the parse tree
	 */
	void enterArgumentContent_Block(AngularParser.ArgumentContent_BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentContent_Block}
	 * labeled alternative in {@link AngularParser#argumentContent}.
	 * @param ctx the parse tree
	 */
	void exitArgumentContent_Block(AngularParser.ArgumentContent_BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentContent_Selector}
	 * labeled alternative in {@link AngularParser#argumentContent}.
	 * @param ctx the parse tree
	 */
	void enterArgumentContent_Selector(AngularParser.ArgumentContent_SelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentContent_Selector}
	 * labeled alternative in {@link AngularParser#argumentContent}.
	 * @param ctx the parse tree
	 */
	void exitArgumentContent_Selector(AngularParser.ArgumentContent_SelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentContent_Template}
	 * labeled alternative in {@link AngularParser#argumentContent}.
	 * @param ctx the parse tree
	 */
	void enterArgumentContent_Template(AngularParser.ArgumentContent_TemplateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentContent_Template}
	 * labeled alternative in {@link AngularParser#argumentContent}.
	 * @param ctx the parse tree
	 */
	void exitArgumentContent_Template(AngularParser.ArgumentContent_TemplateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstructorDeclarationSt}
	 * labeled alternative in {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarationSt(AngularParser.ConstructorDeclarationStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstructorDeclarationSt}
	 * labeled alternative in {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarationSt(AngularParser.ConstructorDeclarationStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parameters_Standard}
	 * labeled alternative in {@link AngularParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters_Standard(AngularParser.Parameters_StandardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parameters_Standard}
	 * labeled alternative in {@link AngularParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters_Standard(AngularParser.Parameters_StandardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parameters_ObjectDestructuring}
	 * labeled alternative in {@link AngularParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters_ObjectDestructuring(AngularParser.Parameters_ObjectDestructuringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parameters_ObjectDestructuring}
	 * labeled alternative in {@link AngularParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters_ObjectDestructuring(AngularParser.Parameters_ObjectDestructuringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionBodySt}
	 * labeled alternative in {@link AngularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBodySt(AngularParser.FunctionBodyStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionBodySt}
	 * labeled alternative in {@link AngularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBodySt(AngularParser.FunctionBodyStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStatementSt}
	 * labeled alternative in {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatementSt(AngularParser.ReturnStatementStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStatementSt}
	 * labeled alternative in {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatementSt(AngularParser.ReturnStatementStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Operation_Plus}
	 * labeled alternative in {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation_Plus(AngularParser.Operation_PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Operation_Plus}
	 * labeled alternative in {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation_Plus(AngularParser.Operation_PlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Operation_Minus}
	 * labeled alternative in {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation_Minus(AngularParser.Operation_MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Operation_Minus}
	 * labeled alternative in {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation_Minus(AngularParser.Operation_MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Operation_Multiply}
	 * labeled alternative in {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation_Multiply(AngularParser.Operation_MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Operation_Multiply}
	 * labeled alternative in {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation_Multiply(AngularParser.Operation_MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Operation_Divide}
	 * labeled alternative in {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation_Divide(AngularParser.Operation_DivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Operation_Divide}
	 * labeled alternative in {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation_Divide(AngularParser.Operation_DivideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Operation_Equals}
	 * labeled alternative in {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation_Equals(AngularParser.Operation_EqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Operation_Equals}
	 * labeled alternative in {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation_Equals(AngularParser.Operation_EqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Operation_NotEquals}
	 * labeled alternative in {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation_NotEquals(AngularParser.Operation_NotEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Operation_NotEquals}
	 * labeled alternative in {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation_NotEquals(AngularParser.Operation_NotEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Operation_GreaterThan}
	 * labeled alternative in {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation_GreaterThan(AngularParser.Operation_GreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Operation_GreaterThan}
	 * labeled alternative in {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation_GreaterThan(AngularParser.Operation_GreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Operation_GreaterEqual}
	 * labeled alternative in {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation_GreaterEqual(AngularParser.Operation_GreaterEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Operation_GreaterEqual}
	 * labeled alternative in {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation_GreaterEqual(AngularParser.Operation_GreaterEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Operation_LessThan}
	 * labeled alternative in {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation_LessThan(AngularParser.Operation_LessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Operation_LessThan}
	 * labeled alternative in {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation_LessThan(AngularParser.Operation_LessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Operation_LessEqual}
	 * labeled alternative in {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation_LessEqual(AngularParser.Operation_LessEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Operation_LessEqual}
	 * labeled alternative in {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation_LessEqual(AngularParser.Operation_LessEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Statement_VariableDeclaration}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement_VariableDeclaration(AngularParser.Statement_VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Statement_VariableDeclaration}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement_VariableDeclaration(AngularParser.Statement_VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Statement_IfStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement_IfStatement(AngularParser.Statement_IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Statement_IfStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement_IfStatement(AngularParser.Statement_IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Statement_ForStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement_ForStatement(AngularParser.Statement_ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Statement_ForStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement_ForStatement(AngularParser.Statement_ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Statement_WhileStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement_WhileStatement(AngularParser.Statement_WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Statement_WhileStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement_WhileStatement(AngularParser.Statement_WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Statement_FunctionCall}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement_FunctionCall(AngularParser.Statement_FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Statement_FunctionCall}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement_FunctionCall(AngularParser.Statement_FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Statement_Print}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement_Print(AngularParser.Statement_PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Statement_Print}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement_Print(AngularParser.Statement_PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Statement_JsxElement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement_JsxElement(AngularParser.Statement_JsxElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Statement_JsxElement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement_JsxElement(AngularParser.Statement_JsxElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Statement_AngularDirective}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement_AngularDirective(AngularParser.Statement_AngularDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Statement_AngularDirective}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement_AngularDirective(AngularParser.Statement_AngularDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Statement_Return}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement_Return(AngularParser.Statement_ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Statement_Return}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement_Return(AngularParser.Statement_ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Statement_Assignment}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement_Assignment(AngularParser.Statement_AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Statement_Assignment}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement_Assignment(AngularParser.Statement_AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComponentBodySt}
	 * labeled alternative in {@link AngularParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void enterComponentBodySt(AngularParser.ComponentBodyStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComponentBodySt}
	 * labeled alternative in {@link AngularParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void exitComponentBodySt(AngularParser.ComponentBodyStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatementSt}
	 * labeled alternative in {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementSt(AngularParser.IfStatementStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatementSt}
	 * labeled alternative in {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementSt(AngularParser.IfStatementStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Condition_Boolean}
	 * labeled alternative in {@link AngularParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition_Boolean(AngularParser.Condition_BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Condition_Boolean}
	 * labeled alternative in {@link AngularParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition_Boolean(AngularParser.Condition_BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Condition_Simple}
	 * labeled alternative in {@link AngularParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition_Simple(AngularParser.Condition_SimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Condition_Simple}
	 * labeled alternative in {@link AngularParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition_Simple(AngularParser.Condition_SimpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStatementSt}
	 * labeled alternative in {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatementSt(AngularParser.ForStatementStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatementSt}
	 * labeled alternative in {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatementSt(AngularParser.ForStatementStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatementSt}
	 * labeled alternative in {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementSt(AngularParser.WhileStatementStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatementSt}
	 * labeled alternative in {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementSt(AngularParser.WhileStatementStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallFunctionSt}
	 * labeled alternative in {@link AngularParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void enterCallFunctionSt(AngularParser.CallFunctionStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallFunctionSt}
	 * labeled alternative in {@link AngularParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void exitCallFunctionSt(AngularParser.CallFunctionStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JsxElement_Tagged}
	 * labeled alternative in {@link AngularParser#jsxElement}.
	 * @param ctx the parse tree
	 */
	void enterJsxElement_Tagged(AngularParser.JsxElement_TaggedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JsxElement_Tagged}
	 * labeled alternative in {@link AngularParser#jsxElement}.
	 * @param ctx the parse tree
	 */
	void exitJsxElement_Tagged(AngularParser.JsxElement_TaggedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JsxElement_SelfClosing}
	 * labeled alternative in {@link AngularParser#jsxElement}.
	 * @param ctx the parse tree
	 */
	void enterJsxElement_SelfClosing(AngularParser.JsxElement_SelfClosingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JsxElement_SelfClosing}
	 * labeled alternative in {@link AngularParser#jsxElement}.
	 * @param ctx the parse tree
	 */
	void exitJsxElement_SelfClosing(AngularParser.JsxElement_SelfClosingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpeningTagSt}
	 * labeled alternative in {@link AngularParser#openingTag}.
	 * @param ctx the parse tree
	 */
	void enterOpeningTagSt(AngularParser.OpeningTagStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpeningTagSt}
	 * labeled alternative in {@link AngularParser#openingTag}.
	 * @param ctx the parse tree
	 */
	void exitOpeningTagSt(AngularParser.OpeningTagStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClosingTagSt}
	 * labeled alternative in {@link AngularParser#closingTag}.
	 * @param ctx the parse tree
	 */
	void enterClosingTagSt(AngularParser.ClosingTagStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClosingTagSt}
	 * labeled alternative in {@link AngularParser#closingTag}.
	 * @param ctx the parse tree
	 */
	void exitClosingTagSt(AngularParser.ClosingTagStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelfClosingTagSt}
	 * labeled alternative in {@link AngularParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingTagSt(AngularParser.SelfClosingTagStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelfClosingTagSt}
	 * labeled alternative in {@link AngularParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingTagSt(AngularParser.SelfClosingTagStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JsxContent_Element}
	 * labeled alternative in {@link AngularParser#jsxContent}.
	 * @param ctx the parse tree
	 */
	void enterJsxContent_Element(AngularParser.JsxContent_ElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JsxContent_Element}
	 * labeled alternative in {@link AngularParser#jsxContent}.
	 * @param ctx the parse tree
	 */
	void exitJsxContent_Element(AngularParser.JsxContent_ElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JsxContent_Interpolation}
	 * labeled alternative in {@link AngularParser#jsxContent}.
	 * @param ctx the parse tree
	 */
	void enterJsxContent_Interpolation(AngularParser.JsxContent_InterpolationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JsxContent_Interpolation}
	 * labeled alternative in {@link AngularParser#jsxContent}.
	 * @param ctx the parse tree
	 */
	void exitJsxContent_Interpolation(AngularParser.JsxContent_InterpolationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JsxContent_ID}
	 * labeled alternative in {@link AngularParser#jsxContent}.
	 * @param ctx the parse tree
	 */
	void enterJsxContent_ID(AngularParser.JsxContent_IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JsxContent_ID}
	 * labeled alternative in {@link AngularParser#jsxContent}.
	 * @param ctx the parse tree
	 */
	void exitJsxContent_ID(AngularParser.JsxContent_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InterpolationSt}
	 * labeled alternative in {@link AngularParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void enterInterpolationSt(AngularParser.InterpolationStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InterpolationSt}
	 * labeled alternative in {@link AngularParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void exitInterpolationSt(AngularParser.InterpolationStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JsxAttributesSt}
	 * labeled alternative in {@link AngularParser#jsxAttributes}.
	 * @param ctx the parse tree
	 */
	void enterJsxAttributesSt(AngularParser.JsxAttributesStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JsxAttributesSt}
	 * labeled alternative in {@link AngularParser#jsxAttributes}.
	 * @param ctx the parse tree
	 */
	void exitJsxAttributesSt(AngularParser.JsxAttributesStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AngularDirectiveSt}
	 * labeled alternative in {@link AngularParser#angularDirective}.
	 * @param ctx the parse tree
	 */
	void enterAngularDirectiveSt(AngularParser.AngularDirectiveStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AngularDirectiveSt}
	 * labeled alternative in {@link AngularParser#angularDirective}.
	 * @param ctx the parse tree
	 */
	void exitAngularDirectiveSt(AngularParser.AngularDirectiveStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Directive_NgIf}
	 * labeled alternative in {@link AngularParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective_NgIf(AngularParser.Directive_NgIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Directive_NgIf}
	 * labeled alternative in {@link AngularParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective_NgIf(AngularParser.Directive_NgIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Directive_NgSwitch}
	 * labeled alternative in {@link AngularParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective_NgSwitch(AngularParser.Directive_NgSwitchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Directive_NgSwitch}
	 * labeled alternative in {@link AngularParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective_NgSwitch(AngularParser.Directive_NgSwitchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Directive_NgFor}
	 * labeled alternative in {@link AngularParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective_NgFor(AngularParser.Directive_NgForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Directive_NgFor}
	 * labeled alternative in {@link AngularParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective_NgFor(AngularParser.Directive_NgForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Directive_NgStyle}
	 * labeled alternative in {@link AngularParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective_NgStyle(AngularParser.Directive_NgStyleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Directive_NgStyle}
	 * labeled alternative in {@link AngularParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective_NgStyle(AngularParser.Directive_NgStyleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Directive_NgClass}
	 * labeled alternative in {@link AngularParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective_NgClass(AngularParser.Directive_NgClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Directive_NgClass}
	 * labeled alternative in {@link AngularParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective_NgClass(AngularParser.Directive_NgClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JsxAttributeSt}
	 * labeled alternative in {@link AngularParser#jsxAttribute}.
	 * @param ctx the parse tree
	 */
	void enterJsxAttributeSt(AngularParser.JsxAttributeStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JsxAttributeSt}
	 * labeled alternative in {@link AngularParser#jsxAttribute}.
	 * @param ctx the parse tree
	 */
	void exitJsxAttributeSt(AngularParser.JsxAttributeStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JsxEventSt}
	 * labeled alternative in {@link AngularParser#jsxEvent}.
	 * @param ctx the parse tree
	 */
	void enterJsxEventSt(AngularParser.JsxEventStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JsxEventSt}
	 * labeled alternative in {@link AngularParser#jsxEvent}.
	 * @param ctx the parse tree
	 */
	void exitJsxEventSt(AngularParser.JsxEventStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JsxBindingSt}
	 * labeled alternative in {@link AngularParser#jsxBinding}.
	 * @param ctx the parse tree
	 */
	void enterJsxBindingSt(AngularParser.JsxBindingStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JsxBindingSt}
	 * labeled alternative in {@link AngularParser#jsxBinding}.
	 * @param ctx the parse tree
	 */
	void exitJsxBindingSt(AngularParser.JsxBindingStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JsxClassSt}
	 * labeled alternative in {@link AngularParser#jsxClass}.
	 * @param ctx the parse tree
	 */
	void enterJsxClassSt(AngularParser.JsxClassStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JsxClassSt}
	 * labeled alternative in {@link AngularParser#jsxClass}.
	 * @param ctx the parse tree
	 */
	void exitJsxClassSt(AngularParser.JsxClassStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_Array}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_Array(AngularParser.Expression_ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_Array}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_Array(AngularParser.Expression_ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_Boolean}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_Boolean(AngularParser.Expression_BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_Boolean}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_Boolean(AngularParser.Expression_BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_String}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_String(AngularParser.Expression_StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_String}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_String(AngularParser.Expression_StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_Double}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_Double(AngularParser.Expression_DoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_Double}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_Double(AngularParser.Expression_DoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_FunctionCall}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_FunctionCall(AngularParser.Expression_FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_FunctionCall}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_FunctionCall(AngularParser.Expression_FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_Value}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_Value(AngularParser.Expression_ValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_Value}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_Value(AngularParser.Expression_ValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_ID}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_ID(AngularParser.Expression_IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_ID}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_ID(AngularParser.Expression_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_Operation}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_Operation(AngularParser.Expression_OperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_Operation}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_Operation(AngularParser.Expression_OperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_Int}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_Int(AngularParser.Expression_IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_Int}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_Int(AngularParser.Expression_IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_MemberAccess}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_MemberAccess(AngularParser.Expression_MemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_MemberAccess}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_MemberAccess(AngularParser.Expression_MemberAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_Object}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_Object(AngularParser.Expression_ObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_Object}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_Object(AngularParser.Expression_ObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Type_ID}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType_ID(AngularParser.Type_IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Type_ID}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType_ID(AngularParser.Type_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Type_String}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType_String(AngularParser.Type_StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Type_String}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType_String(AngularParser.Type_StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Type_Int}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType_Int(AngularParser.Type_IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Type_Int}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType_Int(AngularParser.Type_IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Type_Double}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType_Double(AngularParser.Type_DoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Type_Double}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType_Double(AngularParser.Type_DoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Type_Boolean}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType_Boolean(AngularParser.Type_BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Type_Boolean}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType_Boolean(AngularParser.Type_BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Type_Any}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType_Any(AngularParser.Type_AnyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Type_Any}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType_Any(AngularParser.Type_AnyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Type_Public}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType_Public(AngularParser.Type_PublicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Type_Public}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType_Public(AngularParser.Type_PublicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Type_Private}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType_Private(AngularParser.Type_PrivateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Type_Private}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType_Private(AngularParser.Type_PrivateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Type_Void}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType_Void(AngularParser.Type_VoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Type_Void}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType_Void(AngularParser.Type_VoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Type_Number}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType_Number(AngularParser.Type_NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Type_Number}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType_Number(AngularParser.Type_NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Type_Null}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType_Null(AngularParser.Type_NullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Type_Null}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType_Null(AngularParser.Type_NullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintStatementSt}
	 * labeled alternative in {@link AngularParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatementSt(AngularParser.PrintStatementStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintStatementSt}
	 * labeled alternative in {@link AngularParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatementSt(AngularParser.PrintStatementStContext ctx);
}