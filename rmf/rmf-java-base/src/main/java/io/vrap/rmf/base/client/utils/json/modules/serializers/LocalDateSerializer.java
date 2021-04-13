
package io.vrap.rmf.base.client.utils.json.modules.serializers;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;

public final class LocalDateSerializer extends StdScalarSerializer<LocalDate> {

    static final long serialVersionUID = 0L;

    public LocalDateSerializer() {
        super(LocalDate.class);
    }

    @Override
    public void serialize(final LocalDate value, final JsonGenerator gen, final SerializerProvider arg2)
            throws IOException {
        gen.writeString(DateTimeFormatter.ISO_DATE.format(value));
    }

}
