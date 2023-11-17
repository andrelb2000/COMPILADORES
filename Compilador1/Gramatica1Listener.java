// Generated from Gramatica1.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Gramatica1Parser}.
 */
public interface Gramatica1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Gramatica1Parser#raiz_programa}.
	 * @param ctx the parse tree
	 */
	void enterRaiz_programa(Gramatica1Parser.Raiz_programaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Gramatica1Parser#raiz_programa}.
	 * @param ctx the parse tree
	 */
	void exitRaiz_programa(Gramatica1Parser.Raiz_programaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Gramatica1Parser#comeco}.
	 * @param ctx the parse tree
	 */
	void enterComeco(Gramatica1Parser.ComecoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Gramatica1Parser#comeco}.
	 * @param ctx the parse tree
	 */
	void exitComeco(Gramatica1Parser.ComecoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Gramatica1Parser#personagem}.
	 * @param ctx the parse tree
	 */
	void enterPersonagem(Gramatica1Parser.PersonagemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Gramatica1Parser#personagem}.
	 * @param ctx the parse tree
	 */
	void exitPersonagem(Gramatica1Parser.PersonagemContext ctx);
}