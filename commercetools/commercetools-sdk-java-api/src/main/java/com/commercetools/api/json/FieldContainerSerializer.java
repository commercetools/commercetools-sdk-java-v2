
package com.commercetools.api.json;

import java.io.IOException;
import java.util.List;

import com.commercetools.api.models.type.FieldContainer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class FieldContainerSerializer extends JsonSerializer<FieldContainer> {

    @Override
    public void serialize(FieldContainer value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeStartObject();
        value.values().forEach((key, val) -> {
            try {
                if (val instanceof Double) {
                    gen.writeFieldName(key);
                    new DoubleSerializer().serialize((Double) val, gen, provider);
                }
                else if (val instanceof List) {
                    gen.writeArrayFieldStart(key);
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
                    provider.defaultSerializeField(key, val, gen);
                }
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        gen.writeEndObject();
    }
}
