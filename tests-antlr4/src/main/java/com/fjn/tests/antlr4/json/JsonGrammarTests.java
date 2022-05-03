package com.fjn.tests.antlr4.json;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class JsonGrammarTests {
    public static void main(String[] args) {
        ANTLRInputStream inputStream = new ANTLRInputStream("{\"a\":23, \"b\":[1,2,3]}");
        JsonLexer lexer = new JsonLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JsonParser parser = new JsonParser(tokens);
        ParseTree syntaxTree = parser.value();

        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        parseTreeWalker.walk(new JsonListener() {
            @Override
            public void enterValue(JsonParser.ValueContext ctx) {
                System.out.println(ctx);
            }

            @Override
            public void exitValue(JsonParser.ValueContext ctx) {
                System.out.println(ctx);
            }

            @Override
            public void enterPair(JsonParser.PairContext ctx) {
                System.out.println(ctx);
            }

            @Override
            public void exitPair(JsonParser.PairContext ctx) {
                System.out.println(ctx);
            }

            @Override
            public void enterObject(JsonParser.ObjectContext ctx) {
                System.out.println(ctx);
            }

            @Override
            public void exitObject(JsonParser.ObjectContext ctx) {
                System.out.println(ctx);
            }

            @Override
            public void enterArray(JsonParser.ArrayContext ctx) {
                System.out.println(ctx);
            }

            @Override
            public void exitArray(JsonParser.ArrayContext ctx) {
                System.out.println(ctx);
            }

            @Override
            public void enterJson(JsonParser.JsonContext ctx) {
                System.out.println(ctx);
            }

            @Override
            public void exitJson(JsonParser.JsonContext ctx) {
                System.out.println(ctx);
            }

            @Override
            public void visitTerminal(TerminalNode node) {
                System.out.println(node);
            }

            @Override
            public void visitErrorNode(ErrorNode node) {
                System.out.println(node);
            }

            @Override
            public void enterEveryRule(ParserRuleContext ctx) {
                System.out.println(ctx);
            }

            @Override
            public void exitEveryRule(ParserRuleContext ctx) {
                System.out.println(ctx);
            }
        }, syntaxTree);
    }
}
