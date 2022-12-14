package app.menu;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class MenuComponent extends MenuStyleComponent {
    JButton AluguelButton = new JButton("ALUGUEL");
    JButton ConoscoButton = new JButton("CONOSCO");
    JButton DuvidaButton = new JButton("DUVIDA");
    JButton SobreButton = new JButton("SOBRE");
    JButton VendaButton = new JButton("VENDA");

    public MenuComponent(JFrame JANELA) {
        JANELA.setLayout(new GridLayout(5, 1));
        SetButtons(JANELA);
    }

    public void SetButtons(JFrame JANELA) {
        JANELA.add(this.AluguelButton);
        JANELA.add(this.ConoscoButton);
        JANELA.add(this.DuvidaButton);
        JANELA.add(this.SobreButton);
        JANELA.add(this.VendaButton);
    }

}
