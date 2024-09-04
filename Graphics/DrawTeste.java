import javax.swing.JFrame;

public class DrawTeste {

    public static void main(String args[]){
        DrawPanel panel = new DrawPanel();
        JFrame aplicacao = new JFrame();

        aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacao.setSize(200,200);
        aplicacao.add(panel);
        aplicacao.setVisible(true);

    }
}
