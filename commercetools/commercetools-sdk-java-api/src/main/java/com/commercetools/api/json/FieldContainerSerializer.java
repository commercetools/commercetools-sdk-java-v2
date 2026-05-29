
package com.commercetools.api.json;

import java.io.IOException;
import java.util.List;

import com.commercetools.api.models.type.FieldContainer;
import tools.jackson.core.JsonGenerator;
import tools.jackson.databind.SerializationContext;
import tools.jackson.databind.ValueSerializer;

public class FieldContainerSerializer extends ValueSerializer<FieldContainer> {

    @Override
    public void serialize(FieldContainer value, JsonGenerator gen, SerializationContext provider) {
        gen.writeStartObject();
        value.values().forEach((key, val) -> {
            if (val instanceof Double) {
                gen.writeName(key);
                new DoubleSerializer().serialize((Double) val, gen, provider);
            }
            else if (val instanceof List) {
                gen.writeArrayPropertyStart(key);
                ((List<?>) val).forEach(o -> {
                    if (o instanceof Double) {
                        new DoubleSerializer().serialize((Double) o, gen, provider);
                    }
                    else {
                        Object plainObject = o;
                        gen.writePOJO(plainObject);
                    }
                });

                gen.writeEndArray();
            }
            else {
                gen.writeName(key);
                gen.writePOJO(val);
            }
        });
        gen.writeEndObject();
    }
}
