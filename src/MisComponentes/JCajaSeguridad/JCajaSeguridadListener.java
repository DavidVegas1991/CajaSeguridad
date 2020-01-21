/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisComponentes.JCajaSeguridad;

import java.util.EventListener;

/**
 *
 * @author alumno
 */
public interface JCajaSeguridadListener extends EventListener {
    //ABRIR CERRAR SELECIONAR Y BLOQUEAR
    
    public void JCajaSeguridadAbrir(JCajaSeguridadEvent e);
    public void JCajaSeguridadCerrar(JCajaSeguridadEvent e);
    public void JCajaSeguridadSeleccionar(JCajaSeguridadEvent e);
    public void JCajaSeguridadBloquear(JCajaSeguridadEvent e);
    
}
