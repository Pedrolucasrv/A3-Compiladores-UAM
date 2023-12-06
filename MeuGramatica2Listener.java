import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import static java.lang.Integer.valueOf;

public class MeuGramatica2Listener extends Gramatica2BaseListener{
    FileWriter linguagemFinal = null;
    String ultimoNome = null;
    Map<String, String> minhasVariaveis = new HashMap<String, String>();
    
    public MeuGramatica2Listener() {
        try {
            linguagemFinal = new FileWriter (new File("E:/Materias uam/A3Compiladores/A3g4/LinguagemProc.txt"));
        } catch (IOException e) {
            System.out.println("Erro de criação ao arquivo");
            e.printStackTrace();
        }
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        try {
            org.antlr.v4.runtime.tree.ParseTree no0 = ctx.getChild(0);             
            org.antlr.v4.runtime.tree.ParseTree no1 = ctx.getChild(4);
            if(no0 != null ){
                if((no0).getText().trim().equalsIgnoreCase("O") || (no0).getText().trim().equalsIgnoreCase("A")) {
                    if (ctx.getChild(0) != null && ctx.getChild(2) != null && ctx.getChild(3) != null) {
                        linguagemFinal.write(ctx.getChild(0).getText() + " " + ctx.getChild(1).getText() + " " + ctx.getChild(2).getText() + ";" +"\n");
                        linguagemFinal.flush();
                    }

                    int numeroDeObj;
                    if(no1.getChild(0).getText() == "Se")
                        numeroDeObj = Integer.valueOf(no1.getChild(3).getText());
                    else
                        numeroDeObj = Integer.valueOf(no1.getChild(2).getText());


                    for (int item = 1; item <= numeroDeObj; item++) {
                    String personagem = ctx.getChild(1).getText();
                    String objeto = no1.getChild(3).getText();
                    String acao = no1.getChild(1).getText();

                        linguagemFinal.write(ctx.getChild(0).getText() + " " + personagem + " " + "colocou " + item + " " + objeto + " no carrinho;" + "\n");

                        if(item == numeroDeObj){
                        if(item <= 5){
                        linguagemFinal.write(personagem + " " + acao + " " + item + " " + objeto + ";" + "\n");
                        linguagemFinal.flush();
                    }
                    else{
                        linguagemFinal.write(personagem + " " + acao +" "+ item + " " + objeto +" "+ ctx.getChild(4).getChild(4).getText() +" "+ ctx.getChild(4).getChild(5).getText() + ";"+"\n");
                        linguagemFinal.flush();
                        }
                    }
                    }
                }

            }

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

    }


    
    
}
