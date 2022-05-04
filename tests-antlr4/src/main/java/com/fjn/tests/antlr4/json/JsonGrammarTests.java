package com.fjn.tests.antlr4.json;

import com.jn.easyjson.core.JsonTreeNode;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class JsonGrammarTests {
    public static void main(String[] args) {
        ANTLRInputStream inputStream = new ANTLRInputStream("{\"a\":23, \"b\":[1,2,3]}");
        JsonLexer lexer = new JsonLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JsonParser parser = new JsonParser(tokens);
        ParseTree textTree = parser.json();

        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        JsonTokenReader reader = new JsonTokenReader();
        parseTreeWalker.walk(reader, textTree);
        JsonTreeNode node = reader.getJsonTree();
        System.out.println(node);
    }
}
