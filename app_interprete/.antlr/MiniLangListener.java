// Generated from /home/cesar/Imágenes/Interprete_completo/app_interprete/MiniLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniLangParser}.
 */
public interface MiniLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MiniLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MiniLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MiniLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MiniLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(MiniLangParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(MiniLangParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(MiniLangParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(MiniLangParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MiniLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MiniLangParser.ExprContext ctx);
}