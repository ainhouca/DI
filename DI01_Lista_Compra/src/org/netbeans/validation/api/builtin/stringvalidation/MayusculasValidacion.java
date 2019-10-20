package org.netbeans.validation.api.builtin.stringvalidation;

import org.netbeans.validation.api.Problems;
import org.openide.util.NbBundle;

/**
 *
 * @author Irache Mtnez.
 */
public class MayusculasValidacion extends StringValidator {

    @Override
    public void validate(Problems listaProblemas, String nombreComponente, String texto) {
        if ((!"".equals(texto)) && !Character.isUpperCase(texto.charAt(0))) {
            String mensaje = NbBundle.getMessage(this.getClass(), "MSG_MAYUSCULA_EMPIEZA", nombreComponente);
            listaProblemas.add(mensaje);
        }

    }

}
