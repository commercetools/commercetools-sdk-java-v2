
package com.commercetools.api.json;

/**
 * @deprecated typo in the class name, use AttributeDeserializer instead
 */
@Deprecated
public class AtrributeDeserializer extends AttributeDeserializer {
    public AtrributeDeserializer(boolean deserializeAsDateString) {
        super(deserializeAsDateString);
    }

    public AtrributeDeserializer(boolean deserializeAsDateString, boolean deserializeNumberAsDouble) {
        super(deserializeAsDateString, deserializeNumberAsDouble);
    }

    public AtrributeDeserializer() {
        super();
    }
}
