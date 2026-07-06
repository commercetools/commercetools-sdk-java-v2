
package com.commercetools.api.json;

import tools.jackson.core.JsonGenerator;
import tools.jackson.databind.SerializationContext;
import tools.jackson.databind.ser.std.StdScalarSerializer;

public class DoubleSerializer extends StdScalarSerializer<Double> {

    static final long serialVersionUID = 0L;

    public DoubleSerializer() {
        super(Double.class);
    }

    public void serialize(Double value, JsonGenerator gen, SerializationContext arg2) {
        if (value.intValue() == value)
            gen.writeNumber(value.intValue());
        else
            gen.writeNumber(value);
    }
}
