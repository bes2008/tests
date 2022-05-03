// Generated from D:\Projects\workspace_test\tests\tests-antlr4\src\main\resources\grammar\ArrayInit.g4 by ANTLR 4.5.3
package com.fjn.test.antlr4;

package com.fjn.tests.antlr4.arrayinit;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArrayInitParser}.
 */
public interface ArrayInitListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArrayInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ArrayInitParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrayInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ArrayInitParser.ExprContext ctx);
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