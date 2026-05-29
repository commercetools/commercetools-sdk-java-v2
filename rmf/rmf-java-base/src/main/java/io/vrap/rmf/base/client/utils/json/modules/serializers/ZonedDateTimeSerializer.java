
package io.vrap.rmf.base.client.utils.json.modules.serializers;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

import tools.jackson.core.JsonGenerator;
import tools.jackson.databind.ser.std.StdScalarSerializer;
import tools.jackson.databind.SerializationContext;

/**
 * serializes a {@link ZonedDateTime} to {@link DateTimeFormatter#ISO_DATE} format
 */
public final class ZonedDateTimeSerializer extends StdScalarSerializer<ZonedDateTime> {

    static final long serialVersionUID = 0L;
    private static final DateTimeFormatter FORMATTER = new DateTimeFormatterBuilder().appendInstant(3).toFormatter();

    public ZonedDateTimeSerializer() {
        super(ZonedDateTime.class);
    }

    @Override
    public void serialize(final ZonedDateTime value, final JsonGenerator gen, final SerializationContext arg2) {
        gen.writeString(FORMATTER.format(value.withZoneSameInstant(ZoneOffset.UTC)));
    }
}
