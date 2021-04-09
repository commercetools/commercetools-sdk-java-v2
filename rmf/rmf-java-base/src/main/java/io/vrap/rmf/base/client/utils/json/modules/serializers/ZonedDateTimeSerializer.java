
package io.vrap.rmf.base.client.utils.json.modules.serializers;

import java.io.IOException;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;

public final class ZonedDateTimeSerializer extends StdScalarSerializer<ZonedDateTime> {

    static final long serialVersionUID = 0L;
    private static final DateTimeFormatter FORMATTER = new DateTimeFormatterBuilder().appendInstant(3).toFormatter();

    public ZonedDateTimeSerializer() {
        super(ZonedDateTime.class);
    }

    @Override
    public void serialize(final ZonedDateTime value, final JsonGenerator gen, final SerializerProvider arg2)
            throws IOException {
        gen.writeString(FORMATTER.format(value.withZoneSameInstant(ZoneOffset.UTC)));
    }
}
