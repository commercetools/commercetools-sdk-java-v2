
package io.vrap.rmf.base.client.utils.json.modules.serializers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import tools.jackson.core.JsonGenerator;
import tools.jackson.databind.SerializationContext;
import tools.jackson.databind.ser.std.StdScalarSerializer;

/**
 * serializes a {@link LocalDate} to {@link DateTimeFormatter#ISO_DATE} format
 */
public final class LocalDateSerializer extends StdScalarSerializer<LocalDate> {

    static final long serialVersionUID = 0L;

    public LocalDateSerializer() {
        super(LocalDate.class);
    }

    @Override
    public void serialize(final LocalDate value, final JsonGenerator gen, final SerializationContext arg2) {
        gen.writeString(DateTimeFormatter.ISO_DATE.format(value));
    }

}
