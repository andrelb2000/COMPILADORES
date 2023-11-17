import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MeuGramatica1Listener extends Gramatica1BaseListener {
    FileWriter linguagemFinal = null;
    
    public MeuGramatica1Listener() {
        try {
            linguagemFinal = new FileWriter (new File("LinguagemProc.txt"));
        } catch (IOException e) {
            System.out.println("Erro de criação ao arquivo");
            e.printStackTrace();
        }
    }
    @Override
    public void visitTerminal(TerminalNode node) {
        System.out.println("Entrando Terminal "   + node.getText() );
        try {
            linguagemFinal.write("Entrando Terminal " + node.getText() + "\n");
            linguagemFinal.flush();
        } catch (IOException e) {
            System.out.println("Erro de escrita ao arquivo");
            e.printStackTrace();
        }
    }
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {    
        System.out.println("Entrando Regra " + ctx.getText());
        try {
            linguagemFinal.write("Entrando Regra " + ctx.getText() + "\n");
            linguagemFinal.flush();
        } catch (IOException e) {
            System.out.println("Erro de escrita ao arquivo");
            e.printStackTrace();
        }
    }
}
