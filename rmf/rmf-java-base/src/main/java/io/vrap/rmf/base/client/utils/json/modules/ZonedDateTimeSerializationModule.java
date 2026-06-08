
package io.vrap.rmf.base.client.utils.json.modules;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;

import io.vrap.rmf.base.client.utils.json.modules.serializers.LocalDateSerializer;
import io.vrap.rmf.base.client.utils.json.modules.serializers.LocalTimeSerializer;
import io.vrap.rmf.base.client.utils.json.modules.serializers.ZonedDateTimeSerializer;

import tools.jackson.databind.module.SimpleModule;

public class ZonedDateTimeSerializationModule extends SimpleModule {

    public ZonedDateTimeSerializationModule() {
        addSerializer(LocalDate.class, new LocalDateSerializer());
        addSerializer(LocalTime.class, new LocalTimeSerializer());
        addSerializer(ZonedDateTime.class, new ZonedDateTimeSerializer());
    }
}
