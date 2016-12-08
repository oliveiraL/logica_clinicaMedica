/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaEstetica.dominio;

import dominio.PlanoDeSaude;

/**
 *
 * @author Monster
 */
public class PlanodeSaudeAmil  extends PlanoDeSaude{

    @Override
    public void regrasPagamento(Double valor) {
        if(valor > 100){
            valor*=0.8;
        }
    }
    
}
