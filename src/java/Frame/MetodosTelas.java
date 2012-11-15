package Frame;

import java.awt.*;

public class MetodosTelas {

    public static void centralizar(Component tela){
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension janela = tela.getSize();
        if (janela.height > screen.height)
            tela.setSize(janela.width, screen.height);
        if(janela.width > screen.width)
            tela.setSize(screen.width, janela.width);
            tela.setLocation((screen.width - janela.width) / 2, (screen.height - janela.height) / 2);
    }
}
