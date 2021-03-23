
package com.commercetools.api.json;

import java.io.IOException;
import java.util.List;

import com.commercetools.api.models.product.Attribute;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class AttributeSerializer extends JsonSerializer<Attribute> {

    @Override
    public void serialize(Attribute value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeStartObject();
        gen.writeStringField("name", value.getName());
        Object val = value.getValue();
        if (val instanceof Double) {
            gen.writeFieldName("value");
            new DoubleSerializer().serialize((Double) value.getValue(), gen, provider);
        }
        else if (val instanceof List) {
            gen.writeArrayFieldStart("value");
            ((List<?>) val).forEach(o -> {
                try {
                    if (o instanceof Double) {
                        new DoubleSerializer().serialize((Double) o, gen, provider);
                    }
                    else {
                        provider.defaultSerializeValue(o, gen);
                    }
                }
                catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            gen.writeEndArray();
        }
        else {
            provider.defaultSerializeField("value", value.getValue(), gen);

        }
        gen.writeEndObject();
    }
}
