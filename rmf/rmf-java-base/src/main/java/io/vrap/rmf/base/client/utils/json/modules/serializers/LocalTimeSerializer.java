
package io.vrap.rmf.base.client.utils.json.modules.serializers;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import tools.jackson.core.JsonGenerator;
import tools.jackson.databind.SerializationContext;
import tools.jackson.databind.ser.std.StdScalarSerializer;

/**
 * serializes a {@link LocalTime} to {@link DateTimeFormatter#ISO_TIME} format
 */
public final class LocalTimeSerializer extends StdScalarSerializer<LocalTime> {

    static final long serialVersionUID = 0L;

    public LocalTimeSerializer() {
        super(LocalTime.class);
    }

    @Override
    public void serialize(final LocalTime value, final JsonGenerator gen, final SerializationContext arg2) {
        gen.writeString(DateTimeFormatter.ISO_TIME.format(value));
    }

}
