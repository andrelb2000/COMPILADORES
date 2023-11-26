// Generated from c:/GITRepTemp/ANHEMBI/Teoria da Computacao/COMPILADORES/Compilador2/Gramatica2.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Gramatica2Parser}.
 */
public interface Gramatica2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Gramatica2Parser#raiz_programa}.
	 * @param ctx the parse tree
	 */
	void enterRaiz_programa(Gramatica2Parser.Raiz_programaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Gramatica2Parser#raiz_programa}.
	 * @param ctx the parse tree
	 */
	void exitRaiz_programa(Gramatica2Parser.Raiz_programaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Gramatica2Parser#estoria}.
	 * @param ctx the parse tree
	 */
	void enterEstoria(Gramatica2Parser.EstoriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Gramatica2Parser#estoria}.
	 * @param ctx the parse tree
	 */
	void exitEstoria(Gramatica2Parser.EstoriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Gramatica2Parser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(Gramatica2Parser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Gramatica2Parser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(Gramatica2Parser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Gramatica2Parser#declaracao2}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao2(Gramatica2Parser.Declaracao2Context ctx);
	/**
	 * Exit a parse tree produced by {@link Gramatica2Parser#declaracao2}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao2(Gramatica2Parser.Declaracao2Context ctx);
	/**
	 * Enter a parse tree produced by {@link Gramatica2Parser#personagem}.
	 * @param ctx the parse tree
	 */
	void enterPersonagem(Gramatica2Parser.PersonagemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Gramatica2Parser#personagem}.
	 * @param ctx the parse tree
	 */
	void exitPersonagem(Gramatica2Parser.PersonagemContext ctx);
}