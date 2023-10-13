
package io.vrap.rmf.base.client.utils.json.modules.deserializers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;

public class LocalDateDeserializationModule extends SimpleModule {
    private static final long serialVersionUID = 0L;

    public static final DateTimeFormatter LENIENT_LOCAL_DATE;

    static {
        LENIENT_LOCAL_DATE = new DateTimeFormatterBuilder().parseLenient()
                .append(DateTimeFormatter.ISO_LOCAL_DATE)
                .toFormatter();
    }

    public LocalDateDeserializationModule() {

        addDeserializer(LocalDate.class, new LocalDateDeserializer(LENIENT_LOCAL_DATE));
    }
}
