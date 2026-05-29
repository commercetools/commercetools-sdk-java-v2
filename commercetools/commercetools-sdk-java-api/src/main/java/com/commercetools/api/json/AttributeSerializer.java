
package com.commercetools.api.json;

import java.io.IOException;
import java.util.List;

import com.commercetools.api.models.product.Attribute;
import tools.jackson.core.JsonGenerator;
import tools.jackson.databind.SerializationContext;
import tools.jackson.databind.ValueSerializer;

public class AttributeSerializer extends ValueSerializer<Attribute> {

    @Override
    public void serialize(Attribute value, JsonGenerator gen, SerializationContext provider) {
        gen.writeStartObject();
        gen.writeStringProperty("name", value.getName());
        Object val = value.getValue();
        if (val instanceof Double) {
            gen.writeName("value");
            new DoubleSerializer().serialize((Double) value.getValue(), gen, provider);
        }
        else if (val instanceof List) {
            gen.writeArrayPropertyStart("value");
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
            gen.writeName("value");
            gen.writePOJO(value.getValue());

        }
        gen.writeEndObject();
    }
}
