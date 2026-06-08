
package io.vrap.rmf.base.client.utils.json.modules.deserializers;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

import tools.jackson.core.JsonParser;
import tools.jackson.databind.DeserializationContext;
import tools.jackson.databind.deser.std.StdScalarDeserializer;

/**
 * Deserializer converting string to {@link ZonedDateTime}
 */
public class ZonedDateTimeDeserializer extends StdScalarDeserializer<ZonedDateTime> {
    public static final DateTimeFormatter LENIENT_ZONED_DATE_DATE;

    static {
        LENIENT_ZONED_DATE_DATE = new DateTimeFormatterBuilder().parseLenient()
                .append(DateTimeFormatter.ISO_ZONED_DATE_TIME)
                .toFormatter();
    }

    private static final long serialVersionUID = 0L;

    public ZonedDateTimeDeserializer() {
        super(ZonedDateTime.class);
    }

    @Override
    public ZonedDateTime deserialize(final JsonParser jsonParser, final DeserializationContext deserializationContext) {
        return ZonedDateTime.parse(jsonParser.getString(), LENIENT_ZONED_DATE_DATE);
    }
}
