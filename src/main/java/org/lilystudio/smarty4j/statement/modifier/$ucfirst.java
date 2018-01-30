package org.lilystudio.smarty4j.statement.modifier;

import org.lilystudio.smarty4j.Context;
import org.lilystudio.smarty4j.statement.Modifier;
import org.lilystudio.smarty4j.statement.ParameterCharacter;

/**
 *
 *
 * @author Maikel Bollemeijer
 * 30/01/2018
 */
public class $ucfirst extends Modifier {
    @Override

    public Object execute(final Object obj, final Context context, final Object[] values) {
        String value = (String) obj;
        return (value.length() > 0) ? value.substring(0,1).toUpperCase() + value.substring(1).toLowerCase() : "";
    }

    @Override
    public ParameterCharacter[] getDefinitions() {
        return null;
    }
}
