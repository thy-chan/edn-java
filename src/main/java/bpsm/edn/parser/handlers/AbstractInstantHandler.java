// (c) 2012 B Smith-Mannschott -- Distributed under the Eclipse Public License
package bpsm.edn.parser.handlers;

import bpsm.edn.model.EdnException;
import bpsm.edn.model.Tag;
import bpsm.edn.parser.TagHandler;

public abstract class AbstractInstantHandler implements TagHandler {

    public Object transform(Tag tag, Object value) {
        if (!(value instanceof String)) {
            throw new EdnException(tag.toString() + " expects a String.");
        }
        return transform(InstantUtils.parse((String)value));
    }

    protected abstract Object transform(ParsedInstant pi);

}
