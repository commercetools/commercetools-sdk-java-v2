
package io.vrap.rmf.base.client.utils.json.modules.deserializers;

import java.io.IOException;
import java.time.ZonedDateTime;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;

/**
 * Deserializer converting string to {@link ZonedDateTime}
 */
public class ZonedDateTimeDeserializer extends StdScalarDeserializer<ZonedDateTime> {

    private static final long serialVersionUID = 0L;

    public ZonedDateTimeDeserializer() {
        super(ZonedDateTime.class);
    }

    @Override
    public ZonedDateTime deserialize(final JsonParser jsonParser, final DeserializationContext deserializationContext)
            throws IOException {
        return ZonedDateTime.parse(jsonParser.getText());
    }
}
