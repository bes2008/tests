// Generated from D:/projects/workspace_test_idea/tests/tests-antlr/src/main/resources\ArrayInit.g4 by ANTLR 4.7
package com.fjn.tests.antlr4.arrayinit;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArrayInitParser}.
 */
public interface ArrayInitListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArrayInitParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ArrayInitParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrayInitParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ArrayInitParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArrayInitParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(ArrayInitParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrayInitParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(ArrayInitParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArrayInitParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ArrayInitParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrayInitParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ArrayInitParser.ValueContext ctx);
}