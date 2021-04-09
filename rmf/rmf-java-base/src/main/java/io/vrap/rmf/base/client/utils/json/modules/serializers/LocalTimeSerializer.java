
package io.vrap.rmf.base.client.utils.json.modules.serializers;

import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;

public final class LocalTimeSerializer extends StdScalarSerializer<LocalTime> {

    static final long serialVersionUID = 0L;

    public LocalTimeSerializer() {
        super(LocalTime.class);
    }

    @Override
    public void serialize(final LocalTime value, final JsonGenerator gen, final SerializerProvider arg2)
            throws IOException {
        gen.writeString(DateTimeFormatter.ISO_TIME.format(value));
    }

}
