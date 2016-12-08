package clinicaEstetica.dominio;

import dominio.*;
import javax.swing.JOptionPane;

public  class NotificacaoEmail extends Notificacao {

    public NotificacaoEmail(String mensagem) {
        super(mensagem);
    }

    
    
    @Override
    public void enviar() {
        JOptionPane.showMessageDialog(null, "Email "+this.getMensagem());
    }

}
