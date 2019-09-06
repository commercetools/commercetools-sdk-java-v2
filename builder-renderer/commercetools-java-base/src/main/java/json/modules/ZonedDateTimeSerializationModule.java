package json.modules;

import com.fasterxml.jackson.databind.module.SimpleModule;
import json.modules.serializers.LocalDateSerializer;
import json.modules.serializers.LocalTimeSerializer;
import json.modules.serializers.ZonedDateTimeSerializer;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class ZonedDateTimeSerializationModule extends SimpleModule {
    
    public ZonedDateTimeSerializationModule() {
        addSerializer(LocalDate.class, new LocalDateSerializer());
        addSerializer(LocalTime.class, new LocalTimeSerializer());
        addSerializer(ZonedDateTime.class, new ZonedDateTimeSerializer());
    }
}
