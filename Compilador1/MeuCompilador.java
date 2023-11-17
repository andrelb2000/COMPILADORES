import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class MeuCompilador {
    public static void main(String[] args) {
        
        System.out.println("hello");
        // Ler o texto a ser convertido transformando em Stream de "char"
        //CharStream entrada = CharStreams.fromString("Era uma vez Joao e Maria");
        String filePath = "arquivo.txt";  
        CharStream entrada = null;
        try {
            entrada = CharStreams.fromPath(Path.of(filePath), StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("Erro de acesso ao arquivo");
            e.printStackTrace();
        }
        // Passar a Strem lida para o Lexer
        Gramatica1Lexer lexer = new Gramatica1Lexer(entrada);

        // Passando o resultado da analise Lexica para o processador de Tokens
        CommonTokenStream  tokens = new CommonTokenStream(lexer);
        // Passando os tokens para o parser 
        Gramatica1Parser parser = new Gramatica1Parser(tokens);
        // Pegar o ponto raiz da gramatica
        Gramatica1Parser.Raiz_programaContext arvore = parser.raiz_programa();
        // Imprimir a arvore geradora do texto sendo analisado
        System.out.println(arvore.toStringTree(parser));

        // "Caminha" pela arvore disparando os metodos do Listener
        MeuGramatica1Listener meuListener = new MeuGramatica1Listener();
        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        parseTreeWalker.walk(meuListener, arvore);        
    }
}
