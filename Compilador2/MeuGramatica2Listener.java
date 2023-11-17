import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MeuGramatica2Listener extends Gramatica2BaseListener{
    FileWriter linguagemFinal = null;
    String ultimoNome = null;
    

    public MeuGramatica2Listener() {
        try {
            linguagemFinal = new FileWriter (new File("LinguagemProc.txt"));
        } catch (IOException e) {
            System.out.println("Erro de criação ao arquivo");
            e.printStackTrace();
        }
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        try {
            if(ctx.getChild(0).getText().trim().equalsIgnoreCase("Era uma vez")){
                linguagemFinal.write("Era uma vez... " + ctx.getChild(1).getText() + " e " + ctx.getChild(3).getText() + "\n");
            }
            org.antlr.v4.runtime.tree.ParseTree no = ctx.getChild(1);
            if(no != null){            
                System.out.println("Regra: "+ctx.getText());
                if(no.getText().trim().equalsIgnoreCase("andou")){
                    int vezes = Integer.parseInt(ctx.getChild(2).getText());                
                    for(int i=0; i < vezes; i++){
                        linguagemFinal.write(ctx.getChild(0).getText() + " andou a " + (i+1)+ "a vez\n");
                    }
                }
            }
            linguagemFinal.flush();
        } catch (IOException e) {
            System.out.println("Erro de escrita ao arquivo");
            e.printStackTrace();
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {       
        /* 
        try {
            //linguagemFinal.write("Entrando Terminal " + node.getText() + "\n");
            //linguagemFinal.flush();
        } catch (IOException e) {
            System.out.println("Erro de escrita ao arquivo");
            e.printStackTrace();
        }*/
    }


    
    
}
