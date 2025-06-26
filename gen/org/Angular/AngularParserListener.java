// Generated from C:/compiler/compiler/src/main/java/org/Angular/AngularParser.g4 by ANTLR 4.13.2
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
	 * Enter a parse tree produced by the {@code BlockSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockSt(AngularParser.BlockStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockSt(AngularParser.BlockStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecoratorSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorSt(AngularParser.DecoratorStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecoratorSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorSt(AngularParser.DecoratorStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintStatementSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatementSt(AngularParser.PrintStatementStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintStatementSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatementSt(AngularParser.PrintStatementStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAccessSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccessSt(AngularParser.ArrayAccessStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAccessSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccessSt(AngularParser.ArrayAccessStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableStatementSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatementSt(AngularParser.VariableStatementStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableStatementSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatementSt(AngularParser.VariableStatementStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportStatementSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatementSt(AngularParser.ImportStatementStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportStatementSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatementSt(AngularParser.ImportStatementStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExportStatementSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExportStatementSt(AngularParser.ExportStatementStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExportStatementSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExportStatementSt(AngularParser.ExportStatementStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatementSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementSt(AngularParser.IfStatementStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatementSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementSt(AngularParser.IfStatementStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IterationStatementSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatementSt(AngularParser.IterationStatementStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IterationStatementSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatementSt(AngularParser.IterationStatementStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SwitchStatementSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatementSt(AngularParser.SwitchStatementStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SwitchStatementSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatementSt(AngularParser.SwitchStatementStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDeclartionSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclartionSt(AngularParser.FunctionDeclartionStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDeclartionSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclartionSt(AngularParser.FunctionDeclartionStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallSt(AngularParser.FunctionCallStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallSt(AngularParser.FunctionCallStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSt(AngularParser.ExpressionStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSt(AngularParser.ExpressionStContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(AngularParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(AngularParser.BlockContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(AngularParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(AngularParser.ArrayAccessContext ctx);
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
	 * Enter a parse tree produced by {@link AngularParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(AngularParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(AngularParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importDefaultSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterImportDefaultSpecifier(AngularParser.ImportDefaultSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importDefaultSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitImportDefaultSpecifier(AngularParser.ImportDefaultSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importNamespaceSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterImportNamespaceSpecifier(AngularParser.ImportNamespaceSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importNamespaceSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitImportNamespaceSpecifier(AngularParser.ImportNamespaceSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importNamedSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterImportNamedSpecifier(AngularParser.ImportNamedSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importNamedSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitImportNamedSpecifier(AngularParser.ImportNamedSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterImportSpecifier(AngularParser.ImportSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitImportSpecifier(AngularParser.ImportSpecifierContext ctx);
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
	 * Enter a parse tree produced by {@link AngularParser#exportDefaultDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExportDefaultDeclaration(AngularParser.ExportDefaultDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#exportDefaultDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExportDefaultDeclaration(AngularParser.ExportDefaultDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#exportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExportDeclaration(AngularParser.ExportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#exportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExportDeclaration(AngularParser.ExportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#exportListDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExportListDeclaration(AngularParser.ExportListDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#exportListDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExportListDeclaration(AngularParser.ExportListDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#exportSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterExportSpecifier(AngularParser.ExportSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#exportSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitExportSpecifier(AngularParser.ExportSpecifierContext ctx);
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
	 * Enter a parse tree produced by the {@code DecoratedProperty}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterDecoratedProperty(AngularParser.DecoratedPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecoratedProperty}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitDecoratedProperty(AngularParser.DecoratedPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecoratedMethod}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterDecoratedMethod(AngularParser.DecoratedMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecoratedMethod}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitDecoratedMethod(AngularParser.DecoratedMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstructorMember}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterConstructorMember(AngularParser.ConstructorMemberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstructorMember}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitConstructorMember(AngularParser.ConstructorMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMethodDeclaration(AngularParser.ClassMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMethodDeclaration(AngularParser.ClassMethodDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(AngularParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(AngularParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessModifier(AngularParser.AccessModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessModifier(AngularParser.AccessModifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclarationVr}
	 * labeled alternative in {@link AngularParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationVr(AngularParser.VariableDeclarationVrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclarationVr}
	 * labeled alternative in {@link AngularParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationVr(AngularParser.VariableDeclarationVrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclarationConstVr}
	 * labeled alternative in {@link AngularParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationConstVr(AngularParser.VariableDeclarationConstVrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclarationConstVr}
	 * labeled alternative in {@link AngularParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationConstVr(AngularParser.VariableDeclarationConstVrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableTypedAndAssignedConst}
	 * labeled alternative in {@link AngularParser#variableDeclarationConst}.
	 * @param ctx the parse tree
	 */
	void enterVariableTypedAndAssignedConst(AngularParser.VariableTypedAndAssignedConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableTypedAndAssignedConst}
	 * labeled alternative in {@link AngularParser#variableDeclarationConst}.
	 * @param ctx the parse tree
	 */
	void exitVariableTypedAndAssignedConst(AngularParser.VariableTypedAndAssignedConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableAssignedConstOnly}
	 * labeled alternative in {@link AngularParser#variableDeclarationConst}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignedConstOnly(AngularParser.VariableAssignedConstOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableAssignedConstOnly}
	 * labeled alternative in {@link AngularParser#variableDeclarationConst}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignedConstOnly(AngularParser.VariableAssignedConstOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableTypedAndMaybeAssigned}
	 * labeled alternative in {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableTypedAndMaybeAssigned(AngularParser.VariableTypedAndMaybeAssignedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableTypedAndMaybeAssigned}
	 * labeled alternative in {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableTypedAndMaybeAssigned(AngularParser.VariableTypedAndMaybeAssignedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableUntyped}
	 * labeled alternative in {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableUntyped(AngularParser.VariableUntypedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableUntyped}
	 * labeled alternative in {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableUntyped(AngularParser.VariableUntypedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierVt}
	 * labeled alternative in {@link AngularParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierVt(AngularParser.IdentifierVtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierVt}
	 * labeled alternative in {@link AngularParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierVt(AngularParser.IdentifierVtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayDeclarationVt}
	 * labeled alternative in {@link AngularParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclarationVt(AngularParser.ArrayDeclarationVtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayDeclarationVt}
	 * labeled alternative in {@link AngularParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclarationVt(AngularParser.ArrayDeclarationVtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectDeclarationVt}
	 * labeled alternative in {@link AngularParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterObjectDeclarationVt(AngularParser.ObjectDeclarationVtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectDeclarationVt}
	 * labeled alternative in {@link AngularParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitObjectDeclarationVt(AngularParser.ObjectDeclarationVtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeWithArray}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterTypeWithArray(AngularParser.TypeWithArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeWithArray}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitTypeWithArray(AngularParser.TypeWithArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeWithObject}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterTypeWithObject(AngularParser.TypeWithObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeWithObject}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitTypeWithObject(AngularParser.TypeWithObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InlineObjectArray}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterInlineObjectArray(AngularParser.InlineObjectArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InlineObjectArray}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitInlineObjectArray(AngularParser.InlineObjectArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#inlineObjectType}.
	 * @param ctx the parse tree
	 */
	void enterInlineObjectType(AngularParser.InlineObjectTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#inlineObjectType}.
	 * @param ctx the parse tree
	 */
	void exitInlineObjectType(AngularParser.InlineObjectTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#typeMember}.
	 * @param ctx the parse tree
	 */
	void enterTypeMember(AngularParser.TypeMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#typeMember}.
	 * @param ctx the parse tree
	 */
	void exitTypeMember(AngularParser.TypeMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arraySuffix}.
	 * @param ctx the parse tree
	 */
	void enterArraySuffix(AngularParser.ArraySuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arraySuffix}.
	 * @param ctx the parse tree
	 */
	void exitArraySuffix(AngularParser.ArraySuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#objectDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterObjectDeclaration(AngularParser.ObjectDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#objectDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitObjectDeclaration(AngularParser.ObjectDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NamedObjectProperty}
	 * labeled alternative in {@link AngularParser#objectProperty}.
	 * @param ctx the parse tree
	 */
	void enterNamedObjectProperty(AngularParser.NamedObjectPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NamedObjectProperty}
	 * labeled alternative in {@link AngularParser#objectProperty}.
	 * @param ctx the parse tree
	 */
	void exitNamedObjectProperty(AngularParser.NamedObjectPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShorthandOrDynamicProperty}
	 * labeled alternative in {@link AngularParser#objectProperty}.
	 * @param ctx the parse tree
	 */
	void enterShorthandOrDynamicProperty(AngularParser.ShorthandOrDynamicPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShorthandOrDynamicProperty}
	 * labeled alternative in {@link AngularParser#objectProperty}.
	 * @param ctx the parse tree
	 */
	void exitShorthandOrDynamicProperty(AngularParser.ShorthandOrDynamicPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclaration(AngularParser.ArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclaration(AngularParser.ArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(AngularParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(AngularParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(AngularParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(AngularParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(AngularParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(AngularParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(AngularParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(AngularParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(AngularParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(AngularParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(AngularParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(AngularParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(AngularParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(AngularParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(AngularParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(AngularParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMemberDotExpression(AngularParser.MemberDotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMemberDotExpression(AngularParser.MemberDotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(AngularParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(AngularParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecreaseExpression(AngularParser.PreDecreaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecreaseExpression(AngularParser.PreDecreaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBreakExpression(AngularParser.BreakExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBreakExpression(AngularParser.BreakExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(AngularParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(AngularParser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlBodyExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterHtmlBodyExpression(AngularParser.HtmlBodyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlBodyExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitHtmlBodyExpression(AngularParser.HtmlBodyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReturnExpression(AngularParser.ReturnExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReturnExpression(AngularParser.ReturnExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(AngularParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(AngularParser.FunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecreaseExpression(AngularParser.PostDecreaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecreaseExpression(AngularParser.PostDecreaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpression(AngularParser.ValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpression(AngularParser.ValueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpression(AngularParser.ArrayExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpression(AngularParser.ArrayExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParameterAsExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParameterAsExpression(AngularParser.ParameterAsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParameterAsExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParameterAsExpression(AngularParser.ParameterAsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(AngularParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(AngularParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAccessExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccessExpression(AngularParser.ArrayAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAccessExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccessExpression(AngularParser.ArrayAccessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterObjectExpression(AngularParser.ObjectExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitObjectExpression(AngularParser.ObjectExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(AngularParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(AngularParser.MultiplicativeExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link AngularParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatement(AngularParser.ElseIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatement(AngularParser.ElseIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(AngularParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(AngularParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoStatement}
	 * labeled alternative in {@link AngularParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(AngularParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoStatement}
	 * labeled alternative in {@link AngularParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(AngularParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link AngularParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link AngularParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link AngularParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(AngularParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link AngularParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(AngularParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInStatement}
	 * labeled alternative in {@link AngularParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForInStatement(AngularParser.ForInStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInStatement}
	 * labeled alternative in {@link AngularParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForInStatement(AngularParser.ForInStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(AngularParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(AngularParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void enterCaseClause(AngularParser.CaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void exitCaseClause(AngularParser.CaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void enterDefaultClause(AngularParser.DefaultClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void exitDefaultClause(AngularParser.DefaultClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(AngularParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(AngularParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnExpressionOnly}
	 * labeled alternative in {@link AngularParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturnExpressionOnly(AngularParser.ReturnExpressionOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnExpressionOnly}
	 * labeled alternative in {@link AngularParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturnExpressionOnly(AngularParser.ReturnExpressionOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnObjectLiteral}
	 * labeled alternative in {@link AngularParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturnObjectLiteral(AngularParser.ReturnObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnObjectLiteral}
	 * labeled alternative in {@link AngularParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturnObjectLiteral(AngularParser.ReturnObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnArrayLiteral}
	 * labeled alternative in {@link AngularParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturnArrayLiteral(AngularParser.ReturnArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnArrayLiteral}
	 * labeled alternative in {@link AngularParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturnArrayLiteral(AngularParser.ReturnArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnFunctionCall}
	 * labeled alternative in {@link AngularParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturnFunctionCall(AngularParser.ReturnFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnFunctionCall}
	 * labeled alternative in {@link AngularParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturnFunctionCall(AngularParser.ReturnFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Normal_Function}
	 * labeled alternative in {@link AngularParser#functionDeclartion}.
	 * @param ctx the parse tree
	 */
	void enterNormal_Function(AngularParser.Normal_FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Normal_Function}
	 * labeled alternative in {@link AngularParser#functionDeclartion}.
	 * @param ctx the parse tree
	 */
	void exitNormal_Function(AngularParser.Normal_FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Anoymous_Function}
	 * labeled alternative in {@link AngularParser#functionDeclartion}.
	 * @param ctx the parse tree
	 */
	void enterAnoymous_Function(AngularParser.Anoymous_FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Anoymous_Function}
	 * labeled alternative in {@link AngularParser#functionDeclartion}.
	 * @param ctx the parse tree
	 */
	void exitAnoymous_Function(AngularParser.Anoymous_FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Arrow_Function}
	 * labeled alternative in {@link AngularParser#functionDeclartion}.
	 * @param ctx the parse tree
	 */
	void enterArrow_Function(AngularParser.Arrow_FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Arrow_Function}
	 * labeled alternative in {@link AngularParser#functionDeclartion}.
	 * @param ctx the parse tree
	 */
	void exitArrow_Function(AngularParser.Arrow_FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code New_type_function}
	 * labeled alternative in {@link AngularParser#functionDeclartion}.
	 * @param ctx the parse tree
	 */
	void enterNew_type_function(AngularParser.New_type_functionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code New_type_function}
	 * labeled alternative in {@link AngularParser#functionDeclartion}.
	 * @param ctx the parse tree
	 */
	void exitNew_type_function(AngularParser.New_type_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#normalFunction}.
	 * @param ctx the parse tree
	 */
	void enterNormalFunction(AngularParser.NormalFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#normalFunction}.
	 * @param ctx the parse tree
	 */
	void exitNormalFunction(AngularParser.NormalFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#anoymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterAnoymousFunction(AngularParser.AnoymousFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#anoymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitAnoymousFunction(AngularParser.AnoymousFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunction(AngularParser.ArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunction(AngularParser.ArrowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueArrow}
	 * labeled alternative in {@link AngularParser#arrowParameters}.
	 * @param ctx the parse tree
	 */
	void enterValueArrow(AngularParser.ValueArrowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueArrow}
	 * labeled alternative in {@link AngularParser#arrowParameters}.
	 * @param ctx the parse tree
	 */
	void exitValueArrow(AngularParser.ValueArrowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionArrow}
	 * labeled alternative in {@link AngularParser#arrowParameters}.
	 * @param ctx the parse tree
	 */
	void enterExpressionArrow(AngularParser.ExpressionArrowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionArrow}
	 * labeled alternative in {@link AngularParser#arrowParameters}.
	 * @param ctx the parse tree
	 */
	void exitExpressionArrow(AngularParser.ExpressionArrowContext ctx);
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
	 * Enter a parse tree produced by the {@code SelectorArgument}
	 * labeled alternative in {@link AngularParser#decoratorArgument}.
	 * @param ctx the parse tree
	 */
	void enterSelectorArgument(AngularParser.SelectorArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectorArgument}
	 * labeled alternative in {@link AngularParser#decoratorArgument}.
	 * @param ctx the parse tree
	 */
	void exitSelectorArgument(AngularParser.SelectorArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Template_UrlArgument}
	 * labeled alternative in {@link AngularParser#decoratorArgument}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_UrlArgument(AngularParser.Template_UrlArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Template_UrlArgument}
	 * labeled alternative in {@link AngularParser#decoratorArgument}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_UrlArgument(AngularParser.Template_UrlArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateArgument}
	 * labeled alternative in {@link AngularParser#decoratorArgument}.
	 * @param ctx the parse tree
	 */
	void enterTemplateArgument(AngularParser.TemplateArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateArgument}
	 * labeled alternative in {@link AngularParser#decoratorArgument}.
	 * @param ctx the parse tree
	 */
	void exitTemplateArgument(AngularParser.TemplateArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlBodyWithDiv_L}
	 * labeled alternative in {@link AngularParser#htmlBody}.
	 * @param ctx the parse tree
	 */
	void enterHtmlBodyWithDiv_L(AngularParser.HtmlBodyWithDiv_LContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlBodyWithDiv_L}
	 * labeled alternative in {@link AngularParser#htmlBody}.
	 * @param ctx the parse tree
	 */
	void exitHtmlBodyWithDiv_L(AngularParser.HtmlBodyWithDiv_LContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlBodyNestedDiv_L}
	 * labeled alternative in {@link AngularParser#htmlBody}.
	 * @param ctx the parse tree
	 */
	void enterHtmlBodyNestedDiv_L(AngularParser.HtmlBodyNestedDiv_LContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlBodyNestedDiv_L}
	 * labeled alternative in {@link AngularParser#htmlBody}.
	 * @param ctx the parse tree
	 */
	void exitHtmlBodyNestedDiv_L(AngularParser.HtmlBodyNestedDiv_LContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlBodyDivAlone_L}
	 * labeled alternative in {@link AngularParser#htmlBody}.
	 * @param ctx the parse tree
	 */
	void enterHtmlBodyDivAlone_L(AngularParser.HtmlBodyDivAlone_LContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlBodyDivAlone_L}
	 * labeled alternative in {@link AngularParser#htmlBody}.
	 * @param ctx the parse tree
	 */
	void exitHtmlBodyDivAlone_L(AngularParser.HtmlBodyDivAlone_LContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlBodyNoDiv_L}
	 * labeled alternative in {@link AngularParser#htmlBody}.
	 * @param ctx the parse tree
	 */
	void enterHtmlBodyNoDiv_L(AngularParser.HtmlBodyNoDiv_LContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlBodyNoDiv_L}
	 * labeled alternative in {@link AngularParser#htmlBody}.
	 * @param ctx the parse tree
	 */
	void exitHtmlBodyNoDiv_L(AngularParser.HtmlBodyNoDiv_LContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlBodyWithDiv}.
	 * @param ctx the parse tree
	 */
	void enterHtmlBodyWithDiv(AngularParser.HtmlBodyWithDivContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlBodyWithDiv}.
	 * @param ctx the parse tree
	 */
	void exitHtmlBodyWithDiv(AngularParser.HtmlBodyWithDivContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlBodyNestedDiv}.
	 * @param ctx the parse tree
	 */
	void enterHtmlBodyNestedDiv(AngularParser.HtmlBodyNestedDivContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlBodyNestedDiv}.
	 * @param ctx the parse tree
	 */
	void exitHtmlBodyNestedDiv(AngularParser.HtmlBodyNestedDivContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlBodyDivAlone}.
	 * @param ctx the parse tree
	 */
	void enterHtmlBodyDivAlone(AngularParser.HtmlBodyDivAloneContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlBodyDivAlone}.
	 * @param ctx the parse tree
	 */
	void exitHtmlBodyDivAlone(AngularParser.HtmlBodyDivAloneContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlBodyNoDiv}.
	 * @param ctx the parse tree
	 */
	void enterHtmlBodyNoDiv(AngularParser.HtmlBodyNoDivContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlBodyNoDiv}.
	 * @param ctx the parse tree
	 */
	void exitHtmlBodyNoDiv(AngularParser.HtmlBodyNoDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlContent_Element}
	 * labeled alternative in {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent_Element(AngularParser.HtmlContent_ElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlContent_Element}
	 * labeled alternative in {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent_Element(AngularParser.HtmlContent_ElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlContent_Interpolation}
	 * labeled alternative in {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent_Interpolation(AngularParser.HtmlContent_InterpolationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlContent_Interpolation}
	 * labeled alternative in {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent_Interpolation(AngularParser.HtmlContent_InterpolationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlContent_ID}
	 * labeled alternative in {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent_ID(AngularParser.HtmlContent_IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlContent_ID}
	 * labeled alternative in {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent_ID(AngularParser.HtmlContent_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlContents}
	 * labeled alternative in {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContents(AngularParser.HtmlContentsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlContents}
	 * labeled alternative in {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContents(AngularParser.HtmlContentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlExpression}.
	 * @param ctx the parse tree
	 */
	void enterHtmlExpression(AngularParser.HtmlExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlExpression}.
	 * @param ctx the parse tree
	 */
	void exitHtmlExpression(AngularParser.HtmlExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlText}.
	 * @param ctx the parse tree
	 */
	void enterHtmlText(AngularParser.HtmlTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlText}.
	 * @param ctx the parse tree
	 */
	void exitHtmlText(AngularParser.HtmlTextContext ctx);
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
	 * Enter a parse tree produced by {@link AngularParser#htmlAttributes}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributes(AngularParser.HtmlAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlAttributes}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributes(AngularParser.HtmlAttributesContext ctx);
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
	 * Enter a parse tree produced by the {@code HtmlAtteibute_Object}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAtteibute_Object(AngularParser.HtmlAtteibute_ObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlAtteibute_Object}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAtteibute_Object(AngularParser.HtmlAtteibute_ObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlAtteibute_String}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAtteibute_String(AngularParser.HtmlAtteibute_StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlAtteibute_String}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAtteibute_String(AngularParser.HtmlAtteibute_StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlAtteibute_Identifier}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAtteibute_Identifier(AngularParser.HtmlAtteibute_IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlAtteibute_Identifier}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAtteibute_Identifier(AngularParser.HtmlAtteibute_IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlEvent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlEvent(AngularParser.HtmlEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlEvent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlEvent(AngularParser.HtmlEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlBinding}.
	 * @param ctx the parse tree
	 */
	void enterHtmlBinding(AngularParser.HtmlBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlBinding}.
	 * @param ctx the parse tree
	 */
	void exitHtmlBinding(AngularParser.HtmlBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlClass}.
	 * @param ctx the parse tree
	 */
	void enterHtmlClass(AngularParser.HtmlClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlClass}.
	 * @param ctx the parse tree
	 */
	void exitHtmlClass(AngularParser.HtmlClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#angularDecoratorName}.
	 * @param ctx the parse tree
	 */
	void enterAngularDecoratorName(AngularParser.AngularDecoratorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#angularDecoratorName}.
	 * @param ctx the parse tree
	 */
	void exitAngularDecoratorName(AngularParser.AngularDecoratorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#varHelpers}.
	 * @param ctx the parse tree
	 */
	void enterVarHelpers(AngularParser.VarHelpersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#varHelpers}.
	 * @param ctx the parse tree
	 */
	void exitVarHelpers(AngularParser.VarHelpersContext ctx);
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
	 * Enter a parse tree produced by {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(AngularParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(AngularParser.TypeContext ctx);
}