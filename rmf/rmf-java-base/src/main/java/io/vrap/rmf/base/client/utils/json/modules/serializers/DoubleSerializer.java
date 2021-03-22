package io.vrap.rmf.base.client.utils.json.modules.serializers;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;

import java.io.IOException;

public class DoubleSerializer extends StdScalarSerializer<Double> {

    static final long serialVersionUID = 0L;

    public DoubleSerializer() {
        super(Double.class);
    }

    public void serialize(Double value, JsonGenerator gen, SerializerProvider arg2) throws IOException {
        if (value.intValue() == value)
            gen.writeNumber(value.intValue());
        else
            gen.writeNumber(value);
    }
}
