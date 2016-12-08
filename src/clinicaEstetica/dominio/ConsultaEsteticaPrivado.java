/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaEstetica.dominio;

import dominio.AtendimentoPrivado;
import validacoes.ValidacaoException;

/**
 *
 * @author Monster
 */
public class ConsultaEsteticaPrivado extends AtendimentoPrivado{
    
    public ConsultaEsteticaPrivado() {
    }
    
    @Override
    public Double valorAtendimento() {
        return 50.0;
    }
    
}
